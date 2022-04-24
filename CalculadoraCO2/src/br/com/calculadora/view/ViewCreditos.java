package br.com.calculadora.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.calculadora.componentes.Botoes;
import javax.swing.JLabel;
import java.awt.Font;

public class ViewCreditos extends JDialog {

	private static final long serialVersionUID = -1263841398235751017L;
	private final JPanel contentPanel = new JPanel();
	private Botoes botao = new Botoes();

	public static void main(String[] args) {
		try {
			ViewCreditos dialog = new ViewCreditos();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ViewCreditos() {
		getContentPane().setBackground(Color.WHITE);
		setBackground(Color.WHITE);
		setBounds(100, 100, 500, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		contentPanel.add(botao.botaoVoltar(this));
		
		JLabel lblNewLabel = new JLabel("Cr\u00E9ditos do projeto:");
		lblNewLabel.setFont(new Font("Monospaced", Font.BOLD, 15));
		lblNewLabel.setBounds(74, 43, 185, 20);
		contentPanel.add(lblNewLabel);
	}
}
