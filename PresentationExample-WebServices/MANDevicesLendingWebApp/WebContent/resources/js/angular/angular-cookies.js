/*
 * Extra�do de https://github.com/angular/angular.js/blob/master/src/ngCookies/cookies.js#L21
 */
(function(window, angular, undefined) {
	'use strict';

	angular
			.module('ngCookies', [ 'ng' ])
			.factory(
					'$cookies',
					[
							'$rootScope',
							'$browser',
							function($rootScope, $browser) {
								var cookies = {}, lastCookies = {}, lastBrowserCookies, runEval = false, copy = angular.copy, isUndefined = angular.isUndefined;

								$browser.addPollFn(function() {
									var currentCookies = $browser.cookies();
									if (lastBrowserCookies != currentCookies) {
										lastBrowserCookies = currentCookies;
										copy(currentCookies, lastCookies);
										copy(currentCookies, cookies);
										if (runEval)
											$rootScope.$apply();
									}
								})();

								runEval = true;

								$rootScope.$watch(push);

								return cookies;

								function push() {
									var name, value, browserCookies, updated;

									for (name in lastCookies) {
										if (isUndefined(cookies[name])) {
											$browser.cookies(name, undefined);
										}
									}

									for (name in cookies) {
										value = cookies[name];
										if (!angular.isString(value)) {
											value = '' + value;
											cookies[name] = value;
										}
										if (value !== lastCookies[name]) {
											$browser.cookies(name, value);
											updated = true;
										}
									}

									if (updated) {
										updated = false;
										browserCookies = $browser.cookies();

										for (name in cookies) {
											if (cookies[name] !== browserCookies[name]) {
												if (isUndefined(browserCookies[name])) {
													delete cookies[name];
												} else {
													cookies[name] = browserCookies[name];
												}
												updated = true;
											}
										}
									}
								}
							} ]).

			factory('$cookieStore', [ '$cookies', function($cookies) {

				return {
					get : function(key) {
						var value = $cookies[key];
						return value ? angular.fromJson(value) : value;
					},
					put : function(key, value) {
						$cookies[key] = angular.toJson(value);
					},
					remove : function(key) {
						delete $cookies[key];
					}
				};

			} ]);
})(window, window.angular);