package concessionarioBack.controller.service;

import java.net.HttpURLConnection;
import java.net.URL;

public class Connect {
	URL url = new URL("http://example.com");
	HttpURLConnection con = (HttpURLConnection) url.openConnection();
	con.setRequestMethod("POST");

}
