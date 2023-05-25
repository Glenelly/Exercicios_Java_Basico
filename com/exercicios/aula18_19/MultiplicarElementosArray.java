package com.exercicios.aula18_19;

import java.util.Scanner;

public class MultiplicarElementosArray {
    public static void main(String[] args) {

        /*Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho
         e com os elementos do vetor A multiplicados por 2

         Algoritmo:

         - criar as variaveis dos vetores A e B
         - Criar o for para atribuir os elementos para o vetor A
         - no mesmo loop colocar os elementos do vetor A no vetor B e multiplica por 2
         - exibir os elementos do vetor A
         - exibir os elementos do vetor B
         */

        Scanner scan = new Scanner(System.in);

        //Criei as variaveis dos arrays
        int[] vetorA = new int[8];
        //atribui o tamanho do array A para o array B
        int[] vetorB = new int[vetorA.length];

        //Faço o loop com o tamanho que foi atribuido ao vetor A
        for (int i = 0; i < vetorA.length; i++){

            //Coloquei os elementos no vetor A
            System.out.println("Digite o elemento da posição " + (i+1));
            vetorA[i] = scan.nextInt();

            //Os valores do vetor B agora possuiem os valores do vetor A * 2
            vetorB[i] = (vetorA[i] * 2);
        }

        //Imprime os elementos que foram atribuidos aos vetores
        for(int a : vetorA){
            System.out.print(a + " ");
        }
        System.out.println();

        for(int b : vetorB){
            System.out.print(b + " ");
        }
    }
}
