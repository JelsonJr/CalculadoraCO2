package br.com.calculadora.funcoes;

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;

public class ChecadorCaixaCombinacao implements ChecadorDeComponentes{
	
	@SuppressWarnings("unchecked")
	@Override
	public void checaPreenchimento(JComponent caixaCombustivel) {
		if (((JComboBox<Object>) caixaCombustivel).getSelectedItem().equals("<Selecione o combust�vel>")) {
			JOptionPane.showMessageDialog(null, "Selecione um tipo de combust�vel", "Aviso", 3, null);
			throw new IllegalArgumentException("� necess�rio selecionar um combust�vel");
		}
	}
}
