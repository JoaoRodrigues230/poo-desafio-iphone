package IPHONE.reprodutorMusica;

import java.util.Scanner;

public class reproduzirMusica {

    static Scanner ler = new Scanner(System.in);

    private static String musica;

    public static void selecionarMusica(){
        System.out.println("DIGITE A MÚSICA QUE DESEJA ESCUTAR: ");
        musica = ler.nextLine();
    }

    public void tocarMusica(){
        System.out.println("\n" + musica);
        System.out.println("|______>________|\n");
    }

    public void pausarMusica(){
        System.out.println("\n" + musica);
        System.out.println("|______||________|\n");
        System.out.println("A MÚSICA FOI PAUSADA!");
    }
}
