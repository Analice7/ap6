package questao10;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FilmeTest {

    @Test
    void testarFilmeComUmaCategoria() {
        Filme filme = new Filme("Shrek");
        filme.adicionarCategoria(new Infantil());

        // Preço base é 4.00, e o acréscimo infantil é 2.00
        double precoEsperado = 4.00 + 2.00;

        assertEquals(precoEsperado, filme.calcularPreco(), 0.01);
    }

    @Test
    void testarFilmeComVariasCategorias() {
        Filme filme = new Filme("Divertidamente");
        filme.adicionarCategoria(new Infantil());
        filme.adicionarCategoria(new Lancamento());
        filme.adicionarCategoria(new Promocao());

        // Preço base é 4.00
        // Infantil: +2.00, Lançamento: +3.00, Promoção: -2.00
        double precoEsperado = 4.00 + 2.00 + 3.00 - 2.00;

        assertEquals(precoEsperado, filme.calcularPreco(), 0.01);
    }

    @Test
    void testarFilmeSemCategoria() {
        Filme filme = new Filme("Homem-Aranha");

        // Preço base é 4.00 e não há categorias adicionadas
        double precoEsperado = 4.00;

        assertEquals(precoEsperado, filme.calcularPreco(), 0.01);
    }

}
