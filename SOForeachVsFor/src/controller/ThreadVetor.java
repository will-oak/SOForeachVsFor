package controller;

public class ThreadVetor extends Thread {
	private int[] vetor;
	private int op;

	public ThreadVetor(int[] vetor, int op) {
		this.vetor = vetor;
		this.op = op;
	}

	@Override
	public void run() {
		if (op % 2 > 0) {
			execForeach();
		} else {
			execFor();
		}
	}

	private void execForeach() {
		double tempoInicio = System.nanoTime();
		
		for (int i : vetor) {
			
		}
		
		double tempoFinal = System.nanoTime();
		double total = (tempoFinal - tempoInicio) * (10 ^ 9);
		System.out.println("Foreach ==> " + total + "s");
	}

	private void execFor() {
		double tempoInicio = System.nanoTime();
		
		for (int i = 0; i < vetor.length; i++) {
			
		}
		
		double tempoFinal = System.nanoTime();
		double total = (tempoFinal - tempoInicio) * (10 ^ 9);
		
		System.out.println("For ==> " + total + "s");
	}

}
