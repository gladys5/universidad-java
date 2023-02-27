package Ejercicios;

public class HorarioFormateado {
    public static void main(String[] args) {





        String  texto ="█─█ █▀█ █▀█ █▀█ █─█\n" +
                "█▀█ █▀█ █▀▀ █▀▀ ─█─\n" +
                "• • • • • • • • • •\n" +
                "█▀▀ █▀█ █ █▀▄ █▀█ █─█\n" +
                "█▀▀ ██▀ █ █─█ █▀█ █─█\n" +
                "█── █─█ █ █▄▀ █─█ ─█" ;

        for(int i = 30; i <= 37; i++){
            for(int j = 40; j <= 47; j++){
                String textoformateado = "[";
                textoformateado += (i);
                textoformateado += ";";
                textoformateado += (j);
                textoformateado += "m";
                textoformateado += texto;

                 System.out.println((char)27 + textoformateado);
            }
        }



    }


}
