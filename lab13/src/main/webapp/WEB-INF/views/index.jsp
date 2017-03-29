<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="UTF-8">
    <!-- CSS (load bootstrap) -->
        <!--<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">-->
    <link data-require="bootstrap-css@*" data-semver="3.3.1" rel="stylesheet" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css" />
    <link href="/resources/css/main.css" rel="stylesheet" type="text/css" />
    <!-- Vendor CSS -->
    <link href="/resources/vendors/mediaelement/mediaelementplayer.css" rel="stylesheet" type="text/css">
    <link href="/resources/vendors/fullcalendar/fullcalendar.css" rel="stylesheet" type="text/css">
    <link href="/resources/vendors/animate-css/animate.min.css" rel="stylesheet" type="text/css">
    <link href="/resources/vendors/sweet-alert/sweet-alert.min.css" rel="stylesheet" type="text/css">
    <link href="/resources/vendors/material-icons/material-design-iconic-font.min.css" rel="stylesheet" type="text/css">
    <link href="/resources/vendors/socicon/socicon.min.css" rel="stylesheet" type="text/css">
    <!-- CSS -->
    <link href="/resources/css/app.min.1.css" rel="stylesheet">
    <link href="/resources/css/app.min.2.css" rel="stylesheet">
    <style>
        .navbar { border-radius:0; }
    </style>
</head>
<!-- apply our angular app to our site -->
<body ng-app="travelApp" data-spy="scroll" data-target=".navbar" data-offset="60" ng-cloak>
<!-- NAVIGATION -->
<nav class="navbar navbar-default navbar-fixed-top" role="navigation">
    <div class="collapse navbar-collapse" id="myNavbar">
    <ul class="nav navbar-nav">
        <li><a ui-sref="home">Home</a></li>
        <li><a ui-sref="login">Sign In</a></li>
        <li><a ui-sref="register">Sign up</a></li>
        <li><a href="https://team-phong-ui.run.aws-usw02-pr.ice.predix.io">Admin</a></li>
    </ul>
    </div>
</nav>
<!-- MAIN CONTENT -->
<div class="container">
    <!-- THIS IS WHERE WE WILL INJECT OUR CONTENT ============================== -->
    <div ui-view></div>
</div>
<!--<script src="/resources/js/angularjs.js"></script>-->
<!--<script src="/resources/js/ui-bootstrap-tpls.js"></script>-->
<script data-require="angular.js@*" data-semver="1.3.15" src="https://code.angularjs.org/1.3.15/angular.js"></script>
<script data-require="ui-bootstrap@*" data-semver="0.12.1" src="http://angular-ui.github.io/bootstrap/ui-bootstrap-tpls-0.12.1.min.js"></script>
<!-- Google Map API -->
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyBFGjAowaBYq_aGuGLE1oOXl89OPWhZ4Zs&libraries=places,geometry" async defer></script>
<!-- JS (load angular, ui-router, and our custom js file) -->
<script src="/resources/js/angular-route.min.js"></script>
<script type="text/javascript" src="/resources/js/app.js"></script>
<script src="/resources/js/jquery-2.1.1.min.js"></script>
<script src="/resources/js/bootstrap.min.js"></script>
<script src="/resources/js/config.js"></script>
<script src="/resources/js/service/ModuleService.js"></script>
<script src="/resources/js/controller/homeController.js"></script>
<script src="/resources/js/controller/loginController.js"></script>
<script src="/resources/js/controller/registerController.js"></script>
<script src="/resources/js/controller/customerController.js"></script>
<script src="/resources/js/controller/paymentController.js"></script>
<script src="/resources/js/controller/paymentResultController.js"></script>
</body>
</html>