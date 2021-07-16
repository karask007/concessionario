package concessionarioBack.mapper;

import java.util.List;

public interface BaseMapper <T>{
	public void insert(T model);
	public void update (T model);
	public void delete (int id);
	public T find (int id);
	public List<T> findAll();
	

}
