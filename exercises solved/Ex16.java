/**
 * 3- Considera duas variáveis X e Y que podem assumir valores entre -100 e 100.
 * Escreva um programa em Java que imprime todos os valores de X e Y para os
 * quais a soma de X + Y seja igual a 100 ou igual a -100.
 */

public class Ex3 {
  public static void main(String[] args) throws Exception {
    for (int i = -100; i <= 100; i++) {
      for (int j = -100; j <= 100; j++) {
        if (i + j == 100 || i + j == -100) {
          System.out.printf("%d + %d = %d\n", i, j, (i + j));
        }
      }
    }
  }
}
