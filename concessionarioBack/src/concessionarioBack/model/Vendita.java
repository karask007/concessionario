package concessionarioBack.model;

import java.sql.Timestamp;

public class Vendita {
	private int id;
	private Timestamp data;
	private double prezzo;
	private int id_auto;
	private Automobile automobile;
	private int id_utente;
	private Utente utente;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Timestamp getData() {
		return data;
	}
	public void setData(Timestamp data) {
		this.data = data;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	public int getId_auto() {
		return id_auto;
	}
	public void setId_auto(int id_auto) {
		this.id_auto = id_auto;
	}
	public Automobile getAutomobile() {
		return automobile;
	}
	public void setAuto(Automobile automobile) {
		this.automobile = automobile;
	}
	public int getId_utente() {
		return id_utente;
	}
	public void setId_utente(int id_utente) {
		this.id_utente = id_utente;
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public Vendita(int id, Timestamp data, double prezzo, int id_auto, Automobile automobile, int id_utente, Utente utente) {
		super();
		this.id = id;
		this.data = data ;
		this.prezzo = prezzo;
		this.id_auto = id_auto;
		this.automobile = automobile;
		this.id_utente = id_utente;
		this.utente = utente;
	}
	public Vendita() {
		super();
	}
	@Override
	public String toString() {
		return "Vendita [id=" + id + ", data=" + data + ", prezzo=" + prezzo + ", id_auto=" + id_auto + ", auto=" + automobile
				+ ", id_utente=" + id_utente + ", utente=" + utente + "]";
	}
}
