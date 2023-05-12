package com.exercicios.aula14_15;

import java.util.Scanner;

public class Fruteira {
    public static void main(String[] args) {

        /*Uma fruteira está vendendo frutas com a seguinte tabela de preços: Até 5 Kg Acima de 5 Kg
        -Morango R$ 2,50 por Kg R$ 2,20 por Kg
        -Maçã R$ 1,80 por Kg R$ 1,50 por Kg
        Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total.
        Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.
*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos (kg) de morango você deseja? ");
        double quantidadeMorango = scan.nextDouble();

        System.out.println("Quantos (kg) de maçãs você deseja? ");
        double quantidadeMaca = scan.nextDouble();

        double precoKgMorango;
        double precoKgMaca;

        if (quantidadeMorango <= 5)
            precoKgMorango = 2.5;
        else
            precoKgMorango = 2.2;


        if (quantidadeMaca <= 5)
            precoKgMaca = 1.8;
        else
            precoKgMaca = 1.5;

        double precoTotalMorango = quantidadeMorango * precoKgMorango;
        double precoTotalMaca = quantidadeMaca * precoKgMaca;

        double precoPacial = precoTotalMorango + precoTotalMaca;
        double precoTotal = 0;

        if (quantidadeMorango + quantidadeMaca > 8 || precoPacial > 25)
            precoTotal = precoPacial - ((precoPacial / 100) * 10);

        System.out.println("O preço total foi: " + precoTotal);


    }
}
