// 2. Crie um programa em Java que recebe dois (2) números inteiros e imprime todos os números no intervalo do primeiro e o segundo.Considereosegundomaiordoqueoprimeiro.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Informe o inicio: ");
    int inicio = scanner.nextInt();

    System.out.println("Agora o fim: ");
    int fim = scanner.nextInt();

    int c = inicio + 1;
    while(c < fim) System.out.println(c++); 
  }
}