package com.example.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdemo.model.Exemplo;
import com.example.springdemo.service.ExemploService;

@RestController
public class ExemploController {

	@Autowired
	private ExemploService exemploService;

	@RequestMapping(value = "/salvarMensagem", method = RequestMethod.PUT, consumes = {
			"application/json" }, produces = { "application/json" })
	public ResponseEntity<Exemplo> save(@RequestBody Exemplo msg) {
		try {
			///
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

	@RequestMapping(value = "/salvarTeste", method = RequestMethod.POST)
	public ResponseEntity<Exemplo> save(@RequestBody String msg) {
		try {
			exemploService.salvar(msg);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

	@RequestMapping(value = "/buscar", method = RequestMethod.GET)
	public ResponseEntity<Exemplo> buscar() {
		try {
			List<Exemplo> resultado = exemploService.buscar();
			System.out.println(resultado);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(HttpStatus.ACCEPTED);
	}

}
