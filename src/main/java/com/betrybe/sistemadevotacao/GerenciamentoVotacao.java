package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * Classe que gerencia a votação.
 */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  private ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  private ArrayList<String> cpfsComputados = new ArrayList<String>();

  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata candidato : pessoasCandidatas) {
      if (candidato.getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
      }
    }

    PessoaCandidata pessoaCandidata = new PessoaCandidata(nome, numero);

    pessoasCandidatas.add(pessoaCandidata);
  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora eleitor : pessoasEleitoras) {
      if (eleitor.getCpf() == cpf) {
        System.out.println("Pessoa eleitora já cadastrada!");
      }
    }

    PessoaEleitora pessoaEleitora = new PessoaEleitora(nome, cpf);

    pessoasEleitoras.add(pessoaEleitora);
  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    for (String cpfComputado : cpfsComputados) {
      if (cpfComputado.contains(cpfPessoaEleitora)) {
        System.out.println("Pessoa eleitora já votou!");
      }
    }

    for (PessoaCandidata candidato : pessoasCandidatas) {
      if (candidato.getNumero() == numeroPessoaCandidata) {
        candidato.receberVoto();
        cpfsComputados.add(cpfPessoaEleitora);
      }

    }
  }

  @Override
  public void mostrarResultado() {
    if (cpfsComputados.isEmpty()) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    }

    for (PessoaCandidata candidato : pessoasCandidatas) {
      int votos = candidato.getVotos();
      String nome = candidato.getNome();
      int porcetagemDeVotos = (int) Math.round((votos * 100) / (double) votos);

      System.out.println("Nome: " + nome + " - " + votos + " votos ( "
              + porcetagemDeVotos + "% )");
    }

    System.out.println("Total de votos: " + cpfsComputados.size());
  }
}
