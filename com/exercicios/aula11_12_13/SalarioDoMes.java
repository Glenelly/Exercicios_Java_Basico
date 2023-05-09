package com.exercicios.aula11_12_13;

import java.util.Scanner;

public class SalarioDoMes {
    public static void main(String[] args) {
        /*Faça um Programa que pergunte quanto você ganha por hora e o
        *número de horas trabalhadas no mês. Calcule e mostre o total do seu
        salário no referido mês.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora? ");
        double QuantoGanhaPorHora = scan.nextDouble();

        System.out.print("Quantas horas você trabalha no mês? ");
        double HorasTrabalhadasMensal = scan.nextDouble();

        double Calculo  = QuantoGanhaPorHora * HorasTrabalhadasMensal;

        System.out.print("Seu salário mensal é de: " + Calculo);
    }
}
