package expressoesregulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegulares {

  public static void main(String[] args) {
    /* ====== meta caracteres ========*/
    // \d - todos os digitos
    // \D - tudo que nao for digito
    // \s - espaço em branco \t \n \f \r
    // \S - caractere que nao é branco
    // \w - procurar por caracteres de palavras a-z-A-Z, digitos e _
    // \W - tudo que nao for uma palavra
    // [] -
    //Quantificadores procurar por uma ou mais ocorrencias
    //  ? - zero ou uma;
    //  * - zero ou mais;
    //  + - uma ou mais;
    //{n,m} de n ate m;
    //()  - utilizado para agrupar
    // |  - utilizado para ou
    // $  - algo que esteja no fim da linha
    // .  - coringa pode subtituido por qualquer coisa. ex: 1.3 = 123,133,1A3,1#3, 1 3;
    // o(v|c)o = ovo, oco
    // maca(rr|c)ão = macarrão ou macacão
    // ^  - [^abc] busca tudo que nao for abc
    /*String busca = "0[xX]([0-9a-fA-F])+(\\s|$)";
    String texto = "12 0x 0x 0x01FFABC 0x10G 0x1";
    String busca = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+";
    String busca = "\\d\\d/\\d\\d/\\d\\d\\d\\d";
    String busca = "\\d{2}/\\d{2}/\\d{2,4}";
    String texto = "05/10/2010 05/05/2015 1/1/01 01/05/95";// dd/MM/yyyy
    */    
    
    
    String busca = "proj([^,])*";
    String texto = "proj1.bkp, proj1.java, proj1.class, projfinal.java, proj2.bkp, proj3.bkp, proj3.java";
    Pattern padrao = Pattern.compile(busca);
    Matcher matcher = padrao.matcher(texto);
    System.out.println("texto: " + texto);
    System.out.println("indice: 012345678901234567");
    System.out.println("expressoes :" + matcher.pattern());
    System.out.println("posicao encontrada");
    while (matcher.find()) {
      System.out.println(matcher.start() + " "+ matcher.group());
 
    }
    //System.out.println(numeroHeX);

  }
}
