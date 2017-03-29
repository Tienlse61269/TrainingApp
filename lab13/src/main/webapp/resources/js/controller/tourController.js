'use strict';
angular.module("travelApp").controller('tourController', function($scope,$state) {
    $scope.saveModule = function(){
         $state.go("home");
    };
});
