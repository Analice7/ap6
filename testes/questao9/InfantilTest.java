package questao9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InfantilTest {

	@Test
	public void testarCalcularpreco() {
		 Infantil infantil= new Infantil("Toy Story", "Infantil");

	     // O preço base é 4.00 e o acréscimo é 2.00
	     double precoEsperado = 4.00 + 2.00;

	     assertEquals(precoEsperado, infantil.calcularPreco());
	}

}
