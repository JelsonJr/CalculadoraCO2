package br.com.calculadora.componentes;

import java.awt.Color;

import java.awt.Component;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextArea;

class LeitorDeArquivo {

	private void leitorDeTexto(String string, JTextArea jta) {
		Scanner scanner;
		try {
			scanner = new Scanner(new File(string), "UTF-8");
			while (scanner.hasNextLine()) {
				jta.append(scanner.nextLine() + "\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private JLabel insereArquivoImg(String nomeDaImg) {
		JLabel lblImagem = new JLabel();
		lblImagem.setIcon(new ImageIcon(nomeDaImg));
		lblImagem.setBounds(0, 0, 450, 350);
		
		return lblImagem;
	}
	
	private Component insereArquivoTexto(String nomeArquivo) {
		JTextArea jta = new JTextArea();
		jta.setBorder(null);
		jta.setEditable(false);
		jta.setBounds(0, 0, 600, 240);
		jta.setBackground(Color.WHITE);
		leitorDeTexto(nomeArquivo, jta);
		
		return jta;
	}
	
	protected void exibeTexto(String nomeArquivo) {
		JDialog view = new JDialog();
		view.setBounds(145, 150, 610, 300);
		view.setVisible(true);
		view.add(insereArquivoTexto(nomeArquivo));
	}
	
	protected void exibeImagem(String nomeArquivo) {
		JDialog view = new JDialog();
		view.setBounds(220, 250, 460, 375);
		view.setVisible(true);
		view.add(insereArquivoImg(nomeArquivo));
	}
}