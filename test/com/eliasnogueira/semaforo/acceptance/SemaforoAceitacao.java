package com.eliasnogueira.semaforo.acceptance;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Classe desenvolvida em WebDriver para a automação do semáforo
 * @author elias dot nogueira at gmail dot com
 *
 */
public class SemaforoAceitacao {

	WebDriver driver = null;
	WebDriverWait wait = null;
	
	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver, 10);
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void testaCorSemafoto() {
		driver.get("http://eliasnogueira.com/arquivos_blog/geral/semaforo/");
		
		driver.findElement(By.cssSelector("#trafficLight > div")).click();
		
		/*
		 * conjunto de comandos onde o webdriver ira esperar ate que a o sinal
		 * fique da cor esperada (verde, amarelo, vermelho)
		 */
		By semaforoVerde = By.cssSelector(".lamp.lampGreen");
		wait.until(ExpectedConditions.presenceOfElementLocated(semaforoVerde));

		By semaforoAmarelo = By.cssSelector(".lamp.lampYellow");
		wait.until(ExpectedConditions.presenceOfElementLocated(semaforoAmarelo));
		
		By semaforoVermelho = By.cssSelector(".lamp.lampRed");
		wait.until(ExpectedConditions.presenceOfElementLocated(semaforoVermelho));
	}

}
