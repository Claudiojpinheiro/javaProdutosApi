package br.com.cotiinformatica.repositories;


import java.util.List;
import java.util.UUID;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import br.com.cotiinformatica.entities.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria, UUID> {

	// Consulta de interface sempre pela JPQL 
	// -> JPQL Se parece com a linguagem SQL [ Consultas em classes e objetos ] 
	// -> ANNOTATION @QUERY 
	// findAll() consulta por ordem de inserção 
	// O metodo abaixo consulta por ordem de nome

	@Query("select c from Categoria c order by c.nome")
	List<Categoria> findAll();
}
