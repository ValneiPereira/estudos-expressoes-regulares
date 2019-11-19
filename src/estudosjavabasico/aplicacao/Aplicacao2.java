package estudosjavabasico.aplicacao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import estudosjavabasico.entidade.Cliente;

public class Aplicacao2 {
  public static void main(String[] args) {

    List<Cliente> clientes = new ArrayList<>();

    clientes.add(new Cliente("valnei", new BigDecimal(1000.00)));
    clientes.add(new Cliente("Drielle", new BigDecimal(1300.00)));
    clientes.add(new Cliente("amanda", new BigDecimal(800.00)));
    
    /*Comparator<Produto> compara = new Comparator<Produto>() {
    
    @Override
    public int compare(Produto p1, Produto p2) {
      
      return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
    }
    
  };
  */
  /*Comparator<Produto> compara = (p1,p2) -> {
    return p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());// tem apenas uma linha pode melhorar
  };*/
  
  //Comparator<Produto> compara = (p1,p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
    
    
    
    /*public Vendedor getPiorVendedor() {
      Vendedor piorVendedor = new Vendedor();
      piorVendedor = listaVendedores.get(0);
      for (Vendedor vendedor : listaVendedores) {
        if (vendedor.getSalario().compareTo(piorVendedor.getSalario()) == -1) {
          piorVendedor = vendedor;
        }
    
      }
      return piorVendedor;
    }*/
    
    
    


    clientes.sort((c1,c2) -> c1.getSalario().compareTo(c2.getSalario()));
    
    for (Cliente cliente : clientes) {
      System.out.println(cliente);
    }

  }

}
