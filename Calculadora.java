/*
 * Program.java		1.0 25/10/2025
 * 
 * Menú de 5 opciones, que nos permite las 4 operaciones básicas con dos números y salir del programa.
 * 
 * MIT License
 * Copyright (c) 2025 Marc Lino Aguilar
 */

import java.util.Scanner;
public class Calculadora {

    // OPERACIONES
    public double suma(double a, double b) {
        return a + b;
    }

    public double resta(double a, double b) {
        return a - b;
    }

    public double multiplicacion(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        return a / b;
    }

    // PROGRAMA
    public static void main(String[] args) {
        int opcion = 0; // opcion del menú
        double a, b; // números para las operaciones
        Calculadora p = new Calculadora();
        Scanner s = new Scanner(System.in);

        // Bucle principal: se repite hasta que se elige la opción 5 (salir del programa).
        while (opcion != 5) {
            System.out.print("\n\nMenú\n\n");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplica");
            System.out.println("4. Divide");
            System.out.println("5. Salir del programa");
            System.out.print("\nOpción? ");
            opcion = s.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("\nSuma");
                    System.out.print("Introduce un número: ");
                    a = s.nextDouble();
                    System.out.print("Ahora otro: ");
                    b = s.nextDouble();
                    System.out.println("-----------------------------");
                    System.out.printf("Resultado: %.2f + %.2f = %.2f\n", a, b, p.suma(a, b));
                    System.out.println("-----------------------------");
                    break;
                case 2:
                    System.out.println("\nResta");
                    System.out.print("Introduce un número: ");
                    a = s.nextDouble();
                    System.out.print("Ahora otro: ");
                    b = s.nextDouble();
                    System.out.println("-----------------------------");
                    System.out.printf("Resultado: %.2f - %.2f = %.2f\n", a, b, p.resta(a, b));
                    System.out.println("-----------------------------");
                    break;
                case 3:
                    System.out.println("\nMultiplicación");
                    System.out.print("Introduce un número: ");
                    a = s.nextDouble();
                    System.out.print("Ahora otro: ");
                    b = s.nextDouble();
                    System.out.println("-----------------------------");
                    System.out.printf("Resultado: %.2f * %.2f = %.2f\n", a, b, p.multiplicacion(a, b));
                    System.out.println("-----------------------------");
                    break;
                case 4:
                    System.out.println("\nDivisión");
                    System.out.print("Introduce un número: ");
                    a = s.nextDouble();
                    System.out.print("Ahora otro: ");
                    b = s.nextDouble();
                    if (b == 0) {
                        System.out.println("Error: no se puede dividir entre 0.");
                    } else {
                        System.out.println("-----------------------------");
                        System.out.printf("Resultado: %.2f / %.2f = %.2f\n", a, b, p.division(a, b));
                        System.out.println("-----------------------------");
                    }
                    break;
                case 5:
                    System.out.println("-----------------------------");
                    System.out.println("Saliendo del programa...");
                    System.out.println("-----------------------------");
                    break;
                default:
                    System.out.println("-----------------------------");
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    System.out.println("-----------------------------");
                    break;
            }
            System.out.print("\nPulsa Enter para continuar...");
            s.nextLine(); // para limpiar el buffer
            s.nextLine(); // espera la pulsación
        }
    }
}
