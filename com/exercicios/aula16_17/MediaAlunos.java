package com.exercicios.aula16_17;

import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        /*Faça um programa que calcule o número médio de alunos por turma.
        Para isto, peça a quantidade de turmas e a quantidade de alunos para cada turma.
        As turmas não podem ter mais de 40 alunos.

        Algoritmo:

        -Pedir a quantidade de turmas
        -Pedir a quantidade de alunos por turma (for)
        -verificar se a turma não tem mais de 40 alunos (do-while para fazer o loop caso seja invalido, if dentro do for
        para verificar se tem mais de 40 alunos por turma)
        -Calcular a média (no loop for)
        -Mostra a media (sout)
        */

        Scanner scan = new Scanner(System.in);

        //Variaveis
        int turma;
        int aluno;
        int media;
        int soma = 0;
        boolean invalido;

        //Pedindo a quantidade de turmas
        System.out.println("Informe a quantidade de turmas: ");
        turma = scan.nextInt();

        //acrescentar enquanto o i for menor que turma ou igual
        for(int i = 1; i <= turma; i++){

            //Parar o loop quando a variavel invalido = false
            invalido = true;
            do{
                //informar a quantidade de alunos
                System.out.println("Informe a quantidade de alunos desta turma " + i + ":");
                aluno = scan.nextInt();

                //verificando se a turma tem mais de 40 alunos
                if (aluno <= 40){
                    invalido = false;
                //caso tenha mais de 40 alunos exibe a mensagem e executa o loop (invalido  = true)
                }else {
                    System.out.println("A turma só pode ter até 40 alunos! Digite novamente: ");
                }
            }while (invalido);

            //Soma os alunos de todas as turmas
            soma += aluno;
        }

        //Soma a média de alunos por turma
        media = soma / turma;
        //Exibe o resultado
        System.out.println("A média de alunos por turma é de: " + media);
    }
}
