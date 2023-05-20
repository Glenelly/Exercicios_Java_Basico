package com.exercicios.aula16_17;

import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        //Faça um programa que peça 10 números inteiros, calcule e mostre a quantidade de números pares e a quantidade de números impares.

        Scanner scan = new Scanner(System.in);

        int numeros;
        int pares = 0;
        int impares = 0;

        System.out.println("Digite os números inteiros: ");

        for(int i = 1; i <= 10; i++){

            numeros = scan.nextInt();

            if (numeros % 2 == 0){
                pares++;
            }else{
                impares++;
            }
        }
        System.out.println("Números pares: " + pares);
        System.out.println("Números Ímpares: " + impares);
    }
}
