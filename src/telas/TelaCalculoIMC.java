package telas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class TelaCalculoIMC extends JInternalFrame implements ActionListener {

	private static TelaCalculoIMC tela;

	private FlowLayout layout = new FlowLayout();

	private JLabel alt = new JLabel("Altura:");
	private JLabel pes = new JLabel("Peso:");
	private JTextField altura = new JTextField(10);
	private JTextField peso = new JTextField(10);

	private JButton calculoIMC = new JButton("Calcular IMC");

	private JLabel resultado = new JLabel("Resultado: ");

	public TelaCalculoIMC() {
		super("Calculo do IMC", true, true, true);
		setLayout(layout);
		setSize(400, 300);

		add(alt);
		add(altura);
		add(pes);
		add(peso);
		add(calculoIMC);
		calculoIMC.addActionListener(this);

		add(resultado);

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		double alturaEmMetros = Double.parseDouble(altura.getText());
		;
		double pesoEmQuilogramas = Double.parseDouble(peso.getText());
		;
		double imc = pesoEmQuilogramas / (alturaEmMetros * alturaEmMetros);

		String r = "";
		JOptionPane.showMessageDialog(null, "IMC " + imc);

		if (imc < 20) {
			r = "Abaixo do peso ideal";
		} else if (imc >= 20 && imc < 25) {
			r = "Peso ideal";
		} else if (imc > 25 && imc < 30) {
			r = "Sobrepeso";
		} else if (imc >= 30 && imc < 35) {
			r = "Obesidade Moderada";
		} else if (imc >= 35 && imc < 40) {
			r = "Obesidade Severa";
		} else if (imc >= 40 && imc < 50) {
			r = "Obesidade Mórbida";
		} else if (imc > 50) {
			r = "Super-Obesidade";
		}
		
		String result="";
		JOptionPane.showMessageDialog(null, r);
		resultado.setText(r);
	}
	
	

}
