package com.exercicios.aula14_15;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        /*.Faça um Programa que peça os 3 lados de um triângulo. O programa
        deverá informar se os valores podem ser um triângulo. Indique, caso
        os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou
        escaleno.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro lado: ");
        double lado1 = scan.nextDouble();

        System.out.println("Digite o segundo lado: ");
        double lado2 = scan.nextDouble();

        System.out.println("Digite o terceiro lado: ");
        double lado3 = scan.nextDouble();

        if ((lado1 + lado2) > lado3 ||
            (lado1 + lado3) > lado2 ||
            (lado2 + lado3) > lado1){

            if (lado1 == lado2 && lado1 == lado3)
                System.out.println("É um triângulo Equilátero!");

            else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2)
                System.out.println("É um triângulo Escaleno!");

            else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3)
                System.out.println("É um triângulo Isóceles!");

        }else
            System.out.println("Não é um triângulo!");
    }
}
