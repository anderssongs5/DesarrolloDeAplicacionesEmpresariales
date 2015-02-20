package co.edu.udea.we.mandl.model.dto;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Clase D.T.O. <i>Data Transfer Object</i> que implementa la interfaz
 * {@code IEntityContext} definida para establecer un contexto para permitir la
 * gesti&oacute;n de los datos de la entidad {@code DeviceStatus}.
 * <p>
 * Esta clase ser&aacute; usada para realizar toda la persistencia relacionada
 * con la entidad {@code DeviceStatus}.
 * <p>
 * Los m&eacute;todos definidos en esta clase realizan el almacenamiento y
 * contribuyen a la gesti&oacute;n segura de los atributos que se definen como
 * propiedades pertenecientes a la entidad D.T.O. {@code DeviceStatus}.
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
public class DeviceStatus implements IEntityContext, Serializable {

	/**
	 * Constante utilizada para realizar operaciones de serializaci&oacute;n y
	 * deserializaci&oacute;n de la instancia {@code DeviceStatus}, e
	 * igualmente, de todos los atributos tanto primitivos como objetos y
	 * compuestos que esta instancia agrupe.
	 */
	private static final long serialVersionUID = -1921474439112952926L;

	/**
	 * Atributo que representa un valor entero que se autoincrementa por cada
	 * nueva entrada registrada ante el sistema. Al autoincrementarse se asegura
	 * que cada valor nuevo generado es diferente y por ello, se nota como la
	 * Clave Primaria.
	 */
	private Long id;

	/**
	 * Atributo que representa la asociaci&oacute;n o relaci&oacute;n con la
	 * entidad {@code Client}, la cual define el cliente que tendr&aacute;
	 * asociado la instancia actual.
	 */
	private Client client;

	/**
	 * Atributo que representa la asociaci&oacute;n o relaci&oacute;n con la
	 * entidad {@code Device}, la cual define el Dispositivo que tendr&aacute;
	 * asociado la instancia actual.
	 */
	private Device device;

	/**
	 * 
	 * Atributo que representa la asociaci&oacute;n o relaci&oacute;n con la
	 * entidad {@code Disposition}, la cual define la disposici&oacute;n que
	 * tendr&aacute; asociado la instancia actual.
	 */
	private Disposition disposition;

	/**
	 * Atributo que representa la fecha de finalizaci&oacute;n en la cual se
	 * espera que el Dispositivo pase por un cambio de Estado en el Sistema. En
	 * otras palabras, la fecha en la cual el Dispositivo va a realizar un
	 * cambio de Estado, por ejemplo, de "Manetimiento" a "Disponible".
	 */
	private Date endDate;

	/**
	 * Atributo que representa la fecha de inicializaci&oacute;n en la cual se
	 * espera que el Dispositivo cambie a un nuevo Estado en el Sistema. En
	 * otras palabras, la fecha en la cual el Dispositivo va a realizar un
	 * cambio de Estado, por ejemplo, de "Disponible" a "Mantenimiento".
	 */
	private Date startDate;

	/**
	 * Atributo que representa la hora exacta de finalizaci&oacute;n en la cual
	 * se espera que el Dispositivo pase por un cambio de Estado en el Sistema.
	 * En otras palabras, la hora exacta en la cual el Dispositivo va a realizar
	 * un cambio de Estado, por ejemplo, de "Manetimiento" a "Disponible".
	 */
	private Date endTime;

	/**
	 * Atributo que representa la hora exacta de inicializaci&oacute;n en la
	 * cual se espera que el Dispositivo cambie a un nuevo Estado en el Sistema.
	 * En otras palabras, la hora exacta en la cual el Dispositivo va a realizar
	 * un cambio de Estado, por ejemplo, de "Disponible" a "Mantenimiento".
	 */
	private Date startTime;

	/**
	 * Atributo que repersenta tanto la fecha y hora en la cual se ha realizado
	 * la petici&oacute;n para que cierto Dispositivo dentro de un rago de
	 * fechas y horas cambie a un nuevo Estado en el Sistema.
	 */
	private Date requestDatetime;

