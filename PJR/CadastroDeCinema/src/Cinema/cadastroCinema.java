package Cinema;

import java.util.ArrayList;
import java.util.Scanner;

public class cadastroCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<cinema> listaDeCinemas = new ArrayList<>();

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar Cinema");
            System.out.println("2. Exibir Cinemas Cadastrados");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            if (opcao == 1) {
                System.out.print("Nome do cinema: ");
                String nome = scanner.nextLine();

                System.out.print("Endereço do cinema: ");
                String endereco = scanner.nextLine();

                System.out.print("Número de salas: ");
                int numeroDeSalas = scanner.nextInt();

                ArrayList<Integer> capacidades = new ArrayList<>();
                for (int i = 1; i <= numeroDeSalas; i++) {
                    System.out.print("Capacidade da sala " + i + ": ");
                    int capacidade = scanner.nextInt();
                    capacidades.add(capacidade);
                }

                cinema novoCinema = new cinema(nome, endereco, numeroDeSalas, capacidades);
                listaDeCinemas.add(novoCinema);
                System.out.println("Cinema cadastrado com sucesso!");

            } else if (opcao == 2) {
                if (listaDeCinemas.isEmpty()) {
                    System.out.println("Nenhum cinema cadastrado.");
                } else {
                    for (cinema cinema : listaDeCinemas) {
                        cinema.exibirInformacoes();
                        System.out.println("----------------------------");
                    }
                }

            } else if (opcao == 3) {
                System.out.println("Encerrando o programa...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
