package application.xadrez;

import application.tabuleiro.Posicao;
import application.tabuleiro.Tabuleiro;
import application.xadrez.pecas.King;
import application.xadrez.pecas.Rook;

public class PartidaXadrez {

    private Tabuleiro tabuleiro;

    public PartidaXadrez(){
        tabuleiro = new Tabuleiro(8,8);
        configuracaoInicial();
    }

    public PecaXadrez[][] getPecas(){
        PecaXadrez [][] matriz = new PecaXadrez[tabuleiro.getLinhas()][tabuleiro.getColunas()];
        for( int i = 0; i < tabuleiro.getLinhas(); i++){
            for (int j = 0; j < tabuleiro.getColunas(); j++){
                matriz[i][j] = (PecaXadrez) tabuleiro.peca(i, j);
            }
        }

        return matriz;
    }

    private void configuracaoInicial(){
        tabuleiro.lugarPeca(new Rook(tabuleiro, Cor.BRANCO), new Posicao(2, 1));
        tabuleiro.lugarPeca(new King(tabuleiro, Cor.PRETO), new Posicao(0, 4));
    }
}
