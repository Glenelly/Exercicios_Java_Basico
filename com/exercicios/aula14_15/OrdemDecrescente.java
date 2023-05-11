package com.exercicios.aula14_15;

import java.util.Scanner;

public class OrdemDecrescente {
    public static void main(String[] args) {
        //Faça um Programa que leia três números e mostre-os em ordem decrescente com if .

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double numero1 = scan.nextDouble();

        System.out.println("Digite o segundo número: ");
        double numero2 = scan.nextDouble();

        System.out.println("Digite o terceiro número: ");
        double numero3 = scan.nextDouble();

        if (numero1 <= numero2 && numero1 <= numero3 && numero2 <= numero3)
            System.out.println(numero3 + " - " + numero2 + " - " + numero1);

        else if (numero1 <= numero2 && numero1 <= numero3 && numero3 <= numero2)
            System.out.println(numero2 + " - " + numero3 + " - " + numero1);

        else if (numero2 <= numero1 && numero2 <= numero3 && numero1 <= numero3)
            System.out.println(numero3 + " - " + numero1 + " - " + numero2);

        else if (numero2 <= numero1 && numero2 <= numero3 && numero3 <= numero1)
            System.out.println(numero1 + " - " + numero3 + " - " + numero2);

        else if (numero3 <= numero1 && numero3 <= numero2 && numero1 <= numero2)
            System.out.println(numero2 + " - " + numero1 + " - " + numero3);

        else if (numero3 <= numero1 && numero3 <= numero2 && numero2 <= numero1)
            System.out.println(numero1 + " - " + numero2 + " - " + numero3);
    }
}
