package com.exercicios.aula18_19;

import java.util.Scanner;

public class JuncaoVetores {
    public static void main(String[] args) {
        /*
        Ler dois vetores A e B com 10 elementos cada.
        Construir um vetor C, sendo este a junção dos dois outros vetores.
        Os primeiros 10 elementos de C deverão receber os elementos de A e os últimos
        elementos C deverão receber os elementos de B.
        Desta forma, C deverá ter o dobro de elementos de A e B, ou seja, 20 elementos
        */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length * 2];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe os elementos do vetor A na seguinte posição: " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();

            vetorC[i] = vetorA[i];
        }

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Informe os elementos do vetor B na seguinte posição: " + (i + 1) + ": ");
            vetorB[i] = scan.nextInt();

            vetorC[vetorA.length + i] = vetorB[i];
        }

        System.out.println("Vetor A: ");
        for (int a : vetorA) {
            System.out.print(a + ", ");
        }
        System.out.println();

        System.out.println("Vetor B: ");
        for (int b : vetorB) {
            System.out.print(b + ", ");
        }
        System.out.println();

        System.out.println("Vetor C: ");
        for (int c : vetorC) {
            System.out.print(c + ", ");


        }
    }
}