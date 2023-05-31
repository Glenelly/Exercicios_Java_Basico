package com.exercicios.aula18_19;

import java.util.Scanner;

public class ElementosInvertidos {
    public static void main(String[] args) {
        /*
        Ler um vetor A com 10 elementos e construir um vetor B de mesmo
        tipo e tamanho e com os mesmos elementos de A, sendo que estes
        deverão estar invertidos, ou seja, o primeiro elemento de A passa a
        ser o último de B, o segundo elemento de A passa a ser o penúltimo
        de B e assim por diante.
        */

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe os elementos na seguinte posição " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();

            vetorB[vetorA.length - i - 1] = vetorA[i];
        }

        System.out.println("Vetor A: ");
        for (int a : vetorA)
            System.out.print(a + ", ");

        System.out.println();

        System.out.println("Vetor B: ");
        for (int b : vetorB)
            System.out.print(b + ", ");

    }
}
