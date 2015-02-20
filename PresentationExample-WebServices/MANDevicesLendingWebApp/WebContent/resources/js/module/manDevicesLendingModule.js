/**
 * En este <b>script</b> se hace uso de algunos de los tantos componentes que
 * ofrece <b>Angular JS</b>, buscando imprimirle din&aacute;mica a la
 * aplicaci&oacute;n web en desarrollo.
 * 
 * @author Andersson Garc&iacute;a Sotelo
 * @author Miguel &Aacute;ngel Ossa Ruiz
 * @author Neiber Padierna P&eacute;rez
 */

/**
 * Variable tipo <code>String</code> que expone la ruta al Servicio Web
 * RESTFul encargado de encontrar todos los dispositivos disponibles para ser
 * presetados por partes de los usuarios del sistema.
 */
var AVAILABLE_DEVICES_WEB_SERVICE = 'http://localhost:8080/MANDevicesLendingWebApp/rest/devices/find/availables?';
/**
 * Variable tipo <code>String</code> que expone la ruta al Servicio Web
 * RESTFul con el que se puede actualizar la correspondiente evaluaci&oacute;n
 * de la reserva o pr&eacute;stamo de un dispositivo realizado previamente por
 * parte de los usuarios del sistema.
 */
var EVALUATE_LENDINGS_WEB_SERVICE = 'http://localhost:8080/MANDevicesLendingWebApp/rest/devicesstatuses/evaluate?';
/**
 * Variable tipo <code>String</code> que expone la ruta al Servicio Web
 * RESTFul que permite el inicio de sesi&oacute;n de los diferentes usuarios del
 * sistema, sin importar su rol dentro del mismo.
 */
var LOGIN_WEB_SERVICE = 'http://localhost:8080/MANDevicesLendingWebApp/rest/clients/login?';
/**
 * Variable tipo <code>String</code> que expone la ruta al Servicio Web
 * RESTFul encargado de almacenar la reserva o pr&eacute;stamo de un
 * dispositivo.
 */
var RESERVE_DEVICE_WEB_SERVICE = 'http://localhost:8080/MANDevicesLendingWebApp/rest/devicesstatuses/reserve?';
/**
 * Variable tipo <code>String</code> que expone la ruta al Servicio Web
 * RESTFul destinado a obtener todos los pr&eacute;stamos que hasta la fecha no
 * han sido evaluados por parte de los administradores del sistema.
 */
var UNSOLVE_LENDINGS_WEB_SERVICE = 'http://localhost:8080/MANDevicesLendingWebApp/rest/devicesstatuses/unsolved?';

// / *** MODULES *** / //

/**
 * Creación del m&oacute;dulo de la aplicaci&oacute;n, al cual se le indica el
 * uso de <b>ngRoute</b> para permitir el enrutamiento <i>URL</i> en la
 * aplicaci&oacute;n, <b>ngCookies</b> para realizar el manejo de cookies en la
 * aplicaci&oacute;n, y <b>ui.bootstrap</b> para indicar la instalaci&oacute;n
 * del framework <b>Bootstrap</b>. As&iacute; toda esta configuraci&oacute;n es
 * guardada en la variable <code>manDevicesLendingModule</code>.
 */
var manDevicesLendingModule = angular.module('manDevicesLending', [ 'ngRoute',
		'ngCookies', 'ui.bootstrap' ]);

// / *** FACTORIES *** / //

/**
 * Factor&iacute;a que le permite a la aplicaci&oacute;n inyectar los
 * controladores a las vistas o plantillas que se requieran para mostrar y poder
 * ejecutar los procesos requeridos por los diversos usuarios.
 * <p>
 * Esta factor&iacute;a inyectar&aacute; un controlador dado para la vista o
 * interfaz de usuario en la cual se est&eacute; ubicado actualmente durante la
 * sesi&oacute;n.
 * <p>
 * La disponibilidad de las interfaces gr&aacute;ficas y de sus controladores
 * depender&aacute; directamente del rol del usuario que haya iniciado
 * sesi&oacute;n exitosamente en el aplicativo.
 */
