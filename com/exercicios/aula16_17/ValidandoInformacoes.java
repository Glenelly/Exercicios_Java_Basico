package com.exercicios.aula16_17;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ValidandoInformacoes {
    public static void main(String[] args) {
        /*
        Faça um programa que leia e valide as seguintes informações:
        a. Nome: maior que 3 caracteres;
        b. Idade: entre 0 e 150;
        c. Salário: maior que zero;
        d. Sexo: 'f' ou 'm';
        e. Estado Civil: 's', 'c', 'v', 'd';
        */

        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        boolean validacao = false;
        do {
            System.out.println("Digite seu nome: ");
            nome = scan.nextLine();

            if(nome.length() >= 3){
                validacao = true;
            } else{
                System.out.println("Nome precisar ter mais de 3 caracteres. Tente novamente: ");
            }

        }while (!validacao);

        validacao = false;
        do {
            System.out.println("Digite sua idade: ");
            idade = scan.nextInt();

            if(idade >= 0 && idade <= 150){
                validacao = true;
            } else{
                System.out.println("Sua idade precisa ser entre 0 a 150. Tente novamente: ");
            }

        }while (!validacao);

        validacao = false;
        do {
            System.out.println("Digite sua salário: ");
            salario = scan.nextDouble();

            if(salario > 0){
                validacao = true;
            } else{
                System.out.println("Seu salário precisa ser maior que 0. Tente novamente: ");
            }

        }while (!validacao);

        validacao = false;
        do {
            System.out.println("Digite seu sexo (F/M): ");
            sexo = scan.next();

            if(sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")){
                validacao = true;
            } else{
                System.out.println("Seu sexo precisa ser F ou M. Tente novamente: ");
            }

        }while (!validacao);

        validacao = false;
        do {
            System.out.println("Digite seu Estado Civil (s, c, v, d): ");
            estadoCivil = scan.next();

            if(estadoCivil.equalsIgnoreCase("s") || sexo.equalsIgnoreCase("c")
                    || sexo.equalsIgnoreCase("v") || sexo.equalsIgnoreCase("d")){
                validacao = true;
            } else{
                System.out.println("Seu estado civil precisa ser (s, c, v, d). Tente novamente: ");
            }

        }while (!validacao);

        System.out.println("Nome: " + nome );
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);


    }
}
