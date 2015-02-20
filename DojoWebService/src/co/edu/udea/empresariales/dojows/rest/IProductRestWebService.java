package co.edu.udea.empresariales.dojows.rest;

import java.util.List;

import co.edu.udea.empresariales.dojows.model.Product;
import co.edu.udea.empresariales.dojows.model.Store;

public interface IProductRestWebService {

	public List<Store> findStore(String fullName);

	public Product find(String fullName);
}
