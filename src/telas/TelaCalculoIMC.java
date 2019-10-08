package telas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
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

		double altura = 0;
		double peso = 0;
		double imc;
		
		imc = peso / (altura * altura);
		
		String r="";
		
		 if(imc < 18.5){
             r = "Abaixo do peso";
         }
         else if(imc < 24.9){
        	 r = "Peso ideal";
         }
         else if(imc < 29.9){
        	 r = "Levemente acima do peso";
         }
         else if(imc < 34.9){
        	 r = "Primeiro grau de obesidade";
         }
         else if(imc < 39.9){
        	 r = "Segundo grau de obesidade";
         }
         else {
        	 r = "Obesidade mórbida";
         }
		 resultado.setText(r);
          

	}

}
