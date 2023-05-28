package com.exercicios.aula18_19;

import java.util.Scanner;

public class MultiplosDeCinco {
    public static void main(String[] args) {
        /*
        Criar um vetor A com 10 elementos inteiros.
        Implementar um programa que determine a soma dos elementos armazenados neste vetor que
        são múltiplos de 5.

        - Criar variaveis.
        - Pegar os elementos da variavel(For).
        - Ver quais elementos são multiplos de 5 (if).
        - Somar os elementos que são multiplos de 5.
        - Exibir os elementos da variavel.
        - Exibir o resultado da soma.

        */

        Scanner scan = new Scanner(System.in);

        //Criando a variavel do vetor
        int[] vetorA = new int[10];
        int soma = 0;

        //Faço o loop com o tamanho que foi atribuido ao vetor A para pegar os elementos
        for (int i = 0; i < vetorA.length; i++){

            //Coloquei os elementos no vetor A
            System.out.println("Insira o elemento da posição " + (i+1) + ": ");
            vetorA[i] = scan.nextInt();

            //Ver se o elemento é multiplo de 5, se for adiciona a variavel soma
            if(vetorA[i] % 5 == 0){
                soma += vetorA[i];
            }
        }
        //Imprime os elementos que foram atribuidos ao vetor
        System.out.println("O elementos do vetor A são: ");
        for (int a : vetorA) {
            System.out.print(a + " ");
        }
        System.out.println();

        //Imprime o resultado
        System.out.println("A soma dos números que são multiplicados por 5 é: " + soma);
    }
}
