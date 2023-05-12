package com.exercicios.aula14_15;

import java.util.Scanner;

public class TabelaDesconto{
    public static void main(String[] args) {
        /*Um posto está vendendo combustíveis com a seguinte tabela de descontos:
        a. Álcool:
        b. até 20 litros, desconto de 3% por litro
        c. acima de 20 litros, desconto de 5% por litro Gasolina:
        d. até 20 litros, desconto de 4% por litro
        e. acima de 20 litros, desconto de 6% por litro
        Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, Ggasolina),
        calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a quantidade de litros vendidos?");
        double litros = scan.nextDouble();

        System.out.println("Qual tipo de conbustível");
        String tipoConbustivel = scan.next();

        double precoGas = 2.5;
        double precoAlc = 1.9;
        int percentualDesconto = 0;
        double total = 0;
        double totalDescontos;

        if (tipoConbustivel.equalsIgnoreCase("a")) {

            if (litros <= 20)
                percentualDesconto = 3;
            else percentualDesconto = 5;

            total = litros * precoAlc;
        }

        else if (tipoConbustivel.equalsIgnoreCase("g")) {

            if (litros <= 20)
                percentualDesconto = 4;
            else percentualDesconto = 6;

            total = litros * precoGas;
        }

        totalDescontos = (total / 100) * percentualDesconto;

        double precoAPagar = total - totalDescontos;

        System.out.println("Valor a ser pago: " + precoAPagar);

    }
}
