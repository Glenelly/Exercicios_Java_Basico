package com.exercicios.aula16_17;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        A série de Fibonacci é formada pela seqüência 1,1,2,3,5,8,13,21,34,55,...
        Faça um programa capaz de gerar a série até o n−ésimo termo.
        */

        //SEM RECURSÃO

        System.out.println("Entre com o n-ésimo termo da série de fibonacci: ");
        int n = scan.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int proximo;

        System.out.println(primeiro);
        System.out.println(segundo);

        //1.1.2.3.5
        //primeiro = 1
        //segundo = 1
        //proximo = 2

        for (int i = 3; i <= n; i++){

            proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;

            System.out.println(proximo);
        }


    }
}
