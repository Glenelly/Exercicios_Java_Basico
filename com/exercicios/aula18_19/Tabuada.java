package com.exercicios.aula18_19;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        /*Criar um vetor A com 5 elementos inteiros. Escreva um programa que
        imprima a tabuada de cada um dos elementos do vetor A.
        */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe os valores da tubuada: ");
            vetorA[i] = scan.nextInt();
        }

        for (int i : vetorA) {
            System.out.println("Tabuada de " + i);

            for (int j = 1; j <= 10; j++) {
                System.out.println(j + " X " + i + " = " + (i * j));
            }

            System.out.println();
        }
    }
}
