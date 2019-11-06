package expressoesregulares;

public class ExemploSemExpressao {

  public static String retornaSeguinte(String texto) {
    String incio = "", fim = "";

    for (int i = 0; i < texto.length(); i++) {
      Character caracter = texto.charAt(i);

      if (Character.isDigit(caracter)) {
        incio = texto.substring(0, i);
        fim = texto.substring(i, texto.length());
        break;
      }
    }
    fim = String.valueOf((Integer.valueOf(fim)) + 1);
    return incio + fim;
  }

  public static void main(String[] args) {
    System.out.println(retornaSeguinte("ABC29"));
  }
}
