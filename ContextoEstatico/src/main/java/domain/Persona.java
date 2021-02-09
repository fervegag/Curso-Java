package domain;

public class Persona {

    private int idPersona;
    private String nombre;
    //La valiabre de asocia con la clase y no con los objetos
    private static int contadorPersonas;

    public Persona(String nombre) {
        this.nombre = nombre;
        //Incrementar el contador por cada objeto nuevo
        //Se recomeinda no utilizar this en atributos estaticos
        //Usar el nombre de la clase
        Persona.contadorPersonas++;
        //Asignar el nuevo valor a la variable idPersona
        this.idPersona = Persona.contadorPersonas;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int aContadorPersonas) {
        contadorPersonas = aContadorPersonas;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
    }

}
