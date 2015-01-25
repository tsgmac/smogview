var measurementModule = angular.module('measurementApp', ['ngAnimate']);

measurementModule.controller('measurementController', function ($scope,$http) {
	
	var urlBase			=	"";
	$scope.toggle		=	true;
	$scope.selection	=	[];
	$scope.statuses		=	['ACTIVE','COMPLETED'];
	$scope.priorities	=	['HIGH','LOW','MEDIUM'];
	$http.defaults.headers.post["Content-Type"] = "application/json";

	function findAllMeasurements() {
		
		$http.get(urlBase + '/measurements/all').
			success(function (data) {
				
				if (data._embedded != undefined) {
					$scope.measurements = data._embedded.tasks;
				} else {
					$scope.measurements = [];
				}
				
				for (var i = 0; i < $scope.measurements.length; i++) {
					
					if ($scope.measurements[i].taskStatus == 'COMPLETED') {
						 $scope.selection.push($scope.measurements[i].id);
					}
				}

				$scope.dateUtc		=	"";
				$scope.dateLocal	=	"";
				$scope.timeUtc		=	"";
				$scope.timeLocal	=	"";
				$scope.location		=	"";
				$scope.hostname		=	"";
				$scope.value		=	"";
				
				$scope.toggle		=	'!toggle';

			});
	}

	findAllMeasurements()

}

