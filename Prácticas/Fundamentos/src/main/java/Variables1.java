
public class Variables1 {
    public static void main(String[] args) {
        int variableEntera = 10;
        System.out.println("variableEntera = " + variableEntera);
        variableEntera = 5;
        System.out.println("variableEntera = " + variableEntera);
        
        String variableCadena = "Curso Java";
        System.out.println("variableCadena = " + variableCadena);
        
        //Utilizando var - Inferencia de tipos en Java
        var varEntera = 10;
        var varCadena = "Java";
        System.out.println(varEntera);
        System.out.println(varCadena);
        
        //Reglas para definir una variable en Java
        //Utilizar la notación camello
        //Ejemplos
        var miVariable = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        
    }
}
