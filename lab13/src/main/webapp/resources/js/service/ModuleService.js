'use strict';
angular.module("travelApp").factory("ModuleService",function(Config,$http){
    return {
        list : function(){
            var url = Config.api + "tour/getAll";
            return $http.get(url);
        },
        result_payment : function(customer){
            var url = Config.api + "payment/addPayment";
            return $http.post(url,customer);
        }
    };
});