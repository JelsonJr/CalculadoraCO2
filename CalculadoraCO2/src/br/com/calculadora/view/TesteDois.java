package br.com.calculadora.view;

import javax.swing.JDialog;

//TESTDOIS EXTENDE TESTE, TESTE EXTENDE JDIALOG, ENTÃO TESTEDOIS TAMBÉM É UMA JDIALOG
public class TesteDois extends Teste {

	private static final long serialVersionUID = 1L;
	
	public static void main(String[] args) {
		//AQUI EU ESTOU CHAMANDO A CLASSE, PARA QUE ELA RODE E SEJA EXIBIDA EM TELA, ELA FUNCIONA.
		TesteDois teste = new TesteDois("O Processo do Efeito Estufa", "EfeitoEstufa.txt", "Efeito_estufa.jpg");
		teste.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		teste.setVisible(true);
	}
	
	//EU NÃO PRECISEI REESCREVER TUDO AQUILO, EU APENAS HERDEI E CHAMEI SUPER() PARA HERDAR TODA AQUELA CONSTRUÇÃO
	public TesteDois(String titulo, String arquivoDeTexto, String arquivoDeImagem) {
		super(titulo, arquivoDeTexto, arquivoDeImagem);
	}

}