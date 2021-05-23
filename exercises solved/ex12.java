/* 2. Faça um programa em Java que lê 20 números inteiros e mostra
o maior e o menor.*/

import java.util.Scanner;

public class ex12 {
  public static int menor(int[] arr) {
    int menor = arr[0];
    for (int i = 1; i < arr.length; i++)
      if (menor < arr[i])
        menor = arr[i];
    return menor;
  }

  public static int maior(int[] arr) {
    int maior = arr[0];
    for (int i = 1; i < arr.length; i++)
      if (maior > arr[i])
        maior = arr[i];
    return maior;
  }

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int numbers[] = new int[20];

    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Informe até 20 valores: ");
      numbers[i] = keyboard.nextInt();
    }

    System.out.println("O menor valor é: " + menor(numbers));
    System.out.println(" e o maior é: " + maior(numbers));
  }
}