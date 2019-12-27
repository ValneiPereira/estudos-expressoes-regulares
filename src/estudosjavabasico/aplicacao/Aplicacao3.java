package estudosjavabasico.aplicacao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import estudosjavabasico.entidade.Cliente;

public class Aplicacao3 {
  
  public static int compare(Cliente c1, Cliente c2) {

    return c1.getSalario().compareTo(c2.getSalario()) ;
    
  }
  
  public static void main(String[] args) {

    List<Cliente> clientes = new ArrayList<>();

    clientes.add(new Cliente("valnei", new BigDecimal(1000.00)));
    clientes.add(new Cliente("Drielle", new BigDecimal(1300.00)));
    clientes.add(new Cliente("amanda", new BigDecimal(800.00)));
    
    
    /*passando uma  funcao como argumento de outra funcao, 
    a funcao objeto de 1 ordem, pode ser passado como argumento e retornado por uma funcao.*/ 
    clientes.sort(Aplicacao3::compare );
    
    for (Cliente cliente : clientes) {
      System.out.println(cliente);
    }

  }

}
