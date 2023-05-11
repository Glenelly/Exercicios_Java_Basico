package com.exercicios.aula14_15;

import java.util.Scanner;

public class Turno {
    public static void main(String[] args) {
        /*Faça um Programa que pergunte em que turno você estuda. Peça para digitar
        M-matutino ou V-Vespertino ou N- Noturno.
        Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Em que turno você estuda? M-matutino ou V-Vespertino ou N- Noturno.");
        String turno = scan.nextLine();

        switch (turno) {
            case "m":
            case "M":  System.out.println("Bom Dia!");break;
            case "v":
            case "V":  System.out.println("Boa Tarde!");break;
            case "n":
            case "N":  System.out.println("Boa Noite!");break;
            default:   System.out.println("Valor Inválido!");
        }
    }
}
