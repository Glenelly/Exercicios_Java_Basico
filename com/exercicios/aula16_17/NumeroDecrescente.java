package com.exercicios.aula16_17;

import java.util.Scanner;

public class NumeroDecrescente {

    /*Faça um programa que peça um número inteiro positivo e em seguida mostre este numero
     sequenciado na forma decrescente.*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;

        System.out.println("Informe um número inteiro: ");
        numero = scan.nextInt();

        for(int i = numero; i > 0; i--){
            System.out.println(i);
        }
    }
}
