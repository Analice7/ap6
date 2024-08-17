package questao9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PromocaoTest {

	@Test
	public void testarCalcularpreco() {
		 Promocao promocao = new Promocao("Godzilla", "Promocao");

	     // O preço base é 4.00 e o desconto é 2.00
	     double precoEsperado = 4.00 - 2.00;

	     assertEquals(precoEsperado, promocao.calcularPreco());
	}

}
