<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
  <head>
      <meta charset="utf-8">
      <title>Create an account</title>

      <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
      <link href="${contextPath}/resources/css/common.css" rel="stylesheet">
  </head>

  <body>

    <div class="container">
    
    <div class="container" style="background: lightblue">
    	<h1 style="text-align: center">Eventify</h1>
    </div>

        <form:form method="POST" modelAttribute="eventForm" class="form-signin">
            <h2 class="form-signin-heading">Create an Event</h2>
            
            <spring:bind path="name">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="name" class="form-control" placeholder="Name"
                                autofocus="true"></form:input>
                    <form:errors path="name"></form:errors>
                </div>
            </spring:bind>

            <spring:bind path="description">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="description" class="form-control" placeholder="Description"
                                ></form:input>
                    <form:errors path="description"></form:errors>
                </div>
            </spring:bind>
            
            <spring:bind path="category">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:select class="form-control" id="category" path="category">
                    	<option selected value="Music">Music</option>
                    	<option value="Dance">Dance</option>
                    	<option value="Comedy">Comedy</option>
                    </form:select>
                    <form:errors path="category"></form:errors>
                </div>
            </spring:bind>

            <spring:bind path="startDate">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="date" path="startDate" class="form-control" placeholder="startDate"
                                ></form:input>
                    <form:errors path="startDate"></form:errors>
                </div>
            </spring:bind>

            <spring:bind path="endDate">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="date" path="endDate" class="form-control" placeholder="endDate"
                                ></form:input>
                    <form:errors path="endDate"></form:errors>
                </div>
            </spring:bind>
            
            <spring:bind path="capacity">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="number" path="capacity" class="form-control" placeholder="Capacity"
                                ></form:input>
                    <form:errors path="capacity"></form:errors>
                </div>
            </spring:bind>
            
            <spring:bind path="fee">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="number" path="fee" class="form-control" placeholder="Fee"
                                ></form:input>
                    <form:errors path="fee"></form:errors>
                </div>
            </spring:bind>

            <button class="btn btn-lg btn-primary btn-block" type="submit">Submit</button>
        </form:form>

    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="${contextPath}/resources/js/bootstrap.min.js"></script>
  </body>
</html>
