package com.exercicios.aula11_12_13;

import java.util.Scanner;

public class ConversorDeFarenheitParaCelsius {
    public static void main(String[] args) {
        /*Faça um Programa que peça a temperatura em graus Farenheit,
        transforme e mostre a temperatura em graus Celsius*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual a temperatura em farenheit? ");
        double Farenheit = scan.nextDouble();

        double calculo = (5 * (Farenheit-32) / 9);

        System.out.print("A temperatura em celsius é de: " + calculo);
    }
}
