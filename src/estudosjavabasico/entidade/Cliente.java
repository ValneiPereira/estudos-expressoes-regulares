package estudosjavabasico.entidade;

import java.math.BigDecimal;

public class Cliente {
  private String     nome;
  private BigDecimal salario= new BigDecimal(0);

  public Cliente() {

  }

  public Cliente(String nome, BigDecimal salario) {
    this.nome = nome;
    this.salario = salario;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }  

  @Override
  public String toString() {
    return "Cliente [nome=" + nome + ", salario=" + salario + "]";
  }

  public BigDecimal getSalario() {
    return salario;
  }

  public void setSalario(BigDecimal salario) {
    this.salario = salario;
  }
  

}
