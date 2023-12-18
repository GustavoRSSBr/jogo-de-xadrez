package application.xadrez.pecas;

import application.tabuleiro.Tabuleiro;
import application.xadrez.Cor;
import application.xadrez.PecaXadrez;

public class King extends PecaXadrez {


    public King(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro, cor);
    }

    @Override
    public String toString(){
        return "K";
    }
}
