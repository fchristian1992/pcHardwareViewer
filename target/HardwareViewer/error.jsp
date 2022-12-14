<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="title" value="Error" />
<html lang="en">
<%@include file="head.jsp"%>

<body>
<div class="container">
    <%@include file="header.jsp"%>

    <main>
        <div class="text-center">
            <h2>Oops!!</h2>
            <h3>It seems there's been an error =(</h3>
            <p>You should go back <a href="index.jsp">home</a> and try again!</p>
        </div>
    </main>
</div>
</body>

<%@include file="bootstrapScripts.jsp"%>
</html>