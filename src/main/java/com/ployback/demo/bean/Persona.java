package com.ployback.demo.bean;

public class Persona {
 
	public String nombre;
	public String mesa;
	public String votos;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, String mesa, String votos) {
		this.nombre = nombre;
		this.mesa = mesa;
		this.votos = votos;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMesa() {
		return mesa;
	}
	public void setMesa(String mesa) {
		this.mesa = mesa;
	}
	public String getVotos() {
		return votos;
	}
	public void setVotos(String votos) {
		this.votos = votos;
	}
	
	
}
