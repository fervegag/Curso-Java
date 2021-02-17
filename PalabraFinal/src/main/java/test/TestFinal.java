package test;

import domain.Persona;

public class TestFinal {

    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        //Ya no podemos modificar su valor
//        miVariable = 5;
//        Persona.MI_CONSTANTE = 2; no podemos modificarla
        System.out.println("Constante: " + Persona.MI_CONSTANTE);

        //Palabra final en objetos:
        final Persona persona1 = new Persona();
        //persona1 = new Persona(); no podemos asignar una nuevo objeto a la variable
        //Si podemos modificar sus atributos
        persona1.setNombre("Fernando");
        System.out.println("persona1 nombre = " + persona1.getNombre());
        persona1.setNombre("Eduardo");
        System.out.println("persona1 nombre= " + persona1.getNombre());

    }
}
