package Elevador;

import java.util.concurrent.Semaphore;

public class Passageiro extends Thread {

	public int InPos, DesPos, index;
	Elevador elevador;
	Tela tela;

	boolean chegou = false;
	
	public Semaphore semaforo = new Semaphore(1);

	public Passageiro(int index, int inicial, int des, Elevador elevador, Tela tela) {
		InPos = inicial;
		DesPos = des;
		this.elevador = elevador;
		this.tela = tela;
		this.index = index;
	}

	public void usarElevador(int andarIn, int andarDes, Tela telapredio) {
		chamarElevador();
		MyWait();
		MyWait();
		entrar();
		MyWait();
		MyWait();
		ChegouDestino();
		MyWait();
		MyWait();
		sair();
		MyWait();
		MyWait();

		chegou = true;

	}

	public void MyWait() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	void chamarElevador() {
		Elevador.SetDestino(InPos, this);
	}

	void AbrirPorta() {
		elevador.AbrePorta();
	}

	public void entrar() {
		try {
			semaforo.acquire();
			tela.bonecos[index].setBounds(250, 630 - (int) Predio.altura * InPos, 100, 100);
			Elevador.SetDestino(DesPos, this);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	void FecharPorta() {
		elevador.FecharPorta();
	}

	void ChegouDestino() {
		tela.bonecos[index].setBounds(250, 630 - (int) Predio.altura * DesPos, 100, 100);
		semaforo.release();
		
	}

	public void sair() {
		tela.bonecos[index].setBounds(125, 630 - (int) Predio.altura * DesPos, 100, 100);
		Elevador.requisitante = null;
	}

	@Override
	public void run() {
		while (!chegou) {
			try {
				Elevador.semaforo.acquire();
				usarElevador(InPos, DesPos, tela);
				Elevador.semaforo.release();

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
