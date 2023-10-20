package IPHONE.aparelhoTelefonico;

import java.util.Scanner;
import java.util.Random;

public class telefone {

    static Scanner ler = new Scanner(System.in);
    private static String num;

    public static void ligar(){
        
        System.out.println("DISQUE O NÚMERO: ");
        num = ler.nextLine();

        do{
            System.out.println("Chamando...");
        }while(tocando());

        if(tocando()==false)
            caixaPostal();
        else
            System.out.println("\nALÔ!");
    }

    private static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==0;
       
        //negando o ato de continuar tocando
        return ! atendeu;
    }
    
    private static void caixaPostal(){
        System.out.println("\nSUA CHAMADA ESTÁ SENDO ENCAMINHADA PARA CAIXA POSTAL...");
    }
}
