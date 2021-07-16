package concessionarioBack.model;

public class Utente {
	private int id;
	private String nome;
	private String cognome;
	private String email;
	private String password;
	private String documento;
	private int ruolo;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public int getRuolo() {
		return ruolo;
	}
	public void setRuolo(int ruolo) {
		this.ruolo = ruolo;
	}
	public Utente(int id, String nome, String cognome, String email, String password, String documento, int ruolo) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.documento = documento;
		this.ruolo = ruolo;
	}
	public Utente() {
		super();
	}
	
	public Utente( String nome, String cognome, String email, String password, String documento, int ruolo) {
		super();
		
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.documento = documento;
		this.ruolo = ruolo;
	}
	@Override
	public String toString() {
		return "Utente [id=" + id + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email + ", password="
				+ password + ", documento=" + documento + ", ruolo=" + ruolo + "]";
	}
	
}
