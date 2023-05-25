package com.exercicios.aula18_19;

import java.util.Scanner;

public class MultiplicarPosicao {
    public static void main(String[] args) {
        /*Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho,
         sendo que cada elemento do vetor B deverá ser o respectivo elemento de A multiplicado por sua posição
         (ou índice)

         — Crio as variaveis dos arrays (Vetor B possuir o mesmo tamanho e tipo do vetor A)
        -Faço o loop para pegar os elementos do vetor A
        -No loop eu atribuo o valor de B possuindo a multiplicação dos elementos do VetorA + a posição do VetorA
        -Faço outro loop for para mostrar os elementos dos vetores
        */

        Scanner scan = new Scanner(System.in);

        //Criei as variaveis dos arrays
        int[] vetorA = new int[10];
        //atribui só o tamanho e o tipo do array A para o array B
        int[] vetorB = new int[vetorA.length];

        //Faço o loop com o tamanho que foi atribuido ao vetor A
        for (int i = 0; i < vetorA.length; i++){

            //Coloquei os elementos no vetor A
            System.out.println("Informe o elemento da posição " + i + ": ");
            vetorA[i] = scan.nextInt();

            //Os valores do vetor B agora possuiem a multiplicação dos elementos do VetorA + a posição do VetorA
            vetorB[i] = (vetorA[i] * i );
        }

        //Imprime os elementos que foram atribuidos aos vetores
        System.out.println("Vetor A: ");
        for(int a : vetorA){
            System.out.print(a + " ");
        }

        System.out.println();

        System.out.println("Vetor B: ");
        for(int b : vetorB){
            System.out.print(b + " ");
        }

    }
}
