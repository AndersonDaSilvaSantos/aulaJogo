package principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import telas.TelaCalculadora;
import telas.TelaCalculoIMC;
import telas.TelaJogoForca;
import telas.TelaJogoVelha;

public class Principal extends JFrame implements ActionListener {

	private JMenuBar jmb = new JMenuBar();
	private JMenu jogos = new JMenu("Jogos");
	private JMenu utilitarios = new JMenu("Utilitários");
	private JMenuItem jogoVelha = new JMenuItem("Jogo da Velha");
	private JMenuItem jogoForca = new JMenuItem("Jogo da Forca");
	private JMenuItem calculadora = new JMenuItem("Calculadora");
	private JMenuItem calcuLoIMC = new JMenuItem("Calculo do IMC");
	private JDesktopPane desk = new JDesktopPane();
	private TelaJogoVelha telaJogoVelha;
	private TelaJogoForca telaJogoForca;
	private TelaCalculadora telaCalculadora;
	private TelaCalculoIMC telaCalculoIMC;

	public Principal() {
		setSize(800, 600);

		setJMenuBar(jmb);
		jmb.add(jogos);
		jogos.add(jogoVelha);
		jogos.add(jogoForca);
		jogos.add(calculadora);
		jogos.add(calcuLoIMC);

		jogoVelha.addActionListener(this);
		add(desk);
		setVisible(true);

		jogoForca.addActionListener(this);
		add(desk);
		setVisible(true);

		calculadora.addActionListener(this);
		add(desk);
		setVisible(true);

		calcuLoIMC.addActionListener(this);
		add(desk);
		setVisible(true);

	}

	public static void main(String[] args) {
		Principal p = new Principal();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jogoVelha) {
			if (telaJogoVelha == null) {
				telaJogoVelha = new TelaJogoVelha();
				desk.add(telaJogoVelha);
			}

		}

		if (e.getSource() == jogoForca) {
			if (telaJogoForca == null) {
				telaJogoForca = new TelaJogoForca();
				desk.add(telaJogoForca);
			}
		}

		if (e.getSource() == calculadora) {
			if (telaCalculadora == null) {
				telaCalculadora = new TelaCalculadora();
				desk.add(telaCalculadora);
			}

		}

		if (e.getSource() == calcuLoIMC) {
			if (telaCalculoIMC == null) {
				telaCalculoIMC = new TelaCalculoIMC();
				desk.add(telaCalculoIMC);
			}

		}
	}
}
