package com.exercicios.aula14_15;

import java.util.Scanner;

public class VogalConsoante {
    public static void main(String[] args) {
        //Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite uma letra: ");
        String letra = scan.next();

        if(letra.length() > 1)
            System.out.println("Não é uma letra válida!");
        else
            switch (letra) {
                case "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" ->
                        System.out.println(letra + " é uma vogal!");
                default ->
                        System.out.println(letra + " é uma consoante!");
            }
    }
}
