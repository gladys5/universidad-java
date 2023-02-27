package clases;

public class PruevaPersona {
    public static void main(String[] args) {
        //3. crear un objeto persona apartir de la clase la variable puede tener cualquier nombre pero el tipo
        // es especificamente la clase Persona
        // esta variable definida dentro del metodo main solo vive localmente y cuando este metodo se termina de
        // ejecutar se destrulle
        Persona persona;
        //mandamos llamar al constructor para reservar la memoria donde estara la referencia al objeto desde aqui
        // ya podemos acceder a los atributos y metodos creados en la clase
        persona = new Persona();
        //accedemos a el atributo name y le asignamos un valor
        persona.name = "Juan";
        persona.lastName="Perez";
       // mandamos a llamar al metodo
        persona.information();

        //creamos otro objeto persona a este no le daremos inicializacion por tanto su valor inicial es null es//
       // importante decir que cada objeto apuna a diferentes objetos en memoria
        Persona persona2;
        persona2 = new Persona();


        System.out.println("persona2 = "+ persona2.name);
       persona2.information();
    }
}
