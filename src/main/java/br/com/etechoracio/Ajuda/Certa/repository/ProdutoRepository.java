package br.com.etechoracio.Ajuda.Certa.repository;

import br.com.etechoracio.Ajuda.Certa.Entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long>
{
}
