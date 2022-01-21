package com.company;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Entra el número");
        int a = input.nextInt();
        int[] divis = new int[500];

        for (int i = 1; i < a - 1; i++) {
            int dePas = a - i;
            if (divisible(a,dePas)){
                System.out.println(dePas + " és divisible.");/* Imprimeix per visualitzar el problema */
                divis[i -1] = dePas;
            }

        }

        /* Imprimeix per visualitzar el problema */
        for (int i = 0; i < divis.length -1; i++) {
            if (divis[i] != 0){System.out.println(divis[i]);}
        }

        if (perf(divis, a)){
            System.out.println("Es perfecte");
        } else {
            System.out.println("No es perfecte");
        }

    }

    /**
     * This method gives you the remainder of a division operation.
     * @param a base number that is divided TO in order to get true if divisible or false if not.
     * @param b divided number that gets divided to, it decreases till zero.
     * @return retorna true si el mòdul de l'operació és zero.
     */
    private static boolean divisible(int a, int b) {
        return a % b == 0;
    }

    /**
     * Fa el sumatori dels nombres divisibles guardats a l'array i si és igual al nombre inicial retorna true.
     * @param divis array
     * @param a nombre inicial
     * @return retorna true si els números son perfectes.
     */
    private static boolean perf(int divis[], int a){
        int sumatori = 0;
        for (int i = 0; i < divis.length; i++) {
            sumatori = divis[i] + sumatori;
        }
        System.out.println(sumatori);
        return sumatori == a;
    }
}
