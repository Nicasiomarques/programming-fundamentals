// 3. Crie um programa em Java que imprime a média aritmética de vários valores positivos múltiplos de 2, lidos a partir do teclado. Oprograma termina de ler caso seja inserido um valor negativo.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int totalDeDigitados = 0;
    float num, soma = 0;
    do {
      System.out.println("informe o numero: ");
      num = scanner.nextFloat();
      if(num > 0) {
        soma += num;
        totalDeDigitados++;
      }
    } while(num > 0);
    float media = soma / totalDeDigitados;
    System.out.println("A media dos valore é: "+media);    
  }
}