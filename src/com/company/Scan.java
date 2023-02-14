package com.company;
import java.util.Scanner;
public class Scan {
    public static void main (String arg []){
        Scanner consola = new  Scanner(System.in);
        var requestTitleOfBook = "Hello please write the dates of the book";
        System.out.println(requestTitleOfBook );
        System.out.println("What is the title of book?" );
        var titleOfBook = consola.nextLine();
        System.out.println("Who is the writer of book?" );
        var nameOfWriter = consola.nextLine() ;
        System.out.println("The information send is the next \n" +"Title: "+titleOfBook + "\n Writer : " + nameOfWriter );



    }
}
