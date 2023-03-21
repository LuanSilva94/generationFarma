package org.generation.generationfarma.repository;

import java.util.List;

import org.generation.generationfarma.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List <Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
	
	public List <Produto> findAllByFabricanteContainingIgnoreCase(@Param("fabricante") String fabricante);
	
}
