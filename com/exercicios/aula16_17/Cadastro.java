package com.exercicios.aula16_17;

import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        /* Faça um programa que leia um nome de utilizador e a sua senha e não aceite a senha igual ao nome do utilizador,
         mostrando uma mensagem de erro e voltando a pedir as informações.*/

        Scanner scan = new Scanner(System.in);

        boolean validarCadastro;
        String nome;
        String senha;

        do {
            System.out.println("Digite seu nome de usuário: ");
            nome = scan.nextLine();

            System.out.println("Digite sua senha: ");
            senha = scan.nextLine();

            if (nome.equalsIgnoreCase(senha)){
                validarCadastro = false;
                System.out.println("A senha não pode ser igual ao nome de usuário. Tente novamente: ");
            }else {
                validarCadastro = true;
                System.out.println("Seu cadastro foi concluido com sucesso!!");
            }
        }while (!validarCadastro);
    }
}
