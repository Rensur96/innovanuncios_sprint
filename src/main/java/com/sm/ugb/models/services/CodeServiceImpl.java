package com.sm.ugb.models.services;

import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.sm.ugb.models.entities.Code;
import com.sm.ugb.models.repository.CodeRepository;

@Service
public class CodeServiceImpl implements CodeService{

	@Autowired
	public CodeRepository repository;
	@Override
	public List<Code> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Code save(Code entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Code> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}

}
