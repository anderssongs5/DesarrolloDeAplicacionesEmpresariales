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
 * gesti&oacute;n de los datos de la entidad {@code Client}.
 * <p>
 * Esta clase ser&aacute; usada para realizar toda la persistencia relacionada
 * con la entidad {@code Client}.
 * <p>
 * Los m&eacute;todos definidos en esta clase realizan el almacenamiento y
 * contribuyen a la gesti&oacute;n segura de los atributos que se definen como
 * propiedades pertenecientes a la entidad D.T.O. {@code Client}.
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
public class Client implements IEntityContext, Serializable {

	/**
	 * Constante utilizada para realizar operaciones de serializaci&oacute;n y
	 * deserializaci&oacute;n de la instancia {@code Client}, e igualmente, de
	 * todos los atributos tanto primitivos como objetos y compuestos que esta
	 * instancia agrupe.
	 */
	private static final long serialVersionUID = -2508497574560299781L;
	/**
	 * Atributo que representa la direcci&oacute;n de Correo Electr&oacute;nico
	 * que hace la funci&oacute;n de un nombre de usuario &uacute;nico asociado
	 * a cada una de las Personas que deseen utilizar los servicios de la
	 * aplicaci&oacute;n.
	 */
	private String email;
	/**
	 * Atributo que representa la asociaci&oacute;n o relaci&oacute;n con la
	 * entidad {@code Profile}, la cual define el perfil de usuario que
	 * tendr&aacute; asociado la instancia actual.
	 */
	private Profile profile;
	/**
	 * Atributo que representa la asociaci&oacute;n o relaci&oacute;n con la
	 * entidad {@code Person}, la cual define la persona que tendr&aacute;
	 * asociado la instancia actual.
	 */
	private Person person;
	/**
	 * Atributo que representa la Clave o Contrase&ntilde;a asociada a la Cuenta
	 * de Usuario de cada uno de las Personas.
	 */
	private String password;
	/**
	 * Atributo que representa el N&uacute;mero Telef&oacute;nico del
	 * dispositivo m&oacute;vil o celular de la Persona que tenga cuenta
	 * asociada al Sistema.
	 */
	private String mobilePhoneNumber;
	/**
	 * Atributo que representa el N&uacute;mero Telef&oacute;nico de la casa u
	 * hogar en la cual habita la Persona que tenga cuenta asociada al Sistema.
	 */
	private String homePhoneNumber;
	/**
	 * Atributo que representa la asociaci&oacute;n o relaci&oacute;n con la
	 * entidad {@code DeviceStatus}, la cual define el historial de todos los
	 * dispositivos que han sido requeridos en alg&uacute;n momento por la
	 * instancia actual.
	 */
	private Set<DeviceStatus> deviceStatuses = new HashSet<DeviceStatus>(0);

	/**
	 * Constructor por defecto y sin par&aacute;metros para generar instancias
	 * de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	public Client() {
		super();
	}

	/**
	 * Constructor sobrecargado para generar instancias de esta clase utilizando
	 * todos los atributos obligatorios en el contexto de persistencia definido
	 * en la aplicaci&oacute;n.
	 * 
	 * @param email
	 *            Representa el Correo Electr&oacute;nico para la instancia.
	 * @param profile
	 *            Representa el objeto que define el perfil para la instancia.
	 * @param person
	 *            Representa el objeto que define la persona para a la
	 *            instancia.
	 * @param password
	 *            Representa la clave o contrase&ntilde;a para a la instancia.
	 */
	public Client(String email, Profile profile, Person person, String password) {
		this.email = email;
		this.profile = profile;
		this.person = person;
		this.password = password;
	}

