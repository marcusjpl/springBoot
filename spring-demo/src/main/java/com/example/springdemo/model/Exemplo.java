package com.example.springdemo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TB_EXEMPLO")
public class Exemplo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String campo1;
	private String campo2;
		
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCampo1() {
		return campo1;
	}
	public void setCampo1(String campo1) {
		this.campo1 = campo1;
	}
	public String getCampo2() {
		return campo2;
	}
	public void setCampo2(String campo2) {
		this.campo2 = campo2;
	}
	@Override
	public String toString() {
		return "Exemplo [id=" + id + ", campo1=" + campo1 + ", campo2=" + campo2 + "]";
	}
	

}
