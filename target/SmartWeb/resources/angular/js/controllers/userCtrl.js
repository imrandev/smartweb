'use strict';
var app = angular.module('myApp', [ 'MyOwnService' ]);
app.controller('userController', function ($scope, UserService) {
    var self = this;
    $scope.user = {};
    self.users = [];
    $scope.action = 'add';
    $scope.message = '';
    
    $scope.addUser = function () {
        var json = angular.toJson($scope.user);
        console.log(json);
        UserService.addUser($scope.user).then(
            function (response) {
                $scope.message = 'User Added!';
            }, function (errorResponse) {
                console.error(errorResponse);
            }
        );
    }
});
