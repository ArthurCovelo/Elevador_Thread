package Elevador;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Passageiro[] passageiros;
		Tela telapredio ;

		Random rand = new Random();

		int F = 5; // Número de andares no prédio
		int n = 5; // Número de passageiros

		telapredio = new Tela(n);
		
		Predio predio = new Predio(F);
	 // Inicializa o prédio com o número de andares

		passageiros = new Passageiro[n];


		// Criação dos passageiros com andares de origem e destino aleatórios
		int[] velorIn = new int[F];
		int[] velorDes = new int[F];
		
		velorDes[0] = 0;
		for( int i = 1; i < F; i++) {
			velorDes[i] = i;
		}
		velorIn[0] = 0;
		for( int i = 1; i < F; i++) {
			velorIn[i] = i;
		}
		for (int i = 0; i < n; i++) {
			int in = rand.nextInt(F); // Andar de origem aleatório
			int des = rand.nextInt(F); // Andar de destino aleatório
			
			
			// Verifica se o andar de destino é igual ao andar de origem e gera um novo
			// andar de destino até que sejam diferentes
			while (des == in) {
				des = rand.nextInt(F);
			}

			passageiros[i] = new Passageiro(i, in, des, predio.getElevador(), telapredio);
			passageiros[i].start();
		}

		
		// Define a posição do boneco 1 com base no andar de origem do primeiro passageiro
		for(int i = 0; i < passageiros.length; i++) {
			telapredio.bonecos[i].setBounds(400, 630 - (int)Predio.altura * passageiros[i].InPos, 100, 100);
			
		}
		// Torna os bonecos visíveis na tela
		for(int i = 0; i < passageiros.length; i++) {
			telapredio.bonecos[i].setVisible(true);
		}
			
	}
}