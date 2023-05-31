package com.exercicios.aula18_19;

import java.util.Scanner;

public class FatorialElementos {
    public static void main(String[] args) {
        /*Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
        mesmo tamanho, sendo que cada elemento do vetor B seja o fatorial
        do elemento correspondente em A.
        */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe os elementos: ");
            vetorA[i] = scan.nextInt();
        }

        for(int i = 0; i < vetorA.length; i++){

            vetorB[i] = 1;
            for (int j = 1; j <= vetorA[i]; j++){
                vetorB[i] *= j ;
            }
        }

        System.out.println("Vetor A: ");
        for (int a : vetorA){
            System.out.print(a + ", ");
        }
        System.out.println();

        System.out.println("Vetor B: ");
        for (int i = 0; i < vetorA.length; i++){
            System.out.print(vetorB[i] + " ");
        }
    }
}
