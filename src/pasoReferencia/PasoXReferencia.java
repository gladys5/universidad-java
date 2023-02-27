package pasoReferencia;

import clases.Persona;

public class PasoXReferencia {
    public static void main(String[] args) {
        Persona persona3 = new Persona();
        persona3.name="Roberto";
        persona3.lastName ="Lopez";
        System.out.println("persona3.name = " + persona3.name);
        cambiarValor(persona3);
        System.out.println("persona3 cambio a  = " + persona3.name);
    }

    public static void cambiarValor(Persona persona) {
   persona.name = "Gabriel";
    }

}
