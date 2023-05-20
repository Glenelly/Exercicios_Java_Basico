package com.exercicios.aula16_17;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        /*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
         O utilizador deve informar de qual numero ele deseja ver a tabuada*/

        Scanner scan = new Scanner(System.in);

        int multi;

        System.out.println("Você deseja vizualizar a tabuada de qual número (1 - 10): ");
        int num = scan.nextInt();

        System.out.println("Tabuada de " + num + ":");

        for (int i = 1; i <= 10; i++){

            multi = num * i;
            System.out.println(num + " X " + i + " = " + multi);
        }
    }
}
