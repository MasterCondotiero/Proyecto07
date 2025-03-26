package com.Alvarocampos.Proyecto07.Lib;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class pruebasIO {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Metodo usado para recibir datos de matricula
     * @param mensaje mensaje que se muestra al usuario
     * @param minLength length minima
     * @param maxLength length maxima
     * @return valor que es la matricula
     */
    public static String leerMatricula(String mensaje, int minLength, int maxLength){
        boolean valido = false;
        String valor = null;
        do {
            try {
                System.out.println(mensaje);
                valor = scanner.nextLine();
                valido = valor.length() >= minLength && valor.length() <= maxLength;
                if (!valido){
                    System.out.println("La longuitod debe estar entre %d y %d\n" +minLength +maxLength);
                }
            } catch (NoSuchElementException nsee){
                //sout o serr cual es el correcto?
                System.out.println("El dato introducido no puede ser nulo");
            } catch (IllegalStateException ise){
                System.out.println("Escaner cerrado");
            }
        } while (!valido);
        return valor;
    }

    /**
     * Verifica que la matricula sea correcta
     * @param matricula
     * @return
     */
    public static boolean validarMatricula(String matricula){
        int i;
        if (matricula.length() != 8){
            return false;
        }
        for (i = 0; i < 4; i++){
            if (!Character.isDigit(matricula.charAt(i))){
                return false;
            }
        }
        if (Character.isWhitespace(matricula.charAt(i++))){
            return false;
        }
        for (int j = i; j < matricula.length(); j++){
            if(!Character.isLetter(matricula.charAt(j))){
                return false;
            }
        }
        return true;
    }
}
