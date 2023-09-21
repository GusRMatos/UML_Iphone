package Sistema;

import Interfaces.Internet;
import Interfaces.Musica;
import Interfaces.Telefone;

public class IOS implements Telefone, Musica, Internet{

    //Telefone
    @Override
    public void ligar() {
        System.out.println("Ligando");
    }
    @Override
    public void atender() {
        System.out.println("Atendido");
    }
    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }

    //Musica
    @Override
    public void reproduzir() {
        System.out.println("Reproduzindo");
    }
    @Override
    public void tocar() {
        System.out.println("Tocando");
    }
    @Override
    public void pausar() {
        System.out.println("Pausado");
    }

    //Internet
    @Override
    public void novaPagina() {
        System.out.println("Nova pagina aberta");
    }
    @Override
    public void novaAba() {
        System.out.println("Nova aba aberta");
    }
    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando");
    }
}
