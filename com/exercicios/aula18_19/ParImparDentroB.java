package com.exercicios.aula18_19;

import java.util.Scanner;

public class ParImparDentroB {
    public static void main(String[] args) {
        /*
        Ler um vetor A com 20 elementos. Separar os elementos pares e
        ímpares de A utilizando apenas um vetor extra B. Sugestão: no início
        do vetor B armazene os elementos pares de A e nas posições
        restantes do vetor B armazene os elemen1tos de A que são ímpares.
        */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe os elementos na seguinte posição " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();

        }

        int posB = 0;

        for (int p : vetorA) {

            if (p % 2 == 0) {
                vetorB[posB] = p;
                posB++;
            }
        }

        for (int i : vetorA) {

            if (i % 2 != 0) {
                vetorB[posB] = i;
                posB++;
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
    }
}