manDevicesLendingModule.factory('authentication',
		function($cookies, $location) {

			return ({
				/**
				 * Funci&oacute;n que es definida para establecer los datos de
				 * la <b>Cookie</b> a partir del usuario que ha iniciado
				 * sesi&oacute;n.
				 * 
				 * @param userName
				 *            Nombre de usuario de la persona que ha iniciado
				 *            sesi&oacute;n.
				 * @param password
				 *            Contrase&ntilde;a del usuario que ha iniciado
				 *            sesi&oacute;n.
				 * @param profile
				 *            Prefile del usuario que ha iniciado sesi&oacute;n.
				 */
				login : function(userName, password, profile) {
					$cookies.userName = userName;
					$cookies.password = password;
					$cookies.profile = profile;

					if ($cookies.profile == 'INVESTIGADOR') {
						$location.url('/pages/reservedevices');
					} else if ($cookies.profile == 'ADMINISTRADOR') {
						$location.url('/pages/lendingsevaluation');
					}
				},
				/**
				 * Funci&oacute;n que se encarga de establecer los nuevos
				 * valores para los datos de la <b>Cookie</b> cuando un usuario
				 * ha salido del sistema.
				 */
				logout : function() {
					$cookies.userName = undefined;
					$cookies.password = undefined;
					$cookies.profile = undefined;
					$location.url('/');
				},
				/**
				 * Funci&oacute;n que chequea el estado de la <b>Cookie</b> y a
				 * partir de all&iacute;, se establece la p&aacute;gina a la que
				 * puede ingresar el usuario.
				 */
				checkState : function() {
					if (typeof ($cookies.userName) == 'undefined'
							|| angular.equals($cookies.userName, 'undefined')) {
						$location.url('/');

						return;
					}

					if ((typeof ($cookies.userName) != 'undefined' || !angular
							.equals($cookies.userName, 'undefined'))
							&& ($location.url() == '/')) {
						if ($cookies.profile == 'INVESTIGADOR') {
							$location.url('/pages/reservedevices');
						} else if ($cookies.profile == 'ADMINISTRADOR') {
							$location.url('/pages/lendingsevaluation');
						}
					}
				}
			});
		});

// / *** CONFIGURATIONS *** / //

/**
 * Este aspecto se encarga de establecer las configuraciones dadas para la
 * aplicaci&oacute;n con respecto a <b>AngularJS</b>, m&aacute;s
 * espec&iacute;icamente, establece las configuraciones respectivas a las
 * plantillas y las asocia a las p&aacute;ginas HTML creadas en el proyecto.
 * <p>
 * Igualmente, le asocia o inyecta a cada p&aacute;gina HTML creada, el
 * controlador necesario para generar y mostrar los datos y procesos definidos
 * en dicha p&aacute;gina Web.
 */
manDevicesLendingModule.config([ '$routeProvider', function($routeProvider) {
	$routeProvider.when('/', {
		templateUrl : './pages/login.html',
		controller : 'loginController'
	});

	$routeProvider.when('/pages/reservedevices', {
		templateUrl : './pages/reservedevices.html',
		controller : 'reserveDevicesController'
	});

	$routeProvider.when('/pages/lendingsevaluation', {
		templateUrl : './pages/lendingsevaluation.html',
		controller : 'lendingsEvaluationController'
	});

	$routeProvider.when('/pages/lendingsevaluationempty', {
		templateUrl : './pages/lendingsevaluationempty.html',
		controller : 'emptyController'
	});

	$routeProvider.when('/pages/reservedevicesempty', {
		templateUrl : './pages/reservedevicesempty.html',
		controller : 'emptyController'
	});
} ]);

// / *** RUNNERS *** / //

