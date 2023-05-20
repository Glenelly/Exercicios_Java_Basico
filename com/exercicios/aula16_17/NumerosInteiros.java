package com.exercicios.aula16_17;

import java.util.Scanner;

public class NumerosInteiros {
    public static void main(String[] args) {
        //Faça um programa que receba dois números inteiros e gere os números inteiros no intervalo compreendido por eles.

        Scanner scan = new  Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int num1 = scan.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int num2 = scan.nextInt();

        if(num1 <= num2){
            for (int i = num1; i <= num2; i++){
                System.out.println(i);
            }
        }else {
            for (int i = num2; i <= num1; i++){
                System.out.println(i);
            }
        }

    }
}
