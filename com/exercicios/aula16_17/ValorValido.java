package com.exercicios.aula16_17;

import java.util.Scanner;

public class ValorValido {
    public static void main(String[] args) {
        /*
        Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido
        e continue a pedir até que o utilizador informe um valor válido.
*/
        Scanner scan = new Scanner(System.in);

        boolean notaValida = false;

        do {
            System.out.println("Digite uma nota de 0 a 10: ");
            double nota = scan.nextDouble();

            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Sua nota foi: " + nota);
            } else {
                System.out.println("Valor inválido! Digite a nota novamente:");
            }
        }while (!notaValida);
    }
}
