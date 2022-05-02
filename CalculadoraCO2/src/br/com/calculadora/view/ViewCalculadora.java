package br.com.calculadora.view;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.com.calculadora.componentes.Botoes;
import br.com.calculadora.funcoes.ChecaFuncoes;
import br.com.calculadora.funcoes.Combustiveis;
import br.com.calculadora.funcoes.LimitaCaracteres;
import br.com.calculadora.funcoes.LimitaCaracteres.TipoNumero;
import java.awt.event.ActionEvent;

public class ViewCalculadora extends JDialog {

	private static final long serialVersionUID = -8257849889926054941L;

	private final JPanel contentPanel = new JPanel();
	private double semanasDoAno = 52.1;
	private int co2AbsorvidoPorArvore = 25;
	private JTextField txtKmRodados;
	private JTextField txtDiasSemanas;
	private Botoes botoes = new Botoes();
	private ChecaFuncoes checador = new ChecaFuncoes();

	private JComboBox<Object> caixaCombustivel;

	public static void main(String[] args) {
		try {
			ViewCalculadora dialog = new ViewCalculadora();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ViewCalculadora() {
		setBackground(Color.WHITE);
		setForeground(Color.LIGHT_GRAY);
		setBounds(100, 100, 700, 400);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblKmsRodados = new JLabel("Insira os Km's rodados:");
		lblKmsRodados.setFont(new Font("Monospaced", Font.BOLD, 15));
		lblKmsRodados.setBounds(75, 11, 210, 25);
		contentPanel.add(lblKmsRodados);

		JLabel lblDiasSemana = new JLabel("Insira quantas vezes na semana voc\u00EA roda esses Km's:");
		lblDiasSemana.setFont(new Font("Monospaced", Font.BOLD, 15));
		lblDiasSemana.setBounds(75, 86, 470, 25);
		contentPanel.add(lblDiasSemana);

		JLabel lblCombustivel = new JLabel("Selecione o combust\u00EDvel:");
		lblCombustivel.setFont(new Font("Monospaced", Font.BOLD, 15));
		lblCombustivel.setBounds(75, 159, 225, 25);
		contentPanel.add(lblCombustivel);

		caixaCombustivel = new JComboBox<Object>();
		caixaCombustivel.setModel(new DefaultComboBoxModel<Object>(new Object[] { "<Selecione o combust\u00EDvel>",
				Combustiveis.Gasolina, Combustiveis.Etanol, Combustiveis.Diesel }));
		caixaCombustivel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		caixaCombustivel.setBounds(75, 195, 210, 22);
		contentPanel.add(caixaCombustivel);

		JButton btnCalculo = new JButton("Calcular");
		btnCalculo.addActionListener((ActionEvent e) -> checador.checaResultado(conta()));
		btnCalculo.setFont(new Font("Monospaced", Font.PLAIN, 15));
		btnCalculo.setBounds(284, 271, 115, 25);
		contentPanel.add(btnCalculo);

		txtKmRodados = new JTextField();
		txtKmRodados.setBounds(75, 47, 225, 25);
		txtKmRodados.setDocument(new LimitaCaracteres(100, TipoNumero.NUMERODECIMAL));
		contentPanel.add(txtKmRodados);
		txtKmRodados.setColumns(10);

		txtDiasSemanas = new JTextField();
		txtDiasSemanas.setDocument(new LimitaCaracteres(1, TipoNumero.NUMEROINTEIRO));
		txtDiasSemanas.setColumns(10);
		txtDiasSemanas.setBounds(75, 123, 225, 25);
		contentPanel.add(txtDiasSemanas);

		contentPanel.add(botoes.botaoVoltar(this));
		contentPanel.add(botoes.limpaCampos(txtKmRodados, 320, 47));
		contentPanel.add(botoes.limpaCampos(txtDiasSemanas, 320, 123));

	}

	private double caixaCombinacao() {
		checador.checaCaixaCombinacao(caixaCombustivel);
		

		if (caixaCombustivel.getSelectedItem().equals(Combustiveis.Gasolina))
			return Combustiveis.Gasolina.getValor();
		else if (caixaCombustivel.getSelectedItem().equals(Combustiveis.Etanol))
			return Combustiveis.Etanol.getValor();
		else
			return Combustiveis.Diesel.getValor();
	}

	private double conta() {
		checador.checaCampoTxt(txtDiasSemanas); 
		checador.checaCampoTxt(txtKmRodados);
		
		double conta = (checador.conversor(txtDiasSemanas.getText()) * checador.conversor(txtKmRodados.getText())
				* caixaCombinacao() * semanasDoAno) / co2AbsorvidoPorArvore;
		
		return Math.ceil(conta);
	}
}