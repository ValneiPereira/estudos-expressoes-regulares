package estudosjavabasico.aplicacao;

import javax.swing.JOptionPane;

public class Boletim {

  public static void main(String[] args) {
    String nota1 = JOptionPane.showInputDialog("Informe a nota 1");
    String nota2 = JOptionPane.showInputDialog("Informe a nota 2");
    String nota3 = JOptionPane.showInputDialog("Informe a nota 3");
    String nota4 = JOptionPane.showInputDialog("Informe a nota 4");

    double dNota1 = Double.parseDouble(nota1);
    double dNota2 = Double.parseDouble(nota2);
    double dNota3 = Double.parseDouble(nota3);
    double dNota4 = Double.parseDouble(nota4);

    double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;
    if (media >= 50) {
      if (media >= 70) {
        JOptionPane.showMessageDialog(null, "Aluno esta APROVADO! com a media: " + media);
      } else {
        JOptionPane.showMessageDialog(null, "Aluno esta RECUPERACAO! com a media: " + media, null, JOptionPane.WARNING_MESSAGE, null);
      }
    } else {
      JOptionPane.showMessageDialog(null, "Aluno esta REPROVADO! :" + media, null, JOptionPane.ERROR_MESSAGE, null);
    }

  }

}
