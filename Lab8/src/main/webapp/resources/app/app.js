/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
'use strict';
angular.module('reportApp', [
    'ngSanitize',
    'ngAnimate',
    'ui.router',
    'ui.bootstrap',
    'angular-growl',
    'ui.bootstrap',
    'ui-notification',
    'angular-loading-bar'
]).config(function (cfpLoadingBarProvider, $stateProvider, $urlRouterProvider, NotificationProvider) {
    NotificationProvider.setOptions({
        delay: 10000,
        startTop: 20,
        startRight: 10,
        verticalSpacing: 20,
        horizontalSpacing: 20,
        positionX: 'left',
        positionY: 'bottom'
    });
    $stateProvider.state('admin', {
        url: '/admin',
        templateUrl: 'resources/app/templates/home.html',
        controller: 'HomeController'
    })
            .state('list-module', {
                url: '/list-module',
                templateUrl: 'resources/app/templates/list-module.html',
                controller: 'ListController',
                resolve: {
                    modules: function (ModulesServices) {
                        return ModulesServices.list().then(function (res){
                            return res.data;
                        },function (){
                           return []; 
                        });
                    }
                }
            })
                    .state('add-module', {
                        url:'add-module',
                        templateUrl: 'resources/app/templates/add-module.html',
                        controller:'AddController'
            });
    cfpLoadingBarProvider.includeSpinner = true;
    cfpLoadingBarProvider.includeBar = true;
    $urlRouterProvider.otherwise('/');
}).run(function ($rootScope) {

}).controller('TopController', ['$scope', '$window', function ($scope, $window) {
        $scope.currentUser = {
            name: 'Lý Tiến',
            statusLogin: 'A'
        };
    }]).directive('topMenu', function ($rootScope) {
    return {
        restrict: 'AE',
        templateUrl: 'resources/app/templates/topmenu.html',
        link: function (scope, elm) {

        }
    };
}).directive('leftMenu', function ($rootScope) {
    return {
        restrict: 'AE',
        templateUrl: 'resources/app/templates/leftmenu.html',
        link: function (scope, elm) {

        }
    };
});

