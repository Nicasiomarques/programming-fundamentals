
/**
 * 2- Escreva um programa em Java que simula uma calculadora. Esse programa deve
ler dois valores float do teclado e um caracter, correspondente a uma das
operações básicas (+, -, * ou /), calcular a operação e imprimir o resultado. O
programa deve considerar divisões por zero como sendo erros, e imprimir uma
mensagem adequada.
 */

import java.util.Scanner;

public class Ex15 {
  public static void main(String[] args) {
    Scanner T = new Scanner(System.in);

    System.out.println("Digite o 1ª valor: ");
    float v1 = T.nextFloat();

    System.out.println("Simbolo da operação(+, -, /, %): ");
    String operation = T.next();

    System.out.println("Digite o 2ª valor: ");
    float v2 = T.nextFloat();

    switch (operation) {
      case "+":
        System.out.printf("%.2f + %.2f = %.2f", v1, v2, (v1 + v2));
        break;
      case "-":
        System.out.printf("%.2f - %.2f = %.2f", v1, v2, (v1 - v2));
        break;
      case "/":
        if (v2 == 0) {
          System.out.printf("Operação invalida");
        } else {
          System.out.printf("%.2f / %.2f = %.2f", v1, v2, (v1 / v2));
        }
        break;
      case "*":
        System.out.printf("%.2f * %.2f = %.2f", v1, v2, (v1 * v2));
        break;
      default:
        System.out.printf("Operação invalida");
        break;
    }
  }
}
