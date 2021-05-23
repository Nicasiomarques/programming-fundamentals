//  3. Implementar um programa que peça o nome e três notas de um aluno. O mesmo deve calcular a média.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o 1ª: ");
    float n1 = scanner.nextFloat();

    System.out.println("Digite o 2ª: ");
    float n2 = scanner.nextFloat();

    System.out.println("Digite o 3ª: ");
    float n3 = scanner.nextFloat();

    float media = (n1 + n2 + n3)/3;
    
    System.out.println(media);
  }
}
