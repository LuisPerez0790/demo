package com.luisperez.spring.springTest.beans;

import org.springframework.stereotype.Component;
import lombok.Data;

@Component
@Data
public class Futbolista {
	
		private String nombre = "lionel";
		private String apellido = "messi";
		private int edad = 28;
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
