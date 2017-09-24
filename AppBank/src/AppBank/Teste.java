package AppBank;

import static org.junit.Assert.*;

import org.junit.Test;

import AppBank.Modelo;

public class Teste {

	@Test
	public void test() {
		Modelo modelo = new Modelo();
		
		modelo.cadastrarUsuario(new Usuario("Jose_Ricardo","12345","josericardo@email.com","K2033J"));
		modelo.cadastrarUsuario(new Usuario("Ana_Brito","21548","anabrito@email.com","J8011K"));
		
		assertEquals(modelo.getUsuarios().size(),2);
		
		assertEquals(modelo.getUsuarios().get(0).getUser(),"Jose_Ricardo");
		
	}

}
