package com.exercicios.aula14_15;

import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        /*Faça um Programa que leia um número e exiba o dia correspondente da semana.
        (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um dia da semana em números de 1 a 7: ");
        int diaSemana = scan.nextInt();

        switch(diaSemana){
            case 1 -> System.out.println("Domingo");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            case 7 -> System.out.println("Sábado");
            default -> System.out.println("Valor inválido");
        }


    }
}