	/**
	 * Constructor sobrecargado para generar instancias de esta clase utilizando
	 * todos los atributos definidos para la entidad.
	 * <p>
	 * Este constructor acepta tanto los par&aacute;metros que son requeridos y
	 * no en el contexto de persistencia.
	 * 
	 * @param email
	 *            Representa el Correo Electr&oacute;nico para la instancia.
	 * @param profile
	 *            Representa el objeto que define el perfil para la instancia.
	 * @param person
	 *            Representa el objeto que define la persona para a la
	 *            instancia.
	 * @param password
	 *            Representa la clave o contrase&ntilde;a para a la instancia.
	 * @param mobilePhoneNumber
	 *            Representa el N&uacute;mero Telef&oacute;nico del dispositivo
	 *            m&oacute;vil o celular.
	 * @param homePhoneNumber
	 *            Representa el N&uacute;mero Telef&oacute;nico del hogar o
	 *            casa.
	 * @param deviceStatuses
	 *            Representa una lista de todos los dispositivos que han tenido
	 *            interacci&oacute;n con esta instancia.
	 */
	public Client(String email, Profile profile, Person person,
			String password, String mobilePhoneNumber, String homePhoneNumber,
			Set<DeviceStatus> deviceStatuses) {
		this.email = email;
		this.profile = profile;
		this.person = person;
		this.password = password;
		this.mobilePhoneNumber = mobilePhoneNumber;
		this.homePhoneNumber = homePhoneNumber;
		this.deviceStatuses = deviceStatuses;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al atributo Correo Electr&oacute;nico.
	 * 
	 * @return Un objeto que representa el Correo Electr&oacute;nico asociado a
	 *         la entidad.
	 */
	public String getEmail() {

		return (this.email);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa la informaci&oacute;n correspondiente al atributo Correo
	 * Electr&oacute;nico.
	 * 
	 * @param email
	 *            Nueva instancia del objeto que representa el Correo
	 *            Electr&oacute;nico asociado a la entidad.
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al atributo que define el perfil o rol de usuario.
	 * 
	 * @return Un objeto que representa el perfil o rol de usuario asociado a la
	 *         entidad.
	 */
	public Profile getProfile() {

		return (this.profile);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa la informaci&oacute;n correspondiente al atributo que define
	 * el perfil o rol de usuario.
	 * 
	 * @param profile
	 *            Nueva instancia del objeto que representa el perfil o rol de
	 *            usuario asociado a la entidad.
	 */
	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al atributo que define la persona asociada a la entidad.
	 * 
	 * @return Un objeto que representa la persona asociada a la entidad.
	 */
	public Person getPerson() {

		return (this.person);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa la informaci&oacute;n correspondiente al atributo que define
	 * la persona asociada a la entidad.
	 * 
	 * @param person
	 *            Nueva instancia del objeto que representa la persona asociada
	 *            a la entidad.
	 */
	public void setPerson(Person person) {
		this.person = person;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al atributo que define la clave o contrase&ntilde;a.
	 * 
	 * @return Un objeto que representa la contrase&ntilde;a o clave asociado a
	 *         la entidad.
	 */
	public String getPassword() {

		return (this.password);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa la informaci&oacute;n correspondiente al atributo que define
	 * la clave o contrase&ntilde;a.
	 * 
	 * @param password
	 *            Nueva instancia del objeto que representa la contrase&ntilde;a
	 *            o clave asociado a la entidad.
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al atributo que define el N&uacute;mero Telef&oacute;nico
	 * del dispositivo m&oacute;vil o celular asociado a la entidad.
	 * 
	 * @return Un objeto que representa el N&uacute;mero Telef&oacute;nico
	 *         m&oacute;vil asociado a la entidad.
	 */
	public String getMobilePhoneNumber() {

		return (this.mobilePhoneNumber);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa la informaci&oacute;n correspondiente al atributo que define
	 * el N&uacute;mero Telef&oacute;nico del dispositivo m&oacute;vil o celular
	 * asociado a la entidad.
	 * 
	 * @param mobilePhoneNumber
	 *            Nueva instancia del objeto que representa el N&uacute;mero
	 *            Telef&oacute;nico m&oacute;vil asociado a la entidad.
	 */
	public void setMobilePhoneNumber(String mobilePhoneNumber) {
		this.mobilePhoneNumber = mobilePhoneNumber;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al atributo que define el N&uacute;mero Telef&oacute;nico
	 * del hogar o casa asociado a la entidad.
	 * 
	 * @return Un objeto que representa el N&uacute;mero Telef&oacute;nico del
	 *         hogar o casa asociado a la entidad.
	 */
	public String getHomePhoneNumber() {

		return (this.homePhoneNumber);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa la informaci&oacute;n correspondiente al atributo que define
	 * el N&uacute;mero Telef&oacute;nico del hogar o casa asociado a la
	 * entidad.
	 * 
	 * @param homePhoneNumber
	 *            Nueva instancia del objeto que representa el N&uacute;mero
	 *            Telef&oacute;nico del hogar o casa asociado a la entidad.
	 */
	public void setHomePhoneNumber(String homePhoneNumber) {
		this.homePhoneNumber = homePhoneNumber;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al atributo que define la lista de estados por la cual la
	 * instancia ha pasado con anterioridad.
	 * 
	 * @return Un objeto que representa el listado de estados pasados asociado a
	 *         la entidad.
	 */
	@XmlTransient()
	public Set<DeviceStatus> getDeviceStatuses() {

		return (this.deviceStatuses);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al atributo que
	 * define la lista de estados por la cual la instancia ha pasado con
	 * anterioridad.
	 * 
	 * @param deviceStatuses
	 *            Nueva instancia del objeto que representa el listado de
	 *            estados pasados asociado a la entidad
	 */
	public void setDeviceStatuses(Set<DeviceStatus> deviceStatuses) {
		this.deviceStatuses = deviceStatuses;
	}

	@Override()
	public String getKey() {

		return (this.getEmail());
	}

	@Override()
	public void setKey(Object key) {
		this.setEmail((String) key);
	}
}