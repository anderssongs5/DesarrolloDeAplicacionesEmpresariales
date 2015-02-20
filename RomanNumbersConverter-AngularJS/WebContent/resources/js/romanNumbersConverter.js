// Web Service URL
var ROMAN_NUMBERS_CONVERTER_WEB_SERVICE_URL = 'http://romannumbersconvererws.herokuapp.com/rest/romanconverter?';

// Module
var romanNumbersConverterModule = angular.module('romanNumbersConverterModule',
		[ 'ngRoute' ]);

// Controller
romanNumbersConverterModule
		.controller(
				'romanNumbersConverterController',
				function($scope, romanNumbersConverterWS) {
					$scope.convertToRomanNumber = function() {
						romanNumbersConverterWS
								.convertToRomanNumber($scope)
								.success(
										function(data) {
											if (data != '') {
												$scope.romanNumber = data.romanNumber;
											} else {
												$scope.romanNumber = '';
												alert('El número se ha podido convertir. Inténtelo de nuevo.');
											}
										})
								.error(
										function(data) {
											$scope.romanNumber = '';
											alert('El número se ha podido convertir. Inténtelo de nuevo.');
										});
					};
				});

// Service
romanNumbersConverterModule
		.service(
				'romanNumbersConverterWS',
				function($http) {

					this.convertToRomanNumber = function($scope) {

						if (($scope.numberToConvert == undefined)
								|| ($scope.numberToConvert == '')
								|| ($scope.numberToConvert < 1)
								|| ($scope.numberToConvert > 3999 || ($scope.numberToConvert == ''))) {
							$scope.romanNumber = '';

							alert('El número no es válido. Inténtelo de nuevo.');
						} else {
							return ($http({
								method : 'GET',
								params : {
									number : $scope.numberToConvert
								},
								url : ROMAN_NUMBERS_CONVERTER_WEB_SERVICE_URL
							}));
						}
					};
				});

// Runners
romanNumbersConverterModule.run(function($rootScope, $location) {
	$rootScope.$on('$routeChangeStart', function() {
		$location.url('/');
	});
});

// Configuration
romanNumbersConverterModule.config([ '$routeProvider',
		function($routeProvider) {
			$routeProvider.when('/', {
				templateUrl : './pages/romanNumbersConverter.html',
				controller : 'romanNumbersConverterController'
			});
		} ]);