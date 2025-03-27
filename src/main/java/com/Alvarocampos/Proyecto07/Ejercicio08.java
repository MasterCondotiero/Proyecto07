package com.Alvarocampos.Proyecto07;

public class Ejercicio08 {
    public static void main(String[] args) {
        int[] numeros1 = {-2,-1,0,1,2};
        int[] numeros2 = null;
        int[] numeros3 = {-2,-1};
        final int numInsertado = 2;
        try {
            int[] resultados1 = dividirEnArray(numeros1, numInsertado);
            muestraResultados(numeros1, numInsertado, resultados1);

            int[] resultados2 = dividirEnArray(numeros2, numInsertado);
            muestraResultados(numeros1, numInsertado, resultados2);

            int[] resultados3 = dividirEnArray(numeros3, numInsertado);
            muestraResultadosMal(numeros1, numInsertado, resultados3);
        } catch (ArithmeticException ae){
            System.out.println("Manin no me dividas entre 0");
        } catch (NullPointerException npe){
            System.out.println("El array no esta inicializado");
        } catch (IndexOutOfBoundsException ioobe){
            System.out.println("No te puedes salir del array");
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

    private static void muestraResultadosMal(int[] divisorio, int divisor, int[] resulato){
        for (int i = 0; i < resulato.length; i++){
            System.out.println(divisorio[i] + " dividido  entre " + divisor + " es igual a " + resulato[i+1]);
        }
    }
}
