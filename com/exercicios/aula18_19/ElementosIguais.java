package com.exercicios.aula18_19;

import java.util.Scanner;

public class ElementosIguais {
    public static void main(String[] args) {
        /*
        * Criar um vetor A com 5 elementos inteiros.
        * Construir um vetor B demesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
        * seja, B[i] = A[i].
        */
        Scanner scan = new Scanner(System.in);

        //Criei as variaveis dos arrays
        int[] vetorA = new int[5];
        //atribui o tamanho do array A para o array B
        int[] vetorB = new int[vetorA.length];

        //Faço o loop com o tamanho que foi atribuido ao vetor A
        for(int i = 0; i < vetorA.length; i++){

            //Coloquei os elementos no vetor A
            System.out.println("Informe os elementos: ");
            vetorA[i] = scan.nextInt();

            //Os valores do vetor B agora possuiem os valores do vetor A
            vetorB[i] = vetorA[i];
        }

        //Imprime os elementos que foram atribuidos aos vetores
        System.out.println("Vetor A: ");
        for (int a : vetorA) {
            System.out.println(a + " ");
        }
        System.out.println();

        System.out.println("Vetor B: ");
        for (int b : vetorB) {
            System.out.println(b + "");
        }

    }
}
