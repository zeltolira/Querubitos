package br.com.querubitos.querubitos.domain;

public enum Quiz {
	
	UM(1), DOIS(2), TRES(3), QUATRO(4), CINCO(5), SEIS(6), SETE(7), OITO(8), NOVE(9), DEZ(10);
	
	private final int valor;
	Quiz(int valorOpcao){
		valor = valorOpcao;
	}
	public int getValor() {
		return valor;
	}
}
