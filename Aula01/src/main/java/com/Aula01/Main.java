package com.Aula01;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int linhas, colunas;
        System.out.println("Digite o número de Linhas: ");
        linhas = s.nextInt();

        System.out.println("Digite o número de Colunas: ");
        colunas = s.nextInt();

        System.out.println("Digite os números da matriz: ");
        Matriz matriz = new Matriz();

        matriz.inicializarMatriz(linhas, colunas);

        matriz.lerDadosMatriz();

        System.out.println("Matriz: ");
        matriz.imprimeMatriz();

        matriz.multiplicaCopiaMatrizPorConstante(3);

        System.out.println("Matriz multiplicada por constante: ");
        matriz.imprimeMultiplicaCopiaMatrizPorConstante();
    }
}