/**
 * Esta funci&oacute;n que se ejecuta siempre que se accede a la
 * aplicaci&oacute;n por medio del explorador web. Esta funci&oacuten invica las
 * validaciones pertinentes para garantizar el acceso &uacute;nicamente del
 * personal autorizado.
 */
manDevicesLendingModule.run(function($rootScope, authentication) {

	/**
	 * Esta funci&oacute;n que se encarga de realizar una validaci&oacute;n del
	 * usuario, con el fin de determinar si este se encuentra autenticado para
	 * poder permitirle ingresar a la direcci&oacute;n que desea.
	 */
	$rootScope.$on('$routeChangeStart', function() {
		authentication.checkState();
	});
});

// / *** SERVICES *** / //

/**
 * Servicio que es empleado para hacer uso del Servicio Web que permite la
 * obtenci&oacute;n de todos los dispositivos disponibles en el sistema para ser
 * prestados o reservados por parte de los usuarios del mismo.
 */
manDevicesLendingModule.service('availableDevicesWebService', function($http) {

	/**
	 * As&iacute;, usa el m&eacute;todo <b>GET</b> y la URL respectiva al
	 * Servicio Web para obtener todos los dispositivos disponibles.
	 */
	this.findAllAvailablesDevices = function() {

		return ($http({
			method : 'GET',
			url : AVAILABLE_DEVICES_WEB_SERVICE
		}));
	};
});

/**
 * Esta servicio se encarga de realizar el consumo directo del servicio web que
 * se encarga de verificar si un usuario est&aacute; registrado en el sistema.
 * 
 * El consumo del servicio web se hace usando el m&eacute;todo GET que es
 * proporcionado por la aplicaci&oacute;n en su clase
 * {@code ClientWebServiceImpl}.
 */
manDevicesLendingModule.service('loginWebService', function($http) {

	/**
	 * Esta funci&oacute;n se encarga de realizar el consumo directo del
	 * servicio web y permitir el inicio sesi&oacute;n a todos los usuarios del
	 * sistema.
	 * <p>
	 * En caso de no haber ninguna instancia que cumpla con los valores de los
	 * par&aacute;metros, la funci&oacute;n retornar&aacute; una respuesta sin
	 * datos o contenido.
	 * 
	 * @param userName
	 *            Nombre de usuario de aquel que va a iniciar sesi&oacute;n.
	 * @param password
	 *            Contrase&ntilde;a de aquel usuario que desea iniciar
	 *            sesi&oacute;n.
	 * @return Instancia que representa el objeto JSON de aquel usuario que ha
	 *         iniciado sesi&oacute;n.
	 */
	this.login = function(userName, password) {

		return ($http({
			method : 'GET',
			url : LOGIN_WEB_SERVICE,
			params : {
				clientusername : userName,
				clientpassword : password
			}
		}));
	};
});

/**
 * Servicio provisto por <b>AngularJS</b> que se encarga de realizar una
 * petici&oacute;n a los Servicios Web de la aplicaci&oacute;n para obtener el
 * listado de Dispositivos que no han sido evaluados por alg&uacute;n
 * administrador del sistema.
 * 
 * @param unsolvedLendingsWebService
 *            Nombre propio a ser asignado a este Servicio de <b>AngularJS</b>.
 */
manDevicesLendingModule.service('unsolvedLendingsWebService', function($http) {

	/**
	 * Funci&oacute;n que se encarga de ejecutar una petici&oacute;n al Servicio
	 * Web provisto por la aplicaci&oacute;n para consultar el listado de
	 * Reservas de Dispositivos pendientes a ser evaluados por un administrador
	 * del sistema.
	 * <p>
	 * Es importante resaltar, que los administradores del sistema no
	 * podr&aacute;n gestionar sus propias reservas realizadas sobre los
	 * Dispositivos.
	 * <p>
	 * En caso que el listado de Reservas pendientes est&eacute; vac&iacute;o,
	 * el valor guardado ser&aacute; un lista, igualmente vac&iacute;a de
	 * objetos.
	 * 
	 * @param userName
	 *            Nombre de usuario que ha logrado iniciar exitosamente en el
	 *            sistema y representa el nombre de usuario del administrador.
	 */
	this.findUnsolvedLendings = function(userName) {

		return ($http({
			method : 'GET',
			url : UNSOLVE_LENDINGS_WEB_SERVICE,
			params : {
				clientusername : userName
			}
		}));
	};
});

