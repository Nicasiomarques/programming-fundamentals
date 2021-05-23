
/**
 * 3. Faça um programa que lê 30 números e mostra o vector
* ordenado em forma decrescente.
 */
import java.util.Scanner;

public class ex13 {
  public static void ordernarCrecente(int[] arr) {
    int aux = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          aux = arr[i];
          arr[i] = arr[j];
          arr[j] = aux;
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int numbers[] = new int[5];

    for (int i = 0; i < numbers.length; i++) {
      System.out.println("Informe até 5 valores: ");
      numbers[i] = keyboard.nextInt();
    }

    ordernarCrecente(numbers);

    for (int j : numbers) {
      System.out.println(j);
    }
  }
}