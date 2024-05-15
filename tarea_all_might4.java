package com.mycompany.tarea_all_might;

 import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class tarea_all_might4 {
   

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Ingrese la cantidad de números a verificar: ");
        int n = Integer.parseInt(reader.readLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            String input = reader.readLine();
            int numero = Integer.parseInt(input);
            if (numero >= 0) {
                System.out.println("El número " + numero + " es positivo.");
            } else {
                System.out.println("El número " + numero + " es negativo.");
            }
            if (input.length() == 1) {
                System.out.println("El número " + numero + " tiene un dígito.");
            } else if (input.length() > 2) {
                System.out.println("El número " + numero + " tiene más de dos dígitos.");
            } else {
                System.out.println("El número " + numero + " tiene dos dígitos.");
            }
        }
    }
}

