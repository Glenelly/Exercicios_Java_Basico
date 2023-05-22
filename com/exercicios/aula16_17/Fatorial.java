package com.exercicios.aula16_17;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        /*
        Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário. Ex.: 5!=5.4.3.2.1=120
        */

        Scanner scan = new Scanner(System.in);

        //Vai pedir o número
        System.out.println("Digite um número: ");
        int num = scan.nextInt();

        //O fatorial vai iniciar com o número 1
        int fatorial = 1;


        //A variavel i vai receber o valor de num
        //Exercutar o laço até o número ser maior que zero
        //Faz o decremento

        // fatorial vai multiplicar e receber o valor de i
        for (int i = num; i > 0; i--){
            fatorial *= i;

            System.out.println(i);
        }

        //Imprimir o resultado
        System.out.println(fatorial);
    }
}
