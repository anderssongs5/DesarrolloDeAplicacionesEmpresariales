package co.edu.udea.empresariales.dojows.rest.impl;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import co.edu.udea.empresariales.dojows.dao.StoreDAO;
import co.edu.udea.empresariales.dojows.model.Store;
import co.edu.udea.empresariales.dojows.rest.IStoreRestWebService;

@Path(value = "/store")
@WebService(endpointInterface = "co.edu.udea.empresariales.dojows.rest.IStoreRestWebService")
public class StoreRestWebServices implements IStoreRestWebService {

	private StoreDAO storeDAO;

	public StoreRestWebServices() {
		this.storeDAO = new StoreDAO();
	}

	@Produces(value = { MediaType.APPLICATION_JSON })
	@GET()
	@Override
	public List<Store> findAll() {

		return (this.storeDAO.findAll());
	}

	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Override
	@POST()
	@Produces(value = { MediaType.APPLICATION_JSON })
	public Store save(Store store) {

		return (this.storeDAO.save(store));
	}

	@Consumes(value = { MediaType.APPLICATION_JSON })
	@Override
	@Produces(value = { MediaType.APPLICATION_JSON })
	@PUT()
	public Store update(Store store) {

		return (this.storeDAO.update(store));
	}

	@DELETE()
	@Produces(value = { MediaType.APPLICATION_JSON })
	@Override
	public Store delete(@QueryParam(value = "fullName") String fullName) {

		return (this.storeDAO.delete(fullName));
	}

}