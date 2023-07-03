package Elevador;

import java.util.concurrent.Semaphore;

public class Elevador extends Thread {

	public static final int F = 5;
	Tela tela;
	static int destino = -1;
	public static Semaphore semaforo = new Semaphore(1);

	public static Passageiro requisitante;

	public Elevador(int f) {
		f = F;
		tela = Tela.instance;
	}

	public void AbrePorta() {
		tela.Portas.setVisible(false);
	}

	public void FecharPorta() {
		tela.Portas.setVisible(true);
	}

	private void VisitarAndar() {
		tela.elevador.setBounds(250, 630 - (int) Predio.altura * destino, 100, 100);
		tela.Portas.setBounds(350, 630 - (int) Predio.altura * destino, 100, 100);
	}

	public void MyWait() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public static void SetDestino(int d, Passageiro p) {
		destino = d;
		requisitante = p;
	}

	@Override
	public void run() {
//		VisitarAndar();
		while (true) {
			if (requisitante != null) {
				VisitarAndar();
				MyWait();
				AbrePorta();
				MyWait();
				MyWait();
				FecharPorta();
				MyWait();
			}
		}
	}

}