package com.exercicios.aula16_17;

import java.util.Scanner;

public class BaseExpoente {
    public static void main(String[] args) {
        /*Faça um programa que peça dois números, base e expoente, calcule e mostre o primeiro número elevado ao segundo número.
        Não utilize a função de potência da linguagem.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a base: ");
        int base = scan.nextInt();

        System.out.println("Insira o expoente: ");
        int expoente = scan.nextInt();

        int resul = base;

        for(int i = 1; i < expoente; i++){
            resul *= base;
        }
        System.out.println("O calculo da base elevado ao expoente é: " + resul);
    }
}
