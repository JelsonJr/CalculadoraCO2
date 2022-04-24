package br.com.calculadora.view;

import javax.swing.JDialog;

public class Teste2 extends Teste {

	private static final long serialVersionUID = 6918628253124731275L;
	
	public static void main(String[] args) {
		try {
			Teste2 dialog = new Teste2();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Teste2() {
		super("bebebe");
		System.out.println("rodando teste");
	}
}