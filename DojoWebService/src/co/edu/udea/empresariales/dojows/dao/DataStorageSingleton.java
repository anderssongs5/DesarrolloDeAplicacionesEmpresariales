package co.edu.udea.empresariales.dojows.dao;

import java.util.ArrayList;
import java.util.List;

import co.edu.udea.empresariales.dojows.model.Product;
import co.edu.udea.empresariales.dojows.model.ProductByStore;
import co.edu.udea.empresariales.dojows.model.Store;

final class DataStorageSingleton {

	public static final List<Store> STORES_LIST;
	public static final List<Product> PRODUCTS_LIST;

	static {
		STORES_LIST = new ArrayList<Store>();
		STORES_LIST.add(new Store("Almacenes Exito", "Carrera 1A #2B-3",
				2892001L, "almacenesexitos@exito.com",
				new ArrayList<ProductByStore>()));
		STORES_LIST.add(new Store("Almacenes Falabella", "Carrera 70 #27C-81",
				2658472L, "almacenes.falabella@falabella.com",
				new ArrayList<ProductByStore>()));
		STORES_LIST.add(new Store("Almacenes Flamingo", "Calle 10 #65-35",
				3684596L, "flamingo.almacenes@flamingo.com",
				new ArrayList<ProductByStore>()));
		STORES_LIST.add(new Store("Almacenes Carrefur", "Calle 45 #28A-31",
				2892031L, "almacenescarrefur@carrefur.com",
				new ArrayList<ProductByStore>()));
		STORES_LIST.add(new Store("Hipermercado Euro", "Carrera 15 #29-62",
				5478231L, "almacenes.falabella@falabella.com",
				new ArrayList<ProductByStore>()));
		STORES_LIST.add(new Store("Almacenes Home Center", "Calle 50 #3A-35",
				58716549L, "homcenter.almacenes@homcenter.com",
				new ArrayList<ProductByStore>()));

		PRODUCTS_LIST = new ArrayList<Product>();
		PRODUCTS_LIST.add(new Product("Yogourt",
				"Producto lacteo a base de frutas", 25.04F, "Colanta",
				new ArrayList<ProductByStore>()));
		PRODUCTS_LIST
				.add(new Product("Arroz", "Arroz Roa, el arroz de las senioras",
						19.30F, "Distribuidora de Arroz LTDA",
						new ArrayList<ProductByStore>()));
		PRODUCTS_LIST.add(new Product("Detergente",
				"Detergente con aroma a limon", 8.00F, "P&G",
				new ArrayList<ProductByStore>()));
		PRODUCTS_LIST.add(new Product("Shampoo", "Shampoo con savila",
				15.55F, "P&G", new ArrayList<ProductByStore>()));
		PRODUCTS_LIST.add(new Product("Nevera", "Nevera Haceb", 500.23F,
				"Haceb S.A.", new ArrayList<ProductByStore>()));
		PRODUCTS_LIST.add(new Product("Jabon",
				"Jabon de avena para todo el cuerpo.", 12.34F, "Palmolive",
				new ArrayList<ProductByStore>()));

		int size = PRODUCTS_LIST.size();
		for (Store store : STORES_LIST) {
			for (int i = 0; i < 4; i++) {
				int position = (int) (Math.random() * size);
				if (position == size) {
					position--;
				}

				Product product = PRODUCTS_LIST.get(position);
				ProductByStore productByStore = new ProductByStore(store,
						product, position, Double.MAX_VALUE / position);

				product.getProductByStore().add(productByStore);
				store.getProductByStoreList().add(productByStore);
			}
		}
	}

	public DataStorageSingleton() {
		super();
	}
}