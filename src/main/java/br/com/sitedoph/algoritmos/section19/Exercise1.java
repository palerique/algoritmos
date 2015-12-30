package br.com.sitedoph.algoritmos.section19;

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

        for (int atual = 0; atual < produtos.length - 1; atual++) {
            int menor = getMaisBarato(produtos, atual, produtos.length - 1);
            Produto produtoAtual = produtos[atual];
            Produto produtoMenor = produtos[menor];
            produtos[atual] = produtoMenor;
            produtos[menor] = produtoAtual;
        }

        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    private static int getMaisBarato(Produto[] produtos, int inicio, int fim) {
        int maisBarato = inicio;
        for (int atual = inicio; atual <= fim; atual++) {
            if (produtos[atual].getValor() < produtos[maisBarato].getValor()) {
                maisBarato = atual;
            }
        }
        return maisBarato;
    }

}
