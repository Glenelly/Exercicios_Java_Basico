package com.exercicios.aula14_15;

import java.util.Scanner;

public class MaiorNumero {

    //Faça um Programa que peça dois números e imprima o maior deles.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int numero1 = scan.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int numero2 = scan.nextInt();

        if (numero1 > numero2){
            System.out.println("O maior número é o primeiro com " + numero1);
        }else
            System.out.println("O maior número é o segundo com " + numero2);

    }
}
