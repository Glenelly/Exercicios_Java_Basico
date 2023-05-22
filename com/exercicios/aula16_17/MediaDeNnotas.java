package com.exercicios.aula16_17;

import java.util.Scanner;

public class MediaDeNnotas {
    public static void main(String[] args) {
        /*Faça um programa que calcule o mostre a média de N notas.*/

        Scanner scan = new Scanner(System.in);

        //Recebe a quantidade de notas
        System.out.println("Quantas notas você tem? ");
        int Qnotas = scan.nextInt();

        double notas;
        double soma = 0;
        double media;

        //Vai fazer o loop até que i seja menor que Qnotas
        for (int i = 0; i < Qnotas; i++){

            //Vai receber as notas
            System.out.println("Digite sua nota: ");
            notas = scan.nextDouble();

            //A soma das notas
            soma += notas;

        }
        media = soma / Qnotas;

        //Exibindo o resultado
        System.out.println("A soma das suas notas: " + soma);
        System.out.println("A sua média é: " + media);
    }
}
