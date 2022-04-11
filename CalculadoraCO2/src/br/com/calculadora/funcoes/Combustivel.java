package br.com.calculadora.funcoes;

public enum Combustivel {
	Gasolina(0.13), 
	Etanol(0.11), 
	Diesel(0.17);

	private double valor;

	Combustivel(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}
}
