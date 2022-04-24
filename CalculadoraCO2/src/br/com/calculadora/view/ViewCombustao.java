package br.com.calculadora.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.calculadora.componentes.Botoes;

public class ViewCombustao extends JDialog {

	private static final long serialVersionUID = 1317357236794042131L;
	private final JPanel contentPanel = new JPanel();
	private Botoes botoes = new Botoes();
	
	public static void main(String[] args) {
		try {
			ViewCombustao dialog = new ViewCombustao();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ViewCombustao() {
		getContentPane().setBackground(Color.WHITE);
		setBackground(Color.WHITE);
		setBounds(100, 100, 700, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblTitulo = new JLabel("COMO OCORRE A COMBUSTÃO?");
		lblTitulo.setFont(new Font("Monospaced", Font.BOLD, 15));
		lblTitulo.setBounds(217, 15, 250, 20);
		contentPanel.add(lblTitulo);

		contentPanel.add(botoes.visualizarTexto("Combustao.txt"));
		contentPanel.add(botoes.visualizarImg("fotossintese.jpg"));
		contentPanel.add(botoes.botaoVoltar(this));
	}

}