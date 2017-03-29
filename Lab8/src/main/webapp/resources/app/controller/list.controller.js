/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
'use strict';
angular.module('reportApp').controller('ListController', function ($scope, $window, $state, modules) {
    console.log(modules);
    $scope.module = modules;
});

