define(['angular', 'angular-ui-router', 'jquery'], function(angular, r, $) {
  'use strict';
  return angular.module('app.routes', ['ui.router']).config([
    '$stateProvider',
    '$urlRouterProvider',
    '$locationProvider',
    function($stateProvider, $urlRouterProvider, $locationProvider) {

      //Turn on or off HTML5 mode which uses the # hash
      $locationProvider.html5Mode(true).hashPrefix('!');
      window.stateProviderRef = $stateProvider;
      /**
       * Router paths
       * This is where the name of the route is matched to the controller and view template.
       */
      
      $stateProvider
        .state('base', {
          template: '<ui-view/>',
          abstract: true
        })
        .state('home', {
          url: '/home',
          templateUrl: 'views/home.html',
          controller: 'HomeController',
        })
        ;

      $urlRouterProvider.otherwise(function($injector) {
        var $state = $injector.get('$state');
        document.querySelector('px-app-nav').markSelected('/dashboard');
        $state.go('refridgerated.dashboard');
      });

    }]);
});
