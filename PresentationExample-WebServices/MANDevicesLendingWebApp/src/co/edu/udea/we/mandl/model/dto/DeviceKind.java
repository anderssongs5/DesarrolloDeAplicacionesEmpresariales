package co.edu.udea.we.mandl.model.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase D.T.O. <i>Data Transfer Object</i> que implementa la interfaz
 * {@code IEntityContext} definida para establecer un contexto para permitir la
 * gesti&oacute;n de los datos de la entidad {@code DeviceKind}. Representa a
 * las personas que son registradas en el sistema.
 * <p>
 * Esta clase ser&aacute; usada para realizar toda la persistencia relacionada
 * con la entidad {@code DeviceKind}.
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
public class DeviceKind implements IEntityContext, Serializable {

	/**
	 * Constante utilizada para realizar operaciones de serializaci&oacute;n y
	 * deserializaci&oacute;n de los la instancia {@code Person}, e igualmente,
	 * de todos los atributos tanto primitivos como objetos y compuestos que
	 * esta instancia agrupe.
	 */
	private static final long serialVersionUID = -640366336436722813L;
	/**
	 * Atributo que representa el identificador &uacute;nico de la entidad. Se
	 * presenta debido a que dicho identificador es compuesto.
	 */
	private DeviceKindId id;

	/**
	 * Constructor por defecto y sin par&aacute;metros para generar instancias
	 * de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	public DeviceKind() {
		super();
	}

	/**
	 * Constructor sobrecargado para generar instancias de esta clase utilizando
	 * todos los atributos obligatorios en el contexto de persistencia definido
	 * en la aplicaci&oacute;n.
	 * 
	 * @param id
	 *            Representa el identificador &uacute;nico para la instancia.
	 */
	public DeviceKind(DeviceKindId id) {
		this.id = id;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al identificador &uacute;nico asociado a la instancia.
	 * 
	 * @return Un objeto que representa el identificador &uacute;nico
	 *         relacionado con la instancia.
	 */
	public DeviceKindId getId() {

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
	public void setId(DeviceKindId id) {
		this.id = id;
	}

	@Override()
	public DeviceKindId getKey() {

		return (this.getId());
	}

	@Override()
	public void setKey(Object key) {
		this.setId((DeviceKindId) key);
	}
}