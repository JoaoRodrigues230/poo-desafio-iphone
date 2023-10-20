package IPHONE.navegador;

import java.util.Scanner;

public class internet {
    
    static Scanner ler = new Scanner(System.in);

    private static String pagina;
    private static int opcao;

    public static void exibirPagina(){

        System.out.println("+------------------------------+");
        System.out.println("|            Google            |");
        System.out.println("+------------------------------+");
        System.out.println("|        FAÇA SUA PESQUISA     |");
        System.out.println("+------------------------------+");
        pagina = ler.nextLine();

        pagina();
    }

    public static void pagina(){
        System.out.println(pagina);
        System.out.println("------------------------------\n----------------------------\n--------------\n");
    }

    public static void addAba(){
        
        do{
            System.out.println("1 - NEW ABA\n2 - ATUALIZAR PAGINA");
            opcao = ler.nextInt();

            if(opcao!=1&&opcao!=2)
                System.out.println("\nOPCÃO INVÁLIDA...\n");

        }while(opcao!=1&&opcao!=2);

            if(opcao==1)
                exibirPagina();
            else
                attPagina();
    }

    public static void attPagina(){
        System.out.println("ATUALIZANDO...");
        pagina();

    }
}
