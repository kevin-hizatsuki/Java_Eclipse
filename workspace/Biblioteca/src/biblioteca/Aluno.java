package biblioteca;

public class Aluno {
	
	private String nome;
	private int ra;
	private int quantidade;
	
	
	
	public Aluno(String nome, int ra, int quantidade) {
		this.nome = nome;
		this.ra = ra;
		this.quantidade = quantidade;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	

}
