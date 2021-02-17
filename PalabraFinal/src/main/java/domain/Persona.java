package domain;

public /*final*/ class Persona { //Evita que se creen clases hijas
    //Creando una constante
    //Se recomienda escribirla en mayuscula y separar por _

    public final static int MI_CONSTANTE = 1;

    private String nombre;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public /*final*/ void imprimir() {
        System.out.println("Método imprimir");
    }
}
