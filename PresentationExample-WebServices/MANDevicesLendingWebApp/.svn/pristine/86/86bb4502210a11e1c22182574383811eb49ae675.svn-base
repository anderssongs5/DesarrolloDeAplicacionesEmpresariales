package co.edu.udea.we.mandl.model.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase D.T.O. <i>Data Transfer Object</i> que representa el identificador
 * &uacute;nico de la entidad {@code DeviceKind}. La existencia de esta clase se
 * justifica en el hecho que dicho identificador est&aacute; compuesto por
 * m&aacute;s de un atributo; as&iacute; ser&aacute; utilizada en todo memento
 * que se persistan entidades tipo {@code DeviceKind}.
 * <p>
 * Los m&eacute;todos definidos en esta clase realizan el almacenamiento y
 * contribuyen a la gesti&oacute;n segura de los atributos que se definen como
 * propiedades pertenecientes a la entidad D.T.O. {@code DeviceKind}.
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
public class DeviceKindId implements Serializable {

	/**
	 * Constante utilizada para realizar operaciones de serializaci&oacute;n y
	 * deserializaci&oacute;n de los la instancia {@code Person}, e igualmente,
	 * de todos los atributos tanto primitivos como objetos y compuestos que
	 * esta instancia agrupe.
	 */
	private static final long serialVersionUID = -7311383510479843566L;
	/**
	 * Atributo que representa un valor entero que se autoincrementa por cada
	 * uno de los diversos Dispositivos registrados ante el sistema. Al
	 * autoincrementarse se asegura que cada valor nuevo generado es diferente y
	 * por ello, se nota como la Clave Primaria.
	 */
	private Long deviceId;
	/**
	 * Atributo que representa un tipo de Dispositivo que puede estar disponible
	 * para pr&eacute;stamos por medio del Sistema. Los tipos pueden darse por
	 * caracter&iacute;sticas globales de los Dispositivos.
	 */
	private String kind;

	/**
	 * Constructor por defecto y sin par&aacute;metros para generar instancias
	 * de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	public DeviceKindId() {
		super();
	}

	/**
	 * Constructor sobrecargado para generar instancias de esta clase utilizando
	 * todos los atributos obligatorios en el contexto de persistencia definido
	 * en la aplicaci&oacute;n.
	 * 
	 * @param id
	 *            Representa el n&uacute;mero de &uacute;nico asociado a la
	 *            instancia de la entidad {@code Device}.
	 * @param kind
	 *            Representa el tipo o caracter&iacute;stica asociado a la
	 *            instancia de la entidad {@code Kind}.
	 */
	public DeviceKindId(Long id, String kind) {
		this.deviceId = id;
		this.kind = kind;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al atributo que se define como identificador &uacute;nico
	 * asociado a la instancia {@code Device}.
	 * 
	 * @return Un objeto con la informaci&oacute;n referente al n&uacute;mero de
	 *         identificaci&oacute;n de la {@code Device}.
	 */
	public Long getDeviceId() {

		return (this.deviceId);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa la informaci&oacute;n correspondiente al atributo que se
	 * define como identificador &uacute;nico asociado a la instancia.
	 * 
	 * @param deviceId
	 *            Nueva instancia del objeto que representa el identificador
	 *            &uacute;nico asociado a la entidad.
	 */
	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
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

	@Override()
	public boolean equals(Object other) {
		if (this == other) {

			return (true);
		}

		if (other == null) {

			return (false);
		}

		if (!(other instanceof DeviceKindId)) {

			return (false);
		}

		DeviceKindId castOther = (DeviceKindId) other;

		return (((this.getKind() == castOther.getKind()) || (this.getKind() != null
				&& castOther.getKind() != null && this.getKind().equals(
				castOther.getKind()))) && ((this.getDeviceId() == castOther
				.getDeviceId()) || (this.getDeviceId() != null
				&& castOther.getDeviceId() != null && this.getDeviceId()
				.equals(castOther.getDeviceId()))));
	}

	@Override()
	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (this.getKind() == null ? 0 : this.getKind().hashCode());
		result = 37
				* result
				+ (this.getDeviceId() == null ? 0 : this.getDeviceId()
						.hashCode());

		return (result);
	}
}