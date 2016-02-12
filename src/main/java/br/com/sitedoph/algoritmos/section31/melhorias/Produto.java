package br.com.sitedoph.algoritmos.section31.melhorias;

/**
 * Created by paulohl on 29/12/2015.
 */
public class Produto {
    private final String nome;
    private final double valor;

    public Produto(String nome, double valor) {

        this.nome = nome;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                '}';
    }
}
