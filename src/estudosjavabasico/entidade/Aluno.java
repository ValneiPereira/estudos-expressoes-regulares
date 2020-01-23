package estudosjavabasico.entidade;

import java.util.ArrayList;
import java.util.List;

import estudosjavabasico.constantes.StatusAluno;

public class Aluno {
  private String nome;
  private int    idade;
  private String dataNascimento;
  private String rg;
  private String cpf;

  private List<Curso> cursos = new ArrayList<Curso>();

  public Aluno() {

  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getRg() {
    return rg;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public List<Curso> getCursos() {
    return cursos;
  }

  public void setCursos(List<Curso> cursos) {
    this.cursos = cursos;
  }

  public double getMediaNota() {
    double somaNotas = 0.0;
    for (Curso curso : cursos) {
      somaNotas += curso.getNota();
    }
    return somaNotas / cursos.size();

  }

  public String getAlunoAprovado() {
    double media = getMediaNota();

    if (media >= 50) {
      if (media >= 70) {
        return StatusAluno.APROVADO;
      } else {
        return StatusAluno.RECUPERACAO;
      }
    } else {
      return StatusAluno.REPROVADO;
    }
  } 

  @Override
  public int hashCode() {
    final int prime  = 31;
    int       result = 1;
    result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Aluno other = (Aluno) obj;
    if (cpf == null) {
      if (other.cpf != null)
        return false;
    } else if (!cpf.equals(other.cpf))
      return false;
    return true;
  }

  @Override
  public String toString() {
    return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", rg=" + rg + ", cpf=" + cpf + ", cursos=" + cursos + "]";
  }

}
