package com.exercicios.aula14_15;

import java.util.Scanner;

public class FolhaPagamento {
    public static void main(String[] args) {
        /*Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda,
        que depende do salário bruto (3% para o Sindonforme tabela abaixo) e sindicato e que o
        FGTS corresponde a 11% do Salário Bruto, mas não é descontado (é a empresa que deposita).
        O Salário Líquido corresponde ao Salário Bruto menos os descontos. O programa deverá pedir ao usuário o
        valor da sua hora e a quantidade de horas trabalhadas no mês.
        o Desconto do IR:
        o Salário Bruto até 900 (inclusive) - isento
        o Salário Bruto até 1500 (inclusive) - desconto de 5%
        o Salário Bruto até 2500 (inclusive) - desconto de 10%
        o Salário Bruto acima de 2500 - desconto de 20%
        Imprima na tela as informações, dispostas conforme o exemplo abaixo. No exemplo o valor da hora é 5 e a quantidade de hora é 220.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora trabalhada? ");
        double ganhoPorHora = scan.nextDouble();

        System.out.println("Quantas horas você trabalha no mês? ");
        double horasTrabalhadas = scan.nextDouble();

        double salarioBruto = ganhoPorHora * horasTrabalhadas;

        int percentualIR = 0;

        if(salarioBruto <= 900)
            percentualIR = 0;
        else if(salarioBruto > 900 && salarioBruto <= 1500 )
            percentualIR = 5;
        else if(salarioBruto > 1500 && salarioBruto <= 2500)
            percentualIR = 10;
        else if(salarioBruto > 2500)
            percentualIR = 20;

        double ir = (salarioBruto / 100) * percentualIR;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;
        double totalDescontos = ir + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto:  (" + ganhoPorHora + " * " + horasTrabalhadas + "):  " + salarioBruto);
        System.out.println("(-) IR " + "(" + percentualIR + "%" + "):                    " + ir );
        System.out.println("(-) INSS " + "(10%):                  " + inss);
        System.out.println("FGTS " + "(11%):                      " + fgts);
        System.out.println("Total de descontos:              " + totalDescontos);
        System.out.println("Salário Líquido:                 " + salarioLiquido);
    }
}
