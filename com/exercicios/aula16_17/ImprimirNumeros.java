package com.exercicios.aula16_17;

public class ImprimirNumeros {
    public static void main(String[] args) {
        /*
        Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro.
        Depois modifique o programa para ele mostrar os números um ao lado do outro
        */

        for (int i = 1; i <= 20; i++){
            //Imprimir um abaixo do outro
            System.out.println(i);
        }

        for (int i = 1; i <= 20; i++){
            //Imprimir um ao lado do outro
            System.out.print(i + " ");
        }
    }
}
