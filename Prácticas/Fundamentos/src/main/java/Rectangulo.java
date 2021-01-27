import java.util.Scanner;
public class Rectangulo {
    public static void main (String[] args){
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese la base del rectángulo");
        var base = Float.parseFloat(lectura.nextLine());
        System.out.println("Ingrese la altura del rectángulo");
        var altura = Float.parseFloat(lectura.nextLine());
        var perimetro = (2*base)+(2*altura);
        System.out.println("perimetro = " + perimetro);
        var area = base * altura;
        System.out.println("area = " + area);
    }
}
