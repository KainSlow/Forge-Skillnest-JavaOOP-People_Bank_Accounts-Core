package clases;

public class Persona{
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void despliegaInformacion(){
        System.out.println("Datos Personales:");
        System.out.println("\tNombre: " + nombre);
        System.out.println("\tEdad: " + String.valueOf(edad));
    }

    public String getNombre() {return nombre;}
    public void setNombre(String n) {nombre = n;}

    public int getEdad(){return edad;}
    public void setEdad(int e){edad = e;}
}