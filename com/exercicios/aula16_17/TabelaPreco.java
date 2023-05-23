package com.exercicios.aula16_17;

public class TabelaPreco {
    public static void main(String[] args) {
        /*
        Monte uma tabela de preços, que conterá os preços de 1 até 50 produtos,
        conforme o exemplo abaixo:
        Lojas Quase Dois - Tabela de preços:
        1 - R$ 1.99
        2 - R$ 3.98
        ...
        50 - R$ 99.50

        Algoritmo:

        -Exibir o nome da loja
        -Fazer o loop da tabela(Laço for)
        -Fazer o cálculo dos preços
        */

        //Exibindo o nome da loja
        System.out.println("Lojas Quase Dois - Tabela de preços:");

        //acrescentar enquanto o i for igual a 50
        for (int i = 1; i <= 50; i++){

            //Calculando e exibindo resultado
            System.out.println(i + " - R$ " + (1.99 * i));
        }
    }
}
