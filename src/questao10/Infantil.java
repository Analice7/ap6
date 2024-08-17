package questao10;

public class Infantil implements ICategoria {
	
	private final double ACRESCIMO = 2.00;
	
	@Override
	public double aplicarCategoria(double precoBase) {
		return precoBase + ACRESCIMO;
	}
	
}
