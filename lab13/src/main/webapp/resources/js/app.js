angular.module('travelApp', ['ui.router', 'ui.bootstrap'])
    .config(['$stateProvider','$urlRouterProvider',
        function($stateProvider,$urlRouterProvider) {
    $urlRouterProvider.otherwise('/');
    $stateProvider
        .state('home', {
            url: '/home',
            templateUrl: 'resources/html/table-data.html',
            controller: 'homeController',
            resolve: {
                list : function(ModuleService){
                    return ModuleService.list().then(function (res){
                        return res.data;
                    },function (){
                       return []; 
                    });
                }
            }
        })
        .state('login', {
            url: '/login',
            templateUrl: 'resources/html/login.html',
            controller: 'loginController'
        })
        .state('register', {
            url: '/register',
            templateUrl: 'resources/html/register.html',
            controller: 'registerController'
        })  
        .state('customer', {
            url: '/customer/:tour',
            templateUrl: 'resources/html/customer1.html',
            controller: 'customerController'
        })
        .state('payment', {
            url: '/payment/:customer',
            templateUrl: 'resources/html/payment.html',
            controller: 'paymentController'
        })
        .state('result', {
            url: '/payment/result/:result',
            templateUrl: 'resources/html/result.html',
            controller: 'paymentResultController'
        });    
}]);



