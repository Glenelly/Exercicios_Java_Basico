package com.exercicios.aula11_12_13;

import java.util.Scanner;

public class ConversorDeCelsiusParaFarenheit {
    public static void main(String[] args) {
        /*Faça um Programa que peça a temperatura em graus Celsius,
        transforme e mostre em graus Farenheit.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual a temperatura em celsius? ");
        double celsius = scan.nextDouble();

        double calculo = (celsius * 1.8) + 32;

        System.out.print("A temperatura em farenheit é: " + calculo);
    }
}
