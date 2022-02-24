package com.boglia.dal;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boglia.entities.AutoElettrica;

public interface AutoDAO extends JpaRepository<AutoElettrica, Integer> {

}
