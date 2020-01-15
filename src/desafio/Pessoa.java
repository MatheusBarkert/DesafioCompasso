package desafio;

public class Pessoa {

	private int codigo;
	private String nome;
	private String endereco;
	private int idade;

	public Pessoa(int codigo, String nome, String endereco, int idade) {

		this.codigo = codigo;
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Codigo: " + this.codigo + "\nNome: " + this.nome + "\nEndere�o: " + this.endereco + "\nIdade: "
				+ this.idade;
	}

}
