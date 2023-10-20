package IPHONE;

import java.util.Scanner;

import IPHONE.aparelhoTelefonico.telefone;
import IPHONE.navegador.internet;
import IPHONE.reprodutorMusica.reproduzirMusica;

public class usuario {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        int opcao;
        int pausar;
        do{
        
        System.out.println("SELECIONE O APLICATIVO QUE DESEJA UTILIZAR:\n1 - MUSIC\n2 - TELEFONE\n3 - INTERNET");
        
        opcao = ler.nextInt();
        
            if(opcao!=1&&opcao!=2&&opcao!=3){
                System.out.println("OPÇÃO NÃO É VÁLIDA, TENTE NOVAMENTE...\n");
            }
        }while(opcao!=1&&opcao!=2&&opcao!=3);

        reproduzirMusica musica = new reproduzirMusica();
        telefone ligacao = new telefone();
        internet web = new internet();

        switch (opcao) {
            
            case 1:
                musica.selecionarMusica();

                musica.tocarMusica();

                System.out.println("TECLE 1 PARA PAUSAR:\n1 - PAUSAR");

                do{
                    pausar = ler.nextInt();

                    if(pausar!=1)
                        System.out.println("OPÇÃO INVÁLIDA...\n");
                }while(pausar!=1);

                if(pausar==1)
                    musica.pausarMusica();

                break;

            case 2:
                ligacao.ligar();
                
                break;

            case 3:
                web.exibirPagina();

                web.addAba();
                
                break;
        }

    }
}
