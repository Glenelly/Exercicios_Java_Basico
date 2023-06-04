package com.exercicios.aula20;

import java.util.Scanner;

public class ParesImparesMatriz {
    public static void main(String[] args) {
        /*Capture do teclado valores para preenchimento de uma matriz M 3x3.
        Após a captura imprima a matriz criada e encontre a quantidade de números pares,
        a quantidade de números ímpares.*/

        Scanner scan = new Scanner(System.in);

        int[][] valores = new int[3][3];

        for (int i = 0; i < valores.length; i++){
            for (int j = 0; j < valores[i].length; j++){

                System.out.println("Informe os valores da posição [" + i + " , " + j + "]: ");
                valores[i][j] = scan.nextInt();
            }
        }

        int qtdPares = 0;
        int qtdImpares = 0;

        for (int i = 0; i < valores.length; i++){
            for (int j = 0; j < valores[i].length; j++){

                if(valores[i][j] % 2 == 0){
                    qtdPares++;
                }else{
                    qtdImpares++;
                }
            }
        }

        for (int i = 0; i < valores.length; i++){
            for (int j = 0; j < valores[i].length; j++){

                System.out.println(valores[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Quantidade de números pares: " + qtdPares);
        System.out.println("Quantidade de números ímpares: " + qtdImpares);
    }
}
