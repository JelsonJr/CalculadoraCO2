package br.com.calculadora.componentes;

import java.awt.Font;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Botoes extends JFrame {
	private LeitorDeArquivo leitorArquivo = new LeitorDeArquivo();
	private static final long serialVersionUID = -6471758995565733949L;

	public JButton botaoVoltar(JDialog dialogFrame) {
		JButton botao = new JButton("<<<");
		botao.setFont(new Font("Monospaced", Font.PLAIN, 11));
		botao.setBounds(10, 18, 55, 15);
		botao.addActionListener((ActionEvent e) -> dialogFrame.dispose());

		return botao;
	}

	public JButton limpaCampos(JTextField campo, int x, int y) {
		JButton botao = new JButton("Limpar campo");
		botao.setFont(new Font("Monospaced", Font.PLAIN, 11));
		botao.setBounds(x, y, 125, 25);
		botao.addActionListener((ActionEvent e) -> campo.setText(""));

		return botao;
	}

	public JButton visualizarTexto(String nomeArquivo) {
		JButton botaoTxt = new JButton("Visualizar");
		botaoTxt.addActionListener((ActionEvent e) -> leitorArquivo.textoEmTela(nomeArquivo));
		botaoTxt.setBounds(292, 83, 100, 35);

		return botaoTxt;
	}

	public JButton visualizarImg(String nomeImg) {
		JButton botaoImg = new JButton("Visualizar");
		botaoImg.addActionListener((ActionEvent e) -> leitorArquivo.imagemEmTela(nomeImg));
		botaoImg.setBounds(292, 183, 100, 35);

		return botaoImg;
	}
}