package estudosjavabasico.aplicacao;

public class OperadoresTernarios {

  public static void main(String[] args) {
    int nota1  = 60;
    int nota2  = 50;
    int nota3  = 50;
    int nota4  = 50;
    int media  = 0;
    int numero = 0;

    media = (nota1 + nota2 + nota3 + nota4) / 4;
    /*Condiçoes logicas IF e ELSE*/
    /*==================================================================*/
    /*if(media>=70) {
      System.out.println("Aluno Aprovado "+media);
    }else if(media>=40 && media>=69){
      System.out.println("Aluno Recuperacao "+media);
    }else {
      System.out.println("Aluno Reprovado "+media);
    }*/
    /*==================================================================*/
    /*Ternarios*/
    /*String saidaResultado = media >= 70 ? "Aprovado" :(media>=40 && media<=69)?"Recuperacao":"Reprovado";
    
    System.out.println(saidaResultado);*/
    /*==================================================================*/
    /*while (numero <=10) {//verifica e depois o codigo
      System.out.println("O numero atual é: " + numero);
      numero++;
    }*/
    /*==================================================================*/
    /*do {
      System.out.println("O numero atual é: " + numero);
      numero++;
    } while (numero<=10);*/
    /*==================================================================*/

    /*for (int i = 0; i <= 10; i++) {
      System.out.println("O numero : " +i );
      if (i==7) {
        System.out.println("Achei o : " +i );
        break;
      }*/
    for (int i = 0; i <= 10; i++) {
      if (i == 3 || i == 6 || i == 9) {
        System.out.println("Achei o : " + i);
        continue;
      }
      System.out.println("Processando laço de repetição");

    }

  }

}
