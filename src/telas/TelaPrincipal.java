package telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class TelaPrincipal extends JFrame implements ActionListener{
	
	private JMenuBar jmb = new JMenuBar();
	private JMenu jogos = new JMenu("Jogos");
	private JMenuItem jogoVelha = new JMenuItem("Jogo da Velha");
	private JDesktopPane desk = new JDesktopPane();
	
	
	public TelaPrincipal() {
		setSize(800,600);
		
		setJMenuBar(jmb);
		jmb.add(jogos);
		jogos.add(jogoVelha);
		
		jogoVelha.addActionListener(this);
		add(desk);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TelaPrincipal();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==jogoVelha) {
			TelaJogoVelha tjv = new TelaJogoVelha();
			desk.add(tjv);
		}
		
	}
}
