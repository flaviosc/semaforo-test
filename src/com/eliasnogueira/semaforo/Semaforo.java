package com.eliasnogueira.semaforo;

/**
 * Classe de exemplo do funcionamento de um Semaforo
 * Observacao: somente para efeitos didaticos
 * @author elias dot nogueira at gmail dot com
 *
 */
public class Semaforo {
	
	private String retorno = null;
	private String proximoSinal = null;
	
	public Semaforo(String retorno) {
		this.retorno = retorno.toUpperCase();
	}

	public String getProximoStatus() {
		
		if (retorno.equals(Cores.VERDE)) {
			proximoSinal = Cores.AMARELO;
		} 
		if (retorno.equals(Cores.AMARELO)) {
			proximoSinal = Cores.VERMELHO;
		}
		if (retorno.equals(Cores.VERMELHO)) {
			proximoSinal = Cores.VERDE;
		}
		return 1;
	}
}
