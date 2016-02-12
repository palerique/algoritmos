package br.com.sitedoph.algoritmos.section31.melhorias;

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
        for (int atual = 1; atual < quantidadeDeElementos; atual++) {
            System.out.println("Estou na casinha " + atual + "\n");

            int analise = atual;
            while (analise > 0 && produtos[analise].getValor() < produtos[analise - 1].getValor()) {
                trocaProdutos(produtos, analise, analise - 1);
                analise--;
            }

            imprimeProdutos(produtos);

            System.out.printf("\n\n");
        }
    }

    private static void trocaProdutos(Produto[] produtos, int primeiro, int segundo) {

        System.out.println("Trocando índice " + primeiro + " por " + segundo);

        Produto primeiroProduto = produtos[primeiro];
        Produto segundoProduto = produtos[segundo];

        System.out.println("Estou trocando " + primeiroProduto + " com " + segundoProduto + "\n");

        produtos[primeiro] = segundoProduto;
        produtos[segundo] = primeiroProduto;
    }

    private static void selectionSort(Produto[] produtos, int quantidadeDeElementos) {
        for (int atual = 0; atual < quantidadeDeElementos - 1; atual++) {
            System.out.println("Analizando índice " + atual);
            int menor = getMaisBarato(produtos, atual, quantidadeDeElementos - 1);
            trocaProdutos(produtos, atual, menor);
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
