package domain;

public class Empleado extends Persona {

    //Nos marca error ya que no podemos sobre escribir un metodo marcado como final
    @Override
    public void imprimir() {
        System.out.println("Método imprimir desde la clase hija");
    }
}
