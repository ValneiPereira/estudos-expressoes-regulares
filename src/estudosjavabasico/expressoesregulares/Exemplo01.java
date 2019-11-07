package estudosjavabasico.expressoesregulares;

public class Exemplo01 {

  public static String retornaSeguinte(String texto) {
    StringBuilder retorno = new StringBuilder();
    //todos os digitos
    retorno.append(texto.replaceAll("\\d", ""));

    //tira qualquer digito
    String parteNumerica = texto.replaceAll("\\D", "");

    //qualquer caracter serm digito
    int numero = Integer.valueOf(parteNumerica);

    retorno.append(++numero);

    return retorno.toString();
    }

  public static void main(String[] args) {
    System.out.println(retornaSeguinte("ABC401"));

  }
}
