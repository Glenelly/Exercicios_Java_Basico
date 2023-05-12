package com.exercicios.aula14_15;

import java.util.Scanner;

public class ImparPar2 {
    public static void main(String[] args) {
        /*Faça um Programa que leia 2 números e em seguida pergunte ao
        usuário qual operação ele deseja realizar. O resultado da operação
        deve ser acompanhado de uma frase que diga se o número é:
        b. par ou ímpar;
        a. positivo ou negativo;
        c. inteiro ou decimal*/

        Scanner scan = new Scanner(System.in);

        double resultado = 0;
        boolean valida = true;

        System.out.println("Digite o primeiro número: ");
        double numero1 = scan.nextDouble();

        System.out.println("Digitem o segundo número: ");
        double numero2 = scan.nextDouble();

        System.out.println("Qual operação você deseja realizar? (+ - / *) ");
        String operacao = scan.next();

        switch (operacao) {
            case "+" -> resultado = numero1 + numero2;
            case "-" -> resultado = numero1 - numero2;
            case "*" -> resultado = numero1 * numero2;
            case "/" -> resultado = numero1 / numero2;
            default -> {
                System.out.println("Operação Inválida");
                valida = false;
            }
        }

        if (valida){
            System.out.println("Resultado: " + resultado);

            if (resultado >= 0 )
                System.out.println("Resultado positivo");
        } else
            System.out.println("Resultado negativo");

        if (resultado % 2 == 0)
            System.out.println("Número par");
        else
            System.out.println("Número Ímpar");

    }
}
