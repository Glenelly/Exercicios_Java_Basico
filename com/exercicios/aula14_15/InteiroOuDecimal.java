package com.exercicios.aula14_15;

import java.util.Scanner;

public class InteiroOuDecimal {
    public static void main(String[] args) {
        /*.Faça um Programa que peça um número e informe se o número é
        inteiro ou decimal. Dica: utilize uma função de arredondamento.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double numero = scan.nextDouble();

        if(numero == Math.round (numero))
            System.out.println(numero + " é um número inteiro!");
        else
            System.out.println(numero + " é um número decimal");
    }
}
