package com.exercicios.aula18_19;

import java.util.Scanner;

public class AnalizandoVetor {
    public static void main(String[] args) {
        /*
        Criar um vetor A com 10 elementos inteiros.
        Escrever um programa que calcule e escreva:
        a) a soma de elementos armazenados neste vetor que são inferiores a 15;
        b) a quantidade de elementos armazenados no vetor que são iguais a 15; e
        c) a média dos elementos armazenados no vetor que são superiores a 15.

        - Criar as variaveis(vetorA, somaMenor15, quantidadeIgual15,  somaMaior15, quantidade , media ).
        - Fazer o laço para percorrer o array (for).
        - Pegar os elementos do array dentro do laço.
        - Verificar se a soma dos elementos armazenados neste vetor que são inferiores a 15 (if dentro do for).
        - Verificar se a quantidade de elementos armazenados no vetor que são iguais a 15.(if dentro do for).
        - Verificar se a média dos elementos armazenados no vetor que são superiores a 15.(if dentro do for).
        - Fazer outro laço para mostrar os elementos do array.
        - Mostrar o resultado.
        */

        Scanner scan = new Scanner(System.in);

        //Criei as variaveis
        int[] vetorA = new int[10];
        int somaMenor15 = 0;
        int quantidadeIgual15 = 0;
        int somaMaior15 = 0;
        int quantidadeElementos = 0;
        int media = 0;

        //Fiz o laço para percorrer o array do tamanho da variavel vetorA
        for (int i = 0; i < vetorA.length; i++) {
            //Peguei os elementos do vetorA
            System.out.println("Informe o elemento na posição " + i + ": ");
            vetorA[i] = scan.nextInt();
        }

        //Percorre o vetor
        for (int i : vetorA) {
            //Se os elementos no vetor forem iguais a 15 ++
            if (i == 15) {
                quantidadeIgual15++;

            //Se os elementos no vetor forem menores que 15
            } else if (i < 15) {
                //Soma elementos
                somaMenor15 += i;
            // Se nenhuma condição acima e verdadeira então os elementos vão ser maiores que 15
            } else {
                //Adiciona a quantidade de elementos maiores de 15
                quantidadeElementos++;
                //soma e adiciona os elementos dos vetores na variavel somaMaior15
                somaMaior15 += i;
                //Faz a média dos elementos dividindo a soma pela quantidade
                media = somaMaior15 / quantidadeElementos;
            }
        }

        //Exibe os elementos do vetor A
        System.out.println("Vetor A: ");
        for (int a : vetorA){
            System.out.print(a + " ");
        }
        System.out.println();

        //Mostrando resultado
        System.out.println("Soma dos elementos inferiores a 15: " + somaMenor15);
        System.out.println("Quantidade de elementos igual a 15: " + quantidadeIgual15);
        System.out.println("Média de elementos maior que 15: " + media);



    }
}
