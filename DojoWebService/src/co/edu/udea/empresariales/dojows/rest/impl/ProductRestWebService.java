package co.edu.udea.empresariales.dojows.rest.impl;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import co.edu.udea.empresariales.dojows.dao.ProductDAO;
import co.edu.udea.empresariales.dojows.model.Product;
import co.edu.udea.empresariales.dojows.model.Store;
import co.edu.udea.empresariales.dojows.rest.IProductRestWebService;

@Path(value = "/product")
@WebService(endpointInterface = "co.edu.udea.empresariales.dojows.rest.IProductRestWebService")
public class ProductRestWebService implements IProductRestWebService {

	private ProductDAO productDAO;

	public ProductRestWebService() {
		this.productDAO = new ProductDAO();
	}

	@Path(value = "/stores/{fullName}")
	@Produces(value = { MediaType.APPLICATION_JSON })
	@Override
	@GET()
	public List<Store> findStore(@PathParam(value = "fullName") String fullName) {

		return (this.productDAO.findStore(fullName));
	}

	@Produces(value = { MediaType.APPLICATION_JSON })
	@Override
	@GET()
	public Product find(@QueryParam(value = "fullName") String fullName) {

		return (this.productDAO.find(fullName));
	}
}