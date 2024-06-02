package com.dio.iphone;

import com.dio.funcionalidades.AparelhoTelefonico;
import com.dio.funcionalidades.NavegadorInternet;
import com.dio.funcionalidades.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Reprodutor musical
    @Override
    public void tocar() {
        System.out.println("Tocando");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando");
    }

    @Override
    public String selecionarMusica(String musica) {
        System.out.println("Selecionando música");
        return musica;
    }

    // Aparelho telefônico
    @Override
    public String ligar(String numero) {
        System.out.println("Ligando");
        return numero;
    }

    @Override
    public void atender() {
        System.out.println("Atendendo");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz");
    }

    // Navegador de Internet
    @Override
    public String exibirPagina(String url) {
        System.out.println("Exibindo pagina");
        return url;
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }

}
