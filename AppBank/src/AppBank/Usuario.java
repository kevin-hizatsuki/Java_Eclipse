package AppBank;

public class Usuario {
	
	private String user;
	private String senha;
	private String email;
	private String numeroDaConta;
	
	
	public Usuario(String user, String senha, String email,String numeroDaConta) {
		this.user = user;
		this.senha = senha;
		this.email = email;
		this.numeroDaConta = numeroDaConta;
	}
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumeroDaConta(){
		return numeroDaConta;
	}
	public void setNumeroDaConta(String numeroDaConta){
		this.numeroDaConta = numeroDaConta;
	}
	
	
	

}
