package test;

import domain.Persona;

public class TestMatrices {

    public static void main(String[] args) {
        //edades[Renglones][Columnas]
        int edades[][] = new int[3][2];

        edades[0][0] = 6;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 9;
        edades[2][0] = 10;
        edades[2][1] = 11;

        System.out.println("edades[0][0] = " + edades[0][0]);
        System.out.println("edades[0][1] = " + edades[0][1]);
        System.out.println("edades[1][0] = " + edades[1][0]);
        System.out.println("edades[1][1] = " + edades[1][1]);
        System.out.println("edades[2][0] = " + edades[2][0]);
        System.out.println("edades[2][1] = " + edades[2][1]);

        System.out.println("\n***Imprimiendo con for anidados***\n");

        for (int ren = 0; ren < edades.length; ren++) {
            for (int col = 0; col < edades[ren].length; col++) {
                System.out.println("edades[R" + ren + "][C" + col + "] = " + edades[ren][col]);
            }
        }

        System.out.println("\n***Sintaxis Simplificada***\n");
        //Sintaxis simplificada
        String frutas[][] = {{"Naranja", "Limón"}, {"Fresa", "Zarzamora"}, {"Mango", "Platano", "Piña"}};
        //No es necesario que sea completamente cuadrada
        imprimir(frutas, "frutas");

        System.out.println("\n***Matrices de tipo Object***\n");
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona("Eduardo");
        personas[0][1] = new Persona("Karen");
        personas[0][2] = new Persona("Liz");
        personas[1][0] = new Persona("Oreth");
        personas[1][1] = new Persona("Edgar");
        personas[1][2] = new Persona("Antonio");
        imprimir(personas, "personas");
    }

    public static void imprimir(Object matriz[][], String nombre) {
        for (int ren = 0; ren < matriz.length; ren++) {
            for (int col = 0; col < matriz[ren].length; col++) {
                System.out.println(nombre + "[R" + ren + "][C" + col + "] = " + matriz[ren][col]);
            }
        }
    }
}
