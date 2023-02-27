package Ejercicios;

import java.util.Date;

public class PrintF {
    /* Escribe un programa que muestre por pantalla 10 palabras en inglés junto a su
correspondiente traducción al espaniol. Las palabras deben estar distribuidas
en dos columnas y alineadas a la izquierda.
*/
    //printf formatea el codigo para que tenga espacios determinados por consola
    public static void main(String[] args) {
        System.out.printf("%-10s %s\n", "computer", "ordenador");
        System.out.printf("%-10s %s\n", "student", "alumno\\a");
        System.out.printf("%-10s %s\n", "cat", "gato");
        System.out.printf("%-10s %s\n", "penguin", "pingüino");
        System.out.printf("%-10s %s\n", "machine", "máquina");
        System.out.printf("%-10s %s\n", "nature", "naturaleza");
        System.out.printf("%-10s %s\n", "light", "luz");
        System.out.printf("%-10s %s\n", "green", "verde");
        System.out.printf("%-10s %s\n", "book", "libro");
        System.out.printf("%-10s %s\n", "pyramid", "pirámide");
        int x = 10;
       int r = x + 11;
        System.out.printf("Formatted output is: %d %d%n", x, -r);

        //fecha por consola con printf
        Date date = new Date();
        System.out.printf("%tT%n", date);
        System.out.printf("\033[34m H : %tH, M: %tM, S: %tS%n \033[39;49m ",date,date,date);
    }
}
