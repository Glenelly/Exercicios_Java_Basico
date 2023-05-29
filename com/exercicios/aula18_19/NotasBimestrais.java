package com.exercicios.aula18_19;

import java.util.Scanner;

public class NotasBimestrais {
    public static void main(String[] args) {
        /*
        Ler as duas notas bimestrais para um conjunto de 10 alunos.
        Armazenar as notas informadas em dois vetores “Nota1” e “Nota2” do
        tipo real. Escreva um programa que calcule a média aritmética simples
        das notas informadas armazenando o resultado em um vetor “Result”
        de mesmo tipo e tamanho. Ao mostrar os resultados exibir a situação
        de cada aluno. Se a média calculada for superior ou igual a 7 o aluno
        estará “aprovado”, caso contrário, a situação do aluno será
        “reprovado”

        - Criar vetores (Notas1, Notas2, Resultados)
        - Fazer um laço para pegar as notas e colocar nos vetores de notas
        - Calcular o resultado
        - Exibir as primeiras e segundas notas
        - Exibir o resultado se o aluno passou ou não
        */

        Scanner scan = new Scanner(System.in);

        //Criei os vetores
        double[] Notas1 = new double[10];
        double[] Notas2 = new double[Notas1.length];
        double[] Resultados = new double[Notas1.length];

        //Faço o loop com o tamanho que foi atribuido ao vetor Notas1
        for(int i = 0; i < Notas1.length;i++){

            //Pego as Notas1
            System.out.println("Aluno " + (i+1) + ", digite sua primeira nota: ");
            Notas1[i] = scan.nextDouble();

            //Pego as Notas2
            System.out.println("Aluno " + (i+1) + ", digite sua Segunda nota: ");
            Notas2[i] = scan.nextDouble();

            //Calculo a média
            Resultados[i] = (Notas1[i] + Notas2[i]) / 2;
        }

        //Imprimo as primeiras notas
        System.out.println("Primeiras notas: ");
        for (double i : Notas1){
            System.out.print(i + " ");
        }
        System.out.println();

        //Imprimo as segundas Notas
        System.out.println("Segundas notas: ");
        for (double i : Notas2){
            System.out.print(i + " ");
        }
        System.out.println();

        //Faço a verificação e imprimo os resultados
        System.out.println("Resultados: ");
        for (double resultado : Resultados) {

            //Verifico se a nota é >= a 7 e se for imprimo Aprovado
            if (resultado >= 7) {
                System.out.println(resultado + " - Aprovado ");

            //Verifico se a nota é >= a 7 e se não for imprimo Reprovado
            } else {
                System.out.println(resultado + " - Reprovado ");
            }
        }


    }
}
