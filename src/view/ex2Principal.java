package view;
	

	import java.util.concurrent.Semaphore;
	import controller.ex2controller;
	

	public class ex2Principal {
		
		public static void main(String[] args) {
			Semaphore semaforoCozinheiro = new Semaphore(5);
			Semaphore semaforoEntrega = new Semaphore(1);
			
			for(int i = 0; i < 20; i++) {
				ex2controller j = new ex2controller(semaforoCozinheiro, semaforoEntrega);
				j.start();
			}
		}
	}