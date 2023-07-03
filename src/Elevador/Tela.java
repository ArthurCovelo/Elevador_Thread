package Elevador;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;
	public static Tela instance;
	public JLabel[] bonecos;
	public JLabel Elevador, Portas, predio, fundo, elevador;

	public Tela(int n) {
		instance = this;
		setLayout(null); // Configura o null Layout
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 750);
		setResizable(false);
		bonecos = new JLabel[n];
		for (int i = 0; i < bonecos.length; i++) {
			bonecos[i] = new JLabel();
			bonecos[i].setBounds(500, 630 - i * (int) Predio.altura - 100, 100, 100);
			bonecos[i].setIcon(new ImageIcon("Image/Boneco.png"));
			bonecos[i].setVisible(false);

			add(bonecos[i]);
		}
		Elevador();
		this.portas();
		this.Predio();
		background();
		
		repaint(100);
	}

	public void background() {
		fundo = new JLabel();
		fundo.setBounds(0, 0, 1000, 750);
		fundo.setVisible(true);
		fundo.setIcon(new ImageIcon("Image/Background.jpg"));

		add(fundo);
	}
	public void Elevador() {
		elevador = new JLabel();
		elevador.setBounds(250, 460, 100, 100);
		elevador.setVisible(true);
		elevador.setIcon(new ImageIcon("Image/Elevador.png"));

		add(elevador);
	}
	public void portas() {
		Portas = new JLabel();
		Portas.setBounds(350, 460, 100, 100);
		Portas.setVisible(true);
		Portas.setIcon(new ImageIcon("Image/Porta.png"));

		add(Portas);
	}

	public void Predio() {
		predio = new JLabel();
		predio.setBounds(100, 80, 800, 630);
		predio.setVisible(true);
		predio.setIcon(new ImageIcon("Image/Fundo.png"));
		add(predio);
	}
}
