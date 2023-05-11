package com.exercicios.aula14_15;

import java.util.Scanner;

public class ComprarProduto {
    public static void main(String[] args) {
        /*Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
        sabendo que a decisão é sempre pelo mais barato.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o preço do sabão Omo: ");
        double produto1 = scan.nextDouble();

        System.out.println("Digite o preço do sabão Brilhante: ");
        double produto2 = scan.nextDouble();

        System.out.println("Digite o preço do sabão Tixan Ypê: ");
        double produto3 = scan.nextDouble();

        if (produto1 <= produto2 && produto1 <= produto3)
            System.out.println("O sabão Omo é mais barato, devo comprar!!");

        else if (produto2 <= produto1 && produto2 <= produto3)
            System.out.println("O sabão Brilhante mais barato, devo comprar!!");

        else
            System.out.println("O sabão Tixan Ypê mais barato, devo comprar!!");

    }
}
