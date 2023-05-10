package com.exercicios.aula14_15;

import java.util.Scanner;

public class VerificarF_M {
    public static void main(String[] args) {
        /*Faça um Programa que verifique se uma letra digitada é "F" ou "M".
        Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Você é do sexo feminino ou masculino? F - Feminino, M - Masculino");
        String sexo = scan.nextLine();

        if(sexo.equalsIgnoreCase("F"))
            System.out.println("Você é do sexo feminino! ");
        else if(sexo.equalsIgnoreCase("M"))
            System.out.println("Você é do sexo masculino! ");
        else
            System.out.println("Sexo inválido no sistema.");
    }
}
