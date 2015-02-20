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
 * gesti&oacute;n de los datos de la entidad {@code Disposition}.
 * <p>
 * Esta clase ser&aacute; usada para realizar toda la persistencia relacionada
 * con la entidad {@code Disposition}.
 * <p>
 * Los m&eacute;todos definidos en esta clase realizan el almacenamiento y
 * contribuyen a la gesti&oacute;n segura de los atributos que se definen como
 * propiedades pertenecientes a la entidad D.T.O. {@code Disposition}.
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
public class Disposition implements IEntityContext, Serializable {

	/**
	 * Constante utilizada para realizar operaciones de serializaci&oacute;n y
	 * deserializaci&oacute;n de la instancia {@code Disposition}, e igualmente,
	 * de todos los atributos tanto primitivos como objetos y compuestos que
	 * esta instancia agrupe.
	 */
	private static final long serialVersionUID = 484357298541373912L;

	/**
	 * Atributo que representa los estados o las disposiciones por las cuales un
	 * determinado Dispositivo en el Sistema puede pasar o estar en un instante
	 * determinado del tiempo.
	 */
	private String name;

	/**
	 * Atributo que representa una breve descripci&oacute;n o detalles
	 * importantes referentes o pertenecientes al estado o disposici&oacute;n.
	 * Informaci&oacute;n al respecto de esta Disposici&oacute;n.
	 */
	private String description;

	/**
	 * Atributo que representa la asociaci&oacute;n o relaci&oacute;n con una
	 * lista de la entidad {@code DeviceStatuses}, la cual define la lista de
	 * Estado de los Dispositivo que tendr&aacute; asociado la instancia actual.
	 */
	private Set<DeviceStatus> deviceStatuses = new HashSet<DeviceStatus>(0);

	/**
	 * Constructor por defecto y sin par&aacute;metros para generar instancias
	 * de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	public Disposition() {
		super();
	}

	/**
	 * Constructor sobrecargado para generar instancias de esta clase utilizando
	 * todos los atributos obligatorios en el contexto de persistencia definido
	 * en la aplicaci&oacute;n.
	 */
	public Disposition(String name) {
		this.name = name;
	}

	/**
	 * Constructor sobrecargado para generar instancias de esta clase utilizando
	 * todos los atributos definidos para la entidad.
	 * <p>
	 * Este constructor acepta tanto los par&aacute;metros que son requeridos y
	 * no en el contexto de persistencia.
	 */
	public Disposition(String name, String description,
			Set<DeviceStatus> deviceStatuses) {
		this.name = name;
		this.description = description;
		this.deviceStatuses = deviceStatuses;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al atributo name.
	 * 
	 * @return Un objeto que representa el atributo name perteneciente a esta
	 *         entidad.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa el atributo name.
	 * 
	 * @param name
	 *            Nueva instancia del objeto que representa el atributo name
	 *            perteneciente a esta entidad.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al atributo description.
	 * 
	 * @return Un objeto que representa el atributo description perteneciente a
	 *         esta entidad.
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa el atributo description.
	 * 
	 * @param description
	 *            Nueva instancia del objeto que representa el atributo
	 *            description perteneciente a esta entidad.
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente a la lista de Estados por Dispositivo que tiene asociada
	 * esta entidad.
	 * 
	 * @return Un objeto que representa a una lista de Estados por Dispositivo
	 *         que tiene asociada esta entidad.
	 */
	@XmlTransient()
	public Set<DeviceStatus> getDeviceStatuses() {

		return (this.deviceStatuses);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia que corresponde
	 * a una lista de Estados por Dispositivo que tendr&aacute; asociada esta
	 * clase.
	 * 
	 * @param deviceStatuses
	 *            Nueva instancia del objeto que representa una lista de Estados
	 *            por Dispositivo que tendr&aacute; asociada esta entidad.
	 */
	public void setDeviceStatuses(Set<DeviceStatus> deviceStatuses) {
		this.deviceStatuses = deviceStatuses;
	}

	@Override()
	public String getKey() {

		return (this.getName());
	}

	@Override()
	public void setKey(Object key) {
		this.setName((String) key);
	}
}