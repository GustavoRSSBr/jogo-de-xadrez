package application;

import application.tabuleiro.Posicao;
import application.tabuleiro.Tabuleiro;
import application.xadrez.PartidaXadrez;
import application.xadrez.PecaXadrez;

public class Program {
    public static void main(String[] args) {
        PartidaXadrez partidaXadrez = new PartidaXadrez();
        UI.printTabuleiro(partidaXadrez.getPecas());
    }
}
