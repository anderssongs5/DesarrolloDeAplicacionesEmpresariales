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
 * gesti&oacute;n de los datos de la entidad {@code Device}.
 * <p>
 * Esta clase ser&aacute; usada para realizar toda la persistencia relacionada
 * con la entidad {@code Device}.
 * <p>
 * Los m&eacute;todos definidos en esta clase realizan el almacenamiento y
 * contribuyen a la gesti&oacute;n segura de los atributos que se definen como
 * propiedades pertenecientes a la entidad D.T.O. {@code Device}.
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
public class Device implements IEntityContext, Serializable {

	/**
	 * Constante utilizada para realizar operaciones de serializaci&oacute;n y
	 * deserializaci&oacute;n de los la instancia {@code Client}, e igualmente,
	 * de todos los atributos tanto primitivos como objetos y compuestos que
	 * esta instancia agrupe.
	 */
	private static final long serialVersionUID = 1628434357682201589L;
	/**
	 * Atributo que representa un valor entero que se autoincrementa por cada
	 * uno de los diversos Dispositivos registrados ante el sistema. Al
	 * autoincrementarse se asegura que cada valor nuevo generado es diferente y
	 * por ello, se nota como la Clave Primaria.
	 */
	private Long id;
	/**
	 * Atributo que representa el nombre completo del Dispositivo registrado
	 * ante el sistema. El nombre puede ser de gran magnitud para poder que este
	 * sea descriptivo y suficiente para identificar el Dispositivo.
	 */
	private String fullName;
	/**
	 * Atributo que representa si el Dispositivo asociado est&aacute; disponible
	 * o no para realizarse pr&eacute;stamos o mantimientos sobre este. Este
	 * atribuo cambia cuando se da de baja dicho Dispositivo ante el Sistema.
	 */
	private Boolean isAvailable;
	/**
	 * Atributo que representa una breve descripci&oacute;n o detalles
	 * importantes referentes o pertenecientes al Dispositivo o a su naturaleza.
	 * Informaci&oacute;n relevante y de inter&eacute;s respecto al Dispositivo
	 * en cuesti&oacute;n.
	 */
	private String description;
	/**
	 * Atributo que representa una ruta o direcci&oacute;n local, o un nombre
	 * del archivo, en el Servidor en la cual se podr&aacute; encontrar un
	 * archivo de imagen que describa gr&aacute;ficamente el Dispositivo
	 * asociado.
	 */
	private String photoImage;
	/**
	 * Atributo que representa una lista de todos los estados por los cuales el
	 * Dispositivo ha pasado durante su vida.
	 */
	private Set<DeviceStatus> deviceStatuses = new HashSet<DeviceStatus>(0);
	/**
	 * Atributo que representa una lista de todos las caracter&iacute;sticas o
	 * tipos que se han definido para el Dispositivo.
	 */
	private Set<DeviceKind> devicesKinds = new HashSet<DeviceKind>(0);

	/**
	 * Constructor por defecto y sin par&aacute;metros para generar instancias
	 * de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	public Device() {
		super();
	}

	/**
	 * Constructor sobrecargado para generar instancias de esta clase utilizando
	 * todos los atributos obligatorios en el contexto de persistencia definido
	 * en la aplicaci&oacute;n.
	 * 
	 * @param fullName
	 *            Representa el nombre completo y &uacute;nico asociado a la
	 *            instancia.
	 * @param isAvailable
	 *            Represeneta la disponibilidad asociada a la instancia.
	 */
	public Device(String fullName, Boolean isAvailable) {
		this.fullName = fullName;
		this.isAvailable = isAvailable;
	}

