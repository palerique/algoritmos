package br.com.sitedoph.algoritmos.section9;

/**
 * Created by paulohl on 29/12/2015.
 */
public class Section9Exercise1 {

    public static void main(String[] args) {

        Produto produtos[] = new Produto[5];

        produtos[0] = new Produto("Lamborguini", 1000000);
        produtos[1] = new Produto("Jipe", 46000);
        produtos[2] = new Produto("Brasília", 16000);
        produtos[3] = new Produto("Smart", 46000);
        produtos[4] = new Produto("Fusca", 17000);

        int maisCaro = 0;
        int atual = 0;

        while (atual < produtos.length) {

            if (produtos[atual].getValor() > produtos[maisCaro].getValor()) {
                maisCaro = atual;
            }

            atual++;
        }

        System.out.println("Mais caro = " + produtos[maisCaro].getNome());
        System.out.println("$$$$ caro = " + produtos[maisCaro].getValor());

    }
}