/**
 * Servicio provisto por <b>AngularJS</b> que se encarga de realizar una
 * petici&oacute;n a los Servicios Web de la aplicaci&oacute;n para actualizar
 * el listado de Dispositivos que han sido evaluados por alg&uacute;n
 * administrador del sistema, ya se que las reservas hayan sido aprobadas o
 * denegadas.
 * 
 * @param evaluateLendingsWebService
 *            Nombre propio a ser asignado a este Servicio de <b>AngularJS</b>.
 */
manDevicesLendingModule.service('evaluateLendingsWebService', function($http) {

	/**
	 * Funci&oacute;n que se encarga de ejecutar una petici&oacute;n al Servicio
	 * Web provisto por la aplicaci&oacute;n para actualizar el listado de
	 * Reservas de Dispositivos pendientes que han sido evaluadas por un
	 * administrador del sistema.
	 * <p>
	 * Es importante resaltar, que los administradores del sistema son los
	 * &uacute;nicos capaces de realizar la aprobaci&oacute;n o negaci&oacute;n
	 * de las Reservas sobre los Dispositivos hechas por los usuarios ante el
	 * sistema.
	 * <p>
	 * En caso que el listado de Reservas pendientes a ser evaluadas est&eacute;
	 * vac&iacute;o, entonces, el Administrador no ver&aacute; ninguna reserva a
	 * ser evaluada.
	 * 
	 * @param deviceStatusJSON
	 *            Instancia u objeto JSON que contiene la informaci&oacute;n
	 *            sobre la Reserva de Dispositivo que ha sido aprobada o
	 *            denegada por un Administrador en el sistema.
	 */
	this.evaluateLendings = function(deviceStatusJSON) {

		return ($http({
			method : 'PUT',
			url : EVALUATE_LENDINGS_WEB_SERVICE,
			data : deviceStatusJSON
		}));
	};
});

/**
 * Servicio provisto por <b>AngularJS</b> que se encarga de realizar una
 * petici&oacute;n a los Servicios Web de la aplicaci&oacute;n para guardar las
 * Reservas sobre los Dispositivos que han sido generadas por alg&uacute;n
 * usuario del sistema.
 * 
 * @param reserveDeviceWebService
 *            Nombre propio a ser asignado a este Servicio de <b>AngularJS</b>.
 */
manDevicesLendingModule.service('reserveDeviceWebService', function($http) {

	/**
	 * Funci&oacute;n que se encarga de ejecutar una petici&oacute;n al Servicio
	 * Web provisto por la aplicaci&oacute;n para guardar una Reserva dada sobre
	 * un determinado Dispositivo disponible en el sistema.
	 * <p>
	 * Es importante resaltar, que los usuarios normales del sistema solo
	 * podr&aacute;n realizar la Reserva sobre los Dispositivos si las fechas y
	 * horas dadas cumplen con las reglas del negocio definidas para el
	 * aplicativo.
	 * 
	 * @param deviceStatusJSON
	 *            Instancia u objeto JSON que contiene la informaci&oacute;n
	 *            sobre la Reserva del Dispositivo que ha sido solicitada por
	 *            parte del usuario.
	 */
	this.reserveDevice = function(deviceStatusJSON) {

		return ($http({
			method : 'POST',
			url : RESERVE_DEVICE_WEB_SERVICE,
			data : deviceStatusJSON
		}));
	};
});

// / *** CONTROLLERS *** / //

