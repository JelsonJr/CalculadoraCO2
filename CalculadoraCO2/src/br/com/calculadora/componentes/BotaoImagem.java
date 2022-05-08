package br.com.calculadora.componentes;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

public class BotaoImagem implements BotaoDeArquivo {
	private LeitorDeArquivo leitorArquivo = new LeitorDeArquivo();

	@Override
	public JButton visualizarArquivo(String nomeArquivo) {
		JButton botaoImg = new JButton("Visualizar");
		botaoImg.addActionListener((ActionEvent e) -> leitorArquivo.exibeImagemEmTela(nomeArquivo));
		botaoImg.setBounds(292, 183, 100, 35);

		return botaoImg;
	}
}
