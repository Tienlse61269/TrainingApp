'use strict';
angular.module('reportApp').controller('AddController', function ($scope, $window, $state, Notification,ModulesServices) {
    $scope.module ={
        name: '',
        issueModel: [],
        classModel: {
            total: '',
            running: '',
            release: ''
        },
        personModel: {
            total: '',
            running: '',
            release: ''
        }
    }
    $scope.saveModule = function (){
        ModulesServices.save($scope.module).then(function (){
            Notification.success({message: 'save successful', delay: 1000});
            $state.go("list-module")
        })
    }
});

