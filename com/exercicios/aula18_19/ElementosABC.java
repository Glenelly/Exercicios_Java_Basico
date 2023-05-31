package com.exercicios.aula18_19;

import java.util.Scanner;

public class ElementosABC {
    public static void main(String[] args) {
        /*
        Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
        um vetor C de mesmo tipo e tamanho, obedecendo as seguintes
        regras de formação:
        a) Ci deverá receber 1 quando Ai for maior que Bi;
        b) Ci deverá receber 0 quando Ai for igual a Bi;
        c) Ci deverá receber -1 quando Ai for menor que Bi.
        */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++){
            System.out.println("Informe os elementos do vetor A na seguinte posição: " + (i+1) + ": ");
            vetorA[i] = scan.nextInt();

            System.out.println("Informe os elementos do vetor B na seguinte posição: " + (i+1) + ": ");
            vetorB[i] = scan.nextInt();

            if(vetorA[i] > vetorB[i]){
                vetorC[i] += 1;
            } else if (vetorA[i] == vetorB[i]) {
                vetorC[i] += 0;
            } else if (vetorA[i] < vetorB[i]) {
                vetorC[i] += (-1);
            }
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
        System.out.println();

        System.out.println("Vetor C: ");
        for (int c : vetorC){
            System.out.print(c + ", ");
        }

    }
}
