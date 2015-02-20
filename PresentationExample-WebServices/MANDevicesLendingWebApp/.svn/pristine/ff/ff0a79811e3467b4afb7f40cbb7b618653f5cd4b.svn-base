package co.edu.udea.we.mandl.model.dto;

/**
 * Interfaz definida para establecer un contexto com&uacute;n y estrictamente
 * definido para todas las entidades persistentes en la aplicaci&oacute;n.
 * <p>
 * No todas las clases D.T.O. <i>Data Transfer Object</i> requieren ser
 * persistences para durante las ejecuciones del aplicativo, pero aquellas que
 * desean ser persistentes, son necesariamente objetos creados de clases
 * definidas como D.T.O., del mismo modo, es necesario que dichas clases
 * implementen esta interfaz para poder ser procesdas por las clases encargadas
 * de la persistencia de los datos.
 * <p>
 * Los m&eacute;todos definidos en esta interfaz apoyan a la obtenci&oacute;n y
 * asignaci&oacute;n segura de los atributos que se definen como la clave
 * primaria para las instancias o entidades de las clases D.T.O., en otras
 * palabras, se espera que al implementar las funciones definidas en esta
 * interfaz, apoye al proceso de la capa de persistencia a la gesti&oacute;n
 * plena de los atributos que se definen como las claves primarias en las
 * entidades que desean ser persistidas.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface IEntityContext {

	/**
	 * M&eacute;todo encargado de retornar la instancia que represta la clave
	 * primaria asociada a la entidad a la cual se le invoca esta
	 * funci&oacute;n.
	 * <p>
	 * El valor retornado puede ser un valor primitivo encapsulado como un
	 * objeto o una instancia creada de alguna clase que represente la clave
	 * primaria de la entidad.
	 * 
	 * @return La instancia u objeto que representa la clave primaria.
	 */
	public Object getKey();

	/**
	 * M&eacute;todo encargado de asignar un nueva clave primaria asociada a la
	 * entidad a la cual se le invoca esta funci&oacute;n.
	 * <p>
	 * El valor a ser asignado puede ser un tipo primitivo encapsulado como un
	 * objeto o una instancia creada de alguna clase que represente la clave
	 * primaria de la entidad.
	 * 
	 * @param key
	 *            Instancia u objeto que representa la nueva clave primaria.
	 */
	public void setKey(Object key);
}