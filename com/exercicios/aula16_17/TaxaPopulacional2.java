package com.exercicios.aula16_17;

import java.util.Scanner;

public class TaxaPopulacional2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
            /*
             Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais.
             Valide a entrada.
             */

        double populacaoA;
        double populacaoB;
        double taxaA;
        double taxaB;
        int count = 0;

            System.out.println("Informe a polulação da cidade A: ");
            populacaoA = scan.nextDouble();

            System.out.println("Informe a taxa de crescimento da população A: ");
            taxaA = scan.nextDouble();

            System.out.println("Informe a população da cidade B: ");
            populacaoB = scan.nextDouble();

            System.out.println("Informe a taxa de crescimento da população B: ");
            taxaB = scan.nextDouble();


            if (populacaoA <= 0 || populacaoB <= 0) {
                System.out.println("A quantidade populacional precisa ser maior que 0! ");
            }

            if (taxaA <= 0 || taxaB <= 0) {
                System.out.println("A taxa de crescimento precisa ser maior que 0!");
            }

            while (populacaoA <= populacaoB) {
                populacaoA += (populacaoA / 100) * taxaA;
                populacaoB += (populacaoB / 100) * taxaB;
                count++;
            }

            System.out.println("População A: " + populacaoA);
            System.out.println("Taxa de crescimento A: " + taxaA);
            System.out.println("População B: " + populacaoB);
            System.out.println("Taxa de crescimento B: " + taxaB);
            System.out.println("Quantidade de anos: " + count);

    }
}
