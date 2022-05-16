package br.com.calculadora.funcoes;

public class CoordenadaCartesiana {

	private int posicaoX;
	private int posicaoY;
	
	public CoordenadaCartesiana(int posicaoX, int posicaoY) {
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
	}

	public int getPosicaoY() {
		return posicaoY;
	}

	public int getPosicaoX() {
		return posicaoX;
	}
}
