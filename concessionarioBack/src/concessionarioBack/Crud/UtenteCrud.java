package concessionarioBack.Crud;

import java.util.List;

import concessionarioBack.factory.SqlMapFactory;
import concessionarioBack.mapper.BaseMapper;
import concessionarioBack.mapper.UtenteMapper;
import concessionarioBack.model.Utente;



public class UtenteCrud implements UtenteMapper  {

	@Override
	public void insert(Utente model) {
		SqlMapFactory.instance().openSession();
		UtenteMapper mapper = SqlMapFactory.instance().getMapper(UtenteMapper.class);
		mapper.insert(model);
		SqlMapFactory.instance().commitSession();
		SqlMapFactory.instance().closeSession();
		
		
	}

	@Override
	public void update(Utente model) {
		
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Utente find(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Utente> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
		
		


	
		
	

}
