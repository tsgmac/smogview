//works until AngularJS 1.2.27 (inclusive)
//function Smog($scope, $http) {
//	$http.get('http://localhost:8080/measurements/all').success(function(data) {
//			var response = angular.fromJson(data);
//			$scope.measurements = response;
//	});
//}

//and now the AngularJS 1.3 way
angular.module('smogApp', []).controller('Smog', function ($scope, $http) {
    $http.get('http://localhost:8080/measurements/all').
        success(function(data) {
        	$scope.measurements = angular.fromJson(data);           
        });
});