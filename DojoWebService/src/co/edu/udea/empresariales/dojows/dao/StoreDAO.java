package co.edu.udea.empresariales.dojows.dao;

import java.util.List;

import co.edu.udea.empresariales.dojows.model.Store;

public class StoreDAO {

	public StoreDAO() {
		super();
	}

	// Eliminar Store
	public Store delete(String fullName) {
		Store store = this.findByName(fullName);

		if (store != null) {
			DataStorageSingleton.STORES_LIST.remove(store);
		}

		return (store);
	}

	public List<Store> findAll() {

		return (DataStorageSingleton.STORES_LIST);
	}

	// Encontrar Store por su nombre
	public Store findByName(String fullName) {
		for (Store store : DataStorageSingleton.STORES_LIST) {
			if (store.getFullName().equalsIgnoreCase(fullName)) {

				return (store);
			}
		}

		return (null);
	}

	// Guardar Store
	public Store save(Store store) {
		DataStorageSingleton.STORES_LIST.add(store);

		return (store);
	}

	// Actualizar Store
	public Store update(Store store) {
		Store storeFound = this.findByName(store.getFullName());

		if (storeFound != null) {
			storeFound.setAddress(store.getAddress());
			storeFound.setElectronicMail(store.getElectronicMail());
			storeFound.setPhoneNumber(store.getPhoneNumber());
		}

		return (storeFound);
	}
}