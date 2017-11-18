package biblioteca;

import java.util.List;
import java.util.LinkedList;

public class Modelo {
	
	private List<Livro> livros = new LinkedList<Livro>();
	private List<Aluno> alunos = new LinkedList<Aluno>();
	
	public void cadastrarLivro(Livro livro){
		livros.add(livro);
	}
	
	public List<Livro> buscarLivroPorTitulo(String titulo){
		List<Livro> livrosEncontrados = new LinkedList<Livro>();
		for(Livro livro : this.livros){
			if(livro.getTitulo().equals(titulo)) livrosEncontrados.add(livro);
		}
		return livrosEncontrados;
		
	}
	
	
	public List<Livro> getLivros(){
		return this.livros;
	}
	
}
