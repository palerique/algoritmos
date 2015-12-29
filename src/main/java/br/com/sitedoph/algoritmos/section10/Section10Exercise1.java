package br.com.sitedoph.algoritmos.section10;

/**
 * Created by paulohl on 29/12/2015.
 */
public class Section10Exercise1 {

    public static void main(String[] args) {

        Produto produtos[] = {
                new Produto("Lamborguini", 1000000),
                new Produto("Jipe", 46000),
                new Produto("Brasília", 16000),
                new Produto("Smart", 46000),
                new Produto("Fusca", 17000)
        };

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
