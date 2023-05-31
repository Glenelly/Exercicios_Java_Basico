package com.exercicios.aula18_19;

import java.util.Scanner;

public class CotacaoDolar {
    public static void main(String[] args) {
        /*
        Implementar um programa que obtenha a cotação do dólar (U$) em
        relação ao real (R$) e a seguir armazene em vetor A com 20
        elementos as seguintes conversões:
        A[i] = cotação do dolar * i, para todo i variando de 1 até 20
        */

        Scanner scan = new Scanner(System.in);

        double[] vetorA = new double[20];
        double cotacao;

        System.out.println("Informe a cotação do dolár: ");
        cotacao = scan.nextDouble();

        for(int i = 0; i < vetorA.length; i++){
            vetorA[i] = cotacao * (i + 1);
        }

        for(double i : vetorA){
            System.out.print(i + ", ");
        }


    }
}
