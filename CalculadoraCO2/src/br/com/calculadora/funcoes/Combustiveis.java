package br.com.calculadora.funcoes;

public enum Combustiveis {
	Gasolina(0.13), 
	Etanol(0.11), 
	Diesel(0.17);

	private double valor;

	Combustiveis(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}
}
