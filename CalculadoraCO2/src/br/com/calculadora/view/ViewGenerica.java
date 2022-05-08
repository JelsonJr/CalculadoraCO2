package br.com.calculadora.view;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.calculadora.componentes.BotaoImagem;
import br.com.calculadora.componentes.BotaoTexto;
import br.com.calculadora.componentes.Botoes;

import javax.swing.JLabel;

public class ViewGenerica extends JDialog {

	private static final long serialVersionUID = 2526933679046049803L;
	private final JPanel contentPanel = new JPanel();
	private Botoes botoes = new Botoes();

	public ViewGenerica(String titulo, String arquivoDeTexto, String arquivoDeImagem) {
		getContentPane().setBackground(Color.WHITE);
		setBackground(Color.WHITE);
		setBounds(100, 100, 700, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblTitulo = new JLabel(titulo);
		lblTitulo.setFont(new Font("Monospaced", Font.BOLD, 15));
		lblTitulo.setBounds(217, 15, 250, 20);
		contentPanel.add(lblTitulo);

		contentPanel.add(botoes.visualizarArquivo(arquivoDeTexto, new BotaoTexto()));
		contentPanel.add(botoes.visualizarArquivo(arquivoDeImagem, new BotaoImagem()));
		contentPanel.add(botoes.botaoVoltar(this));
	}
}