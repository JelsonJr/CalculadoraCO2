package br.com.calculadora.componentes;

import java.awt.Font;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JTextField;

import br.com.calculadora.funcoes.CoordenadaCartesiana;

public class Botoes {
	
	public JButton botaoVoltar(JDialog dialogFrame) {
		JButton botaoVoltar = new JButton("<<<");
		botaoVoltar.setFont(new Font("Monospaced", Font.PLAIN, 11));
		botaoVoltar.setBounds(10, 18, 55, 15);
		botaoVoltar.addActionListener((ActionEvent e) -> dialogFrame.dispose());

		return botaoVoltar;
	}

	public JButton limpaCampos(JTextField campo, CoordenadaCartesiana coordenada) {
		JButton botao = new JButton("Limpar campo");
		botao.setFont(new Font("Monospaced", Font.PLAIN, 11));
		botao.setBounds(coordenada.getPosicaoX(), coordenada.getPosicaoY(), 125, 25);
		botao.addActionListener((ActionEvent e) -> campo.setText(""));

		return botao;
	}

	public JButton visualizarArquivo(String nomeArquivo, BotaoDeArquivo btnArquivo) {
		return btnArquivo.visualizarArquivo(nomeArquivo);
	}

	public JButton chamaViews(String textoBotao, JDialog frame, int posicaoY) {
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