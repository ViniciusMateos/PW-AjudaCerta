package br.com.etechoracio.Ajuda.Certa.Controller;

import br.com.etechoracio.Ajuda.Certa.Entity.Dinheiro;
import br.com.etechoracio.Ajuda.Certa.repository.DinheiroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Dinheiro")
public class DinheiroController {

    @Autowired
    private DinheiroRepository repository;

    @GetMapping
        public List<Dinheiro> buscarTodos()
        {
            return repository.findAll();
        }

    @GetMapping("/{id}")
    public Optional<Dinheiro> buscarPorId(@PathVariable Long id){
        return repository.findById(id);
    }
}
