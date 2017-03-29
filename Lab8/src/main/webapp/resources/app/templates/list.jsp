<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<div class="row">
    <div class="card">
        <div class="content" style="float: right;"><button class="btn btn-default" type="button" ng-click="addNew();">Add</button></div>
        <div class="content table-responsive table-full-width" >
            <table class="table table-hover table-striped" >
                <thead>
                <th>ID</th>
                <th>NAME</th>
                <th>CLASS</th>
                <th>PERSON</th>
                </thead>
                
                <tbody>
                    <tr ng-repeat="m in module">
                        <td>{{m.id}}</td>
                        <td>{{m.name}}</td>
                        <td>Running: {{m.classModel.running}} Release: {{m.classModel.release}} Total: {{m.classModel.total}}</td>
                        <td>Running: {{m.personModel.running}} Release: {{m.personModel.release}} Total: {{m.personModel.total}}</td>
                        <td></td>
                        <td>{{}}</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>