package com.exercicios.aula11_12_13;

import java.util.Scanner;

public class MostrarNumero {
    public static void main(String[] args) {

        //Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = scan.nextInt();

        System.out.println("O número informado foi: " + numero);
    }
}
