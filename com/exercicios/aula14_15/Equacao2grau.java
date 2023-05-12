package com.exercicios.aula14_15;

import java.util.Scanner;

public class Equacao2grau {
    public static void main(String[] args) {
        /*.Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. O programa deverá pedir os valores de a,
        b e c e fazer as consistências, informando ao usuário nas seguintes situações:
        a. Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os demais
        valores, sendo encerrado;
        b. Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
        c. Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
        d. Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de a: ");
        int a = scan.nextInt();

        int c = 0;
        int b = 0;

        if (a == 0){
            System.out.println("Não é equação de segundo grau!");
        }
        else {
            System.out.println("Informe o valor de b: ");
            b = scan.nextInt();

            System.out.println("Informe o valor de c: ");
            c = scan.nextInt();
        }

        int delta = (b * b) - (4 * a * c);

        if (delta < 0){
            System.out.println("Delta negativo!");
        }
        else {

            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("X1 = " + x1);
            System.out.println("X2 = " + x2);

        }


    }
}
