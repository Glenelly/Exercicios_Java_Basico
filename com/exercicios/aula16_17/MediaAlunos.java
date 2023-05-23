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

        int turma;
        int aluno;
        int media;
        int soma = 0;
        boolean invalido;

        System.out.println("Informe a quantidade de turmas: ");
        turma = scan.nextInt();

        for(int i = 1; i <= turma; i++){

            invalido = true;
            do{
                System.out.println("Informe a quantidade de alunos desta turma " + i + ":");
                aluno = scan.nextInt();

                if (aluno <= 40){
                    invalido = false;
                }else {
                    System.out.println("A turma só pode ter até 40 alunos! Digite novamente: ");
                }
            }while (invalido);
            
            soma += aluno;
        }
        media = soma / turma;
        System.out.println("A média de alunos por turma é de: " + media);
    }
}
