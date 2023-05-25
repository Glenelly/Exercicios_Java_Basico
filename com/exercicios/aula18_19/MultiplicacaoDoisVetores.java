package com.exercicios.aula18_19;

import java.util.Scanner;

public class MultiplicacaoDoisVetores {
    public static void main(String[] args) {
        /*
        Criar dois vetores A e B cada um com 10 elementos inteiros.
        Construir um vetor C, onde cada elemento de C é a multiplicação dos
        respectivos elementos em A e B

        -Criar dois vetores A e B cada um com 10 elementos inteiros
        -Faço o loop para pegar os elementos do vetor A
        -Faço o loop para pegar os elementos do vetor B
        -Atribuir a multiplicação dos vetores A e B num terceiro Vetor (C)
        -Faço outro loop for para mostrar os elementos dos vetores
        */

        Scanner scan = new Scanner(System.in);

        //Criando a variavel dos vetores
        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        int[] vetorC = new int[vetorA.length];

        //Faço o loop com o tamanho que foi atribuido ao vetor A para pegar os elementos
        for(int i = 0; i < vetorA.length; i++){
            System.out.println("Informe os elementos do vetor A na posição " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();
        }

        //Faço o loop com o tamanho que foi atribuido ao vetor B para pegar os elementos
        for(int i = 0; i < vetorB.length; i++){
            System.out.println("Informe os elementos do vetor B na posição " + (i + 1) + ": ");
            vetorB[i] = scan.nextInt();

            //Atribuindo a multiplicação dos vetores A e B num terceiro Vetor (C)
            vetorC[i] = (vetorA[i] * vetorB[i]);
        }

        //Imprime os elementos que foram atribuidos aos vetores
        System.out.println("Vetor A: ");
        for(int a : vetorA ){
            System.out.print(a + " ");
        }
        System.out.println();

        System.out.println("Vetor B: ");
        for(int b : vetorB){
            System.out.print(b + " ");
        }
        System.out.println();

        System.out.println("Vetor C: ");
        for(int c : vetorC){
            System.out.print(c + " ");
        }
    }
}
