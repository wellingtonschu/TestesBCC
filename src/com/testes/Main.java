package com.testes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;
        int n3 = 1;
        int porUm;
        int porZero;

        porUm = n1 / n3;
        System.out.println("Divisão por 1 " + porUm);
        porZero = n1 / n2;
        System.out.println("Divisão por 0 " + porZero);

    }
    
}
