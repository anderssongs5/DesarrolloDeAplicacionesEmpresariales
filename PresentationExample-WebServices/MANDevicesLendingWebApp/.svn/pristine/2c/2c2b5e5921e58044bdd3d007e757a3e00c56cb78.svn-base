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
 * gesti&oacute;n de los datos de la entidad {@code Person}. Representa a las
 * personas que son registradas en el sistema.
 * <p>
 * Esta clase ser&aacute; usada para realizar toda la persistencia relacionada
 * con la entidad {@code Person}.
 * <p>
 * Los m&eacute;todos definidos en esta clase realizan el almacenamiento y
 * contribuyen a la gesti&oacute;n segura de los atributos que se definen como
 * propiedades pertenecientes a la entidad D.T.O. {@code Person}.
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
public class Person implements IEntityContext, Serializable {

	/**
	 * Constante utilizada para realizar operaciones de serializaci&oacute;n y
	 * deserializaci&oacute;n de los la instancia {@code Person}, e igualmente,
	 * de todos los atributos tanto primitivos como objetos y compuestos que
	 * esta instancia agrupe.
	 */
	private static final long serialVersionUID = 7889776508363444117L;
	/**
	 * Atributo que representa el identificador &uacute;nico de la entidad. Se
	 * presenta debido a que dicho identificador es compuesto.
	 */
	private PersonId id;
	/**
	 * Atributo que representa todos los primeros nombres personales por los
	 * cuales la persona se pueda identificar.
	 */
	private String firstNames;
	/**
	 * Atributo que representa todos los apellidos asociados al nombre completo
	 * y por los cuales la persona se pueda identificar.
	 */
	private String lastNames;
	/**
	 * Atributo que representa el listado de entidades tipo {@code Client} que
	 * est&aacute; asociado a la instancia actual.
	 */
	private Set<Client> clients = new HashSet<Client>(0);

	/**
	 * Constructor por defecto y sin par&aacute;metros para generar instancias
	 * de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	public Person() {
		super();
	}

	/**
	 * Constructor sobrecargado para generar instancias de esta clase utilizando
	 * todos los atributos obligatorios en el contexto de persistencia definido
	 * en la aplicaci&oacute;n.
	 * 
	 * @param id
	 *            Representa el identificador &uacute;nico para la instancia.
	 * @param firstNames
	 *            Representa todos los primeros nombres personales por los
	 *            cuales la persona se pueda identificar.
	 * @param lastNames
	 *            Representa todos los apellidos asociados al nombre completo y
	 *            por los cuales la persona se pueda identificar.
	 */
	public Person(PersonId id, String firstNames, String lastNames) {
		this.id = id;
		this.firstNames = firstNames;
		this.lastNames = lastNames;
	}

	/**
	 * Constructor sobrecargado para generar instancias de esta clase utilizando
	 * todos los atributos definidos para la entidad.
	 * <p>
	 * Este constructor acepta tanto los par&aacute;metros que son requeridos y
	 * no en el contexto de persistencia.
	 * 
	 * @param id
	 *            Representa el identificador &uacute;nico para la instancia.
	 * @param firstNames
	 *            Representa todos los primeros nombres personales por los
	 *            cuales la persona se pueda identificar.
	 * @param lastNames
	 *            Representa todos los apellidos asociados al nombre completo y
	 *            por los cuales la persona se pueda identificar.
	 * @param clients
	 *            Representa el listado de entidades {@code Client} asociadas a
	 *            la instancia actual.
	 */
	public Person(PersonId id, String firstNames, String lastNames,
			Set<Client> clients) {
		this.id = id;
		this.firstNames = firstNames;
		this.lastNames = lastNames;
		this.clients = clients;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al identificador &uacute;nico asociado a la instancia.
	 * 
	 * @return Un objeto que representa el identificador &uacute;nico
	 *         relacionado con la instancia.
	 */
	public PersonId getId() {

		return (this.id);
	}

	/**
	 * M&eacute;todo para establecer la informac&oacute;n correspondiente al
	 * identificador &uacute;nico asociado a esta instancia.
	 * 
	 * @param id
	 *            Representa el objeto que contiene el identificador
	 *            &uacute;nico para la instancia.
	 */
	public void setId(PersonId id) {
		this.id = id;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente a los primeros nombres de la persona en la instancia
	 * actual.
	 * 
	 * @return Un objeto que representa los primeros nombres de la persona.
	 */
	public String getFirstNames() {
		return this.firstNames;
	}

	/**
	 * M&eacute;todo para establecer la informac&oacute;n correspondiente a los
	 * primeros nombres de la persona representada por esta instancia.
	 * 
	 * @param firstNames
	 *            Representa los primeros nombres de la persona.
	 */
	public void setFirstNames(String firstNames) {
		this.firstNames = firstNames;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente a los apellidos de la persona en la instancia actual.
	 * 
	 * @return Un objeto que representa los apellidos de la persona.
	 */
	public String getLastNames() {
		return this.lastNames;
	}

	/**
	 * M&eacute;todo para establecer la informac&oacute;n correspondiente a los
	 * apellidos de la persona representada por esta instancia.
	 * 
	 * @param lastNames
	 *            Representa los apellidos de la persona.
	 */
	public void setLastNames(String lastNames) {
		this.lastNames = lastNames;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al listado de entidades {@code Client} asociados a la
	 * persona representada en la instancia actual.
	 * 
	 * @return Un objeto tipo lista que contiene todas las entidades
	 *         {@code Client} asociadas a la persona.
	 */
	public Set<Client> getClients() {

		return (this.clients);
	}

	/**
	 * M&eacute;todo para establecer la informac&oacute;n correspondiente al
	 * listado de entidades {@code Client} asociados a la persona representada
	 * por esta instancia.
	 * 
	 * @param clients
	 *            Representa el listado de entidades tipo {@code Client}
	 *            asociadas a la persona.
	 */
	@XmlTransient()
	public void setClients(Set<Client> clients) {
		this.clients = clients;
	}

	@Override()
	public PersonId getKey() {

		return (this.getId());
	}

	@Override()
	public void setKey(Object key) {
		this.setId((PersonId) key);
	}
}