package Elevador;

public class Passageiro extends Thread {

	int id;
	int Inicial;
	int Des;
	Elevador elevador;
	Tela tela;

	public Passageiro(int index, int inicial, int des, Elevador elevador, Tela tela) {
		id = index;
		Inicial = inicial;
		Des = des;
		this.elevador = elevador;
		this.tela = tela;
	}

	public void chamada() {
		elevador.usarElevador(id, Inicial, Des, tela);
	}

}