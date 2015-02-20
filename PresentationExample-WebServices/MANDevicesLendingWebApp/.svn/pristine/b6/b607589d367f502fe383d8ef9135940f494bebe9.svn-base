package co.edu.udea.we.mandl.webservice.restful.contract;

/**
 * Clase definida para crear los contratos de todo tipo definidos para todas las
 * interfaces creadas para exponer los Servicios Web a trav&eacute;s de
 * <b>RESTFul</b>.
 * <p>
 * Los contratos aqu&iacute; definidos se har&aacute;n individualmente para cada
 * interfaz de Servicios Web REST que sea creada; es decir, se definir&aacute;
 * una clase interna por cada interfaz de Servicio Web. Cada una de estas clases
 * tendr&aacute; una serie de atributos est&aacute;ticos que ayudar&aacute;n a
 * definir de una forma &uacute;nica cada Servicio Web creado dependientemente
 * de cada entidad asociada.
 * <p>
 * Algunos de los atributos m&aacute;s importantes para la definici&oacute;n de
 * los contratos de los Servicios Web REST, es la ruta &uacute;nica y
 * espec&iacute;fica, en la cual este ser&aacute; desplegado; igualmente, las
 * rutas para cada uno sus m&eacute;todos HTTP y los nombres de los
 * par&aacute;metros que estos reciban al momento de ejecutar alguna
 * petici&oacute;n a estos.
 * <p>
 * Algo en particular es que de esta clase, y de todas sus clases internas, no
 * se podr&aacute; generar instancias para evitar la alteraci&oacute;n de los
 * datos o atributos que est&eacute;n all&iacute; encapsulados.
 * 
 * @since JDK1.7
 * 
 * @version 1.0
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */
public final class WebServicePathsContract {

	/**
	 * Constructor privado y &uacute;nico para generar instancias de esta clase
	 * de utilidad para definir los contractos de todas las interfaces de los
	 * Servicios Web definidas.
	 * <p>
	 * La raz&oacute;n de que este sea privado es para evitar la
	 * construcci&oacute;n personalizada de instancias que hagan referencia
	 * objetos creados directamente de esta clase.
	 * <p>
	 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
	 * constructor padre.
	 */
	private WebServicePathsContract() {
		super();
	}

	/**
	 * Clase definida para crear los contratos de todo tipo definidos para la
	 * interfaz creada para exponer los Servicios Web a trav&eacute;s de
	 * <b>RESTFul</b> para las entidades del tipo {@code Client}.
	 * <p>
	 * Algunos de los atributos m&aacute;s importantes para la definici&oacute;n
	 * de los contratos de los Servicios Web REST para esta instancia son, la
	 * ruta &uacute;nica y espec&iacute;fica, en la cual este ser&aacute;
	 * desplegado; igualmente, las rutas para cada uno sus m&eacute;todos HTTP y
	 * los nombres de los par&aacute;metros que estos reciban al momento de
	 * ejecutar alguna petici&oacute;n a estos; por &uacute;ltimo, la ruta
	 * absoluta dentro del proyecto que apunta a la interfaz que define todos
	 * los m&eacute;todos que deber&aacute;n ser implementados.
	 * <p>
	 * Algo en particular es que de esta clase no se podr&aacute; generar
	 * instancias para evitar la alteraci&oacute;n de los datos o atributos que
	 * est&eacute;n all&iacute; encapsulados.
	 * 
	 * @since JDK1.7
	 * 
	 * @version 1.0
	 * 
	 * @author Andersson Garc&iacute;a Sotelo
	 * @author Miguel &Aacute;ngel Ossa Ruiz
	 * @author Neiber Padierna P&eacute;rez
	 */
	public static final class ClientWebServiceContract {

		/**
		 * Constante est&aacute;tica utilizada para definir la ruta absoluta
		 * dentro del proyecto de la interaz que se deber&aacute; implementar en
		 * el Servicio Web REST, dando de ese modo, todos los m&eacute;todos u
		 * operaciones que se deber&aacute;n implementar para ejecutar todos los
		 * procesos referidos a la entidad {@code Client}.
		 * <p>
		 * Esta ruta contiene tanto del nombre del paquete como el nombre
		 * completo de la interfaz a ser definida.
		 */
		public static final String END_POINT_INTERFACE = "co.edu.udea.we.mandl.webservice.IClientWebService";

