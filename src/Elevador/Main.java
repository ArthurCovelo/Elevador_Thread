package Elevador;

import java.util.Random;

public class Main {

	public static void main(String[] args) {

		Passageiro[] passageiro;
		Tela telapredio = new Tela();

		Random rand = new Random();

		int F = 5; // Número de andares no prédio
		int n = 5; // Número de passageiros

		Predio predio = new Predio();
		predio.run(F); // Inicializa o prédio com o número de andares

		passageiro = new Passageiro[n];

		int index1, index2, index3, index4, index5;

		// Criação dos passageiros com andares de origem e destino aleatórios
		for (int i = 0; i < n; i++) {
			int in = rand.nextInt(F); // Andar de origem aleatório
			int des = rand.nextInt(F); // Andar de destino aleatório

			// Verifica se o andar de destino é igual ao andar de origem e gera um novo
			// andar de destino até que sejam diferentes
			while (des == in) {
				des = rand.nextInt(F);
			}

			passageiro[i] = new Passageiro(i, in, des, predio.getElevador(), telapredio);
			passageiro[i].start();

		}

		// Define a posição inicial dos bonecos na tela com base no andar de origem dos
		// passageiros
		index1 = passageiro[0].Inicial;
		index2 = passageiro[1].Inicial;
		index3 = passageiro[2].Inicial;
		index4 = passageiro[3].Inicial;
		index5 = passageiro[4].Inicial;

		// Define a posição do boneco 1 com base no andar de origem do primeiro passageiro
		if (index1 == 4) {
			telapredio.boneco.setBounds(400, 50, 100, 100);
		}
		if (index1 == 3) {
			telapredio.boneco.setBounds(400, 165, 100, 100);
		}
		if (index1 == 2) {
			telapredio.boneco.setBounds(400, 260, 100, 100);
		}
		if (index1 == 1) {
			telapredio.boneco.setBounds(400, 374, 100, 100);
		}
		if (index1 == 0) {
			telapredio.boneco.setBounds(400, 480, 100, 100);
		}

		// Define a posição do boneco 2 com base no andar de origem do segundo passageiro
		if (index2 == 4) {
			telapredio.boneco1.setBounds(400, 50, 100, 100);
		}
		if (index2 == 3) {
			telapredio.boneco1.setBounds(400, 165, 100, 100);
		}
		if (index2 == 2) {
			telapredio.boneco1.setBounds(400, 260, 100, 100);
		}
		if (index2 == 1) {
			telapredio.boneco1.setBounds(400, 374, 100, 100);
		}
		if (index2 == 0) {
			telapredio.boneco1.setBounds(400, 480, 100, 100);
		}

		// Define a posição do boneco 3 com base no andar de origem do terceiro passageiro
		if (index3 == 4) {
			telapredio.boneco2.setBounds(400, 50, 100, 100);
		}
		if (index3 == 3) {
			telapredio.boneco2.setBounds(400, 165, 100, 100);
		}
		if (index3 == 2) {
			telapredio.boneco2.setBounds(400, 260, 100, 100);
		}
		if (index3 == 1) {
			telapredio.boneco2.setBounds(400, 374, 100, 100);
		}
		if (index3 == 0) {
			telapredio.boneco2.setBounds(400, 480, 100, 100);
		}

		// Define a posição do boneco 4 com base no andar de origem do quarto passageiro
		if (index4 == 4) {
			telapredio.boneco3.setBounds(400, 50, 100, 100);
		}
		if (index4 == 3) {
			telapredio.boneco3.setBounds(400, 164, 100, 100);
		}
		if (index4 == 2) {
			telapredio.boneco3.setBounds(400, 260, 100, 100);
		}
		if (index4 == 1) {
			telapredio.boneco3.setBounds(400, 374, 100, 100);
		}
		if (index4 == 0) {
			telapredio.boneco3.setBounds(400, 480, 100, 100);
		}

		// Define a posição do boneco 5 com base no andar de origem do quinto passageiro
		if (index5 == 4) {
			telapredio.boneco4.setBounds(400, 50, 100, 100);
		}
		if (index5 == 3) {
			telapredio.boneco4.setBounds(400, 165, 100, 100);
		}
		if (index5 == 2) {
			telapredio.boneco4.setBounds(400, 260, 100, 100);
		}
		if (index5 == 1) {
			telapredio.boneco4.setBounds(400, 374, 100, 100);
		}
		if (index5 == 0) {
			telapredio.boneco4.setBounds(400, 480, 100, 100);
		}

		// Torna os bonecos visíveis na tela
		telapredio.boneco.setVisible(true);
		telapredio.boneco1.setVisible(true);
		telapredio.boneco2.setVisible(true);
		telapredio.boneco3.setVisible(true);
		telapredio.boneco4.setVisible(true);

		for (Passageiro p : passageiro) {
			p.comecar(); // Começa a execução dos passageiros
			System.out.println("Pronto");
		}

		// Thread que realiza as chamadas dos passageiros
		new Thread(new Runnable() {
			public void run() {
				for (int i = 0; i < n; i++) {
					passageiro[i].chamada(); // Faz a chamada do passageiro
					System.out.println("Rodando...");
				}
			}
		}).start();
	}
}
