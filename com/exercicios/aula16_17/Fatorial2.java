package com.exercicios.aula16_17;

import java.util.Scanner;

public class Fatorial2 {
    public static void main(String[] args) {
        /*
        Altere o programa de cálculo do fatorial, permitindo ao utilizador calcular o fatorial limitando
        o fatorial a números inteiros positivos e menores que 16 e fazer a repetição caso seja número inválido.
        */

        Scanner scan = new Scanner(System.in);

        //Vai pedir o número
        System.out.println("Digite um número positivo menor ou igual a 16: ");
        int numero = scan.nextInt();

        //O fatorial vai iniciar com o número 1
        int fatorial = 1;

        //Caso o número seja inválido, o laço vai se repetir até que seja colocado um número válido.
        while (numero > 16 || numero < 0){
                System.out.println("Digite um número válido: ");
                numero = scan.nextInt();
        }

        //A variavel i vai receber o valor de num
        //Exercutar o laço até o número ser maior que zero
        //Faz o decremento

        // fatorial vai multiplicar e receber o valor de i
        for(int i = numero; i > 0; i--){

                fatorial *= i;
                System.out.println(i);
        }

        //Imprimir o resultado
        System.out.println("Resultado: " + fatorial);

    }
}
