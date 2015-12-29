package br.com.sitedoph.algoritmos.section11;

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
                new Produto("Fusca", 17000)
        };

        int maisBarato = getMaisBarato(produtos);

        System.out.println("Mais Barato = " + produtos[maisBarato].getNome());
        System.out.println("$$$$ Barato = " + produtos[maisBarato].getValor());

        int maisCaro = getMaisCaro(produtos);

        System.out.println("Mais Caro = " + produtos[maisCaro].getNome());
        System.out.println("$$$$ Caro = " + produtos[maisCaro].getValor());

    }

    private static int getMaisBarato(Produto[] produtos) {
        int maisBarato = 0;
        int atual = 0;

        while (atual < produtos.length) {

            if (produtos[atual].getValor() < produtos[maisBarato].getValor()) {
                maisBarato = atual;
            }

            atual++;
        }
        return maisBarato;
    }

    private static int getMaisCaro(Produto[] produtos) {
        int maisCaro = 0;
        int atual = 0;

        while (atual < produtos.length) {

            if (produtos[atual].getValor() > produtos[maisCaro].getValor()) {
                maisCaro = atual;
            }

            atual++;
        }
        return maisCaro;
    }
}
