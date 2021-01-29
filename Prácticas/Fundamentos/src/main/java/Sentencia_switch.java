import java.util.Scanner;
public class Sentencia_switch {
    public static void main(String[] args) {
        var numero = 4;
        var numeroTexto = "Numero Desconocido";
        switch(numero){
            case 1:
                numeroTexto = "Número uno";
                break;
            case 2:
                numeroTexto = "Número dos";
                break;
            case 3:
                numeroTexto = "Número tres";
                break;
            case 4:
                numeroTexto = "Número cuatro";
                break;
            default:
                numeroTexto = "Caso no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
        System.out.println("\n**********************************************\n");
        //Calculo de año
        System.out.println("Ingrese el número del mes: ");
        Scanner lectura = new Scanner(System.in);
        var mes = Integer.parseInt(lectura.nextLine());
        var estacion = "Estación desconocida";
        switch(mes){
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Invierno";
                break;
            default: //Podemos omitir el default
                estacion = "Estacion no encontrada"; 
        }
        System.out.println("estacion = " + estacion);
    }
}
