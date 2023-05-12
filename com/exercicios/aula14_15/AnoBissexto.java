package com.exercicios.aula14_15;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        /*Faça um Programa que peça um número correspondente a um
        determinado ano e em seguida informe se este ano é ou não bissexto.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe algum ano: ");
        int ano = scan.nextInt();

        if((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0))
            System.out.println(ano + " é um ano bissexto!!");
        else
            System.out.println(ano + " não é um ano bissexto!!");
    }
}
