package com.exercicios.aula18_19;

public class BaseExpoenteDoElemento {
    public static void main(String[] args) {
        /*
        Criar um vetor A com 11 elementos, indexados de 0 até 10. Sendo que
        cada elemento do vetor A é formado pela potência de base 2 elevado
        ao expoente igual à posição do respectivo elemento, ou seja:
        A[i] = 2i
        . Sugestão int A[11]
        */

        double[] vetorA = new double[11];

        for(int i = 0; i < vetorA.length; i++){

            vetorA[i] = Math.pow(2, i);
        }

        System.out.println("Vetor A: ");
        for (double a : vetorA){
            System.out.println(a);
        }
    }
}
