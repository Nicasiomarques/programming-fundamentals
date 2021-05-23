// 2. Fazer um programa que depois de receber três números calcula as quatro operações aritméticas.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o 1ª: ");
    int n1 = scanner.nextInt();

    System.out.println("Digite o 2ª: ");
    int n2 = scanner.nextInt();

    System.out.println("Digite o 3ª: ");
    int n3 = scanner.nextInt();

    System.out.println(n1 + n2 + n3);
    System.out.println(n1 - n2 - n3);
    System.out.println(n1 * n2 * n3);
    System.out.println(n1 / n2 / n3);
  }
}
