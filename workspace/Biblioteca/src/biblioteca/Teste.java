package biblioteca;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.List;

public class Teste {

	@Test
	public void test() {
		
		Modelo modelo = new Modelo();
		
		modelo.cadastrarLivro(new Livro("Senhor dos Aneis", "Fantasia", 123, "abc123", false, false));
		modelo.cadastrarLivro(new Livro("Senhor dos Aneis", "Fantasia", 124, "abc123", false, false));
		
		//2 testes para o requisito funcional cadastrarLivro
		
		assertEquals(modelo.getLivros().size(), 2);
		
		assertEquals(modelo.getLivros().get(0).getTitulo(), "Senhor dos Aneis");
		
		// lembrando que eu poderia fazer mais...
		
		//2 testes para o requisito funcional buscarLivroPorTitulo
		
		assertEquals(modelo.buscarLivroPorTitulo("Senhor dos Aneis").size(), 2);
		
		List<Livro> lista = modelo.buscarLivroPorTitulo("Senhor dos Aneis");
		
		assertEquals(124, lista.get(1).getTomo());
		
		//lembrando que eu poderia fazer mais...
		
	}

}
