package br.com.calculadora.componentes;

import java.awt.Font;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;

public class Botoes {
	private LeitorDeArquivo leitorArquivo = new LeitorDeArquivo();

	public JButton botaoVoltar(JDialog dialogFrame) {
		JButton botaoVoltar = new JButton("<<<");
		botaoVoltar.setFont(new Font("Monospaced", Font.PLAIN, 11));
		botaoVoltar.setBounds(10, 18, 55, 15);
		botaoVoltar.addActionListener((ActionEvent e) -> dialogFrame.dispose());

		return botaoVoltar;
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
		botaoTxt.addActionListener((ActionEvent e) -> leitorArquivo.exibeTextoEmTela(nomeArquivo));
		botaoTxt.setBounds(292, 83, 100, 35);

		return botaoTxt;
	}

	public JButton visualizarImg(String nomeImg) {
		JButton botaoImg = new JButton("Visualizar");
		botaoImg.addActionListener((ActionEvent e) -> leitorArquivo.exibeImagemEmTela(nomeImg));
		botaoImg.setBounds(292, 183, 100, 35);

		return botaoImg;
	}

	public JButton chamaViews(String textoBotao, int posicaoY, JDialog frame) {
		JButton botao = new JButton(textoBotao);
		botao.addActionListener((ActionEvent e) -> {
			frame.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			frame.setVisible(true);
		});
		botao.setFont(new Font("Monospaced", Font.PLAIN, 12));
		botao.setBounds(279, posicaoY, 125, 25);

		return botao;

	}
}