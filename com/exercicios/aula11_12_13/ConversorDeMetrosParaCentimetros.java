package com.exercicios.aula11_12_13;

import java.util.Scanner;

public class ConversorDeMetrosParaCentimetros {
    public static void main(String[] args) {

        //Faça um Programa que converta metros para centímetros

        Scanner scan = new Scanner(System.in);

        System.out.print("Quantos metros você quer converter?");
        double metros = scan.nextDouble();

        double conversor = metros * 100;
        System.out.println("Convertido para centímetros " + conversor);
    }
}
