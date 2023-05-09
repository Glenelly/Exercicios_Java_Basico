package com.exercicios.aula11_12_13;

import java.util.Scanner;

public class SomaDeDoisNumeros {
    public static void main(String[] args) {
        //Faça um Programa que peça dois números e imprima a soma.

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double primeiroNumero = scan.nextDouble();

        System.out.print("Digite o segundo número: ");
        double segundoNumero = scan.nextDouble();

        double resultado = primeiroNumero + segundoNumero;
        System.out.println("A soma dos números foi: " + resultado);
    }
}
