package com.exercicios.aula11_12_13;

import java.util.Scanner;

public class TempoDownload {
    public static void main(String[] args) {
        /*.Faça um programa que peça o tamanho de um arquivo para download
        (em MB) e a velocidade de um link de Internet (em Mbps), calcule e
        informe o tempo aproximado de download do arquivo usando este link
        (em minutos).*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual tamanho do arquivo? ");
        double tamanhoArquivo = scan.nextDouble();

        System.out.println("Qual a velocidade da internet? ");
        double velocidadeInternet = scan.nextDouble();

        double tempo = tamanhoArquivo / velocidadeInternet;

        System.out.println("Tempo de download: " + tempo);
    }
}
