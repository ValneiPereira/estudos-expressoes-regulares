package estudosjavabasico.comparacao;

import java.util.Comparator;

import estudosjavabasico.entidade.Cliente;

public class ComparacaoCliente implements Comparator<Cliente>{

  @Override
  public int compare(Cliente c1, Cliente c2) {

    return c1.getSalario().compareTo(c2.getSalario());
    
  }

}
