package com.eliasnogueira.semaforo.unit;
import static org.junit.Assert.*;

import org.junit.Test;

import com.eliasnogueira.semaforo.Cores;
import com.eliasnogueira.semaforo.Semaforo;

/**
 * Classe de teste em Junit 4
 * @author elias dot nogueira at gmail dot com
 *
 */
public class SemaforoTest {

	@Test
	public void testeSemaforoVerde() {
		Semaforo semaforo = new Semaforo(Cores.CINZA);
		assertEquals(Cores.AMARELO, semaforo.getProximoStatus());
	}
	
	@Test
	public void testeSemaforoAmerelo() {
		Semaforo semaforo = new Semaforo(Cores.AMARELO);
		assertEquals(Cores.VERMELHO, semaforo.getProximoStatus());
	}	
	
	@Test
	public void testeSemaforoVermelho() {
		Semaforo semaforo = new Semaforo(Cores.VERMELHO);
		assertEquals(Cores.VERDE, semaforo.getProximoStatus());
	}

}
