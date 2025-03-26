package com.Alvarocampos.Proyecto07;

import java.util.ArrayList;
import java.util.Scanner;
public class Ejercicio03 {
    private static String mensaje = "Introduzca los valores numericos que quiera. " +
            "\nEl programa se detendra unna vez introduzca una letra.";

    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String mensaje = "Inrtoduzca un numero:";
        double[] array = solicitarNumeros(mensaje);
    }

    public static double[] solicitarNumeros(String mensaje){
        ArrayList<Double> numeros = new ArrayList<>();
        System.out.println(mensaje);
        boolean validoSalida = false;
        double numero;
        int contador = 1;
        do{
            try{
                System.out.printf("indica el numero %d:\n", contador);
                numero = Double.parseDouble(scanner.nextLine());
                numeros.add(numero);
                contador++;
            } catch (NumberFormatException nfe){
                validoSalida = true;
                System.out.println("Saliendo del programa, se introdujo una letra");
            }
        }while(!validoSalida);

        double[] valores = new double[numeros.size()];
        for(int i = 0; i < numeros.size(); i++){
            valores[i] = numeros.get(i);
        }
        return valores;
    }
}
