package test;

public class TestArreglos {

    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades);

        edades[0] = 20;
        edades[1] = 30;
        edades[2] = 40;
        System.out.println("edades[0] = " + edades[0]);
        System.out.println("edades[1] = " + edades[1]);
        System.out.println("edades[2] = " + edades[2]);

        for (int i = 0; i < edades.length; i++) {
            System.out.println("Edades elemento " + i + ": " + edades[i]);
        }

        //Sintaxis resumida
        String frutas[] = {"Sandía", "Mango", "Fresa"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("frutas " + i + " = " + frutas[i]);
        }
    }
}
