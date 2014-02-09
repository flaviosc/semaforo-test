package com.eliasnogueira.semaforo.integration;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import static org.junit.Assert.*;

import com.eliasnogueira.semaforo.Semaforo;

/**
 * Classe desenvolvida com jBehave para a execucao da estoria
 * @author elias dot nogueira at gmail dot com
 *
 */
public class EstoriaSemaforo extends StoryBase {
	
	private Semaforo semaforo;
	
	@Given("que eu estou na pagina de visualizacao")
	public void estouNaPagina() {
		assertTrue(true);
	}
	
	@When("a cor do semaforo e $corAtual")
	public void corDoSemaforo(String corAtual) {
		semaforo = new Semaforo(corAtual);
	}
	
	@Then("a proxima cor do semaforo e $proximaCor")
	public void proximaCor(String proximaCor) {
		assertEquals(proximaCor.toUpperCase(), semaforo.getProximoStatus());
	}
	
}
