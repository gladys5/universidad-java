package objetoThis;

public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("juan","perez");
        //al colocar solo los string el almacenamiento de estos estara en el pull string que administra de java
        //
        System.out.println("persona = " + persona);
        System.out.println("persona.nombre = " + persona.nombre);
    }

    }
class Persona{
    String nombre;
    String apellido;
    Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;

    }
}
