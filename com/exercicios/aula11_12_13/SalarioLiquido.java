package com.exercicios.aula11_12_13;

import java.util.Scanner;

public class SalarioLiquido {
    public static void main(String[] args) {
        /*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu
        salário no referido mês sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um
        programa que nos dê:
        . salário bruto.
        a. quanto pagou ao INSS.
        b. quanto pagou ao sindicato.
        c. o salário líquido.
        d. calcule os descontos e o salário líquido, conforme a tabela
        abaixo:
        + Salário Bruto : R$ - IR (11%) : R$ - INSS (8%) : R$ - Sindicato ( 5%) : R$ = Salário Liquido : R$
        Obs.: Salário Bruto - Descontos = Salário Líquido.*/

        Scanner scan = new Scanner(System.in);

        System.out.print("Quanto você ganha por hora? ");
        double quantoGanhaPorHora = scan.nextDouble();

        System.out.print("Quantas horas você trabalha no mês? ");
        double horasTrabalhadasMensal = scan.nextDouble();

        double salarioBruto  = quantoGanhaPorHora * horasTrabalhadasMensal;
        double inss = (salarioBruto / 100) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double impostoRenda = (salarioBruto / 100) * 11;
        double totalDescontos = inss + sindicato + impostoRenda;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Seu salário bruto é de: " + salarioBruto);
        System.out.println("Valor do INSS é de:" + inss);
        System.out.println("Valor do sindicato é de:" + sindicato);
        System.out.println("Valor do imposto de renda é de:" + impostoRenda);
        System.out.println("Valor do total de descontos é de:" + totalDescontos);
        System.out.println("Seu salário líquido é de: " + salarioLiquido);
    }
}
