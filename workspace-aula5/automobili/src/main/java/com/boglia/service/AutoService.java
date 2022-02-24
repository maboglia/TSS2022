package com.boglia.service;

import java.util.List;

import com.boglia.entities.AutoElettrica;

public interface AutoService {

	List<AutoElettrica> getAll();
	void addAuto(AutoElettrica a);
	
}
