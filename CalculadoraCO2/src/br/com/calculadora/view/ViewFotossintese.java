package br.com.calculadora.view;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.calculadora.componentes.Botoes;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;

public class ViewFotossintese extends JDialog {

	private Botoes botoes = new Botoes();
	private static final long serialVersionUID = 68051319765757823L;
	private final JPanel contentPanel = new JPanel();

	public static void main(String[] args) {
		try {
			ViewFotossintese dialog = new ViewFotossintese();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ViewFotossintese() {
		getContentPane().setBackground(Color.WHITE);
		setBackground(Color.WHITE);
		setBounds(100, 100, 700, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblTitulo = new JLabel("COMO OCORRE A FOTOSS\u00CDNTESE?");
		lblTitulo.setFont(new Font("Monospaced", Font.BOLD, 15));
		lblTitulo.setBounds(217, 15, 250, 20);
		contentPanel.add(lblTitulo);

		contentPanel.add(botoes.visualizarTexto("Fotossintese.txt"));
		contentPanel.add(botoes.visualizarImg("fotossintese.jpg"));
		contentPanel.add(botoes.botaoVoltar(this));
	}
}