		/**
		 * Constante est&aacute;tica utilizada para definir la ruta o
		 * <i>path</i> ra&iacute;z que se deber&aacute; utilizar para cuando se
		 * vaya a realizar una petici&oacute;n sobre alg&uacute;n m&eacute;todo
		 * u opearci&oacute;n referente a la entidad {@code Client}.
		 * <p>
		 * Esta ruta ser&aacute; &uacute;nicamente utilizada para establecer las
		 * rutas HTTP por las cuales se podr&aacute;n acceder a los diversos
		 * m&eacute;todos implementados como acciones HTTP que se puedan
		 * ejecutar como un Servicio Web REST.
		 * <p>
		 * Esta ruta raiz es especialmente creada para definir un conjunto de
		 * rutas totalmente diferentes para cada entidad que posea un Servicio
		 * Web REST.
		 */
		public static final String ROOT_PATH = "/clients";

		/**
		 * Constante est&aacute;tica utilizada para completar la ruta o
		 * <i>path</i> que se deber&aacute; utilizar para realizar peticiones al
		 * Servicio Web REST mediante las cuales se podr&aacute; conocer todos
		 * las intancias de la entidad {@code Client} disponibles en el
		 * repositorio de datos.
		 */
		public static final String LOGIN = "/login";

		/**
		 * Constante est&aacute;tica utilizada para indicar el nombre del
		 * par&aacute;metro que hace referencia al nombre de usuario de aquel
		 * que desea ejecutar el proceso del negocio que permite iniciar
		 * sesi&oacute;n en el sistema.
		 */
		public static final String CLIENT_USER_NAME_QUERY = "clientusername";

		/**
		 * Constante est&aacute;tica utilizada para indicar la contrase&ntilde;a
		 * de aquel usuario que desea ejecutar el proceso del negocio que
		 * permite iniciar sesi&oacute;n en el sistema.
		 */
		public static final String CLIENT_PASSWORD_QUERY = "clientpassword";

		/**
		 * Constructor privado y &uacute;nico para generar instancias de esta
		 * clase de utilidad para definir los contractos de la interfaz de los
		 * Servicios Web definida para las instancias de tipo {@code Client}.
		 * <p>
		 * La raz&oacute;n de que este sea privado es para evitar la
		 * construcci&oacute;n personalizada de instancias que hagan referencia
		 * objetos creados directamente de esta clase.
		 * <p>
		 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
		 * constructor padre.
		 */
		private ClientWebServiceContract() {
			super();
		}
	}

	/**
	 * Clase definida para crear los contratos de todo tipo definidos para la
	 * interfaz creada para exponer los Servicios Web a trav&eacute;s de
	 * <b>RESTFul</b> para las entidades del tipo {@code Device}.
	 * <p>
	 * Algunos de los atributos m&aacute;s importantes para la definici&oacute;n
	 * de los contratos de los Servicios Web REST para esta instancia son, la
	 * ruta &uacute;nica y espec&iacute;fica, en la cual este ser&aacute;
	 * desplegado; igualmente, las rutas para cada uno sus m&eacute;todos HTTP y
	 * los nombres de los par&aacute;metros que estos reciban al momento de
	 * ejecutar alguna petici&oacute;n a estos; por &uacute;ltimo, la ruta
	 * absoluta dentro del proyecto que apunta a la interfaz que define todos
	 * los m&eacute;todos que deber&aacute;n ser implementados.
	 * <p>
	 * Algo en particular es que de esta clase no se podr&aacute; generar
	 * instancias para evitar la alteraci&oacute;n de los datos o atributos que
	 * est&eacute;n all&iacute; encapsulados.
	 * 
	 * @since JDK1.7
	 * 
	 * @version 1.0
	 * 
	 * @author Andersson Garc&iacute;a Sotelo
	 * @author Miguel &Aacute;ngel Ossa Ruiz
	 * @author Neiber Padierna P&eacute;rez
	 */
	public static final class DeviceWebServiceContract {

