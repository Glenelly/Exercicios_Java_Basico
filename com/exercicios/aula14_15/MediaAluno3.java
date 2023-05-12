package com.exercicios.aula14_15;

import java.util.Scanner;

public class MediaAluno3 {
    public static void main(String[] args) {
        /*Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, e calcule a sua média. A
        atribuição de conceitos obedece à tabela abaixo:
        o Média de Aproveitamento Conceito
        Entre 9.0 e 10.0 A
        Entre 7.5 e 9.0 B
        Entre 6.0 e 7.5 C
        Entre 4.0 e 6.0 D
        Entre 4.0 e zero E
        O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem “APROVADO” se o conceito for
        A, B ou C ou “REPROVADO” se o conceito for D ou E.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite sua primeira nota parcial: ");
        double nota1 = scan.nextDouble();

        System.out.println("Digite sua segunda nota parcial: ");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        String aproveitamento = "";

        if (media >= 9 && media <= 10)
            aproveitamento = "A";
        else if (media >= 7.5 && media < 9)
            aproveitamento = "B";
        else if (media >= 6.0 && media < 7.5)
            aproveitamento = "C";
        else if (media >= 4.0 && media < 6.0)
            aproveitamento = "D";
        else if (media >= 0 && media < 4)
            aproveitamento = "E";

        System.out.println("Suas notas foram: " + nota1 + "e " + nota2);
        System.out.println("Sua média foi de " + media);
        System.out.println("Conceito: " + aproveitamento);

        switch (aproveitamento) {
            case "A", "B", "C" -> System.out.println("Você foi APROVADO!!");
            case "D", "E" -> System.out.println("Você foi REPROVADO!!");
        }


    }
}