/**
 * Controlador en el que se re&uacute;nen todas las operaciones relacionadas con
 * el inicio de sesi&oacute;n por parte de los usuarios ante el sistema.
 * As&iacute;, en &eacute;ste se podr&aacute; realizar un inicio de
 * sesi&oacute;n para poder acceder a los procesos referentes a la
 * gesti&oacute;n de los Dispositivos.
 * <p>
 * Las vistas que se mostrar&aacute;n despu&eacute;s del inicio de
 * sesi&oacute;n, depender&aacute;n del rol de la persona que haya realizado el
 * inicio de sesi&oacute;n exitoso en el sistema.
 */
manDevicesLendingModule
		.controller(
				'loginController',
				function($scope, loginWebService, authentication) {

					/**
					 * Esta funci&oacute; se encarga de hacer el consumo del
					 * servicio web que brinda la clase {@code ClientWebService},
					 * el cual est&aacute; en esta misma aplicaci&oacute;n. Esta
					 * funci&oacute;n se encarga de obtener el usuario dado una
					 * contrase&ntilde;a y nombre de usuario, e igualmente, el
					 * perfil del usuario que est&aacute; tratando de realizar
					 * el inicio de sesi&oacute;n.
					 * <p>
					 * Si los valores devueltos por el Servicio Web est&aacute;n
					 * vac&iacute;os, la aplicaci&oacute;n no permitir&aacute;
					 * el acceso exitoso al sistema.
					 */
					$scope.login = function() {
						loginWebService
								.login($scope.userName, $scope.password)
								.success(
										function(data) {
											$scope.password = '';
											if (data != '') {
												$scope.userName = '';

												authentication.login(
														data.email,
														data.password,
														data.profile.profile);
											} else {
												alert('El Nombre de Usuario o Contraseña no son válidos.');
											}
										});
					};
				});

/**
 * Controlador en el que se re&uacute;nen todas las operaciones relacionadas con
 * los dispositivos del sistema. As&iacute;, en &eacute;ste se podr&aacute;
 * acceder a los dispositivos disponibles, reservar dispositivos, entre otras
 * funciones.
 */
