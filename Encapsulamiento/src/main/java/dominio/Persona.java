package dominio;

public class Persona {

    //Atributos con modificador de acceso private
    private String nombre;
    private double sueldo;
    private boolean eliminado;

    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    //Metodos get y set por cada atributo - deben ser publicos
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    //Para los tipo boolean se utiliza is
    public boolean isEliminado() {
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    //Metodo toString para imprimir el estado actual del objeto
    public String toString() {
        return "Persona (nombre: " + this.nombre
                + " , sueldo: " + this.sueldo
                + " , eliminado: " + this.eliminado + ")";
    }
}
