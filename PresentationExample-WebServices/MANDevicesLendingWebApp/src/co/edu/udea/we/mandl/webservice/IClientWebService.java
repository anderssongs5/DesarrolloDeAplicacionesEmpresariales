package co.edu.udea.we.mandl.webservice;

import co.edu.udea.we.mandl.model.dto.Client;
import co.edu.udea.we.mandl.webservice.exception.MANDevicesLendingWebServiceException;

/**
 * Interfaz definida para establecer los m&eacute;todos que se podr&aacute;n
 * realizar sobre los procesos que involucran los Servicios Web que est&aacute;n
 * relacionados con instancias pertenecientes a la clase {@code Client}, y de
 * ese modo, poder realizar el paso de informaci&oacute;n y mensajes entre los
 * sistemas heterog&eacute;neos, y de ese modo, cumplir con los procesos de
 * negocio definidos para el aplicativo.
 * <p>
 * Esta interfaz define los m&eacute;todos o funciones que se deber&aacute;n
 * implementar en todos los Servicios Web de todo tipo, para dar soporte a las
 * operaciones requeridas por la l&oacute;gica definida para la arquitectura de
 * los Servicios Web, y que requieren acceso o interacci&oacute;n con la capa
 * encargada de ejecutar o brindar el acceso a los procesos de negocio referidos
 * a las entidades {@code Client}.
 * <p>
 * De ese modo, esta interfaz debe ser implementada por aquellas clases que
 * definan de una forma espec&iacute;fica alg&uacute;n proceso referido al paso
 * de informaci&oacute;n por medio de Servicios Web, referentes a las entidades
 * {@code Client}. En otras palabras, el objetivo primordial de esta interfaz es
 * definir las operaciones m&aacute;s b&aacute;sicas y requeridas que se
 * realizar&aacute;n sobre la arquitectura de los Servicios Web, y que en su
 * mayor&iacute;a, interactuar&aacute;n con la capa que define el contexto de la
 * l&oacute;gica del Negocio en la aplicaci&oacute;n con respecto a la
 * instancias {@code Client}.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public interface IClientWebService {

	/**
	 * M&eacute;todo que se encarga de proveer un Servicio Web que puede ser
	 * consumido por los usuarios, el cual consiste en permitir el inicio
	 * sesi&oacute;n a todos los usuarios del sistema.
	 * <p>
	 * En caso de no haber ninguna instancia que cumpla con los valores de los
	 * par&aacute;metros, la funci&oacute;n retornar&aacute; un valor
	 * <code>null</code> , lo cual para el Servicio Web representar&iacute;a una
	 * respuesta sin datos o contenido.
	 * 
	 * @param email
	 *            Nombre de usuario de aquel que va a iniciar sesi&oacute;n.
	 * @param password
	 *            Contrase&ntilde;a de aquel usuario que desea iniciar
	 *            sesi&oacute;n.
	 * @return Instancia que representa el objeto de aquel usuario que ha
	 *         iniciado sesi&oacute;n.
	 * @throws MANDevicesLendingWebServiceException
	 *             Excepci&oacute;n lanzada cuando alg&uacute;n error ha surgido
	 *             durante la ejecuci&oacute;n de alg&uacute;n proceso referente
	 *             a los Servicios Web.
	 */
	public Client login(String email, String password)
			throws MANDevicesLendingWebServiceException;
}