package controller;
import java.util.concurrent.Semaphore;

public class Cruzamento extends Thread {
  private int Carro;
  private String sentido;
  private Semaphore semaphore;

  public Cruzamento(int Carro, Semaphore semaphore) {
	this.semaphore = semaphore;
    this.Carro= Carro;
  }

  public void run() {
    try {
      semaphore.acquire();
      PassandoCruzamento();
    } catch (Exception error) {
        error.printStackTrace();
    } 
    finally {
      semaphore.release();
    }
  }

  private void PassandoCruzamento() {

	if (Carro==1) {
			sentido = "Sul - Descendo";
	}
	if (Carro==2) {
		sentido = "Sul - Descendo";
	}
	if (Carro==3) {
		sentido = "Sul - Descendo";
	}
	if (Carro==4) {
		sentido = "Sul - Descendo";
	}
	System.out.println("O Carro " + Carro+ " seguiu para " + sentido);
  }
}