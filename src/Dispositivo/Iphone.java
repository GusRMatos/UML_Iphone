package Dispositivo;

import Sistema.IOS;

public class Iphone {
    public static void main(String[] args) {

        IOS ios = new IOS();

        System.out.println("FUNCOES TELEFONICAS");
        ios.ligar();
        ios.atender();
        ios.iniciarCorreioDeVoz();
        System.out.println("");
        System.out.println("FUNCOES MUSICAIS");
        ios.tocar();
        ios.pausar();
        ios.reproduzir();
        System.out.println("");
        System.out.println("FUNCOES DE INTERNET");
        ios.novaAba();
        ios.novaPagina();
        ios.atualizarPagina();
    }
}
