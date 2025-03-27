package com.Alvarocampos.Proyecto07;

import java.util.Scanner;

public class Ejercicio06 {
    //private Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] numeros1 = {-2,-1,0,1,2};
        final int numInsertado = 2;
        try {
            int[] resultados = dividirEnArray(numeros1, numInsertado);
            muestraResultados(numeros1, numInsertado, resultados);
        } catch (ArithmeticException ae){
            System.out.println("Manin no me dividas entre 0");
        }
    }
    private static int[] dividirEnArray(int[] numeros, int divisor){
        int[] arrayResultados = new int[numeros.length];
        for (int i = 0; i < arrayResultados.length; i++){
            if (numeros[i] == 0){
                arrayResultados[i] = 0;
            } else {
                arrayResultados[i] = divisor/numeros[i];
            }
        }
        return arrayResultados;
    }

    private static void muestraResultados(int[] divisorio, int divisor, int[] resulato){
        for (int i = 0; i < resulato.length; i++){
            System.out.println(divisorio[i] + " dividido  entre " + divisor + " es igual a " + resulato[i]);
        }
    }

}