	/**
	 * Constructor por defecto y sin par&aacute;metros para generar instancias
	 * de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	public DeviceStatus() {
		super();
	}

	/**
	 * Constructor sobrecargado para generar instancias de esta clase utilizando
	 * todos los atributos definidos para la entidad.
	 * <p>
	 * Este constructor acepta tanto los par&aacute;metros que son requeridos y
	 * no en el contexto de persistencia.
	 */
	public DeviceStatus(Client client, Device device, Disposition disposition,
			Date endDate, Date startDate, Date endTime, Date startTime,
			Date requestDatetime) {
		this.client = client;
		this.device = device;
		this.disposition = disposition;
		this.endDate = endDate;
		this.startDate = startDate;
		this.endTime = endTime;
		this.startTime = startTime;
		this.requestDatetime = requestDatetime;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al identificador &uacute;nico.
	 * 
	 * @return Un objeto que representa la identificaci&oacute;n &uacute;nica de
	 *         esta entidad.
	 */
	public Long getId() {

		return (this.id);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa la informaci&oacute;n correspondiente al identificador
	 * &uacute;nico.
	 * 
	 * @param id
	 *            Nueva instancia del objeto que representa
	 *            identificaci&oacute;n &uacute;nica de esta entidad.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al Cliente que tiene asociada esta entidad.
	 * 
	 * @return Un objeto que representa al Cliente que tiene asociada esta
	 *         entidad.
	 */
	public Client getClient() {

		return (this.client);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa el Cliente que tendr&aacute; asociada esta clase.
	 * 
	 * @param client
	 *            Nueva instancia del objeto que representa el Cliente que
	 *            tendr&aacute; asociada esta entidad.
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al Dispositivo que tiene asociada esta entidad.
	 * 
	 * @return Un objeto que representa al Dispositivo que tiene asociada esta
	 *         entidad.
	 */
	public Device getDevice() {

		return (this.device);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa el Dispositivo que tendr&aacute; asociada esta clase.
	 * 
	 * @param device
	 *            Nueva instancia del objeto que representa el Dispositivo que
	 *            tendr&aacute; asociada esta entidad.
	 */
	public void setDevice(Device device) {
		this.device = device;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente a la Disposici&oacute;n que tiene asociada esta entidad.
	 * 
	 * @return Un objeto que representa la Disposici&oacute;n que tiene asociada
	 *         esta entidad.
	 */
	public Disposition getDisposition() {

		return (this.disposition);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa la Disposici&oacute;n tendr&aacute; asociada esta clase.
	 * 
	 * @param disposition
	 *            Nueva instancia del objeto que representa la
	 *            Disposici&oacute;n que tendr&aacute; asociada esta entidad.
	 */
	public void setDisposition(Disposition disposition) {
		this.disposition = disposition;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al atributo endDate.
	 * 
	 * @return Un objeto que representa el atributo endDate perteneciente a esta
	 *         entidad.
	 */
	public Date getEndDate() {

		return (this.endDate);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa el atributo endDate.
	 * 
	 * @param endDate
	 *            Nueva instancia del objeto que representa el atributo endDate
	 *            perteneciente a esta entidad.
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al atributo startDate.
	 * 
	 * @return Un objeto que representa el atributo startDate perteneciente a
	 *         esta entidad.
	 */
	public Date getStartDate() {

		return (this.startDate);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa el atributo startDate.
	 * 
	 * @param startDate
	 *            Nueva instancia del objeto que representa el atributo
	 *            startDate perteneciente a esta entidad.
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al atributo endTime.
	 * 
	 * @return Un objeto que representa el atributo endTime perteneciente a esta
	 *         entidad.
	 */
	public Date getEndTime() {

		return (this.endTime);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa el atributo endTime.
	 * 
	 * @param endTime
	 *            Nueva instancia del objeto que representa el atributo endTime
	 *            perteneciente a esta entidad.
	 */
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al atributo startTime.
	 * 
	 * @return Un objeto que representa el atributo startTime perteneciente a
	 *         esta entidad.
	 */
	public Date getStartTime() {

		return (this.startTime);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa el atributo startTime.
	 * 
	 * @param startTime
	 *            Nueva instancia del objeto que representa el atributo
	 *            startTime perteneciente a esta entidad.
	 */
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	/**
	 * M&eacute;todo utilizado para obtener la informaci&oacute;n
	 * correspondiente al atributo requestDatetime.
	 * 
	 * @return Un objeto que representa el atributo requestDatetime
	 *         perteneciente a esta entidad.
	 */
	public Date getRequestDatetime() {

		return (this.requestDatetime);
	}

	/**
	 * M&eacute;todo utilizado para asignar una nueva instancia al objeto que
	 * representa el atributo requestDatetime.
	 * 
	 * @param requestDatetime
	 *            Nueva instancia del objeto que representa el atributo
	 *            requestDatetime perteneciente a esta entidad.
	 */
	public void setRequestDatetime(Date requestDatetime) {
		this.requestDatetime = requestDatetime;
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