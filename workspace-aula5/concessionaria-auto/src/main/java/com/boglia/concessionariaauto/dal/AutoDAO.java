package com.boglia.concessionariaauto.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boglia.concessionariaauto.entities.Auto;

public interface AutoDAO extends JpaRepository<Auto, Integer> {

}
