package com.betrybe.sistemadevotacao;

/**
 * Classe da pessoa candidata.
 */
public class PessoaCandidata extends Pessoa {
  int numero;
  int votos;

  /**
   * Construtor.
   */
  public PessoaCandidata(String nome, int numero) {
    this.numero = numero;
    this.nome = nome;
    this.votos = 0;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getNumero() {
    return numero;
  }

  public int getVotos() {
    return votos;
  }

  public void receberVoto() {
    votos += 1;
  }

  @Override
  public int hashCode() {
    return numero;
  }
}
