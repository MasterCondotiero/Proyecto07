package com.Alvarocampos.Proyecto07.Ejercicio05;

public class Alumno {
    private String nombre;
    private int edad;
    private double altura;

    public Alumno(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    private boolean validacionAltura(double altura){
        if( altura > 2.3d){
            System.out.println("La altura es demasiado grande, introduzca un valor creible.");
            return false;
        }
        return true;
    }
}
