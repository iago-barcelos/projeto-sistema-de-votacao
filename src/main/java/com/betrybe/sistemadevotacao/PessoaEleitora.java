package com.betrybe.sistemadevotacao;

/**
 * Classe da pessoa Eleitora.
 */
public class PessoaEleitora extends Pessoa {
  private String cpf;

  public PessoaEleitora(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    PessoaEleitora that = (PessoaEleitora) o;

    return cpf.equals(that.cpf);
  }

  @Override
  public int hashCode() {
    return cpf.hashCode();
  }
}
