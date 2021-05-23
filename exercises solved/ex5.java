//1. Crie um programa em Java que recebe uma quantidade de infinita de números inteiros, só termina quando digitar um número Negativo. O programa deverá imprimir a quantidade de números lidos menores que 8.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num, totalMaior8 = 0;
    do {
      System.out.println("informe o numero: ");
      num = scanner.nextInt();

      if(num < 8 && num >= 0) totalMaior8++;
    } while(num > 0);

    System.out.println("Quantidade de numeros digitados maiores que 8: "+totalMaior8);    
  }
}