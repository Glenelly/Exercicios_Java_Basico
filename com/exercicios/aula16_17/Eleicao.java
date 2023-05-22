package com.exercicios.aula16_17;

import java.util.Scanner;

public class Eleicao {
    public static void main(String[] args) {
        /*Numa eleição existem três candidatos. Faça um programa que peça o número total de eleitores.
         Peça para cada eleitor votar e ao final mostrar o número de votos de cada candidato.

         Algoritmo:
         -Criar variavel para os 3 candidatos
         -Pedir o número total de eleitores
         -Pedir os votos (loop for)
         -Coletar os votos (If dentro do for)
         -Exibir o resultado
         */

        Scanner scan = new Scanner(System.in);

        //Variaveis
        int cand1 = 0;
        int cand2 = 0;
        int cand3 = 0;
        int eleitores;
        int votos;

        //Quantidade de eleitores
        System.out.println("Informe o número total de eleitores: ");
        eleitores = scan.nextInt();

        //acrescentar enquanto o i for menor que eleitores
        for (int i = 0; i < eleitores; i++){

            //pedir votos
            System.out.println("Digite os votos dos eleitores (Candidato 1 João - 1, candidato Ana - 2, candidato Matheus - 3 ): ");
            votos = scan.nextInt();

            //Contar votos, se votos for 1 acrescenta no candidato 1
            if (votos == 1){
                cand1++;
            //se votos for 2 acrescenta no candidato 2
            } else if (votos == 2) {
                cand2++;
            //se votos for 3 acrescenta no candidato 3
            }else if(votos == 3){
                cand3++;
            }
        }

        //Exibe o resultado
        System.out.println("A quantidade de votos do candidato 1 foi de: " + cand1);
        System.out.println("A quantidade de votos do candidato 2 foi de: " + cand2);
        System.out.println("A quantidade de votos do candidato 3 foi de: " + cand3);
    }
}
