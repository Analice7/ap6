package questao9;

import java.util.ArrayList;
import java.util.Scanner;

public class Locadora {
    private ArrayList<Filme> filmes = new ArrayList<>();


    public Locadora() {
        
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
                System.out.println("\n" + filme.getTitulo() + " - Preço: " + filme.calcularPreco());
            }
        }
    }

    public void mostrarFilmes() {
        if (filmes.isEmpty()) {
            System.out.println("\nNenhum filme na locadora.");
        } else {
            for (Filme filme : filmes) {
                System.out.println("\n" + filme.getTitulo() + " - Categoria: " + filme.getCategoria() + " - Preço: " + filme.getPreco());
            }
        }
    }
    
    public static void adicionarFilmeMenu(Scanner scanner, Locadora locadora) {
        System.out.print("\nDigite o título do filme: ");
        String titulo = scanner.nextLine();
        System.out.print("\nEscolha a categoria do filme:\n1 - Promoção\n2 - Infantil\n3 - Lançamento");
        int categoriaEscolha = scanner.nextInt();
        scanner.nextLine();  // Consumir a nova linha após o número

        Filme filme = null;

        switch (categoriaEscolha) {
        	case 1:
        		filme = new Promocao(titulo, "Promoção");
        		break;
        	case 2:
        		filme = new Infantil(titulo, "Infantil");
        		break;
        	case 3:
        		filme = new Lancamento(titulo, "Lançamento");
        		break;
        	default:
        		System.out.println("Categoria inválida. Filme não adicionado.");
        		return;
        }

        if (filme != null) {
        	locadora.adicionarFilme(filme);
        }
    }

}

    