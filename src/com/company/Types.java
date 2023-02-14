package com.company;

public class Types {
    public static void main(String[] args) {
/*
variables
* int: son los numeros enteros negativos y positivos
* float:hace referencia a valores flotantes :decimales :1.2
* double: son decimales :1,2,4,5
* String:cadenas de texto
* char :solo guarda un caracter
* boolean:true o false
*
* */
     int number =100;
     System.out.println(number);
        String sayHello = "Hello Word";
        System.out.print(sayHello);
        float number_float=2.5f;
        System.out.println(number_float);
        double number_double=2.5;
        System.out.println(number_double);
        String text="cadena de texto";
        System.out.println(number_float);
        var myVariableString ="i am string";
        System.out.println(myVariableString);
        var concat =  "the result is : " + (number_float + number_double);
       /*
       * contexto cadena se refiere a que si en una union de  variables estas llevan un string y despues una suma
       * java lo tomara como string el contexto por esto se recomienda usar parentesis
       */

        System.out.println(concat);
        System.out.println(sayHello  + " \n My name is Gladys");//salto de linea
        System.out.println(sayHello  + " \t My name is Gladys");//tabulador
        System.out.println(sayHello  + " \b My name is Gladys");//retrosede
        System.out.println(sayHello  + " \b\b My name is Gladys");// retrosede y se superpone
        System.out.println("\'" + sayHello + "\' " + " \n My name is Gladys");// comilla simple
        System.out.println("\""+sayHello +"\" " + " \n My name is Gladys");//comilla doble






    }
}