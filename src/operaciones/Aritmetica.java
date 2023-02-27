package operaciones;

public class Aritmetica {
int a;
int b;
//creacion de un metodo 
public void sumar(){
 int resultado = a +b;
    System.out.println("resultado = " + resultado);
}
public int sumarConRetorno(){
//    int resultado = a + b;
//    return resultado;
    return a + b;
}
public int sumarConArg(int arg1, int arg2){
    this.a = arg1;
    this.b = arg2;
    nuevoMetodo();
    return sumarConRetorno();


}
    public void nuevoMetodo() {
        System.out.println("soy un metodo que no puede implementarce directo en main");
    }

//creamos este metod como void por que no se planea que regrese nada este metodo no puede ser
// llamado dentro del metodo main ya que no es estatico

//public Aritmetica(int a, int b){
//    this.a = a;
//    this.b =b;
//    System.out.println("ejecutamos un metodo como parametro");
//}


}
