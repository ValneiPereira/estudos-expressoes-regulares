package estudosjavabasico.aplicacao;

import javax.swing.JOptionPane;

public class Painel {

  public static void main(String[] args) {
    String produtos = JOptionPane.showInputDialog("Informe a quantidade de produtos!");
    String pessoas  = JOptionPane.showInputDialog("Informe a quantidade de pessoas!");

    double produtosNumero = Double.parseDouble(produtos);
    double pessoasNumero  = Double.parseDouble(pessoas);

    int    divisao = (int) (produtosNumero / pessoasNumero);
    double resto   = produtosNumero % pessoasNumero;

    int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da DIVISAO?");

    if (resposta == 0) {
      JOptionPane.showMessageDialog(null, "Divisao para pessoas deu " + divisao);
    } else {
      System.out.println("Não quiz ver o resultado");
    }

    resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o RESTO da divisão ?");
    if (resposta == 0) {
      JOptionPane.showMessageDialog(null, "o resto da divisao é " + resto);
    } else {
      System.out.println("Não quiz ver o resultado");
    }

  }

}
