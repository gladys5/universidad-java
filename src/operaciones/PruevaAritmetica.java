package operaciones;

public class PruevaAritmetica {
    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica();//esto esta almacenado en la memoria Heap de java
        aritmetica.a =3;//esto esta almacenado en la memoria Stack
        aritmetica.b =2;
        aritmetica.sumar();

      int resultado = aritmetica.sumarConRetorno();
        System.out.println("resultado  desde la clase pruevaAritmetica= " + resultado);
        resultado =  aritmetica.sumarConArg(3,4);
        System.out.println("resultado = " + resultado);



    }
    //
}
