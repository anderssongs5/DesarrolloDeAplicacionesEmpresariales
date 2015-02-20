package co.edu.udea.empresariales.dojows.dao;

import java.util.ArrayList;
import java.util.List;

import co.edu.udea.empresariales.dojows.model.Product;
import co.edu.udea.empresariales.dojows.model.ProductByStore;
import co.edu.udea.empresariales.dojows.model.Store;

public class ProductDAO {

	public ProductDAO() {
		super();
	}

	// Buscar el producto con el nombre dado
	public Product find(String fullName) {
		for (Product product : DataStorageSingleton.PRODUCTS_LIST) {
			if (product.getFullName().equalsIgnoreCase(fullName)) {

				return (product);
			}
		}

		return (null);
	}

	// Buscar el listado de tiendas que tienen el producto con el nombre dado
	public List<Store> findStore(String fullName) {
		List<Store> storesList = new ArrayList<Store>();
		Product product = this.find(fullName);

		for (ProductByStore productByStore : product.getProductByStore()) {
			storesList.add(productByStore.getStore());
		}

		return ((storesList.isEmpty()) ? null : storesList);
	}
}