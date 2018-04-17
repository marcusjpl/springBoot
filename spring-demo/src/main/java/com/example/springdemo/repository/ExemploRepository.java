package com.example.springdemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springdemo.model.Exemplo;

@Repository
public interface ExemploRepository extends CrudRepository<Exemplo, Integer> {
	

}
