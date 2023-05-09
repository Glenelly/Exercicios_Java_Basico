package com.exercicios.aula11_12_13;

import java.util.Scanner;

public class CalculoPesoIdeal {
    public static void main(String[] args) {
         /*Tendo como dados de entrada a altura de uma pessoa, construa um
        algoritmo que calcule seu peso ideal, usando a seguinte fórmula:
        (72.7*altura) - 58*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual a sua altura? ");
        double altura = scan.nextDouble();

        double resultado = (72.7 * altura) - 58;

        System.out.print("Seu peso ideal é: " + resultado);
    }
}
