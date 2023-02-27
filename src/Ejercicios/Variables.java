package Ejercicios;

public class Variables {
    public static void main(String[] args) {
       /* int x; // Declara la variable x como entera
        x = 5; // Asigna el valor 5 a la variable x
// Muestra el valor de x
        System.out.println("El valor actual de mi variable es " + x);
        x = 7; // Asigna el valor 7 a la variable x
// Muestra de nuevo el valor de x
        System.out.println("y ahora es " + x);
        char variableChar =56;
        String variableString = "no";

        System.out.println(variableChar+variableString);

*/

        String linea;
        System.out.print("Por favor, introduce un número: ");
        linea = System.console().readLine();
        int primerNumero;
        primerNumero = Integer.parseInt( linea );
        System.out.print("introduce otro, por favor: ");
        linea = System.console().readLine();
        int segundoNumero;
        segundoNumero = Integer.parseInt( linea );
        int total;
        total = (2 * primerNumero) + segundoNumero;
        System.out.print("El primer número introducido es " + primerNumero);
        System.out.println(" y el segundo es " + segundoNumero);

        System.out.print("El doble del primer número más el segundo es ");
        System.out.print(total);



        total = (2 * primerNumero) + segundoNumero;
       // se podrían quedar en una sola línea
         total = (2 * primerNumero) + segundoNumero;
        //De igual modo, estas tres líneas
        linea = System.console().readLine();

        primerNumero = Integer.parseInt( linea );
        //también se podrían reducir a una sola tal que así
         primerNumero = Integer.parseInt( System.console().readLine() );
    }
}
