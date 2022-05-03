package br.com.calculadora.funcoes;

import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class ChecaCaixaDeTexto implements Checador {
	
	@Override
	public void checaPreenchimento(JComponent campoDeTexto) {
		if (((JTextField) campoDeTexto).getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Preencha todos os campos!", "Aviso", 3, null);
			throw new NumberFormatException("É preciso preencher os campos de texto");
		}
	}

}
