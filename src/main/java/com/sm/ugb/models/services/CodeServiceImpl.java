package com.sm.ugb.models.services;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sm.ugb.models.entities.Code;
import com.sm.ugb.models.repository.CodeRepository;

@Service
public class CodeServiceImpl implements CodeService{

	@Autowired
	public CodeRepository repository;
	@Override
	public List<Code> findAll() {
		return (List<Code>)repository.findAll();
	}

	@Override
	public Code save(Code entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<Code> findById(Long id) {
		return repository.findById(id);
	}

	public void delete(Long id) {
		repository.deleteById(id);
	}

}
