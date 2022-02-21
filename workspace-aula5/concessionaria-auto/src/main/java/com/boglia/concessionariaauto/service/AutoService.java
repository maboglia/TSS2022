package com.boglia.concessionariaauto.service;

import java.util.List;

import com.boglia.concessionariaauto.entities.Auto;

public interface AutoService {

	void addAuto(Auto a);
	List<Auto> getAll();
	Auto getOneById(int id);
}
