package br.com.sitedoph.algoritmos.section13;

/**
 * Created by paulohl on 29/12/2015.
 */
public class Exercise1 {

    public static void main(String[] args) {

        Produto produtos[] = {
                new Produto("Lamborguini", 1000000),
                new Produto("Jipe", 46000),
                new Produto("Brasília", 16000),
                new Produto("Smart", 46000),
                new Produto("Fusca", 17000),
                null,
                null,
                null
        };

        int maisBarato = getMaisBarato(produtos, 0, produtos.length);

        System.out.println("Mais Barato = " + produtos[maisBarato].getNome());
        System.out.println("$$$$ Barato = " + produtos[maisBarato].getValor());

        int maisCaro = getMaisCaro(produtos, 0, produtos.length);

        System.out.println("Mais Caro = " + produtos[maisCaro].getNome());
        System.out.println("$$$$ Caro = " + produtos[maisCaro].getValor());

    }

    private static int getMaisBarato(Produto[] produtos, int inicio, int fim) {
        int maisBarato = 0;

        for (; inicio < fim; inicio++) {
            if (produtos[inicio] != null && produtos[inicio].getValor() < produtos[maisBarato].getValor()) {
                maisBarato = inicio;
            }
        }

        return maisBarato;
    }

    private static int getMaisCaro(Produto[] produtos, int inicio, int fim) {
        int maisBarato = 0;

        for (; inicio < fim; inicio++) {
            if (produtos[inicio] != null && produtos[inicio].getValor() > produtos[maisBarato].getValor()) {
                maisBarato = inicio;
            }
        }

        return maisBarato;
    }

}
