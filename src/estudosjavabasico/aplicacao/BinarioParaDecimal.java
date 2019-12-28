package estudosjavabasico.aplicacao;

import java.util.Scanner;

public class BinarioParaDecimal {

  public static void main(String[] args) {

    Scanner ler      = new Scanner(System.in);
    String  entrada  = ler.next();
    int     potencia = 0;
    int     decimal  = 0;
    for (int i = entrada.length() - 1; i >= 0; i--) {
      decimal += Math.pow(2, potencia) * Character.getNumericValue(entrada.charAt(i));
      potencia++;
    }
    System.out.println(decimal);

  }

}
