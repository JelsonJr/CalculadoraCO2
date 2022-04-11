package br.com.calculadora.funcoes;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ChecaFuncoes {

	public double conversor(String string) {
		double numero = Double.parseDouble(string);
		return numero;
	}

	public void checaCaixaCombinacao(JComboBox<Object> caixaCombustivel) {
		if (caixaCombustivel.getSelectedItem().equals("<Selecione o combust�vel>")) {
			JOptionPane.showMessageDialog(null, "Selecione um tipo de combust�vel", "Aviso", 3, null);
			throw new IllegalArgumentException("� necess�rio selecionar um combust�vel");
		}
	}

	public void checaCampoTxt(JTextField campoDeTexto) {
		if (campoDeTexto.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Aviso", 3, null);
			throw new NumberFormatException("� preciso preencher os campos de texto");
		}
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