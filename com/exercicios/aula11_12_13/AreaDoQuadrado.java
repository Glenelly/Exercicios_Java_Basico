package com.exercicios.aula11_12_13;

import java.util.Scanner;

public class AreaDoQuadrado {
    public static void main(String[] args) {
        // Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o tamanho do lado do quadrado?");
        double lado = scan.nextInt();

        double area = Math.pow(lado, 2);

        System.out.print("A área do quadrado é: " + area);
        System.out.println("O dobro da área do quadrado é: " + (area * 2));
    }
}
