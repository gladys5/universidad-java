package ProyectoCaja;

public class Caja {

    int ancho;
    int alto;
    int profundo;


    public int calcularVolumen(){

        return alto * ancho * profundo;

    }

    public int constructorLleno( int ancho, int alto, int profundo){
     this.alto =alto;
     this.ancho =ancho;
     this.profundo = profundo;

     return calcularVolumen();
    }
    public void constructorVacio(){
        System.out.println("Estoy vacio");
    }


}
