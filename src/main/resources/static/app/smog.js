angular.module('smogApp', ['ui.utils']).controller('Smog', function($scope, $http) {
	$http.get('http://localhost:8080/measurements/all').success(function(data) {
		$scope.measurements = angular.fromJson(data);
		$scope.predicate = 'utcDate';		
	});
});