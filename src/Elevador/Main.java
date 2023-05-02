package Elevador;

import java.util.Random;

public class Main {
	
	public static void main(String[] args) {

			Passageiro[] passageiro;
			Tela telapredio = new Tela();
		
			Random rand = new Random();

			int F = 5;
			int n = 5;
		
			Predio predio = new Predio();
			predio.run(F);
			
			passageiro = new Passageiro[n];
			
			int index1, index2, index3, index4, index5;
			
			for (int i = 0; i < n; i++) {
				int in = rand.nextInt(F);
				int des = rand.nextInt(F);
				while (des == in) {
					des = rand.nextInt(F);
				}
				passageiro[i] = new Passageiro(i, in, des, predio.getElevador(), telapredio);
				passageiro[i].start();
				
				try {
					passageiro[i].join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			//Inicial
			index1 = passageiro[0].Inicial;
			index2 = passageiro[1].Inicial;
			index3 = passageiro[2].Inicial;
			index4 = passageiro[3].Inicial;
			index5 = passageiro[4].Inicial;
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
			telapredio.boneco.setVisible(true);
			telapredio.boneco1.setVisible(true);
			telapredio.boneco2.setVisible(true);
			telapredio.boneco3.setVisible(true);
			telapredio.boneco4.setVisible(true);

			for (int i = 0; i < n; i++) {
				passageiro[i].chamada();
			}
	}

}
