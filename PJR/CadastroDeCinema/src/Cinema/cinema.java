package Cinema;

import java.util.ArrayList;

public class cinema {
    private String nome;
    private String endereco;
    private int numeroDeSalas;
    private ArrayList<Integer> capacidadeDasSalas;

    public cinema(String nome, String endereco, int numeroDeSalas, ArrayList<Integer> capacidadeDasSalas) {
        this.nome = nome;
        this.endereco = endereco;
        this.numeroDeSalas = numeroDeSalas;
        this.capacidadeDasSalas = capacidadeDasSalas;
    }

    public void exibirInformacoes() {
        System.out.println("Nome do cinema: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Número de salas: " + numeroDeSalas);
        for (int i = 0; i < capacidadeDasSalas.size(); i++) {
            System.out.println("Capacidade da sala " + (i + 1) + ": " + capacidadeDasSalas.get(i) + " pessoas");
        }
    }
}