manDevicesLendingModule
		.controller(
				'reserveDevicesController',
				function($scope, $cookies, availableDevicesWebService,
						reserveDeviceWebService, $location, authentication) {

					/**
					 * Llamado al servicio buscando obtener todos los
					 * dispositivos disponibles. En el caso en el que no existan
					 * dispositivos disponibles a ser mostrados, el usuario
					 * ser&aacute; redirigido a una nueva p&aacute;gina en la
					 * que es informado sobre ello; de lo contrario, se le
					 * agregar&aacute;n nuevos atributos a los datos que
					 * ser&aacute;n &uacute;tiles para mostrarlos al usuario y
					 * al momento de que ellos sean prestados o reservados.
					 */
					availableDevicesWebService
							.findAllAvailablesDevices()
							.success(
									function(data) {
										var flag = false;
										if (data == '') {
											flag = true;
										}
										$scope.availableDevicesFoundList = data.device;

										if (!flag) {
											var index;
											for (index = 0; index < $scope.availableDevicesFoundList.length; index++) {
												var device = $scope.availableDevicesFoundList[index];

												device.isReserved = 'No';
												device.startDate = new Date();
												device.startTime = new Date();
												device.endTime = new Date();
											}

										} else {
											$location
													.url("/pages/reservedevicesempty");
										}
									});

					/**
					 * Funci&oacute;n que facilita el cierre de sesi&oacute;n.
					 */
					$scope.logout = function() {
						authentication.logout();
					};

					/**
					 * Funci&oacute;n en la que se hace una validaci&oacute;n
					 * desde la capa de presentaci&oacute;n a los datos de
					 * aquellos dispositivos que van a ser reservados.
					 * As&iacute;, se realiza una validaci&oacute;n a cada
					 * dispositivo seleccionado para reserva, luego se construye
					 * el respectivo objeto <b>JSON<b> que debe ser enviado
					 * como par&aacute;metro para realizar la respectiva
					 * persistencia en el sistema. Finalmente, se determina si
					 * el guardado fue exitoso o no, ya que se pudo haber
					 * presentado la situaci&oacute;n en la que el horario en la
					 * que el dispositio desea prestarse, se cruza con otro.
					 * Este proceso se realiza por cada dispositivo seleccionado
					 * para ser reservado.
					 */
					$scope.reserveDevice = function() {
						var index;
						for (index = 0; index < $scope.availableDevicesFoundList.length; index++) {
							var d = $scope.availableDevicesFoundList[index];
							var currentDate = new Date();

							if (d.isReserved == 'Si') {
								if (currentDate.getMonth() <= d.startDate
										.getMonth()
										&& currentDate.getYear() <= d.startDate
												.getYear()) {
									if ((currentDate.getMonth() == d.startDate
											.getMonth() && currentDate
											.getDate() <= d.startDate.getDate())
											|| currentDate.getMonth() < d.startDate
													.getMonth()) {
										if (d.startTime.getHours() <= d.endTime
												.getHours()) {
											if ((d.startTime.getHours() == d.endTime
													.getHours() && d.startTime
													.getMinutes() < d.endTime
													.getMinutes())
													|| d.startTime.getHours() < d.endTime
															.getHours()) {
												if ((d.endTime.getHours() - d.startTime
														.getHours()) <= 8) {
													var deviceStatus = {
														client : {
															email : $cookies.userName
														},
														device : {
															id : d.id
														},
														endDate : d.startDate,
														endTime : d.endTime,
														startDate : d.startDate,
														startTime : d.startTime
													};

													reserveDeviceWebService
															.reserveDevice(
																	deviceStatus)
															.success(
																	function(
																			statusText) {
																		if (!angular
																				.equals(
																						statusText,
																						"")) {
																			alert('RESERVA EXITOSA\n\nDispositivo con ID: '
																					+ statusText.device.id);
																		} else {
																			alert('RESERVA NO EXITOSA\n\nDispositivo con ID: '
																					+ deviceStatus.device.id);
																		}
																	});
												} else {
													alert('EL RANGO MÁXIMO DE HORAS A PRESTAR SON 8 HORAS\n\nDispositivo con datos:\nID: '
															+ d.id
															+ '\n'
															+ 'Nombre: '
															+ d.name);
												}
											} else {
												alert('LA HORA DE INICIO NO PUEDE SER MAYOR A LA DE FINALIZACIÓN\n\nDispositivo con datos:\nID: '
														+ d.id
														+ '\n'
														+ 'Nombre: ' + d.name);
											}
										} else {
											alert('LA HORA DE INICIO NO PUEDE SER MAYOR A LA DE FINALIZACIÓN\n\nDispositivo con datos:\nID: '
													+ d.id
													+ '\n'
													+ 'Nombre: '
													+ d.name);
										}
									} else {
										alert('LA FECHA DE PRÉSTAMO NO PUEDE SER MENOR A LA ACTUAL\n\nDispositivo con datos:\nID: '
												+ d.id
												+ '\n'
												+ 'Nombre: '
												+ d.name);
									}
								} else {
									alert('AÑO O MES INVÁLIDO\n\nDispositivo con datos:\nID: '
											+ d.id + '\n' + 'Nombre: ' + d.name);
								}
							}
						}
					};
				});

/**
 * Este es el controlador que se encarga de definir el comportamiento para
 * realizar la evaluaci&oacute;n de cada una de las reservas que se han
 * realizado por cada uno de los usuarios.
 */
