import java.util.Scanner;
public class Sentencia_if_else {
    public static void main(String[] args) {
        var condicion = false;
        
        if(condicion){
            System.out.println("Condición verdadera");
        }else{
            System.out.println("Condición falsa");
        }
        
        var numero = 5;
        var numeroTexto = "Numero desconocido";
        
        if(numero == 1){
            numeroTexto ="Número uno";
        }else if(numero == 2){
            numeroTexto ="Número dos";
        }else if(numero == 3){
            numeroTexto ="Número tres";
        }else if (numero == 4){
            numeroTexto ="Número cuatro";
        }else{
            numeroTexto ="Número no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);
        System.out.println("\n**********************************************\n");
        //Calculo de año
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el mes número del mes: ");
        var mes = Integer.parseInt(lectura.nextLine());
        var estacion = "Estación desconocida";
        
        if(mes == 1 || mes == 2 || mes == 12){
            estacion = "Invierno";
        }else if (mes == 3 || mes == 4 || mes == 5){
            estacion = "Primavera";
        }else if (mes == 6 || mes == 7 || mes == 8){
            estacion = "Verano";
        }else if (mes == 9 || mes == 10 || mes == 11){
            estacion = "Otoño";
        }
        System.out.println("estacion = " + estacion);
    }
}
