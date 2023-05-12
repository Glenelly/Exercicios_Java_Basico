package com.exercicios.aula14_15;

import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        /*Faça um Programa que peça um número inteiro e determine se ele é
        par ou impar. Dica: utilize o operador módulo.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Digitem um número inteiro: ");
        int numero = scan.nextInt();

        if(numero % 2 == 0)
            System.out.println(numero + " é um número par!!");
        else
            System.out.println(numero + " é um número impar!!");
    }
}
