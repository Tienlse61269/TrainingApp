'use strict';
angular.module("travelApp").controller('paymentController', function($scope,$state,$stateParams,ModuleService) {
  $scope.customer = $stateParams.customer;
 $scope.payment = function(){
     var result = ModuleService.result_payment($scope.customer).then(function (res){
                        return res.data;
                    },function (){
                       return []; 
                    });
     $state.go('result',{result:result});
 };
    
});