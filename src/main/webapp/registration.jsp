<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />


<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Create an Account - Eventify</title>
    <link rel="stylesheet" href="${contextPath}/resources/assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${contextPath}/resources/assets/css/Features-Blue.css">
    <link rel="stylesheet" href="${contextPath}/resources/assets/css/Registration-Form-with-Photo.css">
    <link rel="stylesheet" href="${contextPath}/resources/assets/css/styles.css">
    <link rel="stylesheet" href="${contextPath}/resources/assets/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Cabin:700">
    <link rel="stylesheet" href="${contextPath}/resources/assets/fonts/font-awesome.min.css">
</head>

<body>
    <div class="register-photo">
        <div class="form-container">
            <div class="image-holder"></div>
            <form:form method="POST" modelAttribute="userForm" class="form-signin">
            <h2 class="form-signin-heading">Create your account</h2>
            
            <spring:bind path="name">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="name" class="form-control" placeholder="Name"
                                autofocus="true"></form:input>
                    <form:errors path="name"></form:errors>
                </div>
            </spring:bind>

            <spring:bind path="email">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="email" path="email" class="form-control" placeholder="Email"
                                ></form:input>
                    <form:errors path="email"></form:errors>
                </div>
            </spring:bind>

            <spring:bind path="dob">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="date" path="dob" class="form-control" placeholder="dob"
                                ></form:input>
                    <form:errors path="dob"></form:errors>
                </div>
            </spring:bind>
            
            <spring:bind path="country">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:select class="form-control" id="country" path="country">
                    	<option selected value="IN">India</option>
                    	<option value="US">USA</option>
                    </form:select>
                    <form:errors path="dob"></form:errors>
                </div>
            </spring:bind>

            
            <spring:bind path="username">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="text" path="username" class="form-control" placeholder="Username"
                                ></form:input>
                    <form:errors path="username"></form:errors>
                </div>
            </spring:bind>

            <spring:bind path="password">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="password" path="password" class="form-control" placeholder="Password"></form:input>
                    <form:errors path="password"></form:errors>
                </div>
            </spring:bind>

            <spring:bind path="passwordConfirm">
                <div class="form-group ${status.error ? 'has-error' : ''}">
                    <form:input type="password" path="passwordConfirm" class="form-control"
                                placeholder="Confirm your password"></form:input>
                    <form:errors path="passwordConfirm"></form:errors>
                </div>
            </spring:bind>
			<br>
            <button class="btn btn-lg btn-danger btn-block" type="submit">Submit</button>
        </form:form>
            
        </div>
    </div>
    <section id="contact" class="content-section text-center" style="height: 450px;padding: 50px,0px,0px,0px;">
        <div class="container">
            <div class="row">
                <div class="col-lg-8 mx-auto">
                    <h2>Contact us</h2>
                    <p>Feel free to leave us a comment on the<a href="#">&nbsp; Eventify &nbsp;</a>&nbsp;to give some
                        feedback about this service!</p>
                    <ul class="list-inline banner-social-buttons">
                        <li class="list-inline-item">&nbsp;<button class="btn btn-primary btn-lg btn-default"
                                type="button"><i class="fa fa-google-plus fa-fw"></i><span class="network-name">&nbsp;
                                    Google</span></button></li>
                        <li class="list-inline-item">&nbsp;<button class="btn btn-primary btn-lg btn-default"
                                type="button"><i class="fa fa-twitter fa-fw"></i><span
                                    class="network-name">&nbsp;Twitter</span></button></li>
                        <li class="list-inline-item">&nbsp;<button class="btn btn-primary btn-lg btn-default"
                                type="button"><i class="fa fa-instagram fa-fw"></i><span
                                    class="network-name">&nbsp;insta</span></button></li>
                    </ul>
                </div>
            </div>
        </div>
    </section>
    <div class="map-clean"></div>
    <footer>
        <div class="container text-center">
            <p>Copyright ©&nbsp;Brand 2018</p>
        </div>
    </footer>
    <script src="${contextPath}/resources/assets/js/jquery.min.js"></script>
    <script src="${contextPath}/resources/assets/bootstrap/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.4.1/jquery.easing.min.js"></script>
    <script src="${contextPath}/resources/assets/js/grayscale.js"></script>
    <script src="${contextPath}/resources/assets/js/jquery.min.js"></script>
    <script src="${contextPath}/resources/assets/bootstrap/js/bootstrap.min.js"></script>
</body>

</html>