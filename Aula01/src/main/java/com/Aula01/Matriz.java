package com.Aula01;

import java.util.Scanner;


public class Matriz {

    int linhas;
    int colunas;
    int[][] matriz;
    int[][] copiaMatriz;

    public void inicializarMatriz(int linhas, int colunas){
        this.linhas = linhas;
        this.colunas = colunas;
        matriz = new int[linhas][colunas];
    }

    public void multiplicaCopiaMatrizPorConstante(int c){
         copiaMatriz = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                copiaMatriz[i][j] = matriz[i][j] * c;
            }
        }
    }

    public void imprimeMultiplicaCopiaMatrizPorConstante(){
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(copiaMatriz[i][j] + " ");
            }
            System.out.println("\n");
        }
    }

    public void lerDadosMatriz(){
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = s.nextInt();
            }
        }
    }

    public void imprimeMatriz(){
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}