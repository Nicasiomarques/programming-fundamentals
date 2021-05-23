// 4. Calcular o salário líquido de um funcionário. Será informado seu nome, seu salário base e o desconto do INSS (11%, por exemplo). Formula: salarioLiquido = Base – Base * Desconto / 100.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Seu nome: ");
    String nome = scanner.nextLine();

    System.out.println("Digite o seu salario: ");
    float Salario = scanner.nextFloat();

    System.out.println("Valor do esconto INSS(%): ");
    float INSS = scanner.nextFloat();

    float salarioLiquido = Salario - (Salario * (INSS / 100));

    System.out.println("Senhor " + nome + " o seu salario liquido é de " + salarioLiquido);
  }
}