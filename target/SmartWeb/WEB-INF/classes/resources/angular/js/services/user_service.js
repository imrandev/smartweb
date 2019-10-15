'use strict';
var validationHandler = angular.module('MyOwnService', []);
validationHandler.factory('UserService', function ($http, $q) {
    var REST_SERVICE_URL = 'http://localhost:8080/';
    return {
        addUser: addUser,
        updateUser: updateUser,
        deleteUser: deleteUser
    };

    function addUser(user) {
        console.log("add user called");
        var deferred = $q.defer();

        $http.post(REST_SERVICE_URL + 'user/add-user', user).then(
            function (response) {
                deferred.resolve(response.data);
            }, function (errorResponse) {
                console.error(errorResponse);
                deferred.reject(errorResponse);
            }
        );
        return deferred.promise;
    }

    function updateUser(user) {

    }

    function deleteUser(user) {

    }
});