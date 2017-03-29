/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
'use strict';
angular.module('reportApp').factory('ModulesServices', function (Config, $http, $window) {
    return {
        list: function () {
            var url = Config.api + 'api/module';
            return $http.get(url);
        },
        save: function (currentModules) {
            var url = Config.api + 'api/module';
            return $http.post(url, currentModules);
        }
    };
});

