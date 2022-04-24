package br.com.calculadora.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionEvent;

public class ViewInicial {

	private JFrame frame;

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
		
		JButton btnCalculadora = new JButton("CALCULAR");
		btnCalculadora.addActionListener((ActionEvent e) -> frameCalculadora());
		btnCalculadora.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnCalculadora.setBounds(279, 65, 125, 25);
		frame.getContentPane().add(btnCalculadora);
		
		JButton btnFotossintese = new JButton("FOTOSS\u00CDNTESE");
		btnFotossintese.addActionListener((ActionEvent e) -> frameFotossintese());
		btnFotossintese.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnFotossintese.setBounds(279, 110, 125, 25);
		frame.getContentPane().add(btnFotossintese);
		
		JButton btnEfeitoEstufa = new JButton("EFEITO ESTUFA");
		btnEfeitoEstufa.addActionListener((ActionEvent e) -> frameEfeitoEstufa());
		btnEfeitoEstufa.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnEfeitoEstufa.setBounds(279, 155, 125, 25);
		frame.getContentPane().add(btnEfeitoEstufa);
		
		JButton btnCombustao = new JButton("COMBUST\u00C3O");
		btnCombustao.addActionListener((ActionEvent e) -> frameCombustao());
		btnCombustao.setFont(new Font("Monospaced", Font.PLAIN, 12));
		btnCombustao.setBounds(279, 200, 125, 25);
		frame.getContentPane().add(btnCombustao);
		
		JButton btnCreditos = new JButton("Cr\u00E9ditos");
		btnCreditos.addActionListener((ActionEvent e) -> frameCreditos());
		btnCreditos.setBounds(6, 315, 90, 30);
		frame.getContentPane().add(btnCreditos);
	}
	
	private void frameCalculadora() {
		ViewCalculadora view = new ViewCalculadora();
		view.setSize(700, 400);
		view.setVisible(true);
	}
	
	private void frameFotossintese() {
		ViewFotossintese view = new ViewFotossintese();
		view.setSize(700, 400);
		view.setVisible(true);
	}
	//teste
	private void frameEfeitoEstufa() {
		ViewEfeitoEstufa view = new ViewEfeitoEstufa();
		view.setSize(700, 400);
		view.setVisible(true);
	}
	
	private void frameCombustao() {
		ViewCombustao view = new ViewCombustao();
		view.setSize(700, 400);
		view.setVisible(true);
	}
	
	private void frameCreditos() {
		ViewCreditos view = new ViewCreditos();
		view.setSize(700, 400);
		view.setVisible(true);
	}
}