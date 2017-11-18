package biblioteca;

public class Livro {

	private String titulo;
	private String genero;
	private int tomo;
	private String isbn;
	private boolean alugado;
	private boolean reservado;
	
	
	
	
	public Livro(String titulo, String genero, int tomo, String isbn, boolean alugado, boolean reservado) {
		this.titulo = titulo;
		this.genero = genero;
		this.tomo = tomo;
		this.isbn = isbn;
		this.alugado = alugado;
		this.reservado = reservado;
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getTomo() {
		return tomo;
	}
	public void setTomo(int tomo) {
		this.tomo = tomo;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public boolean isAlugado() {
		return alugado;
	}
	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}
	public boolean isReservado() {
		return reservado;
	}
	public void setReservado(boolean reservado) {
		this.reservado = reservado;
	}
	
	
	
}
