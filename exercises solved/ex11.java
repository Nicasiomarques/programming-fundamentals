
/**
 * 1. Faça um programa que recebe uma quantidade de números determinados pelo
 * utilizador e imprime-os de forma inversa.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class ex11 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    int num = 0;

    do {
      if (num < 0)
        return;
      System.out.println("Informe os numeros: ");
      num = keyboard.nextInt();
      numbers.add(num);
    } while (num > 0);

    for (int i = numbers.size() - 1; i >= 0; i--) {
      System.out.println(numbers.get(i));
    }
  }
}
