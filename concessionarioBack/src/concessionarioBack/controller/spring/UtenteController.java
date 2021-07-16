package concessionarioBack.controller.spring;

import javax.servlet.http.HttpSession;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import concessionarioBack.Crud.UtenteCrud;



@CrossOrigin
@Controller
@RequestMapping(value = "controller")
public class UtenteController {
	UtenteCrud utenteCrud = new UtenteCrud();
	@RequestMapping(value = "registrazione", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public HTTPResponse register(@RequestBody Utente utente, HTTPResponse response, HttpSession session) {
	utenteCrud.insert(utente);
	
	}
}
