package br.com.calculadora.funcoes;


import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class ChecadorDeFuncoes {

	public double conversor(String string) {
		double numero = Double.parseDouble(string);
		return numero;
	}
	
	public void checaPreenchimento(Checador checador, JComponent componente) {
		checador.checaPreenchimento(componente);
	}

	public void checaResultado(double valor) {
		if (valor <= 10) {
			JOptionPane.showMessageDialog(null,
					"Parab�ns, voc� � um consumidor consciente e deve plantar " + valor + " �rvores por ano.", "Resultado", 1);
		} else if (valor <= 40) {
			JOptionPane.showMessageDialog(null,
					"Aten��o, voc� � um consumidor de n�vel moderado para alto e deve plantar cerca de " + valor
							+ " �rvores por ano.", "Resultado", 2);
		} else {
			JOptionPane.showMessageDialog(null,
					"Aten��o, voc� est� usando demais seu ve�culo, est� prejudicando a natureza! Precisa plantar cerca de "
							+ valor + " �rvores por ano.", "Resultado", 0);
		}
	}
}