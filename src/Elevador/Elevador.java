package Elevador;

import java.util.concurrent.Semaphore;

public class Elevador extends Thread {

	Tela tela;
	int F;
	int inicial;
	int atual;
	Semaphore semaforo = new Semaphore(1);

	int index, in, des;

	public Elevador(int f, int andarIn) {
		F = f;
		inicial = andarIn;
		atual = inicial;
	}

	public void usarElevador(int id, int andarIn, int andarDes, Tela telapredio) {
		try {
			semaforo.acquire();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.tela = telapredio;
		index = id;
		in = andarIn;
		des = andarDes;

		try {
			sleep(500 + (int) (Math.random() * 1000.0));

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		entrar();

		try {
			sleep(300 + (int) (Math.random() * 1000.0));

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		sair();

		atual = in;
		atual = des;
		semaforo.release();
		
		try {
			sleep(500 + (int) (Math.random() * 1000.0));

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void vacuo() {
		try {
			sleep(200 + (int) (Math.random() * 1000.0));

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void entrar() {
		if (index == 0) {
			
			if (in == 4) {
				
				tela.Elevador.setBounds(250, 50, 100, 100);
				tela.Portas.setBounds(350, 50, 100, 100);	
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				
				tela.boneco.setBounds(250, 50, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}

			if (in == 3) {
				tela.Elevador.setBounds(250, 165, 100, 100);
				tela.Portas.setBounds(350, 165, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco.setBounds(250, 165, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (in == 2) {
				tela.Elevador.setBounds(250, 260, 100, 100);
				tela.Portas.setBounds(350, 260, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco.setBounds(250, 260, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (in == 1) {
				tela.Elevador.setBounds(250, 374, 100, 100);
				tela.Portas.setBounds(350, 374, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco.setBounds(250, 374, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (in == 0) {
				tela.Elevador.setBounds(250, 480, 100, 100);
				tela.Portas.setBounds(350, 480, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco.setBounds(250, 480, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
		}
		if (index == 1) {
			if (in == 4) {
				tela.Elevador.setBounds(250, 50, 100, 100);
				tela.Portas.setBounds(350, 50, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco1.setBounds(250, 50, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}

			if (in == 3) {
				tela.Elevador.setBounds(250, 165, 100, 100);
				tela.Portas.setBounds(350, 165, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco1.setBounds(250, 165, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (in == 2) {
				tela.Elevador.setBounds(250, 260, 100, 100);
				tela.Portas.setBounds(350, 260, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco1.setBounds(250, 260, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (in == 1) {
				tela.Elevador.setBounds(250, 374, 100, 100);
				tela.Portas.setBounds(350, 374, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco1.setBounds(250, 374, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (in == 0) {
				tela.Elevador.setBounds(250, 480, 100, 100);
				tela.Portas.setBounds(350, 480, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco1.setBounds(250, 480, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
		}
		if (index == 2) {
			if (in == 4) {
				tela.Elevador.setBounds(250, 50, 100, 100);
				tela.Portas.setBounds(350, 50, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco2.setBounds(250, 50, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}

			if (in == 3) {
				tela.Elevador.setBounds(250, 165, 100, 100);
				tela.Portas.setBounds(350, 165, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco2.setBounds(250, 165, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (in == 2) {
				tela.Elevador.setBounds(250, 260, 300, 600);
				tela.Portas.setBounds(350, 260, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco2.setBounds(250, 260, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (in == 1) {
				tela.Elevador.setBounds(250, 374, 100, 100);
				tela.Portas.setBounds(350, 374, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco2.setBounds(250, 374, 100, 100);
				vacuo();
			}
			if (in == 0) {
				tela.Elevador.setBounds(250, 480, 100, 100);
				tela.Portas.setBounds(350, 480, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco2.setBounds(250, 480, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
		}
		if (index == 3) {
			if (in == 4) {
				tela.Elevador.setBounds(250, 50, 100, 100);
				tela.Portas.setBounds(350, 50, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco3.setBounds(250, 50, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}

			if (in == 3) {
				tela.Elevador.setBounds(250,  165, 100, 100);
				tela.Portas.setBounds(350, 165, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco3.setBounds(250, 165, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (in == 2) {
				tela.Elevador.setBounds(250, 260, 300, 600);
				tela.Portas.setBounds(350, 260, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco3.setBounds(250, 260, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (in == 1) {
				tela.Elevador.setBounds(250, 374, 100, 100);
				tela.Portas.setBounds(350, 374, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco3.setBounds(250, 374, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (in == 0) {
				tela.Elevador.setBounds(250, 480, 100, 100);
				tela.Portas.setBounds(350, 480, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco3.setBounds(250, 480, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
		}
		if (index == 4) {
			if (in == 4) {
				tela.Elevador.setBounds(250, 50, 100, 100);
				tela.Portas.setBounds(350, 50, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco4.setBounds(250, 50, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}

			if (in == 3) {
				tela.Elevador.setBounds(250, 165, 100, 100);
				tela.Portas.setBounds(350, 165, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco4.setBounds(250, 165, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (in == 2) {
				tela.Elevador.setBounds(250, 260, 100, 100);
				tela.Portas.setBounds(350, 260, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco4.setBounds(250, 260, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (in == 1) {
				tela.Elevador.setBounds(250, 374, 100, 100);
				tela.Portas.setBounds(350, 374, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco4.setBounds(250, 374, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (in == 0) {
				tela.Elevador.setBounds(250, 480, 100, 100);
				tela.Portas.setBounds(350, 480, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco4.setBounds(250, 480, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
		}

	}

	public void sair() {
		if (index == 0) {
			if (des == 4) {
				tela.boneco.setBounds(250, 50, 100, 100);
				tela.Portas.setBounds(350, 50, 100, 100);
				tela.Elevador.setBounds(250, 50, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco.setBounds(150, 50, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}

			if (des == 3) {
				tela.boneco.setBounds(250, 165, 100, 100);
				tela.Portas.setBounds(350, 165, 100, 100);
				tela.Elevador.setBounds(250, 165, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco.setBounds(150, 165, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (des == 2) {
				tela.boneco.setBounds(250, 260, 100, 100);
				tela.Portas.setBounds(350, 260, 100, 100);
				tela.Elevador.setBounds(250, 260, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco.setBounds(150, 260, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (des == 1) {
				tela.boneco.setBounds(250, 374, 100, 100);
				tela.Portas.setBounds(350, 374, 100, 100);
				tela.Elevador.setBounds(250, 374, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco.setBounds(150, 374, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (des == 0) {
				tela.boneco.setBounds(250, 480, 100, 100);
				tela.Portas.setBounds(350, 480, 100, 100);
				tela.Elevador.setBounds(250, 480, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco.setBounds(150, 480, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
		}
		if (index == 1) {
			if (des == 4) {
				tela.boneco1.setBounds(250, 50, 100, 100);
				tela.Portas.setBounds(350, 50, 100, 100);
				tela.Elevador.setBounds(250, 50, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco1.setBounds(150, 50, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}

			if (des == 3) {
				tela.boneco1.setBounds(250, 165, 100, 100);
				tela.Portas.setBounds(350, 165, 100, 100);
				tela.Elevador.setBounds(250, 165, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco1.setBounds(150, 165, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (des == 2) {
				tela.boneco1.setBounds(250, 260, 100, 100);
				tela.Portas.setBounds(350, 260, 100, 100);
				tela.Elevador.setBounds(250, 260, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco1.setBounds(150, 260, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (des == 1) {
				tela.boneco1.setBounds(250, 374, 100, 100);
				tela.Portas.setBounds(350, 374, 100, 100);
				tela.Elevador.setBounds(250, 374, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco1.setBounds(150, 374, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (des == 0) {
				tela.boneco1.setBounds(250, 480, 100, 100);
				tela.Portas.setBounds(350, 480, 100, 100);
				tela.Elevador.setBounds(250, 480, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco1.setBounds(150, 480, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
		}
		if (index == 2) {
			if (des == 4) {
				tela.boneco2.setBounds(250, 50, 100, 100);
				tela.Portas.setBounds(350, 50, 100, 100);
				tela.Elevador.setBounds(250, 50, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco2.setBounds(150, 50, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}

			if (des == 3) {
				tela.boneco2.setBounds(250, 165, 100, 100);
				tela.Portas.setBounds(350, 165, 100, 100);
				tela.Elevador.setBounds(250, 165, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco2.setBounds(150, 165, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (des == 2) {
				tela.boneco2.setBounds(250, 260, 100, 100);
				tela.Portas.setBounds(350, 260, 100, 100);
				tela.Elevador.setBounds(250, 260, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco2.setBounds(150, 260, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (des == 1) {
				tela.boneco2.setBounds(250, 374, 100, 100);
				tela.Portas.setBounds(350, 374, 100, 100);
				tela.Elevador.setBounds(250, 374, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco2.setBounds(150, 374, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (des == 0) {
				tela.boneco2.setBounds(250, 480, 100, 100);
				tela.Portas.setBounds(350, 480, 100, 100);
				tela.Elevador.setBounds(250, 480, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco2.setBounds(150, 475, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
		}
		if (index == 3) {
			if (des == 4) {
				tela.boneco3.setBounds(250, 50, 100, 100);
				tela.Portas.setBounds(350, 50, 100, 100);
				tela.Elevador.setBounds(250, 50, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco3.setBounds(150, 50, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);

			}

			if (des == 3) {
				tela.boneco3.setBounds(250, 165, 100, 100);
				tela.Portas.setBounds(350, 165, 100, 100);
				tela.Elevador.setBounds(250, 165, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco3.setBounds(150, 165, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (des == 2) {
				tela.boneco3.setBounds(250, 260, 100, 100);
				tela.Portas.setBounds(350, 260, 100, 100);
				tela.Elevador.setBounds(250, 260, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco3.setBounds(150, 260, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (des == 1) {
				tela.boneco3.setBounds(250, 374, 100, 100);
				tela.Portas.setBounds(350, 374, 100, 100);
				tela.Elevador.setBounds(250, 374, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco3.setBounds(150, 374, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (des == 0) {
				tela.boneco3.setBounds(250, 480, 100, 100);
				tela.Portas.setBounds(350, 480, 100, 100);
				tela.Elevador.setBounds(250, 480, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco3.setBounds(150, 475, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
		}
		if (index == 4) {
			if (des == 4) {
				tela.boneco4.setBounds(250, 50, 100, 100);
				tela.Portas.setBounds(350, 50, 100, 100);
				tela.Elevador.setBounds(250, 50, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco4.setBounds(150, 50, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}

			if (des == 3) {
				tela.boneco4.setBounds(250, 165, 100, 100);
				tela.Portas.setBounds(350, 165, 100, 100);
				tela.Elevador.setBounds(250, 165, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco4.setBounds(150, 165, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (des == 2) {
				tela.boneco4.setBounds(250, 260, 100, 100);
				tela.Portas.setBounds(350, 260, 100, 100);
				tela.Elevador.setBounds(250, 260, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco4.setBounds(150, 260, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (des == 1) {
				tela.boneco4.setBounds(250, 374, 100, 100);
				tela.Portas.setBounds(350, 374, 100, 100);
				tela.Elevador.setBounds(250, 374, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco4.setBounds(150, 374, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
			if (des == 0) {
				tela.boneco4.setBounds(250, 480, 100, 100);
				tela.Portas.setBounds(350, 480, 100, 100);
				tela.Elevador.setBounds(250, 480, 100, 100);
				vacuo();
				tela.Portas.setVisible(false);
				vacuo();
				tela.boneco4.setBounds(150, 480, 100, 100);
				vacuo();
				tela.Portas.setVisible(true);
			}
		}
	}
}