package operaciones;

public class Aritmetica {

    //Atributos de la clase
    int a;
    int b;

    //Constructor vacio
    //Tiene el mismo nombre que la clase
    //No retorna ningún valor
    public Aritmetica() {
        System.out.println("Ejecutando constructor");
    }

    //Sobre-carga de construtores
    public Aritmetica(int arg1, int arg2) {
        this.a = arg1;
        this.b = arg2;
        System.out.println("Ejecutando construtor con argumentos");
    }

    //Metodo
    //Los metodos inician con minuscula
    public void sumar() {
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
    }

    public int sumarConRetorno() {
        int resultado = this.a + this.b;
        return resultado;
    }

    public int sumarConArgumentos(int arg1, int arg2) {
        this.a = arg1; //Apunta al objeto que se está ejecutando
        this.b = arg2;
        /*
            Sabemos que hace referencia a un atributo de la clase 
            y no a una variabel local.
            Hace el código más legible
            Si los argumentos que recibimos tienen el mismo nombre que los atributos
            de la clase, podemos diferenciarlos más facilmente
            Dentro de un método estatico (static) no se peude usar this.
         */
//        return a + b;
        return this.sumarConRetorno();
    }
}
