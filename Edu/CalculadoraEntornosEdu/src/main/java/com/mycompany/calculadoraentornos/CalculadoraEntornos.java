/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadoraentornos;

/**
 *
 * @author Eduar
 */
import java.util.Scanner;

public class CalculadoraEntornos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int operacion = 1;
        int a, b;
        do {
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.print("Que operacion quieres realizar (0 para salir): ");
            operacion = scanner.nextInt();
            switch (operacion) {
                case 1:
                    System.out.print("Introduce primer numero: ");
                    a = scanner.nextInt();
                    System.out.print("Introduce segundo numero: ");
                    b = scanner.nextInt();
                    System.out.println(suma(a, b));
                    break;
                case 2:
                    System.out.print("Introduce primer numero: ");
                    a = scanner.nextInt();
                    System.out.print("Introduce segundo numero: ");
                    b = scanner.nextInt();
                    System.out.println(resta(a, b));
                    break;
                case 3:
                    System.out.print("Introduce primer numero: ");
                    a = scanner.nextInt();
                    System.out.print("Introduce segundo numero: ");
                    b = scanner.nextInt();
                    System.out.println(multiplicacion(a, b));
                    break;
                case 4:
                    System.out.print("Introduce primer numero: ");
                    a = scanner.nextInt();
                    System.out.print("Introduce segundo numero: ");
                    b = scanner.nextInt();
                    System.out.println(division(a, b));
                    break;
            }
        } while (operacion != 0);
    }

    public static double suma(double a, double b) {
        return a+b;
    }

    public static double resta(double a, double b) {
        return a-b;
    }

    public static double multiplicacion(double a, double b) {
        return a*b;
    }

    public static double division(double a, double b) {
        return a/b;
    }
}
