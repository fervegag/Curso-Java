
import java.util.Scanner;

public class ConversionTiposPrimitivos {

    public static void main(String[] args) {
        //String to int
        var edad = "20";
        var edadInt = Integer.parseInt(edad);
        System.out.println("edadInt = " + edadInt);

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPI);

        //Pedir un valor
        var lectura = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        edadInt = Integer.parseInt(lectura.nextLine());

        //Int to String
        int edadInt1 = 40;
        var edadTexto = String.valueOf(edadInt1);
        System.out.println("edadTexto = " + edadTexto);

        var caracter = "Hola".charAt(3);
        System.out.println("caracter = " + caracter);

        //Regogiendo solo un caracter
        System.out.println("Proporciona un caracter");
        caracter = lectura.nextLine().charAt(0);
        System.out.println("caracter = " + caracter);
    }
}
