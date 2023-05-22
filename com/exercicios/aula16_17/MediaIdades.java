package com.exercicios.aula16_17;

import java.util.Scanner;

public class MediaIdades {
    public static void main(String[] args) {
        /*
        Faça um programa que peça para n pessoas a sua idade, ao final o programa devera verificar se a média de idade da turma varia entre 0 e
        25,26 e 60 e maior que 60; e então, dizer se a turma é jovem, adulta ou idosa, conforme a média calculada.

        -pedir a quantidade de pessoas
        -pedir a idade das pessoas (loop for)
        -Verificar a média das idades ( media += idades / Qpessoas)
        -Dizer se a pessoa é jovem, adulta, idosa.( if media > 0 && media < 26 = Jovem
                                                    if media > 26 && media < 60 = adulto
                                                    if media > 60 = idosa
        */

        Scanner scan = new Scanner(System.in);

        int Qpessoas;
        int idades;
        int media = 0;

        //Pedindo quantidade de idades
        System.out.println("Quantidade de pessoas: ");
        Qpessoas = scan.nextInt();

        //acrescentar enquanto o i for menor que Qpessoas
        for (int i = 0; i < Qpessoas; i++) {
            //pedindo as idades
            System.out.println("Digite a idade das pessoas: ");
            idades = scan.nextInt();

            //media recebe a soma das idades e divide pela Qpessoas
            media += idades / Qpessoas;
        }
        //Verifica se é jovem, adulto ou idoso
        if (media >= 0 && media <= 25){
            System.out.println("A turma é jovem com a média de idade de " + media + " anos.");

        } else if (media >= 26 && media <= 60) {
            System.out.println("A turma é adulta com a média de idade de " + media + " anos.");

        } else if (media > 60) {
            System.out.println("A turma é idosa com a média de idade de " + media + " anos.");
        }
    }
}
