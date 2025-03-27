package com.Alvarocampos.Proyecto07;

import com.Alvarocampos.Proyecto07.exceptions.ArithmeticZeroException;
import com.Alvarocampos.Proyecto07.exceptions.IndexOutOfBoundsArrayException;
import com.Alvarocampos.Proyecto07.exceptions.NullPointerArrayException;

public class Ejercicio09 {
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
            muestraResultados(numeros1, numInsertado, resultados3);

        } catch (ArithmeticZeroException aze){
            System.out.println(aze.getMessage());
        } catch (NullPointerArrayException npae){
            System.out.println(npae.getMessage());
        } catch (IndexOutOfBoundsArrayException ioobae){
            System.out.println(ioobae.getMessage());
        }
    }
    private static int[] dividirEnArray(int[] numeros, int divisor){
        int[] arrayResultados = new int[numeros.length];
        for (int i = 0; i < arrayResultados.length; i++){
            if (numeros[i] == 0){
                throw new ArithmeticZeroException("No se puede dividir entre cero");
            } else if (numeros == null){
                throw new NullPointerArrayException("El array no está inicializado");
            } else if (i >= arrayResultados.length) {
                throw new IndexOutOfBoundsArrayException("Manin que no te salgas de array");
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
