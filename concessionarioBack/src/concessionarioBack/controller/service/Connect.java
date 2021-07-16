package concessionarioBack.controller.service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Connect {
	static String url = "http://localhost:8080/concessionarioBack/";
	public static void dopost(String uri) throws IOException {
	URL urlPost = new URL(url+uri);
	HttpURLConnection con = (HttpURLConnection) urlPost.openConnection();
	con.setRequestMethod("POST");
	}
	
	public static void main(String[]args) throws IOException {
		dopost("Utente/registrazione");
	}
}
