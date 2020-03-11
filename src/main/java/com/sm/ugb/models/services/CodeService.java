package com.sm.ugb.models.services;

import java.util.List;
import java.util.Optional;

import com.sm.ugb.models.entities.Code;

public interface CodeService {
	
	public List<Code> findAll();
	
	public Code save(Code entity);
	
	public Optional<Code> findById(Long id);
	
	public void delete(Long id);
}
