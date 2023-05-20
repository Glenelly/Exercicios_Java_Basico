package com.exercicios.aula16_17;

import java.util.Scanner;

public class MediaNumeros {
    public static void main(String[] args) {
        //w Faça um programa que leia 5 números e informe a soma e a média dos números.

        Scanner scan = new Scanner(System.in);
        double numero;
        double media;
        double soma = 0;

        for (int i = 0; i < 5; i++){
            System.out.println("Digite o número: ");
            numero = scan.nextDouble();

            soma += numero;
        }
        media = (soma / 5);

        System.out.println("A média dos números é: " + media);
    }
}
