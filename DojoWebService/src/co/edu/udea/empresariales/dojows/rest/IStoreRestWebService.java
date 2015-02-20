package co.edu.udea.empresariales.dojows.rest;

import java.util.List;

import co.edu.udea.empresariales.dojows.model.Store;

public interface IStoreRestWebService {

	public List<Store> findAll();

	public Store save(Store store);

	public Store update(Store store);
	
	public Store delete(String fullName);
}
