package com.Aula00;

import java.util.Scanner;

public class Main {
    public static int leNumeroInt() {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o numero desejado");
        return s.nextInt();
    }

    public static void main(String[] args) {

        int[][] matriz = new int[2][2];

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++) {
                matriz[i][j] = leNumeroInt();
            }
        }

        for(int i=0; i<2; i++){
            System.out.println("\n");
            for(int j=0; j<2; j++) {
                System.out.print(matriz[i][j]);
                System.out.print("\t");
            }
        }
    }
}