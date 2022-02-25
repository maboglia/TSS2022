package com.boglia.dal;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.boglia.entities.Alimento;

@Repository
public interface AlimentoDAO extends JpaRepository<Alimento, Integer>{

	List<Alimento> findByCategoriaStartingWith(String categoria);
	
	@Query(value = "SELECT DISTINCT(categoria) FROM alimenti ORDER BY categoria", nativeQuery = true)
	List<String> trovaCategorie();
	
	List<Alimento> findDistinctByEnergia(int energia);
	
	List<Alimento> findByEnergiaBetweenOrderByEnergiaDesc(int min, int max);
	
	int countByCategoria(String categoria);
}
