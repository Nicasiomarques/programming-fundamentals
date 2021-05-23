
/**
 * 5- Uma string é chamada palíndroma se puder ser lida da esquerda para a direita
ou da direita para a esquerda da mesma forma. Exemplo, as strings “radar” e
“asa” são palíndromas. Escreva um programa que recebe uma string e diz se ela
é ou não palíndroma.
 */

import java.util.Scanner;

public class Ex5 {
  public static String invertString(String str) {
    String invertedString = "";
    for (int i = str.length() - 1; i >= 0; i--)
      invertedString += str.charAt(i);
    return invertedString;
  }

  public static void main(String[] args) throws Exception {
    Scanner T = new Scanner(System.in);

    System.out.println("Informe  palavra");
    String originalString = T.next();

    if (originalString.equalsIgnoreCase(invertString(originalString))) {
      System.out.println("É um palindromo!");
    } else {
      System.out.println("Não um palindromo!");
    }
  }
}
