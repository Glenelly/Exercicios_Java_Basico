package com.exercicios.aula11_12_13;

import java.util.Scanner;

public class CalculoDeNumerosInteirosEReais {
    public static void main(String[] args) {

        /*.Faça um Programa que peça 2 números inteiros e um número real.
        Calcule e mostre:
        a. o produto do dobro do primeiro com metade do segundo .
        b. a soma do triplo do primeiro com o terceiro.
        c. o terceiro elevado ao cubo.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro número inteiro: ");
        int PrimeiroNumero = scan.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int SegundoNumero = scan.nextInt();

        System.out.print("Digite um número real: ");
        double NumeroReal = scan.nextFloat();

        int DobroDo1ComMetadeDo2 = (PrimeiroNumero * 2) * (SegundoNumero / 2);
        double SomaTriploDo1Com3 = (PrimeiroNumero * 3) + NumeroReal;
        double elevadoA3 = Math.pow(NumeroReal, 3);

        System.out.println("O produto do dobro do primeiro com metade do segundo: " + DobroDo1ComMetadeDo2);
        System.out.println("A soma do triplo do primeiro com o terceiro: " + SomaTriploDo1Com3);
        System.out.println("o terceiro elevado ao cubo: " + elevadoA3);
    }
}
