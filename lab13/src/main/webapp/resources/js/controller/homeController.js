'use strict';
angular.module("travelApp").controller('homeController', function($scope,$http,list,$state) {
    $scope.filteredTodos = [];
    $scope.currentPage = 1;
    $scope.numPerPage = 9;     
    $scope.tours = list;
    $scope.$watch('currentPage + numPerPage', function() {
            var begin = (($scope.currentPage - 1) * $scope.numPerPage)
            , end = begin + $scope.numPerPage;
            $scope.filteredTodos = $scope.tours.slice(begin, end);
            console.log($scope.filteredTodos);
        });
    $scope.loadMap = function (id){
        if (document.getElementById('map'+id).value == null){
            var mapOptions = {
			zoom : 10,
			center : new google.maps.LatLng(10.8230989, 106.6296638), //mặc định toạ độ Hồ Chí Minh
			mapTypeId : google.maps.MapTypeId.ROADMAP
		}
        $scope.map = new google.maps.Map(document.getElementById('map'+id),mapOptions);
        }
    }
    $scope.bookTour = function(tour){
        $state.go('customer',{tour:JSON.stringify(tour)});
    };
});