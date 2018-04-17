package com.example.springdemo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdemo.model.Exemplo;
import com.example.springdemo.repository.ExemploRepository;

@Service
public class ExemploService {

	@Autowired
	private ExemploRepository exemploRepository;

	public void salvar(String msg) {
		Exemplo ex = new Exemplo();
		ex.setCampo1(msg);
		ex.setCampo2(new Date().toString());
		exemploRepository.save(ex);
	}

	public List<Exemplo> buscar() {
		return (List<Exemplo>) exemploRepository.findAll();
	}


}
