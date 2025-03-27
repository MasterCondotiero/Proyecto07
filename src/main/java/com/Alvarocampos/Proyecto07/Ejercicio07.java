package com.Alvarocampos.Proyecto07;

public class Ejercicio07 {
    public static void main(String[] args) {
        String[] nombres1 = {"Paco", "Carlos", "Toni", "Ernesto"};
        String[] nombres2 = {"Paco", "Carlos", "Toni", null};

        try {
            muestraPrimeraLetraArrayString(nombres1);
            //muestraPrimeraLetraArrayString(nombres2);
        } catch (NullPointerException npe){
            System.out.println("No puede haber unn null en el array");
        }
    }
    private static void muestraPrimeraLetraArrayString(String[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println((i+1 + ". " + array[i].charAt(0)));
        }
    }
}
