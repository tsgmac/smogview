//angular.module('Smog', []).controller('Smog', [function($scope, $http) { 
function Smog($scope, $http) {
	$http.get('http://localhost:8080/measurements/all').success(function(data) {
			var response = angular.fromJson(data);
			$scope.measurements = response;
	});
}
//}])