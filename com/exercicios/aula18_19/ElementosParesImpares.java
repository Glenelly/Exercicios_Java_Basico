package com.exercicios.aula18_19;

import java.util.Scanner;

public class ElementosParesImpares {
    public static void main(String[] args) {
        /*
        Criar um vetor A com 10 elementos inteiros.
        Desenvolver um programa que defina o percentual de elementos pares e ímpares,
        respectivamente, armazenados neste vetor

        - Criar as variaveis (VetorA, pares, impares, PorcentagemPares, PorcentagemImpares).
        - Fazer o laço para percorrer o array (for).
        - Pegar os elementos do array dentro do laço.
        - Verificar quais elementos são impares e quais são pares.
        - Adicionar os elementos pares a variavel pares e os impares a variavel impares.
        - Calcular a porcentagem de números pares e impares.
        - Fazer outro laço para mostrar os elementos do array.
        - Mostrar o resultado
        */

        Scanner scan = new Scanner(System.in);
        //Criei as variaveis
        int[] vetorA = new int[10];
        int pares = 0;
        int impares = 0;
        int porcentagemPares;
        int porcentagemImpares;

        //Fiz o laço para percorrer o array do tamanho da variavel vetorA
        for(int i = 0; i < vetorA.length; i++){

            //Peguei os elementos do vetorA
            System.out.println("Insira o elemento na posição " + (i + 1) + ": " );
            vetorA[i] = scan.nextInt();

            //Verifiquei se é par ou impar
            if(vetorA[i] % 2 == 0){
                //Adcionei os elementos pares a variavel pares
                pares++;
            }else {
                //Adcionei os elementos impares a variavel impares
                impares++;
            }
        }

        //Calculei a porcentagem de impar e pares dos elementos armazenados no vetorA
        porcentagemPares = (pares * 100) / vetorA.length;
        porcentagemImpares = (impares * 100) / vetorA.length;

        //Exibe os elementos do vetor A
        System.out.println("Vetor A: ");
        for (int a : vetorA){
            System.out.print(a + " ");
        }
        System.out.println();

        //Mostrei o resultado das porcentagens
        System.out.println("Porcentagem de elementos pares: " + porcentagemPares + "%");
        System.out.println("Porcentagem de elementos ímpares: " + porcentagemImpares + "%");


    }
}
