'use strict';
angular.module("travelApp").controller('registerController', function($rootScope,$scope,$http) {
    $scope.account={};
    $scope.account.username="";
    $scope.account.password="";
    $scope.account.fullname="";
    $scope.account.address="";
    $scope.account.phone_number="";
    $scope.account.role = "user";
    $scope.register=false;
    $scope.signUp = function(){
    $http.post("/account/signUp",$scope.account,{
                ignoreLoadingBar: false,
                timeout: 0
              }).then(function (res) {
                      if (res.data!="true") 
                        {   
                            $rootScope.account = $scope.account;
                            $scope.register = true;
                        }
                      else $scope.response="Vui lòng đăng ký lại!";
              });
    }
});