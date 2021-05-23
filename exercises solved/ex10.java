// 3. O sistema de avaliação de determinada disciplina, é composto por três provas. A primeira prova tem peso 2, a segunda tem peso 3 e a terceira tem peso 5. Faça um programa em java para calcular a média final de um aluno desta disciplina.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite a 1ª nota: ");
    float n1 = scanner.nextFloat();

    System.out.println("Digite a 2ª nota: ");
    float n2 = scanner.nextFloat();

    System.out.println("Digite a 3ª nota: ");
    float n3 = scanner.nextFloat();

    float media = (n1 * 0.2f) + (n2 * 0.3f) + (n3 *0.5f);  

      System.out.println("A sua media é: "+ media);
  }
}