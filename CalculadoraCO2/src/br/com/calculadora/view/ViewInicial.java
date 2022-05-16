package br.com.calculadora.view;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

import br.com.calculadora.componentes.Botoes;

public class ViewInicial {

	private JFrame frame;
	private Botoes botoes = new Botoes();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewInicial window = new ViewInicial();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ViewInicial() {
		frameInicial();
	}

	private void frameInicial() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setForeground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 700, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblTituloInicial = new JLabel("CALCULADORA");
		lblTituloInicial.setBounds(276, 5, 132, 27);
		lblTituloInicial.setFont(new Font("Monospaced", Font.BOLD, 20));
		frame.getContentPane().add(lblTituloInicial);

		frame.getContentPane().add(botoes.chamaViews("CALCULAR", new CalculadoraCO2(), 65));

		frame.getContentPane().add(botoes.chamaViews("FOTOSSÍNTESE",
				new ViewGenerica("COMO OCORRE A FOTOSSÍNTESE?", "Fotossintese.txt", "fotossintese.jpg"), 110));

		frame.getContentPane().add(botoes.chamaViews("EFEITO ESTUFA",
				new ViewGenerica("O PROCESSO DO EFEITO ESTUFA", "EfeitoEstufa.txt", "Efeito_estufa.jpg"), 155));

		frame.getContentPane().add(botoes.chamaViews("COMBUSTÃO",
				new ViewGenerica("COMO ACONTECE A COMBUSTÃO?", "Combustao.txt", "combustao.jpeg"), 200));

	}
}