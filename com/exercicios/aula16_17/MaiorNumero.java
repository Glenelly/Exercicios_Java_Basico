package com.exercicios.aula16_17;

import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        //Faça um programa que leia 5 números e informe o maior número.

        Scanner scan = new Scanner(System.in);
        double maior = Integer.MIN_VALUE;
        int numero;

        for (int i = 0; i < 5; i++){
            System.out.println("Digite o número: ");
            numero = scan.nextInt();

            if (numero > maior){
                maior = numero;
            }
        }

        System.out.println(maior);
    }
}
