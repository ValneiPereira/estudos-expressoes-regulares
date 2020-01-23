package estudosjavabasico.aplicacao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import estudosjavabasico.constantes.StatusAluno;
import estudosjavabasico.entidade.Aluno;
import estudosjavabasico.entidade.Curso;

public class Boletim {

  public static void main(String[] args) {

    List<Aluno> alunos = new ArrayList<Aluno>();
    
    /*É lista que dentro dela  temos uma  chave que identifica uma sequencia de valores*/
    HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();

    /*  List<Aluno> alunosAprovados   = new ArrayList<Aluno>();
        List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
        List<Aluno> alunosReprovados  = new ArrayList<Aluno>();*/

    String numeroAlunos = JOptionPane.showInputDialog("Informe a numero de alunos");

    for (int qtd = 1; qtd <= Integer.valueOf(numeroAlunos); qtd++) {
      Aluno  aluno = new Aluno();
      String nome  = JOptionPane.showInputDialog("Qual o nome do aluno " + qtd + "?");

      aluno.setNome(nome);

      /*Acrescentando numeros de disciplinas*/
      String numeroDisciplica = JOptionPane.showInputDialog("Informe a numero de disciplinas");
      for (int i = 1; i <= Integer.valueOf(numeroDisciplica); i++) {
        String nomeCurso = JOptionPane.showInputDialog("Informe nome do curso" + i + "?");
        String notaCurso = JOptionPane.showInputDialog("Informe a nota" + i + ":");
        Curso  curso     = new Curso();
        curso.setDisciplina(nomeCurso);
        curso.setNota(Double.valueOf(notaCurso));
        aluno.getCursos().add(curso);
      }

      /*Comando para remover*/
      int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover curso?");
      if (escolha == 0) {
        int continuarRemovendo = 0;
        int posicao            = 1;
        while (continuarRemovendo == 0) {
          String cursoRemover = JOptionPane.showInputDialog("Qual a disciplina");
          aluno.getCursos().remove(Integer.valueOf(cursoRemover).intValue() - posicao);
          posicao++;
          continuarRemovendo = JOptionPane.showConfirmDialog(null, "Continuar removendo");
        }
      }
      alunos.add(aluno);
    }
    
    maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
    maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
    maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
    
    for (Aluno aluno : alunos) {
      if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
        maps.get(StatusAluno.APROVADO).add(aluno);
      }else if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
        maps.get(StatusAluno.RECUPERACAO).add(aluno);  
      }else if(aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.REPROVADO)) {
        maps.get(StatusAluno.REPROVADO).add(aluno);
      }
      
    }
    
    System.out.println("========== Listas dos aprovados ==========");
    for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
      System.out.println("Nome = " + aluno.getNome() + " resultado = " + aluno.getAlunoAprovado() + " com media de=" + aluno.getMediaNota());
    }
    
    System.out.println("========== Listas dos recuperacao ==========");
    for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
      System.out.println("Nome = " + aluno.getNome() + " resultado = " + aluno.getAlunoAprovado() + " com media de=" + aluno.getMediaNota());
    }
    
    System.out.println("========== Listas dos reprovados ==========");
    for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
      
      System.out.println("Nome = " + aluno.getNome() + " resultado = " + aluno.getAlunoAprovado() + " com media de=" + aluno.getMediaNota());
    }
    
    
    /*forEach JAVA 8*/
    /*alunosAprovados.forEach(aluno -> {
      if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
        alunosAprovados.add(aluno);
      } else if (aluno.getAlunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
        alunosRecuperacao.add(aluno);
      } else {
        alunosReprovados.add(aluno);
      }
    });*/

    /*    for (int pos = 0; pos < alunos.size(); pos++) {
      Aluno aluno = alunos.get(pos);
      if (aluno.getNome().equalsIgnoreCase("valnei")) {
        Aluno trocar = new Aluno();
        trocar.setNome("foi trocado");
        Curso curso = new Curso();
        curso.setDisciplina("Matematica");
        curso.setNota(90);
        trocar.getCursos().add(curso);
        alunos.set(pos, trocar);
        aluno = alunos.get(pos);
      }
      System.out.println("Nome do aluno   : " + aluno.getNome());
      System.out.println("Media do aluno  : " + aluno.getMediaNota());
      System.out.println("Resultado       : " + aluno.getAlunoAprovado());
      System.out.println("=======================================================================");
      for (Curso curso : aluno.getCursos()) {
        System.out.println("Curso   :" + curso.getDisciplina());
      }
    }*/

    /*for (Aluno aluno : alunos) {
      if (aluno.getNome().equalsIgnoreCase("valnei")) {
        alunos.remove(aluno);
        break;
      }else {
        System.out.println("Nome do aluno   : " + aluno.getNome());
        System.out.println("Cursos do aluno : " + aluno.getCursos());
        System.out.println("Media do aluno  : " + aluno.getMediaNota());
        System.out.println("Resultado       : " + aluno.getAlunoAprovado());
        System.out.println("=======================================================================");
      }
    }
    for (Aluno aluno : alunos) {
      System.out.println("********** Alunos que sobraram na lista: **********");
      System.out.println("Nome do aluno     :"+aluno.getNome());
      System.out.println("Suas materias sao :");
      for (Curso curso : aluno.getCursos()) {
        System.out.println("Materia do aluno :" + curso.getDisciplina());
        
      }
    }*/

  }

}
