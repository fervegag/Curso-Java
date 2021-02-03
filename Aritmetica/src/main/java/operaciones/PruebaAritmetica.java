package operaciones;

public class PruebaAritmetica {

    public static void main(String[] args) {
        Aritmetica aritmetica1 = new Aritmetica();
        aritmetica1.a = 3;
        aritmetica1.b = 2;
        aritmetica1.sumar();

        int resultado = aritmetica1.sumarConRetorno();
        System.out.println("resultado con retorno= " + resultado);

        int result = aritmetica1.sumarConArgumentos(9, 8);
        System.out.println("resultado con paso de parametros = " + result);

        //Haciendo uso de los construtores
        System.out.println("aritmetica1 a:" + aritmetica1.a);
        System.out.println("aritmetica1 b:" + aritmetica1.b);

        //Constructor con argumentos
        Aritmetica aritmetica2 = new Aritmetica(5, 8);
        System.out.println("aritmetica1 a:" + aritmetica2.a);
        System.out.println("aritmetica1 b:" + aritmetica2.b);

        /*Alcance de variables*/
        //Variables locales
        //Solo pueden ser utilizadas en el método dónde se definió
        int varA = 10;
        int varB = 2;

    }
    public void miMetodo(){
//        varA = 10; --->No se puede utilizar ya que no esta al alcance de de este metodo
        //Un metodo estatico solo puede mandar a llamar a otros metodos estaticos
        //Para que miMetodo() pueda ser llamado desde el método main(), debe tener el modificador static
    }
}
