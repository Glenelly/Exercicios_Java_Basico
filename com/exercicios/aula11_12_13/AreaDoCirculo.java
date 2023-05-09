package com.exercicios.aula11_12_13;

import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {

        //Faça um Programa que peça o raio de um círculo, calcule e mostre sua área

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o raio: ");
        double raio = scan.nextInt();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.print("Está é a área do círculo: " + area);
    }
}
