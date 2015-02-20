package co.edu.udea.we.mandl.model.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase D.T.O. <i>Data Transfer Object</i> que representa el identificador
 * &uacute;nico de la entidad {@code Person}. La existencia de esta clase se
 * justifica en el hecho que dicho identificador est&aacute; compuesto por
 * m&aacute;s de un atributo; as&iacute; ser&aacute; utilizada en todo memento
 * que se persistan entidades tipo {@code Person}.
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
public class PersonId implements Serializable {

	/**
	 * Constante utilizada para realizar operaciones de serializaci&oacute;n y
	 * deserializaci&oacute;n de los la instancia {@code PersonId}, e
	 * igualmente, de todos los atributos tanto primitivos como objetos y
	 * compuestos que esta instancia agrupe.
	 */
	private static final long serialVersionUID = -2828216788433606031L;
	/**
	 * Atributo que representa el n&uacute;mero de identificaci&oacute;n
	 * asociado al tipo de documento perteneciente a la persona que haga parte
	 * del sistema.
	 */
	private String idNumber;
	/**
	 * Atribuo que representa el tipo de documento de identidad que la persona
	 * tenga asociado al momento de crear una cuenta en el Sistema.
	 */
	private String documentType;

	/**
	 * Constructor por defecto y sin par&aacute;metros para generar instancias
	 * de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	public PersonId() {
		super();
	}

	/**
	 * Constructor sobrecargado para generar instancias de esta clase utilizando
	 * todos los atributos obligatorios en el contexto de persistencia definido
	 * en la aplicaci&oacute;n.
	 * 
	 * @param idNumber
	 *            Representa el n&uacute;mero de identificaci&oacute;n asociado
	 *            a la instancia de la entidad {@code Person}.
	 * @param documentType
	 *            Representa el tipo de documento de identidad asociado a la
	 *            instancia de la entidad {@code Person}.
	 */
	public PersonId(String idNumber, String documentType) {
		this.idNumber = idNumber;
		this.documentType = documentType;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al n&uacute;mero de identificaci&oacute;n de la persona
	 * en la instancia de tipo {@code Person}.
	 * 
	 * @return Un objeto con la informaci&oacute;n referente al n&uacute;mero de
	 *         identificaci&oacute;n de la {@code Person}.
	 */
	public String getIdNumber() {
		return this.idNumber;
	}

	/**
	 * M&eacute;todo para establecer la informac&oacute;n correspondiente al
	 * n&uacute;mero de identificaci&oacute;n de la persona en la instancia de
	 * tipo {@code Person}.
	 * 
	 * @param idNumber
	 *            Representa el n&uacute;mero de identificaci&oacute;n de la
	 *            persona.
	 */
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al tipo de documento de la persona en la instancia de
	 * tipo {@code Person}.
	 * 
	 * @return Un objeto con la informaci&oacute;n referente al tipo de
	 *         documento de la persona.
	 */
	public String getDocumentType() {
		return this.documentType;
	}

	/**
	 * M&eacute;todo para establecer la informac&oacute;n correspondiente al
	 * tipo de documento de la persona en la instancia de tipo {@code Person}.
	 * 
	 * @param documentType
	 *            Representa el tipo de documento de la persona.
	 */
	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	@Override()
	public boolean equals(Object other) {
		if (this == other) {

			return (true);
		}

		if (other == null) {

			return (false);
		}

		if (!(other instanceof PersonId)) {

			return (false);
		}

		PersonId castOther = (PersonId) other;

		return (((this.getIdNumber() == castOther.getIdNumber()) || (this
				.getIdNumber() != null && castOther.getIdNumber() != null && this
				.getIdNumber().equals(castOther.getIdNumber()))) && ((this
				.getDocumentType() == castOther.getDocumentType()) || (this
				.getDocumentType() != null
				&& castOther.getDocumentType() != null && this
				.getDocumentType().equals(castOther.getDocumentType()))));
	}

	@Override()
	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (this.getIdNumber() == null ? 0 : this.getIdNumber()
						.hashCode());
		result = 37
				* result
				+ (this.getDocumentType() == null ? 0 : this.getDocumentType()
						.hashCode());

		return (result);
	}
}