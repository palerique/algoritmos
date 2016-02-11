package br.com.sitedoph.algoritmos.section30.sysos;

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

        //selectionSort(produtos, produtos.length);
        novoSort(produtos, produtos.length);

        imprimeProdutos(produtos);
    }

    private static void imprimeProdutos(Produto[] produtos) {
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }

    private static void novoSort(Produto[] produtos, int quantidadeDeElementos) {
        for (int atual = 0; atual < quantidadeDeElementos - 1; atual++) {
            System.out.println("Estou na casinha " + atual + "\n");

            int analise = atual;
            while (analise > 0 && produtos[analise].getValor() < produtos[analise - 1].getValor()) {
                System.out.println("Estou trocando " + analise + " com " + (analise - 1));

                Produto produtoAnalise = produtos[analise];
                Produto produtoAnaliseMenos1 = produtos[analise - 1];
                System.out.println("Estou trocando " + produtoAnalise.getNome()
                        + " com " + produtoAnaliseMenos1.getNome() + "\n");
                produtos[analise] = produtoAnaliseMenos1;
                produtos[analise - 1] = produtoAnalise;
                analise--;
            }

            imprimeProdutos(produtos);

            System.out.printf("\n\n");
            System.out.printf("\n\n");
        }
    }

    private static void selectionSort(Produto[] produtos, int quantidadeDeElementos) {
        for (int atual = 0; atual < quantidadeDeElementos - 1; atual++) {

            System.out.println("Analizando índice " + atual);

            int menor = getMaisBarato(produtos, atual, quantidadeDeElementos - 1);
            System.out.println("Trocando índice " + atual + " por " + menor);
            Produto produtoAtual = produtos[atual];
            Produto produtoMenor = produtos[menor];

            System.out.println("Trocando " + produtoAtual.getNome() + " por " + produtoMenor.getNome());

            produtos[atual] = produtoMenor;
            produtos[menor] = produtoAtual;
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
