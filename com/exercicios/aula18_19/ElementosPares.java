package com.exercicios.aula18_19;

import java.util.Scanner;

public class ElementosPares {
    public static void main(String[] args) {
        /*
        Criar um vetor A com 10 elementos inteiros.
        Implementar um programa que defina e escreva a quantidade de elementos armazenados neste
        vetor que são pares

        - Criar variaveis.
        - Pegar os elementos da variavel(For).
        - Ver quais elementos são pares (if).
        - Adicionar os elementos que são pares a uma variavel.
        - Exibir os elementos da variavel.
        - Exibir a quantidade de elementos.
        */

        Scanner scan = new Scanner(System.in);

        //Criando a variavel do vetor
        int[] vetorA = new int[10];
        int QtdPares = 0;

        //Faço o loop com o tamanho que foi atribuido ao vetor A para pegar os elementos
        for (int i = 0; i < vetorA.length; i++){

            //Coloquei os elementos no vetor A
            System.out.println("Insira o elemento da posição " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();

            // Ver se o elemento é um número par se for adiciona a variavel QtdPares
            if(vetorA[i] % 2 == 0){
                QtdPares++;
            }
        }

        //Imprime os elementos que foram atribuidos ao vetor
        System.out.println("O elementos do vetor A são: ");
        for (int a : vetorA) {
            System.out.print(a + " ");
        }
        System.out.println();

        //Imprime o resultado
        System.out.println("Esses elementos são pares: " + QtdPares);


    }
}
