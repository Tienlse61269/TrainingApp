<%-- 
    Document   : admin
    Created on : Mar 20, 2017, 11:50:22 PM
    Author     : tungn
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <jsp:include page="header.jsp" ></jsp:include>
    <body ng-app="reportApp">
        <div class="wrapper" >
            <div left-menu ></div>
            <div class="main-panel">
                <div top-menu></div>
                <div class="content" >
                    <div class="container-fluid fade-in" id="main-section" ui-view></div>
                </div>
            </div>
        </div>
    </body>

    <script type="text/javascript" src="http://www.gstatic.com/charts/loader.js"></script>
    <script src="resources/bower_components/jquery/dist/jquery.js" ></script>
    <script src="resources/bower_components/jquery-ui/jquery-ui.js" ></script>
    <script src="resources/bower_components/bootstrap/dist/js/bootstrap.js" ></script>
    <script src="resources/bower_components/angular/angular.js" ></script>
    <script src="resources/bower_components/angular-bootstrap/ui-bootstrap-tpls.js" ></script>
    <script src="resources/bower_components/angular-cookies/angular-cookies.js" ></script>
    <script src="resources/bower_components/angular-sanitize/angular-sanitize.js" ></script>
    <script src="resources/bower_components/angular-ui-router/release/angular-ui-router.js" ></script>
    <script src="resources/bower_components/angular-animate/angular-animate.js" ></script>
    <script src="resources/bower_components/angular-growl-v2/build/angular-growl.js" ></script>
    <script src="resources/bower_components/angular-loading-bar/build/loading-bar.js" ></script>
    <script src="resources/bower_components/angular-ui-notification.min.js" ></script>

    <script src="resources/app/app.js" ></script>
    <script src="resources/app/config.js" ></script>

    <script src="resources/app/controller/home.controller.js" ></script>
    <script src="resources/app/controller/list.controller.js" ></script>
    <script src="resources/app/controller/add.controller.js" ></script>
    <script src="resources/app/service/module.services.js" ></script>

</html>
