package com.exercicios.aula18_19;

import java.util.Scanner;

public class IdadeInferior35 {
    public static void main(String[] args) {

        /*
        Ler um vetor A com 10 elementos inteiros correspondentes
        as Quantidades de um grupo de pessoas.
        Escreva um programa que determine
        e escreva a quantidade de pessoas que possuem idade superior a 35 anos

        -Criar vetor e variavel
        -Pegar todas as idades
        -Verificar idades maiores que 35 anos
        -Exibir quantidade de idades que são maiores que 35
        */

        Scanner scan = new Scanner(System.in);

        //Criando vetor e variavel
        int[] idades = new int[10];
        int Quantidade = 0;

        //Faço o loop com o tamanho que foi atribuido ao vetor idades
        for(int i = 0; i < idades.length; i++){
            //Pego as idades
            System.out.println("Digite sua idade (posicão " + (i+1) + "): ");
            idades[i] = scan.nextInt();

        }

        //Faço o loop com o tamanho que foi atribuido ao vetor idades
        for (int i : idades) {
            //Se os elementos forem maiores que 35 anos
            if (i > 35) {
                //conta mais 1
                Quantidade++;
            }
        }

        //Exibe os elementos as idades
        System.out.println("Idades: ");
        for (int a : idades){
            System.out.print(a + ", ");
        }
        System.out.println();

        //Exibindo quantidade de idades que são maiores que 35
        System.out.println("Essa é a quantidade de Quantidades maiores que 35: " + Quantidade);


    }
}
