'use strict';
angular.module("travelApp").controller('loginController', function($rootScope,$scope,$http) {
    $scope.username="";
    $scope.password="";
    $scope.response="";
    $scope.login=false;
    $scope.checkLogin = function(){
          $http.post("/account/checkLogin?username="+$scope.username+"&password="+$scope.password,{
            ignoreLoadingBar: false,
            timeout: 0
          }).then(function (res) {
                  if (res.data!=null) 
                  {
                      $rootScope.account =  $scope.account; 
                      $scope.login = true;
                  }
                  else $scope.response="Vui lòng đăng nhập lại!";

          });  
    };
});