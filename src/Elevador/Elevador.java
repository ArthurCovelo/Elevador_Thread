package Elevador;

public class Elevador {

	Tela tela;
	int F;
	public int inicial;
	public int atual;

	public Elevador(int f, int andarIn) {
		F = f;
		inicial = andarIn;
		atual = inicial;
	}
}