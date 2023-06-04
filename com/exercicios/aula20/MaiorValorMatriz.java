package com.exercicios.aula20;

import java.util.Random;

public class MaiorValorMatriz {
    public static void main(String[] args) {
        /*Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
        Após isso determine o maior número da matriz e a sua posição (linha, coluna).*/

        int[][] valoresAleatorios = new int[4][4];

        Random numeroRandom = new Random();

        for(int i = 0; i < valoresAleatorios.length; i++){
            for(int j = 0; j < valoresAleatorios[i].length; j++){
                valoresAleatorios[i][j] = numeroRandom.nextInt(100);
            }
        }

        int maior = 0;
        int linha = 0;
        int coluna = 0;

        for(int i = 0; i < valoresAleatorios.length; i++){
            for (int j = 0; j< valoresAleatorios[i].length; j++){
                if (valoresAleatorios[i][j] > maior){
                    maior = valoresAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        for (int[] valoresAleatorio : valoresAleatorios) {
            for (int i : valoresAleatorio) {
                System.out.println(i + " ");
            }
            System.out.println();
        }

        System.out.println("Maior valor: " + maior);
        System.out.println("Linha: " + linha);
        System.out.println("Coluna: " + coluna);


    }
}
