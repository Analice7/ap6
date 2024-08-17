package questao9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LancamentoTest {

	@Test
	public void testarCalcularpreco() {
		 Lancamento lancamento = new Lancamento("Interestelar", "Lancamento");

	     // O preço base é 4.00 e o acréscimo é 3.00
	     double precoEsperado = 4.00 + 3.00;

	     assertEquals(precoEsperado, lancamento.calcularPreco());
	}

}
