package com.Alvarocampos.Proyecto07.Lib;
import java.util.ArrayList;
import java.util.Scanner;

public class IO {
    private static final Scanner scanner = new Scanner(System.in);
    public static double[] solicitarArrayDouble(String mensaje){
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
    public static int[] solicitarArrayInteger(String mensaje){
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println(mensaje);
        boolean validoSalida = false;
        int numero;
        int contador = 1;
        do{
            try{
                System.out.printf("indica el numero %d:\n", contador);
                numero = Integer.parseInt(scanner.nextLine());
                numeros.add(numero);
                contador++;
            } catch (NumberFormatException nfe){
                validoSalida = true;
                System.out.println("Saliendo del programa, se introdujo una letra");
            }
        }while(!validoSalida);

        int[] valores = new int[numeros.size()];
        for(int i = 0; i < numeros.size(); i++){
            valores[i] = numeros.get(i);
        }
        return valores;
    }
    public static void leerInt(int num){
        try {
            int numeroInt = Integer.parseInt(scanner.nextLine());
            if (validacionInteger(String.valueOf(numeroInt))) {
                if (numeroInt == Integer.MAX_VALUE || numeroInt == Integer.MIN_VALUE){
                    throw new ArithmeticException("Numero positivo o negativo demasiado grande, no podrá ser mostrado correctamente");
                }
            }
        } catch (ArithmeticException ae) {
            System.out.println(ae.getMessage());
        }
    }
    public static void leerDouble(double num){
        try {
            num = Double.parseDouble(scanner.nextLine());
            if (validacionDouble(String.valueOf(num))) {
                /*if (Double.isInfinite(num)){
                    throw new ArithmeticException("Numero demasiado grande, no podrá ser mostrado correctamente");
                }*/                     //Por ahora comentado, no se cual es una mejor opcion, supongo que catch
            }
        } catch (ArithmeticException ae){
            System.out.println(ae.getMessage());
        } catch (NumberFormatException nfe) {
            System.out.println("Solo numeros por favor");
        }
    }
    private static boolean validacionString(String texto){
        return !texto.isBlank();
    }
    private static boolean validacionInteger(String num){
        try {
            int numero = Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e){
            return false;
        }
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
