package questao10;

/*No modelo anterior, onde as categorias eram tratadas como subclasses de `Filme`, 
 * cada instância de filme podia pertencer apenas a uma categoria, o que impede a 
 * combinação de múltiplas categorias como "Infantil" e "Lançamento". 
 * 
 * Ao invés de usar herança, podemos modelar as categorias como classes separadas 
 * que podem ser associadas a um filme. Isso permite que um filme tenha múltiplas categorias associadas a ele.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locadora locadora = new Locadora();
        int escolha = 0;

        while (escolha != 4) {
            System.out.println("\nMenu:\n");
            System.out.println("1 - Adicionar Filme");
            System.out.println("2 - Calcular Preco dos Filmes");
            System.out.println("3 - Mostrar Filmes");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opcao: ");

            escolha = scanner.nextInt();
            scanner.nextLine();  // Consumir a nova linha após o número

            switch (escolha) {
                case 1:
                    Locadora.adicionarFilmeMenu(scanner, locadora);
                    break;
                case 2:
                    locadora.calcularPrecos();
                    break;
                case 3:
                    locadora.mostrarFilmes();
                    break;
                case 4:
                    System.out.println("\nSecao encerrada.");
                    break;
                default:
                    System.out.println("\nOpcao invalida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
