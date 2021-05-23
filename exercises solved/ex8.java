// 1. Crie um programa que recebe o salário de um trabalhador e o valor da prestação de um empréstimo, se a prestação for maior que 20% do salário imprimir: Empréstimo não concedido, caso contrário imprimir: Empréstimo concedido.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite o seu salario: ");
    float salario = scanner.nextFloat();

    System.out.println("Digite da pestação: ");
    float prestacao = scanner.nextFloat();

    if (prestacao > salario * 0.2) {
      System.out.println("Emprestimo não concedido");
    } else {
      System.out.println("Emprestimo concedido");
    } 
  }
}