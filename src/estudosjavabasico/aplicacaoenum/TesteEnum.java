package estudosjavabasico.aplicacaoenum;

import estudosjavabasico.enumerador.DiaSemana;

public class TesteEnum {

  public static void main(String[] args) {
    DiaSemana[] dias = DiaSemana.values();

    for (int i = 0; i < dias.length; i++) {
      System.out.println(dias[i]);
    }
    /*for (DiaSemana diaSemana : dias) {
      System.out.println(diaSemana);
    }*/
    for (DiaSemana dia : DiaSemana.values()) {
      System.out.println(dia);
    }
    

  }
}
