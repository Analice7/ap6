package questao13;

public class Nadador extends Atleta implements INadador {
	
	public Nadador(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void nadar() {
        System.out.println(getNome() + " esta nadando.");
    }

}