
/**
 * 4- Cria, um programa que recebe duas strings em Maiúsculo que depois de uma
comparação entre as duas strings retorna um valor inteiro, calculado segundo o
seguinte algoritmo:
• Inicializar uma variável acumulador com o valor zero (0),
• Para cada posição nas duas strings, compare os dois caracteres na
mesma posição,
• Se os caracteres forem exatamente iguais, some +3 pontos ao valor da
variável acumulador,
• Se os caracteres forem as combinações ’A’ e ’T’ ou ’T’ e ’A’, some +1
ponto ao valor da variável acumulador,
• Se os caracteres forem as combinações ’C’ e ’G’ ou ’G’ e ’C’, some +1
ponto ao valor da variável acumulador,
• Quando terminarem os caracteres de uma das strings, o valor
acumulado será o valor a ser retornado pelo programa.

Exemplo: Se os valores das duas strings forem “ACATTG” e “ATTCCG”, o valor a
ser retornado será 3+0+1+0+0+3 = 7.
 */

import java.util.Scanner;

public class Ex17 {

  public static int takesLongestString(String s1, String s2) {
    return (s1.length() > s2.length() ? s2 : s1).length();
  }

  public static boolean onePointCombination(String str, String combination) {
    return str.charAt(0) == combination.charAt(0) && str.charAt(1) == combination.charAt(1)
        || str.charAt(0) == combination.charAt(1) && str.charAt(1) == combination.charAt(0);
  }

  public static int checkHowMuchAdd(String[] s) {
    int acumulator = 0;
    boolean isOnePointCombination = false;
    for (int i = 0; i < takesLongestString(s[0], s[1]); i++) {
      isOnePointCombination = onePointCombination(s[0].charAt(i) + "" + s[1].charAt(i), "AT")
          || onePointCombination(s[0].charAt(i) + "" + s[1].charAt(i), "CG");

      if (isOnePointCombination)
        acumulator += 1;

      if (s[0].charAt(i) == s[1].charAt(i))
        acumulator += 3;
    }
    return acumulator;
  }

  public static String[] requestWords() {
    Scanner T = new Scanner(System.in);

    System.out.println("Informe  palavra 1: ");
    String word1 = T.next().toUpperCase();

    System.out.println("Informe  palavra 2: ");
    String word2 = T.next().toUpperCase();

    String[] words = { word1, word2 };
    return words;
  }

  public static void main(String[] args) {
    int acumulator = checkHowMuchAdd(requestWords());
    System.out.println(acumulator);
  }
}
