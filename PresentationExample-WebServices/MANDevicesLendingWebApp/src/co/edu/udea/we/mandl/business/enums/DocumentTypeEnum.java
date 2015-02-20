package co.edu.udea.we.mandl.business.enums;

/**
 * Clase que define una enumeraci&oacute;n de constantes para establer los tipos
 * de documentos de identidad que ser&aacute;n seleccionables al momento de
 * realizar la gesti&oacute;n de datos de todo los tipos de usuarios.
 * <p>
 * Esta enumeraci&oacute;n definir&aacute; solo el nombre o tipo de documento.
 * De ese modo, los valore de las enumeraciones que podremos encontrar como
 * constantes son las siguientes: <b>C&eacute;dula de Ciudadan&iacute;a</b>,
 * <b>C&eacute;dula de Extranjer&iacute;a</b>, <b>N&uacute;mero &Uacute;nico de
 * Identificaci&oacute;n Personal</b>, <b>Registro Civil</b> y <b>Tarjeta de
 * Identidad</b>.
 * <p>
 * Esta enumeraci&oacute;n provee los m&eacute;todos necesarios para obtener
 * todos los tipos de documentos de identidad de una forma abstracta e invisible
 * para los procesos de negocio.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public enum DocumentTypeEnum {

	/**
	 * Listado de enumeraciones que definen los tipos de documentos de identidad
	 * seleccionables para efectuar la gesti&oacute;n de los datos de los
	 * usuarios.
	 */
	CEDULA_DE_CIUDADANIA("Cédula de Ciudadanía"), CEDULA_DE_EXTRANJERIA(
			"Cédula de Extranjería"), NUMERO_IDENTIFICACION_PERSONAL(
			"Número Único de Identificación Personal"), REGISTRO_CIVIL(
			"Registro Civil"), TARJETA_DE_IDENTIDAD("Tarjeta de Identidad");
	private String documentType;

	/**
	 * Constructor privado y &uacute;nico para generar instancias de esta
	 * enumeraci&oacute;n.
	 * <p>
	 * La raz&oacute;n de que este sea privado es para evitar la
	 * construcci&oacute;n personalizada de instancias que hagan referencia a
	 * los tipos de documentos de identidad, evitando de ese modo, la
	 * inconsistencia y generaci&oacute;n informaci&oacute;n err&oacute;nea.
	 * 
	 * @param documentType
	 *            Instancia que representa el nombre &uacute;nico del tipo de
	 *            documento de identidad.
	 */
	private DocumentTypeEnum(String documentType) {
		this.setDocumentType(documentType);
	}

	/**
	 * M&eacute;todo para obtener la instancia que representa el nombre propio y
	 * &uacute;nico que define la enumeraci&oacute;n del tipo de documento de
	 * identidad que realiza la invocaci&oacute;n a esta funci&oacute;n.
	 * 
	 * @return un objeto que representa el nombre propio y &uacute;nico del tipo
	 *         de documento de identidad.
	 */
	public String getDocumentType() {

		return (this.documentType);
	}

	/**
	 * M&eacute;todo para establecer una instancia que representa el nombre
	 * propio y &uacute;nico que define la enumeraci&oacute;n del tipo de
	 * documento de identidad que realiza la invocaci&oacute;n a esta
	 * funci&oacute;n.
	 * <p>
	 * Este m&eacute;todo es privado para evitar la modificaci&oacute;n de los
	 * nombres de los tipos de documentos definidos en la enumeraci&oacute;n,
	 * logrando de ese modo evitar ambiguedad y errores en la informaci&oacute;n
	 * correspondiente a los nombres de los tipos de documentos de identidad.
	 * 
	 * @param documentType
	 *            Instancia que representa el nuevo nombres para el tipo de
	 *            documento de identidad.
	 */
	private void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	@Override()
	public String toString() {

		return (this.getDocumentType());
	}
}