package com.exercicios.aula14_15;

import java.util.Scanner;

public class PositivoNegativo {
    public static void main(String[] args) {
        // Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scan.nextInt();

        if(numero < 0)
            System.out.println(numero + " é um número negativo!!");
        else
            System.out.println(numero + " é um número positivo!!");
    }
}
