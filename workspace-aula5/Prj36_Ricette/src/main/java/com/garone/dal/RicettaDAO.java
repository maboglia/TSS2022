package com.garone.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.garone.entities.Ricetta;

@Repository
public interface RicettaDAO extends JpaRepository<Ricetta, Integer>{

}
