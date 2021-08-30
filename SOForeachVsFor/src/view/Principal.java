package view;

import controller.ThreadVetor;

public class Principal {

	public static void main(String[] args) {
		int[] vetorNum = new int[1000];
		
		for (int i = 0; i < 1000; i++) {
			int numero = (int) ((Math.random() * 100) + 1);
			vetorNum[i] = numero;
		}
		
		ThreadVetor td1 = new ThreadVetor(vetorNum, 1);
		ThreadVetor td2 = new ThreadVetor(vetorNum, 2);
		
		td1.start();
		td2.start();
	}

}