manDevicesLendingModule
		.controller(
				'lendingsEvaluationController',
				function($cookies, $scope, unsolvedLendingsWebService,
						evaluateLendingsWebService, $location, authentication) {

					/**
					 * Esta funci&oacute; se encarga de hacer el consumo del
					 * servicio web que brinda la clase
					 * {@code DeviceStatusWebService}, el cual est&aacute; en
					 * esta misma aplicaci&oacute;n. esta funci&oacute;n se
					 * encarga de obtener la lista de reservas que se encuentran
					 * pendientes a ser evaluadas por parte del administrador y
					 * proporcionarlas a la vista en la variable
					 * unsolvedDevicesFoundList.
					 * <p>
					 * Si la lista es vacia entonces se informa al usuario que
					 * no existen prestamos pendientes por evaluar.
					 * 
					 * @param userName
					 *            instancia que representa la propiedad que
					 *            permite la ejecuci&oacute;n de los procesos
					 *            del negocio relacionados con el nombre del
					 *            usuario.
					 */
					unsolvedLendingsWebService
							.findUnsolvedLendings($cookies.userName)
							.success(
									function(data) {
										var flag = false;

										if (data == '') {
											flag = true;
										}
										$scope.unsolvedDevicesFoundList = data.deviceStatus;

										if (angular.isArray(data.deviceStatus) == false) {
											var deviceStatus = [];
											deviceStatus
													.push(data.deviceStatus);

											$scope.unsolvedDevicesFoundList = deviceStatus;

											if (flag) {
												$location
														.url('/pages/lendingsevaluationempty');
											}
										}
									});

					/**
					 * Esta funci&oacute; se encarga de hacer el consumo del
					 * servicio web que brinda la clase
					 * {@code DeviceStatusWebService}, el cual est&aacute; en
					 * esta misma aplicaci&oacute;n. Esta funci&oacute;n se
					 * encarga de actualizar una lista de instancias de la
					 * entidad {@code DeviceStatus} que se encuentr&aacute;n
					 * pendientes a ser evaluadas por parte del administrador.
					 * 
					 * Si la lista es vacia entonces se informa al usuario que
					 * no existen prestamos pendientes por guardar.
					 */
					$scope.evaluateLendings = function() {
						var index;
						for (index = 0; index < $scope.unsolvedDevicesFoundList.length; index++) {
							var item = $scope.unsolvedDevicesFoundList[index];
							if (item.disposition.name != 'RESERVADO PENDIENTE') {
								evaluateLendingsWebService
										.evaluateLendings(item);
								$scope.unsolvedDevicesFoundList.splice(
										$scope.unsolvedDevicesFoundList
												.indexOf(item), 1);
								index--;
							}
						}

						if ($scope.unsolvedDevicesFoundList.length == 0) {
							$location.url('/pages/lendingsevaluationempty');
						}
					};

					/**
					 * Funci&oacute;n que facilita el cierre de sesi&oacute;n.
					 */
					$scope.logout = function() {
						authentication.logout();
					};
				});

/**
 * Controlador que se encarga de todo el manejo de aquellas p&aacute;ginas a las
 * que son redirigidas el usuario cuando no hay datos qu&eacute; mostrar, ya sea
 * cuando no hay evaluaciones de pr&eacute;stamos por raelizar o no hay
 * dispositivos disponibles para reservar.
 */
manDevicesLendingModule.controller('emptyController', function($scope,
		$location) {

	/**
	 * Funci&oacute;n que permite redigir al usuario (ADMINISTRADOR) a la
	 * p&aacute;gina donde se puede realizar la evaluaci&oacute;n de los
	 * pr&eacute;stamos o reservas hechas por los usuarios (INVESTIGADORES) del
	 * sistema.
	 */
	$scope.returnLendingEvaluation = function() {
		$location.url("/pages/lendingsevaluation");
	};

	/**
	 * Funci&oacute;n que permite redirigir al usuario (INVESTIGADOR) a la
	 * p&aacute;gina donde se puede ver el cat&aacute;logo de dispositivos
	 * disponibles y a partir de &eacute;ste, realizar el pr&eacute;stamo de uno
	 * o vario de ellos.
	 */
	$scope.returnReserveDevices = function() {
		$location.url("/pages/reservedevices");
	};
});