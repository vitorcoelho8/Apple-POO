package Iphone;

import Iphone.AparelhoTelefonico.Call;
import Iphone.Internet.internet;
import Iphone.RepodutorMusical.Music;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Music tocar = new Music();
        tocar.tocar();
        Music pausar = new Music();
        pausar.pausar();
        Music selecionarMusica = new Music();
        selecionarMusica.selecionarMusica();

        internet exibir = new internet();
        exibir.exibirPagina();
        internet atualizar = new internet();
        atualizar.atualizarPagina();
        internet adicionar = new internet();
        adicionar.adicionarNovaAba();

        Call telefone = new Call();
        telefone.ligar();
        Call atender = new Call();
        atender.atender();
        Call caixaPostal = new Call();
        caixaPostal.correioVoz();



    }
}