package concessionarioBack.test;

import concessionarioBack.Crud.UtenteCrud;
import concessionarioBack.model.Utente;

public class UtenteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Utente utente = new Utente("Pippoiolo", "Rosfdscfdsi", "Pipporossi@live.it", "pippo","asd",1);
		UtenteCrud utenteCrud= new UtenteCrud();
		utenteCrud.insert(utente);
		System.out.println(utente);
		
	}

}
