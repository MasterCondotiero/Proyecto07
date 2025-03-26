package com.Alvarocampos.Proyecto07;

import java.util.Scanner;

public class Ejercicio02 {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String mensaje ="Introduce un conjunto de numeros hasta ingresar un numero negativo: ";
        solicitarNum(mensaje);
    }
    private static void solicitarNum(String mensaje){
        double[] numeros = new double[10];
        int size = numeros.length;
        double numero = 0;
        int contadorExcep = 0;
        int contador = 0;
        System.out.println(mensaje);
        do {
            try {
                System.out.printf("Indica el numero %d: \n", contador+1);
                numero = Double.parseDouble(scanner.nextLine());
                if (validacionDouble(String.valueOf(numero))) {
                    if (Double.isInfinite(numero)){
                        ++contadorExcep;
                        throw new ArithmeticException("Numero demasiado grande, no podrá ser mostrado correctamente");
                    }
                    numeros[contador] = numero;
                    contador++;
                }
            } catch (ArithmeticException ae){
                System.out.println(ae.getMessage());
            } catch (NumberFormatException nfe) {
                ++contadorExcep;
                System.out.println("Solo numeros por favor");
            }
        } while (contador < size);

        numero = 0;
        for (int i = 0; i < size; i++) {
            if (numero < numeros[i]) {
                numero = numeros[i];
            }
        }
        System.out.println(numero + " es el valor mas grande y " + contadorExcep + " son las excepciones ocurridas.");
    }
    private static boolean validacionDouble(String num){
        try {
            double numero = Double.parseDouble(num);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
    }
}
