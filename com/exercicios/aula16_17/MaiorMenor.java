package com.exercicios.aula16_17;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {
        //Faça um programa que, dado um conjunto de N números, determine o menor valor, o maior valor e a soma dos valores.

        Scanner scan = new Scanner(System.in);

        //Recebendo quantas vezes o código vai ser repetido
        System.out.println("Digite o número N: ");
        int N = scan.nextInt();

        int numeros;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int soma = 0;

        //Vai fazer o loop da quantidade colocado no N
        for(int i = 0; i <= N; i++){

            //Vai receber os números do programa
            System.out.println("Digite os números: ");
            numeros = scan.nextInt();

            // O número que for maior vai entrar na condição e a variavel maior vai receber esse número.
            if(numeros > maior){
                maior = numeros;
            // O número que for menor vai entrar na condição e a variavel menor vai receber esse número.
            }else if(numeros < menor){
                menor = numeros;
            }
            //A variavel soma vai somar e receber os números da variavel "numeros"
            soma += numeros;
        }

        //Imprime o maior número
        System.out.println("O maior número é: " + maior);
        //Imprime o menor número
        System.out.println("O menor número é: " + menor);
        //Imprime a soma dos números
        System.out.println("A soma dos valores é: " + soma);

    }
}
