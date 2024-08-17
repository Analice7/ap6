package questao10;

public class Lancamento implements ICategoria {
	
	private final double ACRESCIMO = 3.00;

    @Override
    public double aplicarCategoria(double precoBase) {
        return precoBase + ACRESCIMO;
    }

}
