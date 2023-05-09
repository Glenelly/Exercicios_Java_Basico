package com.exercicios.aula11_12_13;

import java.util.Scanner;

public class MediaDoAluno {
    public static void main(String[] args) {
        //Faça um Programa que peça as 4 notas bimestrais e mostre a média.

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        double nota1 = scan.nextDouble();

        System.out.print("Digite sua segunda nota: ");
        double nota2 = scan.nextDouble();

        System.out.print("Digite sua terceira nota: ");
        double nota3 = scan.nextDouble();

        System.out.print("Digite sua quarta nota: ");
        double nota4 = scan.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4 ) / 4;
        System.out.print("Sua média é: " + media);

    }
}
