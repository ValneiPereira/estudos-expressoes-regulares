package estudosjavabasico.entidade;

public class Curso {
  private double nota;
  private String disciplina;

  public double getNota() {
    return nota;
  }

  public void setNota(double nota) {
    this.nota = nota;
  }

  public String getDisciplina() {
    return disciplina;
  }

  public void setDisciplina(String disciplina) {
    this.disciplina = disciplina;
  }

  @Override
  public String toString() {
    return "Curso : disciplina = " + disciplina + ", nota : " + nota + ";";
  }

}
