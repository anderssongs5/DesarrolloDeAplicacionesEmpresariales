package co.edu.udea.we.mandl.persistence.dao.hibernate.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import co.edu.udea.we.mandl.model.dto.Client;
import co.edu.udea.we.mandl.model.dto.IEntityContext;
import co.edu.udea.we.mandl.persistence.dao.IClientDAO;
import co.edu.udea.we.mandl.persistence.dao.exception.MANDevicesLendingDAOException;

/**
 * Clase que define la implementaci&oacute;n espec&iacute;fica para los
 * m&eacute;todos de acceso al repositorio de datos y definidos en la interfaz
 * {@code IClientDAO}; por otra parte, esta clase hereda indirectamente de clase
 * definida en el framework <b>Spring MVC</b> llamada:
 * <code>HibernateDaoSupport</code>, dando de ese modo un soporte directo para
 * el acceso y gesti&oacute;n de los datos en el contexto de persistencia
 * definido en la aplicaci&oacute;n.
 * <p>
 * Esta clase implementar&aacute; los m&eacute;todos de acceso a los datos de
 * acuerdo al contexto de persistencia asociado a la aplicaci&oacute;n, en otras
 * palabras, realizar&aacute; las operaciones C.R.U.D. <i>Create Retrieve Update
 * Delete</i>, necesarias y &uacute;nicamente definidas, sobre la Base de Datos
 * a trav&eacute;s de un contexto de persistencia defindo por el framework
 * <b>Hibernate</b>.
 * <p>
 * Los m&eacute;todos expuestos para la gesti&oacute;n de los datos asociados a
 * las entidades pertencientes a la clase {@code Client}, son solo aquellos que
 * se han definido en la interfaz o prototipo {@code IClientDAO}; de ese modo,
 * esta clase se convierte en un D.A.O. <i>Data Access Object</i>, para
 * gestionar los datos de las entidades {@code Client}.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public class ClientDAOImpl extends AbstractEntityDAO implements IClientDAO {

	/**
	 * Constructor por defecto, sin par&aacute;metros, y &uacute;nico para
	 * generar instancias de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	public ClientDAOImpl() {
		super();
	}

	@Override()
	public List<Client> findByAttributes(Map<String, Object> parametersMap)
			throws MANDevicesLendingDAOException {
		List<Client> clientsFoundList = new ArrayList<Client>();
		List<IEntityContext> entitiesContextFoundList = super.findByAttributes(
				Client.class, parametersMap);

		for (IEntityContext entityContext : entitiesContextFoundList) {
			clientsFoundList.add((Client) entityContext);
		}

		return (clientsFoundList);
	}

	@Override()
	public Client save(Client client) throws MANDevicesLendingDAOException {
		String clientKey = (String) super.save(client);

		return ((clientKey != null) ? client : null);
	}

	@Override()
	public Client find(String clientKey) throws MANDevicesLendingDAOException {

		return ((Client) super.find(Client.class, clientKey));
	}

	@Override()
	public Client update(Client client) throws MANDevicesLendingDAOException {
		String clientKey = (String) super.update(client);

		return ((clientKey != null) ? client : null);
	}
}