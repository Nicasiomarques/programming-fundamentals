// 2. Escrever um programa que solicite um salário ao utilizador e mostre o imposto a pagar.  Se o salário for negativo ou zero mostre o erro respectivo.  Se o salário for maior que 1000 paga 10% de imposto, senão paga apenas 5%.

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Digite o seu salario: ");
    float salario = scanner.nextFloat();

    if(salario <= 0) {
      System.out.println("Verifique o seu salario há algo de errado!");
    }

    if (salario > 1000) {
      System.out.println("O seu imposto é de: "+ salario * 0.1);
    }else {
      System.out.println("O seu imposto é de: "+ salario * 0.05);
    }    
  }
}