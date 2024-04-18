package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * Classe principal.
 */
public class Principal {

  /**
   * Metodo main.
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();
    Scanner scanner = new Scanner(System.in);

    int inputCandidato = 0;
    int inputEleitor = 0;
    int inputVotacao = 0;



    do {
      System.out.println("Cadastrar pessoa candidata?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:\n");

      inputCandidato = scanner.nextInt();

      if (inputCandidato == 1) {
        System.out.println("Entre com o nome da pessoa candidata:\n");
        String nome = scanner.next();

        System.out.println("Entre com o número da pessoa candidata:\n");
        int numero = scanner.nextInt();

        gerenciamentoVotacao.cadastrarPessoaCandidata(nome, numero);
        inputCandidato = 0;
      }
    } while (inputCandidato != 2);


    do {
      System.out.println("Cadastrar pessoa eleitora?");
      System.out.println("1 - Sim");
      System.out.println("2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:\n");

      inputEleitor = scanner.nextInt();

      if (inputEleitor == 1) {
        System.out.println("Entre com o nome da pessoa eleitora:\n");
        String nome = scanner.next();

        System.out.println("Entre com o CPF da pessoa eleitora:\n");
        String cpf = scanner.next();

        gerenciamentoVotacao.cadastrarPessoaEleitora(nome, cpf);
        inputEleitor = 0;
      }
    } while (inputEleitor != 2);

    do {
      System.out.println(" Entre com o número correspondente à opção desejada:");
      System.out.println("1 - Votar");
      System.out.println("2 - Resultado Parcial");
      System.out.println("3 - Finalizar Votação");

      inputVotacao = scanner.nextInt();

      if (inputVotacao == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:\n");
        String cpf = scanner.next();

        System.out.println("Entre com o número da pessoa candidata:\n");
        int numero = scanner.nextInt();

        gerenciamentoVotacao.votar(cpf, numero);
        inputVotacao = 0;
      } else if (inputVotacao == 2) {
        gerenciamentoVotacao.mostrarResultado();
        inputVotacao = 0;
      } else if (inputVotacao == 3) {
        gerenciamentoVotacao.mostrarResultado();
      }
    } while (inputVotacao != 3);

    scanner.close();

  }
}