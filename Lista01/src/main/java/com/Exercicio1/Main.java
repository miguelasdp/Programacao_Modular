package com.Exercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] vetA = new int[15];
        int[] vetB = new int[15];

        lerVetor(vetA);
        vetorB(vetA, vetB);

    }

    public static void lerVetor(int[] vet) {
        Scanner ler = new Scanner(System.in);  // Create scanner once
        for (int i = 0; i < vet.length; i++) {
            System.out.println("Digite o " + (i + 1) + " numero: ");
            vet[i] = ler.nextInt();
        }
        for (int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }
    }

    public static void vetorB(int[] vet, int[] vetB) {
        for (int i = 0; i < vet.length; i++) {
           vetB[i] =  fatorial(vet[i]);
        }
        for (int i = 0; i < vetB.length; i++) {
            System.out.println(vetB[i]);
        }
    }

    public static int fatorial(int num) {
        int fat = 1;
        for (int i = 1; i <= num; i++) {
            fat *= i;
        }
        return fat;
    }
}
