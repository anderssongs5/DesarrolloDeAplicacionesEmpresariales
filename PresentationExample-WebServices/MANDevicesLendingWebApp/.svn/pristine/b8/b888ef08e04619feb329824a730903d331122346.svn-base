package co.edu.udea.we.mandl.model.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * Clase D.T.O. <i>Data Transfer Object</i> que implementa la interfaz
 * {@code IEntityContext} definida para establecer un contexto para permitir la
 * gesti&oacute;n de los datos de la entidad {@code Profile}. Representa a los
 * perfiles o roles de usuario que pueden tomar los actores que
 * interact&uacute;an con el sistema.
 * <p>
 * Esta clase ser&aacute; usada para realizar toda la persistencia relacionada
 * con la entidad {@code Profile}.
 * <p>
 * Los m&eacute;todos definidos en esta clase realizan el almacenamiento y
 * contribuyen a la gesti&oacute;n segura de los atributos que se definen como
 * propiedades pertenecientes a la entidad D.T.O. {@code Profile}.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
@XmlAccessorType(value = XmlAccessType.PROPERTY)
@XmlRootElement()
public class Profile implements IEntityContext, Serializable {

	/**
	 * Constante utilizada para realizar operaciones de serializaci&oacute;n y
	 * deserializaci&oacute;n de los la instancia {@code Profile}, e igualmente,
	 * de todos los atributos tanto primitivos como objetos y compuestos que
	 * esta instancia agrupe.
	 */
	private static final long serialVersionUID = -1019023473054808991L;
	/**
	 * Atributo que representa el nombre del perfil que pueden ser asignados a
	 * las entidades {@code Person} cuando crean una cuenta en el Sistema.
	 * Gracias a este atributo se pueden identificar los diversos roles.
	 */
	private String profile;
	/**
	 * Atributo que representa una breve descripci&oacute;n o detalles
	 * importantes referentes al perfil o rol asociado.
	 */
	private String description;
	/**
	 * Atributo que representa la asociaci&oacute;n o relaci&oacute;n con la
	 * entidad {@code Client}, la cual define el listado de clientes que tiene
	 * asociado la instancia actual.
	 */
	private Set<Client> clients = new HashSet<Client>(0);

	/**
	 * Constructor por defecto y sin par&aacute;metros para generar instancias
	 * de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	public Profile() {
		super();
	}

	/**
	 * Constructor sobrecargado para generar instancias de esta clase utilizando
	 * todos los atributos obligatorios en el contexto de persistencia definido
	 * en la aplicaci&oacute;n.
	 * 
	 * @param profile
	 *            Representa el nombre del perfil o rol de usuario.
	 */
	public Profile(String profile) {
		this.profile = profile;
	}

	/**
	 * Constructor sobrecargado para generar instancias de esta clase utilizando
	 * todos los atributos definidos para la entidad.
	 * <p>
	 * Este constructor acepta tanto los par&aacute;metros que son requeridos y
	 * no en el contexto de persistencia.
	 * 
	 * @param profile
	 *            Representa el nombre del perfil o rol de usuario.
	 * @param description
	 *            Representa una breve descripci&oacute;n referente al perfil o
	 *            rol asociado.
	 * @param clients
	 *            Representa la asociaci&oacute;n con la entidad {@code Client},
	 *            la cual define el listado de clientes que tiene asociado la
	 *            instancia actual.
	 */
	public Profile(String profile, String description, Set<Client> clients) {
		this.profile = profile;
		this.description = description;
		this.clients = clients;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al nombre del perfil.
	 * 
	 * @return Un objeto que representa el nombre del perfil definido par la
	 *         entidad.
	 */
	public String getProfile() {
		return this.profile;
	}

	/**
	 * M&eacute;todo para establecer la informac&oacute;n correspondiente al
	 * nombre del perfil.
	 * 
	 * @param profile
	 *            Representa el nombre del perfil o rol de usuario.
	 */
	public void setProfile(String profile) {
		this.profile = profile;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente a la descripci&oacute;n del perfil o rol de usuario.
	 * 
	 * @return Un objeto que representa la descripci&oacute;n del perfil
	 *         definido para la entidad.
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * M&eacute;todo para establecer la informac&oacute;n correspondiente a la
	 * descripci&oacute;n del perfil.
	 * 
	 * @param description
	 *            Representa una breve descripci&oacute;n referente al perfil o
	 *            rol asociado.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente a listado de clientes que tienen asociado esta instancia.
	 * 
	 * @return Un objeto tipo lista que contiene el conjunto de instancias
	 *         {@code Client} que tienen asociado esta instancia.
	 */
	@XmlTransient()
	public Set<Client> getClients() {

		return (this.clients);
	}

	/**
	 * M&eacute;todo para establecer la informac&oacute;n correspondiente a la
	 * al listado de entidades {@code Client} que est&aacute; asociado con esta
	 * instancia.
	 * 
	 * @param clients
	 *            Listado de entidades {@code Client} asociados a esta
	 *            instancia.
	 */
	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

	@Override()
	public String getKey() {

		return (this.getProfile());
	}

	@Override()
	public void setKey(Object key) {
		this.setProfile((String) key);
	}
}