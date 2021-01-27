
public class OperadoresIgualdadRelacionales {

    public static void main(String[] args) {
        var a = 3;
        var b = 2;

        var c = (a == b);
        System.out.println("c = " + c);

        var d = a != b;
        System.out.println("d = " + d);

        //Igualdad en tipo String
        var cadena1 = "Hola";
        var cadena2 = "Adios";
        var e = cadena1 == cadena2; //Compara referencias de objetos
        System.out.println("e = " + e);
        var f = cadena1.equals(cadena2); //Comparamos contenido de cadenas
        System.out.println("f = " + f);
        var f2 = !cadena1.equals(cadena2);
        System.out.println("f2 = " + f2);

        //Operadores relacionales
        var g = a > b;
        System.out.println("g = " + g);
        
        var edad = 20;
        var adulto = 18;
        if(edad >= adulto){
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
        /*Otros operadores relacionales
         > , < , >= , <=       
        */
    }
}
