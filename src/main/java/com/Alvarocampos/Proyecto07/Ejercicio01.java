package com.Alvarocampos.Proyecto07;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String mensaje = "Inrtoduzca un numero positivo";
        double[] array = solicitarNumeros(mensaje);
    }
    public static double[] solicitarNumeros(String mensaje){
        ArrayList<Double> numeros = new ArrayList<>();
        System.out.println(mensaje);
        double numero;
        int contador = 1;
        do{
            try{
                System.out.printf("indica el numero %d:\n", contador);
                numero = Double.parseDouble(scanner.nextLine());
                numeros.add(numero);
                contador++;
            }catch (NumberFormatException nfe){
                numero = 1;
                System.out.println("Solo numero por favor");
            }

        }while(numero >= 0);

        double[] valores = new double[numeros.size()];
        for(int i = 0; i < numeros.size(); i++){
            valores[i] = numeros.get(i);
        }
        return valores;
    }
}
