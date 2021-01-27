
public class OperadorTernario {
    
    public static void main(String[] args) {
        var resultado = (1 > 2) ? "Verdadero" : "falso";
        System.out.println("resultado = " + resultado);
        
        var resultado2 = (1 > 2) ? true : false;
        System.out.println("resultado2 = " + resultado2);
        
        var numero = 8;
        resultado = (numero % 2 == 0) ? "Es par" : "Es impar";
        System.out.println("resultado = " + resultado);
        
        var combinacion = (9 >= 10) ? "Verdadero" : false;
        System.out.println("combinacion = " + combinacion);
    }
}
