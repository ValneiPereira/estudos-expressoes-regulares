package estudosjavabasico.aplicacaoenum;

import estudosjavabasico.enumeradores.Operacao;

public class Calculadora {

  public static void main(String[] args) {
    double x= 2.0;
    double y= 3.0;
    
    for (Operacao operacao : Operacao.values()) {
      System.out.print(x+" ");
      System.out.print(operacao.toString()+ " ");
      System.out.print(y +"= ");
      System.out.println(operacao.executarOperacao(x , y));
    }
    
    
  }

}
