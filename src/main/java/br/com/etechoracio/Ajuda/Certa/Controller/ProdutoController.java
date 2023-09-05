package br.com.etechoracio.Ajuda.Certa.Controller;

import br.com.etechoracio.Ajuda.Certa.Entity.Produto;
import br.com.etechoracio.Ajuda.Certa.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Produto")
public class ProdutoController {

    @Autowired
    private ProdutoRepository repository;

    @GetMapping
        public List<Produto> buscarTodos()
        {
            return repository.findAll();
        }

    @GetMapping("/{id}")
    public Optional<Produto> buscarPorId(@PathVariable Long id){
        return repository.findById(id);
    }
}
