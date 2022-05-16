package br.com.calculadora.componentes;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class BotaoTexto implements BotaoDeArquivo {
	private LeitorDeArquivo leitorArquivo = new LeitorDeArquivo();
	
	
	@Override
	public JButton visualizarArquivo(String nomeArquivo) {
		JButton botaoTxt = new JButton("Visualizar");
		botaoTxt.addActionListener((ActionEvent e) -> leitorArquivo.exibeTexto(nomeArquivo));
		botaoTxt.setBounds(292, 83, 100, 35);

		return botaoTxt;
	}

}
