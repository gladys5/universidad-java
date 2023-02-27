package clases;

public class Persona {

// 1. creando atributos de la clase
  public String name;
  public String lastName;
// 2. creamos un metodo para poder ser usado fuera de la clase con los atributos que creamos dentro de ella
    public void information(){
        System.out.println("name = " + name);
        System.out.println("lastName = " + lastName);
    }


}
