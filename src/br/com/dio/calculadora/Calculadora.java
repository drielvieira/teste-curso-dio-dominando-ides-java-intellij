package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.println("Digite o primeiro valor: ");
        a = scan.nextInt();
        System.out.println("Digite o segundo valor: ");
        b = scan.nextInt();

        int somar = somar(a, b);
        int sub = sub(a, b);
        int mutiplica = multiplica(a, b);
        int divid = divid(a, b);


        System.out.println("somar: " + somar);
        System.out.println("sub: " + sub);
        System.out.println("multiplica: " + mutiplica);
        System.out.println("divisao: " + divid);

    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int multiplica(int a, int b) {
        return a * b;
    }

    public static int divid(int a, int b) {
        return a / b;
    }
}
