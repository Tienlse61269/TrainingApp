'use strict';
angular.module("travelApp").controller('customerController', function($scope,$state,$stateParams) {
  var tour = $stateParams.tour;
  $scope.customer = {
     id : null,
     tour: JSON.parse(tour),
     created_date: new Date(),
     name : '',
     address : '',
     phone_number : '',
     quantity : 2,
     comment : ''
  };
 $scope.continue = function(){
     $state.go("payment",{customer:JSON.stringify($scope.customer)});
 };
    
});