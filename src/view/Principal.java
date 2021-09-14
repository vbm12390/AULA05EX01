package view;

import java.util.concurrent.Semaphore;
import controller.Cruzamento;

class Principal {
  public static void main(String[] args) {
      int permissoes = 1;
      Semaphore semaphore = new Semaphore(permissoes);
      for (int Carro = 1; Carro <= 4; Carro++) {
        Thread tCarro = new Cruzamento(Carro, semaphore);
        tCarro.start();
      }
  }
} 