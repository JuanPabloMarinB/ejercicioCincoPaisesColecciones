package Entidades;

public class Pais {

    private String nombre;

    public Pais() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Pais {" +
                "nombre = '" + nombre + '\'' +
                " }";
    }



}
