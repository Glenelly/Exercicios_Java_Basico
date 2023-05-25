package com.exercicios.aula18_19;

import java.text.DecimalFormat;
import java.util.Scanner;

public class RaizQuadrada {
    public static void main(String[] args) {
        /*
        Criar um vetor A com 15 elementos inteiros. Construir um vetor B de mesmo tamanho,
        sendo que cada elemento do vetor B deverá ser a raiz quadrada do respectivo elemento de A,
         ou seja: sqrt(A[i])

        — Crio as variaveis dos arrays (Vetor B possuir o mesmo tamanho do vetor A)
        -Faço o loop para pegar os elementos do vetor A
        -No loop eu atribuo o valor de B possuindo a raiz quadrada do elemento A.
        -Faço outro loop for para mostrar os elementos dos vetores
        */

        Scanner scan = new Scanner(System.in);

        //Criei as variaveis dos arrays
        int[] vetorA = new int[15];
        //atribui só o tamanho do array A para o array B
        double[] vetorB = new double[vetorA.length];

        //Faço o loop com o tamanho que foi atribuido ao vetor A
        for(int i = 0; i < vetorA.length; i++){
            //Coloquei os elementos no vetor A
            System.out.println("Informe os elementos da posição " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();

            //Os valores do vetor B agora possuiem a raiz quadrada do vetorA
            vetorB[i] = Math.sqrt(vetorA[i]);
        }

        //Imprime os elementos que foram atribuidos aos vetores
        System.out.print("Vetor A: ");
        for(int a : vetorA) {
            System.out.print(a + " ");
        }

        System.out.println();

        //Formatar o resultado do vetor B que está no tipo Double
        DecimalFormat df = new DecimalFormat("###,###.###");

        System.out.print("Vetor B: ");
        for (double b : vetorB){
            System.out.print(df.format(b) + ", ");
        }
    }
}
