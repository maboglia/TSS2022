package com.boglia.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boglia.entities.Viaggio;

@Repository
public interface ViaggioRepo extends JpaRepository<Viaggio, Integer>{
	
}
