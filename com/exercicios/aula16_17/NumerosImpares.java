package com.exercicios.aula16_17;

public class NumerosImpares{
    public static void main(String[] args) {
        //Faça um programa que imprima na tela apenas os números ímpares entre 1 e 50.

        for(int i = 1; i < 50; i++){

            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }
}
