package estudosjavabasico.aplicacao;

import java.util.ArrayList;
import java.util.List;

import estudosjavabasico.entidade.Produto;

public class Aplicacao {
  public static void main(String[] args) {
    
    
    List<Produto> produtos = new ArrayList<>();
    
    produtos.add(new Produto("c", 900.00));
    produtos.add(new Produto("b", 1200.00));
    produtos.add(new Produto("a", 1700.00));
    
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
    
    
    
    produtos.sort((p1,p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));
    for (Produto produto : produtos) {
      System.out.println(produto.toString().toUpperCase());
    }
    
  }

}
