package estudosjavabasico.entidade;

public class Aluno {
  private String nome;
  private int    idade;
  private String dataNascimento;
  private String rg;
  private String cpf;

  public Aluno() {

  }

  public Aluno(String nome, int idade, String dataNascimento, String rg, String cpf) {
    super();
    this.nome           = nome;
    this.idade          = idade;
    this.dataNascimento = dataNascimento;
    this.rg             = rg;
    this.cpf            = cpf;
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

  @Override
  public String toString() {
    return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", rg=" + rg + ", cpf=" + cpf + "]";
  }

}