		/**
		 * Constante est&aacute;tica utilizada para definir la ruta absoluta
		 * dentro del proyecto de la interaz que se deber&aacute; implementar en
		 * el Servicio Web REST, dando de ese modo, todos los m&eacute;todos u
		 * operaciones que se deber&aacute;n implementar para ejecutar todos los
		 * procesos referidos a la entidad {@code Device}.
		 * <p>
		 * Esta ruta contiene tanto del nombre del paquete como el nombre
		 * completo de la interfaz a ser definida.
		 */
		public static final String END_POINT_INTERFACE = "co.edu.udea.we.mandl.webservice.IDeviceWebService";

		/**
		 * Constante est&aacute;tica utilizada para definir la ruta o
		 * <i>path</i> ra&iacute;z que se deber&aacute; utilizar para cuando se
		 * vaya a realizar una petici&oacute;n sobre alg&uacute;n m&eacute;todo
		 * u opearci&oacute;n referente a la entidad {@code Device}.
		 * <p>
		 * Esta ruta ser&aacute; &uacute;nicamente utilizada para establecer las
		 * rutas HTTP por las cuales se podr&aacute;n acceder a los diversos
		 * m&eacute;todos implementados como acciones HTTP que se puedan
		 * ejecutar como un Servicio Web REST.
		 * <p>
		 * Esta ruta raiz es especialmente creada para definir un conjunto de
		 * rutas totalmente diferentes para cada entidad que posea un Servicio
		 * Web REST.
		 */
		public static final String ROOT_PATH = "/devices";

		/**
		 * Constante est&aacute;tica utilizada para completar la ruta o
		 * <i>path</i> que se deber&aacute; utilizar para realizar peticiones al
		 * Servicio Web REST mediante las cuales se podr&aacute; conocer todos
		 * las intancias de la entidad {@code Device} disponibles en el
		 * repositorio de datos.
		 */
		public static final String FIND_ALL_AVAILABLES = "/find/availables";

		/**
		 * Constructor privado y &uacute;nico para generar instancias de esta
		 * clase de utilidad para definir los contractos de la interfaz de los
		 * Servicios Web definida para las instancias de tipo {@code Device}.
		 * <p>
		 * La raz&oacute;n de que este sea privado es para evitar la
		 * construcci&oacute;n personalizada de instancias que hagan referencia
		 * objetos creados directamente de esta clase.
		 * <p>
		 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
		 * constructor padre.
		 */
		private DeviceWebServiceContract() {
			super();
		}
	}

	/**
	 * Clase definida para crear los contratos de todo tipo definidos para la
	 * interfaz creada para exponer los Servicios Web a trav&eacute;s de
	 * <b>RESTFul</b> para las entidades del tipo {@code DeviceStatus}.
	 * <p>
	 * Algunos de los atributos m&aacute;s importantes para la definici&oacute;n
	 * de los contratos de los Servicios Web REST para esta instancia son, la
	 * ruta &uacute;nica y espec&iacute;fica, en la cual este ser&aacute;
	 * desplegado; igualmente, las rutas para cada uno sus m&eacute;todos HTTP y
	 * los nombres de los par&aacute;metros que estos reciban al momento de
	 * ejecutar alguna petici&oacute;n a estos; por &uacute;ltimo, la ruta
	 * absoluta dentro del proyecto que apunta a la interfaz que define todos
	 * los m&eacute;todos que deber&aacute;n ser implementados.
	 * <p>
	 * Algo en particular es que de esta clase no se podr&aacute; generar
	 * instancias para evitar la alteraci&oacute;n de los datos o atributos que
	 * est&eacute;n all&iacute; encapsulados.
	 * 
	 * @since JDK1.7
	 * 
	 * @version 1.0
	 * 
	 * @author Andersson Garc&iacute;a Sotelo
	 * @author Miguel &Aacute;ngel Ossa Ruiz
	 * @author Neiber Padierna P&eacute;rez
	 */
	public static final class DeviceStatusWebServiceContract {

