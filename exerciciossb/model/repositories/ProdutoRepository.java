package exerciciossb.model.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import br.com.atalaias.exerciciossb.model.entities.Produto;
											//CrudRepository
public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>, CrudRepository<Produto, Integer>{

	public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome);

	/*
	 * findByNomeContaining 
	 * findByNomeIsContaining
	 * findByNomeContains
	 * 
	 * findByNomeStartWith
	 * finByNomeEndsWith
	 * 
	 * findByNomeNotContaining
	 */
	
	@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
	public Iterable<Produto> searchByNameLike(@Param("nome")String nome);
}
