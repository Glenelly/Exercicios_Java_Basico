package com.exercicios.aula18_19;

import java.util.Scanner;

public class RestoDivisao {
    public static void main(String[] args) {
        /*Criar um vetor A com 10 elementos inteiros.
        Construir um vetor B de mesmo tipo e tamanho, sendo que cada elemento do vetor B deverá
        ser o resto da divisão do respectivo elemento de A por 2 (dois)

        — Crio as variaveis dos arrays (Vetor B possuir o mesmo tamanho do vetor A)
        -Faço o loop para pegar os elementos do vetor A
        -No loop eu atribuo o valor de B possuindo o resto da divisão do elemento A.
        -Faço outro loop for para mostrar os elementos dos vetores
        */

        Scanner scan = new Scanner(System.in);

        //Criei as variaveis dos arrays
        int[] vetorA = new int[10];
        //atribui só o tamanho do array A para o array B
        double[] vetorB = new double[vetorA.length];

        //Faço o loop com o tamanho que foi atribuido ao vetor A
        for(int i = 0; i < vetorA.length; i++){
            //Coloquei os elementos no vetor A
            System.out.println("Informe os elementos da posição " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();

            //Os valores do vetor B agora possuiem o resto da divisão dos elementos do vetor A
            vetorB[i] = vetorA[i] % 2;

        }

        //Imprime os elementos que foram atribuidos aos vetores
        System.out.print("Vetor A: ");
        for(int a : vetorA) {
            System.out.print(a + " ");
        }

        System.out.println();

        System.out.print("Vetor B: ");
        for (double b : vetorB){
            System.out.print(b + " ");
        }
    }
}
