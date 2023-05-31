package com.exercicios.aula14_15;

import java.util.Scanner;

public class SomaElementos {
    public static void main(String[] args) {
        /*.
        Criar um vetor A com 10 elementos inteiros.
        Implementar um programa que defina e escreva a soma de todos os elementos armazenados
        neste vetor.
        */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int soma = 0;

        for (int i = 0; i < vetorA.length; i++){

            System.out.println("Insira o elemento da posição " + i + ": ");
            vetorA[i] = scan.nextInt();

            soma += vetorA[i];
        }

        System.out.println("Essa é a soma dos elementos: " + soma);
    }



}
