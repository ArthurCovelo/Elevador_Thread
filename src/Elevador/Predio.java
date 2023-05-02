package Elevador;

public class Predio {

	int In = 0;

	Elevador elevador;

	public Predio() {
	}

	public void run(int F) {
		elevador = new Elevador(F, In);
	}

	public Elevador getElevador() {
		return this.elevador;
	}

}