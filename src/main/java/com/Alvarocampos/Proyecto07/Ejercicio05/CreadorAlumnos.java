package com.Alvarocampos.Proyecto07.Ejercicio05;

import java.util.Scanner;

public class CreadorAlumnos {
    //private Scanner scanner = new Scanner(System.in);

    public static void nuevoAlumno(){
        try {
            Alumno alumno1 = new Alumno("Manolo",20,1.8);
            Alumno alumno2 = new Alumno("",0,3);
            Alumno alumno3 = new Alumno("123",99,3);
        } catch (NumberFormatException nfe){
            System.out.println(nfe.getMessage());
        }
    }
}
