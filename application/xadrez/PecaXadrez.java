package application.xadrez;

import application.tabuleiro.Peca;
import application.tabuleiro.Tabuleiro;

public class PecaXadrez extends Peca {

    private Cor cor;

    public PecaXadrez(Tabuleiro tabuleiro, Cor cor) {
        super(tabuleiro);
        this.cor = cor;
    }

    public Cor getCor() {
        return cor;
    }
}
