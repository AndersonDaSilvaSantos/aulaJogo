package telas;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class TelaJogoVelha extends JInternalFrame implements ActionListener {
	private static TelaJogoVelha tela;

	List<JButton> botoes = new ArrayList<JButton>();
	private String valorAtual = "X";

	private FlowLayout layout = new FlowLayout();

	public TelaJogoVelha() {
		super("Jogo da Velha", true, true, true);
		setLayout(layout);
		setSize(400, 300);
		JButton botao;
		for (int i = 0; i < 9; i++) {
			botao = new JButton();
			botoes.add(botao);
			botao.setPreferredSize(new Dimension(50, 50));
			botao.addActionListener(this);
			add(botao);
		}

		setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton botaoClicado = (JButton) e.getSource();
		if (valorAtual == "X") {

			valorAtual = "0";
		} else {

			valorAtual = "X";
		}
		//valorAtual = valorAtual == "X" ? "0" : "X"; Outra alternativa
		botaoClicado.setText(valorAtual);

	}

}
