package questao13;

public abstract class Atleta implements IAtleta {
	
	private String nome;
	private int idade;
	
	public Atleta(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	@Override
	public String getNome() {
		return this.nome;
	}
	
	@Override
	public int getIdade() {
		return this.idade;
	}
	
	@Override
	public void aquecer() {
		System.out.println(this.nome + " esta aquecendo.");
	}

}
