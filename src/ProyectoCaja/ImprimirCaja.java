package ProyectoCaja;

public class ImprimirCaja {
    public static void main(String[] args) {

        Caja caja = new Caja();
        caja.alto=3;
        caja.ancho =2;
        caja.profundo =6;
        System.out.println(caja.constructorLleno(caja.alto,caja.ancho,caja.profundo));

        caja.constructorVacio();
        System.out.println( caja.calcularVolumen());



    }
}
