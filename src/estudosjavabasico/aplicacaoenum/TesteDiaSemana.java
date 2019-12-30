package estudosjavabasico.aplicacaoenum;

import estudosjavabasico.enumeradores.DiaSemana;
import estudosjavabasico.enumeradores.Genero;

public class TesteDiaSemana {

  public static void main(String[] args) {
    DiaSemana dia= DiaSemana.DOMINGO;
    System.out.println(dia.toString()+" - "+ dia.getValor());
    Genero sexo = Genero.MASCULINO;
    System.out.println(sexo.toString()+" - "+ sexo.getValor());

  }

}
