package com.exercicios.aula14_15;

import java.util.Scanner;

public class MaiorMenor {
    public static void main(String[] args) {

            // Faça um Programa que leia três números e mostre o maior e o menor deles.

            Scanner scan = new Scanner(System.in);

            System.out.println("Digite o primeiro número: ");
            double numero1 = scan.nextDouble();

            System.out.println("Digite o segundo número: ");
            double numero2 = scan.nextDouble();

            System.out.println("Digite o terceiro número: ");
            double numero3 = scan.nextDouble();


            if (numero1 > numero2 && numero1 > numero3) {
                System.out.println("O maior número é o primeiro com " + numero1);
            }
            else if (numero2 > numero1 && numero2 > numero3) {
                System.out.println("O maior número é o segundo com " + numero2);
            }
            else {
                System.out.println("O maior número é o terceiro com " + numero3);
            }


            if (numero1 < numero2 && numero1 < numero3) {
                System.out.println("O menor número é o primeiro com " + numero1);
            }
            else if (numero2 < numero1 && numero2 < numero3) {
                System.out.println("O menor número é o segundo com " + numero2);
            }
            else {
                System.out.println("O menor número é o terceiro com " + numero3);
            }
    }
}
