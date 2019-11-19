package estudosjavabasico.aplicacao;

import java.util.ArrayList;
import java.util.List;

import estudosjavabasico.entidade.Produto;

public class Aplicacao {
  public static void main(String[] args) {
    
    List<Produto> produtos = new ArrayList<>();
    
    produtos.add(new Produto("Tv", 900.00));
    produtos.add(new Produto("Notebook", 1200.00));
    produtos.add(new Produto("Celular", 1700.00));
    
    produtos.sort(new MinhaComparacao());
    
    for (Produto produto : produtos) {
      System.out.println(produto);
    }
    
    
  }

}
