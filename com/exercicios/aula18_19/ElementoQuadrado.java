package com.exercicios.aula18_19;

import java.util.Scanner;

public class ElementoQuadrado {
    public static void main(String[] args) {
        /*
        Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho,
        sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento de A, ou seja:
        B[i] = A[i] * A[i]

        -Crio as variaveis dos arrays (Vetor B possuir o mesmo tamanho do vetor A)
        -Faço o loop para pegar os elementos do vetor A
        -No loop eu atribuo o valor de B possuindo os elementos do vetor A ao quadrado
        -Faço outro loop for para mostrar os elementos dos vetores
        */

        Scanner scan = new Scanner(System.in);

        //Criei as variaveis dos arrays
        int[] vetorA = new int[15];
        //atribui o tamanho do array A para o array B
        int[] vetorB = new int[vetorA.length];

        //Faço o loop com o tamanho que foi atribuido ao vetor A
        for(int i = 0; i < vetorA.length; i++){
            //Coloquei os elementos no vetor A
            System.out.println("Digite o elemento da posição " + (i + 1) + ":");
            vetorA[i] = scan.nextInt();

            //Os valores do vetor B agora possuiem os valores do vetor A ao quadrado
            vetorB[i] = (vetorA[i] * vetorA[i]);
        }

        //Imprime os elementos que foram atribuidos aos vetores
        System.out.println("Os elementos do vetor A: ");
        for(int a : vetorA){
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("Os elementos do vetor B: ");
        for(int b : vetorB){
            System.out.print(b + " ");
        }
    }
}
