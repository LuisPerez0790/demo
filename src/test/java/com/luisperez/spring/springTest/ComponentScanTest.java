package com.luisperez.spring.springTest;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.luisperez.spring.sprinTest.configuration.ComponentScanConfiguration;
import com.luisperez.spring.sprinTest.configuration.ConfigurationBeansTeam;
import com.luisperez.spring.springTest.beans.Futbolista;
import com.luisperez.spring.springTest.beans.FutbolistaEstrella;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ComponentScanConfiguration.class)
public class ComponentScanTest {
	
		@Autowired
		private Futbolista jugadorEstrella;

		@Autowired
		@Qualifier("futbolistaEstrella")
		private FutbolistaEstrella jugador;


		@Test
		public void jugador() {
			assertNotNull(jugadorEstrella);
			log.info("{}", jugadorEstrella.getNombre());
			log.info("{}", jugadorEstrella.getApellido());
			log.info("{}", jugadorEstrella.getEdad());
			log.info("{}", jugadorEstrella.getEquipo());
		}

		@Test
		public void jugadorEstrella() {
			assertNotNull(jugador);
			log.info("{}", jugador.getNombre());
			log.info("{}", jugador.getApellido());
			log.info("{}", jugador.getEdad());
			log.info("{}", jugador.getEquipo());

		}

		
	}



