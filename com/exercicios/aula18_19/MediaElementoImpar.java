package com.exercicios.aula18_19;

import java.util.Scanner;

public class MediaElementoImpar {
    public static void main(String[] args) {
        /*
        Criar um vetor A com 10 elementos inteiros.
        Implementar um programa que defina e escreva a média
        aritmética simples dos elementos ímpares armazenados neste vetor

        - Criar variaveis.
        - Pegar os elementos da variavel(For).
        - Ver quais elementos são impares (if).
        - Adicionar os elementos que são impares a uma variavel.
        - Exibir os elementos da variavel.
        - Exibir a quantidade de elementos.
        */

        Scanner scan = new Scanner(System.in);

        //Criando a variavel do vetor
        int[] vetorA = new int[10];
        int impar = 0;
        int soma = 0;
        int media = 0;

        //Faço o loop com o tamanho que foi atribuido ao vetor A para pegar os elementos
        for (int i = 0; i < vetorA.length; i++){

            //Coloquei os elementos no vetor A
            System.out.println("Insira o elemento da posição " + (i + 1) + ": ");
            vetorA[i] = scan.nextInt();

            // Ver se o elemento é um número ímpar
            if(vetorA[i] % 2 != 0){
                // somar os elementos do vetor A e coloca na variavel soma
                soma += vetorA[i];
                //Adiciona os números impares na variavel impar
                impar++;
                //adiciona a divisão das variaveis soma e impar na variavel media
                media = soma/impar;
            }
        }

        //Imprime os elementos que foram atribuidos ao vetor
        System.out.println("O elementos do vetor A são: ");
        for (int a : vetorA) {
            System.out.print(a + " ");
        }
        System.out.println();

        //Imprime o resultado
        System.out.println("A soma dos elementos ímpares é: " + soma);
        System.out.println("Essa é a média dos elementos ímpares: " + media);


    }
}