		/**
		 * Constante est&aacute;tica utilizada para definir la ruta absoluta
		 * dentro del proyecto de la interaz que se deber&aacute; implementar en
		 * el Servicio Web REST, dando de ese modo, todos los m&eacute;todos u
		 * operaciones que se deber&aacute;n implementar para ejecutar todos los
		 * procesos referidos a la entidad {@code Device}.
		 * <p>
		 * Esta ruta contiene tanto del nombre del paquete como el nombre
		 * completo de la interfaz a ser definida.
		 */
		public static final String END_POINT_INTERFACE = "co.edu.udea.we.mandl.webservice.IDeviceStatusWebService";

		/**
		 * Constante est&aacute;tica utilizada para definir la ruta o
		 * <i>path</i> raiz que se deber&aacute; utilizar para cuando se vaya a
		 * realizar una petici&oacute;n sobre alg&uacute;n m&eacute;todo u
		 * opearci&oacute;n referente a la entidad {@code Device}.
		 * <p>
		 * Esta ruta ser&aacute; &uacute;nicamente utilizada para establecer las
		 * rutas HTTP por las cuales se podr&aacute;n acceder a los diversos
		 * m&eacute;todos implementados como acciones HTTP que se puedan
		 * ejecutar como un Servicio Web REST.
		 * <p>
		 * Esta ruta raiz es especialmente creada para definir un conjunto de
		 * rutas totalmente diferentes para cada entidad que posea un Servicio
		 * Web REST.
		 */
		public static final String ROOT_PATH = "/devicesstatuses";

		/**
		 * Constante est&aacute;tica utilizada para completar la ruta o
		 * <i>path</i> que se deber&aacute; utilizar para realizar peticiones al
		 * Servicio Web REST mediante las cuales se invoca la ejecuci&oacute; de
		 * un m&eacute; que permitir&aacute; la evaluaci&oacute;n de los
		 * diferentes pr&eacute;stamos o reservas de dispositivos que han
		 * realizado los usuarios del sistema.
		 */
		public static final String EVALUATE_LENDINGS = "/evaluate";

		/**
		 * Constante est&aacute;tica utilizada para completar la ruta o
		 * <i>path</i> que se deber&aacute; utilizar para realizar peticiones al
		 * Servicio Web REST mediante las cuales se invoca la ejecuci&oacute; de
		 * un m&eacute; que permitir&aacute; la obtenci&oacute;n de todos
		 * aquellos pr&eacute;stamos o reservas de dispositivos que han
		 * realizado los usuarios del sistema y que a&uacute;n no han sido
		 * evaluados.
		 */
		public static final String FIND_UNSOLVED_LENDINGS = "/unsolved";

		/**
		 * Constante est&aacute;tica utilizada para completar la ruta o
		 * <i>path</i> que se deber&aacute; utilizar para realizar peticiones al
		 * Servicio Web REST mediante las cuales se invoca la ejecuci&oacute; de
		 * un m&eacute; que facilitar&aacute; la realizaci&oacute;n de reservas
		 * o pr&eacute;stamos de dispositivos por parte de los usuarios del
		 * sistema.
		 */
		public static final String RESERVE_DEVICE = "/reserve";

		/**
		 * Constante est&aacute;tica utilizada para indicar el nombre del
		 * par&aacute;metro que hace referencia al nombre de usuario de aquel
		 * usuario que desea ejecutar el proceso del negocio que permite conocer
		 * las reservas o pr&eacute;stamos de dispositivos que a&uacute;n no han
		 * sido evaludadas.
		 */
		public static final String CLIENT_USER_NAME_QUERY = "clientusername";

		/**
		 * Constructor privado y &uacute;nico para generar instancias de esta
		 * clase de utilidad para definir los contractos de la interfaz de los
		 * Servicios Web definida para las instancias de tipo
		 * {@code DeviceStatus}.
		 * <p>
		 * La raz&oacute;n de que este sea privado es para evitar la
		 * construcci&oacute;n personalizada de instancias que hagan referencia
		 * objetos creados directamente de esta clase.
		 * <p>
		 * Este constructor realizar&aacute; una llamada expl&iacute;cita a su
		 * constructor padre.
		 */
		public DeviceStatusWebServiceContract() {
			super();
		}
	}
}