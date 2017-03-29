<%-- 
    Document   : header
    Created on : Mar 20, 2017, 11:27:40 PM
    Author     : tungn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <meta name="_csrf" content="${_csrf.token}"/>
    <!-- default header name is X-CSRF-TOKEN -->
    <meta name="_csrf_header" content="${_csrf.headerName}"/>
    <title>Book Management</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <link rel="icon" type="image/png" href="resources/themes/lbd/assets/img/favicon.ico"  type="text/css"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport' />
    <meta name="viewport" content="width=device-width" />
    <!-- Bootstrap core CSS     -->
    <link href="resources/themes/lbd/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    <!-- Animation library for notifications   -->
    <link href="resources/themes/lbd/assets/css/animate.min.css" rel="stylesheet" type="text/css"/>
    <link href="resources/app/css/my-css.css" rel="stylesheet" type="text/css"/>
    <!--  Light Bootstrap Table core CSS    -->
    <link href="resources/themes/lbd/assets/css/light-bootstrap-dashboard.css" rel="stylesheet" type="text/css"/>
    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="resources/themes/lbd/assets/css/demo.css" rel="stylesheet" type="text/css"/>
    <link href="resources/bower_components/angular-growl-v2/build/angular-growl.css" rel="stylesheet" type="text/css"/>
    <link href="resources/bower_components/angular-loading-bar/build/loading-bar.css" rel="stylesheet" type="text/css"/>

    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet" type="text/css"/>
    <link href='http://fonts.googleapis.com/css?family=Roboto:400,700,300' rel='stylesheet' type='text/css'/>
    <link href="resources/themes/lbd/assets/css/pe-icon-7-stroke.css" rel="stylesheet" type="text/css"/>
</html>