	/**
	 * Constructor sobrecargado para generar instancias de esta clase utilizando
	 * todos los atributos definidos para la entidad.
	 * <p>
	 * Este constructor acepta tanto los par&aacute;metros que son requeridos y
	 * no en el contexto de persistencia.
	 * 
	 * @param fullName
	 *            Representa el nombre completo y &uacute;nico asociado a la
	 *            instancia.
	 * @param isAvailable
	 *            Represeneta la disponibilidad asociada a la instancia.
	 * @param description
	 *            Atributo que representa una breve descripci&oacute;n sobre la
	 *            instancia.
	 * @param photoImage
	 *            Atributo que guarda la ruta de una determinada imagen asociada
	 *            a la instancia.
	 * @param deviceStatuses
	 *            Atributo que representa una lista de todos los estados por los
	 *            cuales la instancia a pasado.
	 * @param kinds
	 *            Atributo que representa una lista de todas las
	 *            caracter&iacute;sticas o tipos que se han definido para la
	 *            instacia.
	 */
	public Device(String fullName, Boolean isAvailable, String description,
			String photoImage, Set<DeviceStatus> deviceStatuses,
			Set<DeviceKind> devicesKinds) {
		this.fullName = fullName;
		this.isAvailable = isAvailable;
		this.description = description;
		this.photoImage = photoImage;
		this.deviceStatuses = deviceStatuses;
		this.devicesKinds = devicesKinds;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al atributo que se define como identificador &uacute;nico
	 * asociado a la instancia.
	 * 
	 * @return Un objeto que representa el identificador &uacute;nico asociado a
	 *         la entidad.
	 */
	public Long getId() {

		return (this.id);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa la informaci&oacute;n correspondiente al atributo que se
	 * define como identificador &uacute;nico asociado a la instancia.
	 * 
	 * @param id
	 *            Nueva instancia del objeto que representa el identificador
	 *            &uacute;nico asociado a la entidad.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al atributo que representa el nombre completo.
	 * 
	 * @return Un objeto que representa el nombre completo asociado a la
	 *         entidad.
	 */
	public String getFullName() {

		return (this.fullName);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa la informaci&oacute;n correspondiente al atributo que
	 * representa el nombre completo.
	 * 
	 * @param fullName
	 *            Nueva instancia del objeto que representa el nombre completo
	 *            asociado a la entidad.
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al atributo que representa la disponibilidad del
	 * dispositivo.
	 * 
	 * @return Un objeto que representa la disponibilidad asociada a la entidad.
	 */
	public Boolean isIsAvailable() {

		return (this.isAvailable);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa la informaci&oacute;n correspondiente al atributo que
	 * representa la disponibilidad del dispositivo.
	 * 
	 * @param isAvailable
	 *            Nueva instancia del objeto que representa la disponibilidad
	 *            asociada a la entidad.
	 */
	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al atributo que contiene una breve descripci&oacute;n
	 * sobre la instancia.
	 * 
	 * @return Un objeto que representa la breve descripci&oacute;n asociado a
	 *         la entidad.
	 */
	public String getDescription() {

		return (this.description);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa la informaci&oacute;n correspondiente al atributo que contiene
	 * una breve descripci&oacute;n sobre la instancia.
	 * 
	 * @param description
	 *            Nueva instancia del objeto que representa la breve
	 *            descripci&oacute;n asociado a la entidad.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al atributo que contiene una ruta de una imagen que
	 * define el dispositivo asociado a esta instancia.
	 * 
	 * @return Un objeto que representa la ruta de una imagen asociada a la
	 *         entidad.
	 */
	public String getPhotoImage() {

		return (this.photoImage);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa la informaci&oacute;n correspondiente al atributo que contiene
	 * una ruta de una imagen que define el dispositivo asociado a esta
	 * instancia.
	 * 
	 * @param photoImage
	 *            Nueva instancia del objeto que representa la ruta de una
	 *            imagen asociada a la entidad.
	 */
	public void setPhotoImage(String photoImage) {
		this.photoImage = photoImage;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al atributo que define la lista de todos los estados por
	 * los cuales ha pasado esta instancia.
	 * 
	 * @return Un objeto que representa la lista de todos los estados pasados
	 *         asociado a la entidad.
	 */
	@XmlTransient()
	public Set<DeviceStatus> getDeviceStatuses() {

		return (this.deviceStatuses);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa la informaci&oacute;n correspondiente al atributo que define
	 * la lista de todos los estados por los cuales ha pasado esta instancia.
	 * 
	 * @param deviceStatuses
	 *            Nueva instancia del objeto que representa la lista de todos
	 *            los estados pasados asociado a la entidad.
	 */
	public void setDeviceStatuses(Set<DeviceStatus> deviceStatuses) {
		this.deviceStatuses = deviceStatuses;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente a la lista que define todas las caracter&iacute;sticas o
	 * tipos de dispositivos asociados a la instancia.
	 * 
	 * @return Un objeto que representa la lista de todos los tipos asociados de
	 *         dispositivos a la entidad.
	 */
	public Set<DeviceKind> getDevicesKinds() {

		return (this.devicesKinds);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa la informaci&oacute;n correspondiente a la lista que define
	 * todas las caracter&iacute;sticas o tipos de dispositivos asociados a la
	 * instancia.
	 * 
	 * @param devicesKinds
	 *            Nueva instancia del objeto que representa la lista de todos
	 *            los tipos asociados de dispositivos a la entidad.
	 */
	public void setDevicesKinds(Set<DeviceKind> devicesKinds) {
		this.devicesKinds = devicesKinds;
	}

	@Override()
	public Long getKey() {

		return (this.getId());
	}

	@Override()
	public void setKey(Object key) {
		this.setId((Long) key);
	}
}