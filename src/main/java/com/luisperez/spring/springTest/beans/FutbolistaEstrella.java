package com.luisperez.spring.springTest.beans;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class FutbolistaEstrella {
	private String nombre = "luis";
	private String apellido = "suarez";
	private int edad = 29;
	private String equipo = "Barcelona";
	
	public String celebrar() {
		return "He anotado un gol :)";
		
	}
	public String enojarce() {
		return "he fallado!! :( ";
		
	}
	public String saludar() {
		return "Hola soy jugador de futbol";
	}
}
