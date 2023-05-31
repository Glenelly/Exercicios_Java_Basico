package com.exercicios.aula18_19;

import java.util.Scanner;

public class ParImparVetorA {
    public static void main(String[] args) {
        /*
        Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo
        que nos vetor B e C serão armazenados o valores pares e ímpares de
        A, respectivamente
        */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe os elementos na seguinte posição " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();
        }

        int posB = 0;
        int posC = 0;

        for (int i = 0; i < vetorA.length; i++) {

            if (vetorA[i] % 2 == 0) {
                vetorB[posB] = i;
                posB++;
            } else {
                vetorC[posC] = i;
                posC++;
            }
        }

        System.out.println("Vetor A: ");
        for (int a : vetorA){
            System.out.print(a + ", ");
        }
        System.out.println();

        System.out.println("Vetor B: ");
        for (int b = 0; b < posB; b++)
            System.out.print(vetorB[b] + ", ");
        System.out.println();

        System.out.println("Vetor C: ");
        for (int c = 0; c < posC; c++){
            System.out.print(vetorC[c] + ", ");
        }
    }
}
