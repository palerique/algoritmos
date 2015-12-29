package br.com.sitedoph.algoritmos.section6;

/**
 * Created by paulohl on 29/12/2015.
 */
public class Section6Exercise1 {

    public static void main(String[] args) {

        double precos[] = new double[5];

        precos[0] = 1000000;
        precos[1] = 46000;
        precos[2] = 16000;
        precos[3] = 46000;
        precos[4] = 17000;

        int maisBarato = 0;
        int atual = 0;

        while (atual < precos.length) {

            if (precos[atual] < precos[maisBarato]) {
                maisBarato = atual;
            }

            atual++;
        }

        System.out.println("Mais barato = " + maisBarato);
        System.out.println("$$$$ barato = " + precos[maisBarato]);

    }
}
