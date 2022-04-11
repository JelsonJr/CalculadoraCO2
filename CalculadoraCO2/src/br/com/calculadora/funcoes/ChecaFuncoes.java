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
		if (caixaCombustivel.getSelectedItem().equals("<Selecione o combustível>")) {
			JOptionPane.showMessageDialog(null, "Selecione um tipo de combustível", "Aviso", 3, null);
			throw new IllegalArgumentException("É necessário selecionar um combustível");
		}
	}

	public void checaCampoTxt(JTextField campoDeTexto) {
		if (campoDeTexto.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Aviso", 3, null);
			throw new NumberFormatException("É preciso preencher os campos de texto");
		}
	}

	public void checaResultado(double valor) {
		if (valor <= 10) {
			JOptionPane.showMessageDialog(null,
					"Parabéns, você é um consumidor consciente e deve plantar " + valor + " árvores por ano.", "Resultado", 1);
		} else if (valor <= 40) {
			JOptionPane.showMessageDialog(null,
					"Atenção, você é um consumidor de nível moderado para alto e deve plantar cerca de " + valor
							+ " árvores por ano.", "Resultado", 2);
		} else {
			JOptionPane.showMessageDialog(null,
					"Atenção, você está usando demais seu veículo, está prejudicando a natureza! Precisa plantar cerca de "
							+ valor + " árvores por ano.", "Resultado", 0);
		}
	}
}