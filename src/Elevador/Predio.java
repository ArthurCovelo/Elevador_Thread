package Elevador;

public class Predio {

	
	Elevador elevador;
	public static float altura = 115;

	public Predio(int f) {
		elevador = new Elevador(f);
		Elevador.destino = 0;
		elevador.start();
	}

	public Elevador getElevador() {
		return this.elevador;
	}

}