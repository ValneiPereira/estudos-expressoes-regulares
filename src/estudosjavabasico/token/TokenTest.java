package estudosjavabasico.token;

public class TokenTest {

  public static void main(String[] args) {
    String str =" Valnei9, Paulo6, Agusto5, Joana4, Camelia3, Anna2, John5, Matheus6";
    String[] tokens = str.split("\\d  ");
    for (String string : tokens) {
      System.out.println(string.trim());
    }

  }

}
