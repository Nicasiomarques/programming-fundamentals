
/* 1- Identifique e explica o(s) erro(s) na classe abaixo.
 * O lapso consta no incremento do contador em 3 valores mas ainda assim
 * chegamos ao fim da execução com o valor 100 no contador
 */
public class Ex1 {
  public static void main(String[] args) {
    int contator = 0;
    while (contator != 100)
      contator = contator + 3;
  }
}