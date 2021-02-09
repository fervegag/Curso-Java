package test;

import dominio.Persona;

public class PersonaPrueba {

    public static void main(String[] args) {
        Persona persona1 = new Persona("Fernando", 5000.00, false);
        //Obteniendo el valor del atributo
        System.out.println("Persona: " + persona1.getNombre());
        //Cambiando el valor del atributo
        persona1.setNombre("Eduardo");
        System.out.println("Persona: " + persona1.getNombre());
        System.out.println("Sueldo: " + persona1.getSueldo());
        System.out.println("¿Eliminado?: " + persona1.isEliminado());
        System.out.println("persona1: " + persona1.toString());
        //Si esta definido el metodo toString no es necesario llamarlo implicitamente
        System.out.println("persona1: " + persona1);
    }
}
