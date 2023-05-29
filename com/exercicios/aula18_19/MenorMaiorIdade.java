package com.exercicios.aula18_19;

import java.util.Scanner;

public class MenorMaiorIdade {
    public static void main(String[] args) {
        /*
        Ler um vetor A com 10 elementos inteiros correspondentes as idades
        de um grupo de pessoas. Escreva um programa que determine e
        escreva a menor e a maior idades e suas respectivas posições.

        - Crio os vetores e variaveis
        - Faço o loop para pegar as idades
        - Faço outro for verificando as idades que são maiores e menores
        - Imprimo as idades
        - Imprimo o resultado
        */

        Scanner scan = new Scanner(System.in);

        //Criando vetor e variaveis
        int[] idades = new int[10];
        int indexMaior = 0;
        int maior = idades[0];
        int indexMenor = 0;
        int menor = idades[0];


        //Faço o loop com o tamanho que foi atribuido as idades
        for(int i = 0; i < idades.length; i++){
            //Pego as idades
            System.out.println("Digite sua idade (posicão " + (i+1) + "): ");
            idades[i] = scan.nextInt();
        }

        //Faço o loop com o tamanho que foi atribuido as idades
        for(int i = 1; i < idades.length; i++){
            //Verifico se os elementos dentro de idades são maiores que idades[0]
            if(idades[i] > maior){
                //se for maior, a variavel maior vai passar a conter o número maior
                maior = idades[i];
                //E a variavel indexMaior vai passar a ter o index da maior idade
                indexMaior = i;

            //Verifico se os elementos dentro de idades são menores que idades[0]
            }else if(idades[i] < maior){
                //se for menor, a variavel menor vai passar a conter o número menor
                menor = idades[i];
                //E a variavel indexMenor vai passar a ter o index da menor idade
                indexMenor = i;
            }
        }

        //Exibe as idades
        System.out.println("Idades: ");
        for (int a : idades){
            System.out.print(a + ", ");
        }
        System.out.println();

        //Mostrando resultado
        System.out.println("A maior idade é: " + maior);
        System.out.println("Posição maior idade: " + indexMaior);
        System.out.println("A menor idade é: " + menor);
        System.out.println("Posição menor idade: " + indexMenor);

    }
}
