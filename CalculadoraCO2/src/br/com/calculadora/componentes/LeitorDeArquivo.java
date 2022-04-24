package br.com.calculadora.componentes;

import java.awt.Color;
import java.awt.Component;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

class LeitorDeArquivo extends JFrame {

	private static final long serialVersionUID = 5750292563409359477L;

	private void leitorDeArquivoTxt(String string, JTextArea jta) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File(string), "UTF-8");
			while (scanner.hasNextLine()) {
				jta.append(scanner.nextLine() + "\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private JLabel labelArquivoImg(String nomeDaImg) {
		JLabel lblImagem = new JLabel();
		lblImagem.setIcon(new ImageIcon(nomeDaImg));
		lblImagem.setBounds(0, 0, 450, 350);
		
		return lblImagem;
	}
	
	private Component textArea (String nomeArquivo) {
		JTextArea jta = new JTextArea();
		jta.setBorder(null);
		jta.setEditable(false);
		jta.setBounds(0, 0, 600, 240);
		jta.setBackground(Color.WHITE);
		leitorDeArquivoTxt(nomeArquivo, jta);
		
		return jta;
	}
	
	protected void textoEmTela(String nomeArquivo) {
		JDialog view = new JDialog();
		view.setBounds(145, 150, 610, 300);
		view.setVisible(true);
		view.add(textArea(nomeArquivo));
	}
	
	protected void imagemEmTela(String nomeArquivo) {
		JDialog view = new JDialog();
		view.setBounds(220, 250, 460, 375);
		view.setVisible(true);
		view.add(labelArquivoImg(nomeArquivo));
	}
}