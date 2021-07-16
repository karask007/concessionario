package concessionarioBack.model;

import java.security.Timestamp;

public class Automobile {
	private int id;
	private String marca;
	private String modello;
	private String targa;
	private Timestamp data_immatricolazione;
	private String stato;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public String getTarga() {
		return targa;
	}
	public void setTarga(String targa) {
		this.targa = targa;
	}
	public Timestamp getData_immatricolazione() {
		return data_immatricolazione;
	}
	public void setData_immatricolazione(Timestamp data_immatricolazione) {
		this.data_immatricolazione = data_immatricolazione;
	}
	public String getStato() {
		return stato;
	}
	public void setStato(String stato) {
		this.stato = stato;
	}
	public Automobile(int id, String marca, String modello, String targa, Timestamp data_immatricolazione, String stato) {
		super();
		this.id = id;
		this.marca = marca;
		this.modello = modello;
		this.targa = targa;
		this.data_immatricolazione = data_immatricolazione;
		this.stato = stato;
		
		
	}
	public Automobile() {
		super();
	}
	@Override
	public String toString() {
		return "Auto [id=" + id + ", marca=" + marca + ", modello=" + modello + ", targa=" + targa
				+ ", data_immatricolazione=" + data_immatricolazione + ", stato=" + stato + "]";
	}
	
}
