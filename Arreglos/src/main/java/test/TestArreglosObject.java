package test;

import domain.Persona;

public class TestArreglosObject {

    public static void main(String[] args) {
        Persona personas[] = new Persona[2];

        personas[0] = new Persona("Fernando");
        personas[1] = new Persona("Eduardo");

        System.out.println("persoans 0 = " + personas[0]);
        System.out.println("persoans 1 = " + personas[1]);

        for (int i = 0; i < personas.length; i++) {
            System.out.println("personas " + i + " = " + personas[i]);
        }
    }
}
