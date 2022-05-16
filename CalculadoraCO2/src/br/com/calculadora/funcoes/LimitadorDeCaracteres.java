package br.com.calculadora.funcoes;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class LimitadorDeCaracteres extends PlainDocument {
	
	private static final long serialVersionUID = 3800658577038803458L;

	public enum TipoNumero {
		NUMEROINTEIRO, NUMERODECIMAL;
	};
	
	private int qtdCaracteres;
	private TipoNumero tpNumero;
	
	public LimitadorDeCaracteres(int qtdCaracteres, TipoNumero tpNumero) {
		this.qtdCaracteres = qtdCaracteres;
		this.tpNumero = tpNumero;
	}
	
	@Override
	public void insertString(int i, String string, AttributeSet as) throws BadLocationException {
		if(string == null || getLength() == qtdCaracteres) {
			return;
		}
		int totalCaracteres = getLength() + string.length();
		//filtro de tipo de numeros/caracteres
		String regex = "";
		switch(tpNumero) {
			case NUMEROINTEIRO: regex = "[^1-7]"; break;
			case NUMERODECIMAL: regex = "[^0-9,.]"; break;
		}
		//substituindo
		string = string.replaceAll(regex, "");
		
		if(totalCaracteres <= qtdCaracteres){
			super.insertString(i, string, as);
		} else {
			String novaString = string.substring(0, qtdCaracteres);
			super.insertString(i, novaString, as);
		}
	}
}