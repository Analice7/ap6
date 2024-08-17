package questao10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Locadora {
    private List<Filme> filmes;

    public Locadora() {
        filmes = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
        System.out.println("\nFilme adicionado: " + filme.getTitulo());
    }

    public void calcularPrecos() {
        if (filmes.isEmpty()) {
            System.out.println("\nNenhum filme na locadora.");
        } else {
            for (Filme filme : filmes) {
                System.out.println("\nTitulo: " + filme.getTitulo() + " - Preco: " + filme.calcularPreco());
            }
        }
    }

    public void mostrarFilmes() {
    	if (filmes.isEmpty()) {
            System.out.println("\nNenhum filme na locadora.");
        } else {
            for (Filme filme : filmes) {
                System.out.println("\nTítulo: " + filme.getTitulo() +
                                   " - Categorias: " + filme.getCategorias() +
                                   " - Preco: " + filme.calcularPreco());
            }
        }
    }
    
    public static void adicionarFilmeMenu(Scanner scanner, Locadora locadora) {
        System.out.print("\nDigite o título do filme: ");
        String titulo = scanner.nextLine();

        Filme filme = new Filme(titulo);

        System.out.println("\nEscolha as categorias do filme (digite 0 para parar):");
        System.out.println("1 - Promocao");
        System.out.println("2 - Infantil");
        System.out.println("3 - Lancamento");

        int categoriaEscolha;
        do {
            categoriaEscolha = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha após o número

            switch (categoriaEscolha) {
                case 1:
                    filme.adicionarCategoria(new Promocao());
                    break;
                case 2:
                    filme.adicionarCategoria(new Infantil());
                    break;
                case 3:
                    filme.adicionarCategoria(new Lancamento());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("\nCategoria invalida. Tente novamente.");
            }
        } while (categoriaEscolha != 0);

        locadora.adicionarFilme(filme);
    }
}
