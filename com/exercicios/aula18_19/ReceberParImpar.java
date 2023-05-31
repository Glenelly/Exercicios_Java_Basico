package com.exercicios.aula18_19;

import java.util.Scanner;

public class ReceberParImpar {
    public static void main(String[] args) {
        /*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de
        mesmo tipo e tamanho, obedecendo as seguintes regras de formação:
        a) Bi deverá receber 1 quando Ai for par;
        b) Bi deverá receber 0 quando Ai for ímpar.
        */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Informe os elementos: ");
            vetorA[i] = scan.nextInt();

            vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;
        }

        System.out.println("Vetor A: ");
        for (int a : vetorA){
            System.out.print(a + ", ");
        }
        System.out.println();

        System.out.println("Vetor B: ");
        for (int b : vetorB){
            System.out.print(b + ", ");
        }
    }
}
