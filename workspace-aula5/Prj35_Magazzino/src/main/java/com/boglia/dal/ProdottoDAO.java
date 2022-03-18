package com.boglia.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.boglia.entities.Prodotto;

@Repository
public interface ProdottoDAO extends JpaRepository<Prodotto, Integer> {

//	@Query(value = "from Prodotto where quantita between :min and :max")//JPQL
	@Query(value = "select * from products where quantita between :min and :max", nativeQuery = true)
	List<Prodotto> trovaProdotti(@Param("min") int min, @Param("max") int max );
	
	List<Prodotto> findByQuantitaBetween(int min, int max);//derived query JPA
	
}
