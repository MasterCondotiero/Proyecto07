package com.Alvarocampos.Proyecto07;

import java.util.Scanner;

public class Ejercicio04 {
    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        final int SIZE = 5;
        int[] numeros = null;
        String mensaje = "Inrtoduzca un numero positivo";
        try {
            solicitarNumeros(numeros, mensaje);
            if(numeros == null){
                throw new NullPointerException();
            }
            mostrarArray(numeros);
        } catch (NullPointerException npe){
            System.out.println(npe.getMessage());
        }
    }

    public static void solicitarNumeros(int[] numeros, String mensaje){
        System.out.println(mensaje);
        int numero;
        int contador = 0;
        for(int i = 0; i < 6; i++){
            try{
                System.out.printf("indica el numero %d:\n", (contador+1));
                numero = Integer.parseInt(scanner.nextLine());
                numeros[contador] = numero;
                contador++;
            }catch (NumberFormatException nfe){
                System.out.println("Solo numero por favor");
            }catch (IndexOutOfBoundsException iobe){
                System.out.println("El array esta lleno, no acepta mas numeros");
                break;
            }
        }
    }

    public static void mostrarArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.println("Numero "+(i+1)+": "+array[i]);
        }
    }


}
