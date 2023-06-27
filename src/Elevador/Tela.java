package Elevador;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela extends JFrame {

	private static final long serialVersionUID = 1L;

	public JLabel boneco, boneco1, boneco2, boneco3, boneco4, Elevador, Portas, Predio;;

	public Tela() {

		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 800, 630);
		setResizable(false);

		ArrayList<JLabel> ListadePassageiros = new ArrayList<JLabel>();
		boneco = new JLabel();
		boneco.setBounds(500, 90, 100, 100);
		boneco.setIcon(new ImageIcon("Image/Boneco.png"));
		boneco.setVisible(false);
		ListadePassageiros.add(boneco);

		add(boneco);

		boneco1 = new JLabel();
		boneco1.setBounds(500, 90, 100, 100);
		boneco1.setIcon(new ImageIcon("Image/Boneco.png"));
		boneco1.setVisible(false);
		ListadePassageiros.add(boneco1);

		add(boneco1);

		boneco2 = new JLabel();
		boneco2.setBounds(500, 90, 100, 100);
		boneco2.setIcon(new ImageIcon("Image/Boneco.png"));
		boneco2.setVisible(false);
		ListadePassageiros.add(boneco2);

		add(boneco2);

		boneco3 = new JLabel();
		boneco3.setBounds(500, 90, 100, 100);
		boneco3.setIcon(new ImageIcon("Image/Boneco.png"));
		boneco3.setVisible(false);
		ListadePassageiros.add(boneco3);

		add(boneco3);

		boneco4 = new JLabel();
		boneco4.setBounds(500, 90, 100, 100);
		boneco4.setIcon(new ImageIcon("Image/Boneco.png"));
		boneco4.setVisible(false);
		ListadePassageiros.add(boneco4);

		add(boneco4);

		Elevador = new JLabel();
		Elevador.setBounds(250, 460, 100, 100);
		Elevador.setVisible(true);
		Elevador.setIcon(new ImageIcon("Image/Elevador.png"));

		Predio = new JLabel();
		Predio.setBounds(-270, 50, 800, 630);
		Predio.setVisible(true);
		Predio.setIcon(new ImageIcon("Image/Fundo.png"));

		Portas = new JLabel();
		Portas.setBounds(350, 460, 100, 100);
		Portas.setVisible(true);
		Portas.setIcon(new ImageIcon("Image/Porta.png"));

		add(Portas);
		add(Predio);
		add(Elevador);

		repaint(100);

	}

}
