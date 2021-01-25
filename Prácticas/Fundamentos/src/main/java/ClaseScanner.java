
import java.util.Scanner;

public class ClaseScanner {

    public static void main(String[] args) {
        System.out.println("Escribe tu nombre:");
        Scanner lectura = new Scanner(System.in);
        var usuario = lectura.nextLine();
//        System.out.println("usuario = " + usuario);
        System.out.println("Escribe tu titulo");
        var titulo = lectura.nextLine();
        System.out.println("Datos: " + titulo + " " + usuario);
    }
}
