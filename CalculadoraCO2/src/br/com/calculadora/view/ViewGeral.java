package br.com.calculadora.view;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.calculadora.componentes.Botoes;

import javax.swing.JLabel;

public class ViewGeral extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private Botoes botoes = new Botoes();

	// O CONSTRUTOR RECEBERIA O TITULO DA VIEW, O NOME DO ARQUIVO DE TEXTO E IMAGEM
	// (QUE ESTÃO NA FONTE DO PROJETO)
	public ViewGeral(String titulo, String arquivoDeTexto, String arquivoDeImagem) {
		// O MOLDE DESSA JANELA, O TAMANHO, COR, FUNDO, BORDA E LAYOUT
		getContentPane().setBackground(Color.WHITE);
		setBackground(Color.WHITE);
		setBounds(100, 100, 700, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		// O TÍTULO DESSA JANELA
		JLabel lblTitulo = new JLabel(titulo);
		lblTitulo.setFont(new Font("Monospaced", Font.BOLD, 15));
		lblTitulo.setBounds(217, 15, 250, 20);
		contentPanel.add(lblTitulo);

		// OS COMPONENTES DELA
		contentPanel.add(botoes.visualizarTexto(arquivoDeTexto));
		contentPanel.add(botoes.visualizarImg(arquivoDeImagem));
		contentPanel.add(botoes.botaoVoltar(this));
	}

}