package br.com.calculadora.view;

import java.awt.Color;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
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

		frame.getContentPane().add(botoes.chamaViews("CALCULAR", 65, new ViewCalculadora()));

		frame.getContentPane().add(botoes.chamaViews("FOTOSSÍNTESE", 110, new ViewFotossintese()));

		frame.getContentPane().add(botoes.chamaViews("EFEITO ESTUFA", 155, new ViewEfeitoEstufa()));

		frame.getContentPane().add(botoes.chamaViews("COMBUSTÃO", 200, new ViewCombustao()));

		JButton btnCreditos = new JButton("Cr\u00E9ditos");
		btnCreditos.addActionListener((ActionEvent e) -> frameCreditos());
		btnCreditos.setBounds(6, 315, 90, 30);
		frame.getContentPane().add(btnCreditos);
	}

	private void frameCreditos() {
		ViewCreditos view = new ViewCreditos();
		view.setSize(700, 400);
		view.setVisible(true);
	}
}