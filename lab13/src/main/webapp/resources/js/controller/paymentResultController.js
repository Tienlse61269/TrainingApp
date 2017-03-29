'use strict';
angular.module("travelApp").controller('paymentResultController', function($scope,$state,$stateParams,ModuleService) {
  $scope.result = $stateParams.result;
});