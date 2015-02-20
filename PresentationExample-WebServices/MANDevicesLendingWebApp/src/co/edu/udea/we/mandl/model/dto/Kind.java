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
 * gesti&oacute;n de los datos de la entidad {@code Kind}.
 * <p>
 * Esta clase ser&aacute; usada para realizar toda la persistencia relacionada
 * con la entidad {@code Kind}.
 * <p>
 * Los m&eacute;todos definidos en esta clase realizan el almacenamiento y
 * contribuyen a la gesti&oacute;n segura de los atributos que se definen como
 * propiedades pertenecientes a la entidad D.T.O. {@code Kind}.
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
public class Kind implements IEntityContext, Serializable {

	/**
	 * Constante utilizada para realizar operaciones de serializaci&oacute;n y
	 * deserializaci&oacute;n de la instancia {@code Kind}, e igualmente, de
	 * todos los atributos tanto primitivos como objetos y compuestos que esta
	 * instancia agrupe.
	 */
	private static final long serialVersionUID = 636100376695621510L;

	/**
	 * Atributo que representa un tipo de Dispositivo que puede estar disponible
	 * para pr&eacute;stamos por medio del Sistema. Los tipos pueden darse por
	 * caracter&iacute;sticas globales de los Dispositivos.
	 */
	private String kind;

	/**
	 * Atributo que representa una breve descripci&oacute;n o detalles
	 * imporatantes references o pertenecientes al Tipo de Dispositivo o a su
	 * naturaleza. Informaci&oacute;n relevante y de inter&eacute;s respecto al
	 * Tipo de Dispositivo en cuesti&oacute;n.
	 */
	private String description;

	/**
	 * Atributo que representa la asociaci&oacute;n o relaci&oacute;n con una
	 * lista de la entidad {@code DeviceKind}, la cual define la lista de
	 * instancias que representan qu&eacute; Dispositivo tienen asociado la
	 * instancia actual.
	 */
	private Set<DeviceKind> devicesKinds = new HashSet<DeviceKind>(0);

	/**
	 * Constructor por defecto y sin par&aacute;metros para generar instancias
	 * de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	public Kind() {
		super();
	}

	/**
	 * Constructor sobrecargado para generar instancias de esta clase utilizando
	 * todos los atributos obligatorios en el contexto de persistencia definido
	 * en la aplicaci&oacute;n.
	 */
	public Kind(String kind) {
		this.kind = kind;
	}

	/**
	 * Constructor sobrecargado para generar instancias de esta clase utilizando
	 * todos los atributos definidos para la entidad.
	 * <p>
	 * Este constructor acepta tanto los par&aacute;metros que son requeridos y
	 * no en el contexto de persistencia.
	 */
	public Kind(String kind, String description, Set<DeviceKind> devicesKinds) {
		this.kind = kind;
		this.description = description;
		this.devicesKinds = devicesKinds;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al atributo que representa el tipo de Dispositivo.
	 * 
	 * @return Un objeto que representa el atributo kind perteneciente a esta
	 *         entidad.
	 */
	public String getKind() {

		return (this.kind);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa el atributo de tipo de Dispositivo.
	 * 
	 * @param kind
	 *            Nueva instancia del objeto que representa el atributo kind
	 *            perteneciente a esta entidad.
	 */
	public void setKind(String kind) {
		this.kind = kind;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al atributo description.
	 * 
	 * @return Un objeto que representa el atributo description perteneciente a
	 *         esta entidad.
	 */
	public String getDescription() {

		return (this.description);
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
	 * correspondiente a la lista de {@code DeviceKind} que representa los
	 * Dispositivos que tienen asociada esta entidad.
	 * 
	 * @return Un objeto que representa a una lista de {@code DeviceKind} que
	 *         tiene asociada esta entidad.
	 */
	@XmlTransient()
	public Set<DeviceKind> getDevicesKinds() {

		return (this.devicesKinds);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia que corresponde
	 * a una lista de {@code DeviceKind}.
	 * 
	 * @param devicesKinds
	 *            Nueva instancia del objeto que representa una lista de
	 *            {@code DeviceKind} que tendr&aacute; asociada esta entidad.
	 */
	public void setDevicesKinds(Set<DeviceKind> devicesKinds) {
		this.devicesKinds = devicesKinds;
	}

	@Override()
	public String getKey() {

		return (this.getKind());
	}

	@Override()
	public void setKey(Object key) {
		this.setKey((String) key);
	}
}