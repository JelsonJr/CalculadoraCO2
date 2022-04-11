package br.com.calculadora.view;

import java.awt.BorderLayout;

import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.com.calculadora.componentes.Botoes;

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
		setBounds(100, 100, 700, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		contentPanel.add(botoes.botaoVoltar(this));
		
	}

}
