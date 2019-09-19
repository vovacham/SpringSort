<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Сортировка массива</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/w3.css"/>
</head>


<body>
<form action="${pageContext.request.contextPath}/logout" method="post">
    <input type="submit" value="Sign Out"/>
</form>
<form action="${pageContext.request.contextPath}/sort" method="post" class="w3-selection w3-light-grey w3-padding">
    <h2>Сортировка массива</h2>
    <input type="test" name="login" class="w3-input w3-animate-input w3-border w3-round-large"
           style="width: 30%"><br/>
    <input type="password" name="password" class="w3-input w3-animate-input w3-border w3-round-large"
           style="width: 30%"><br/>
    <button type="submit" name="OK" value="OK" class="w3-btn w3-green w3-round-large w3-margin-bottom">OK
    </button>
    <button type="submit" name="action" value="random" class="w3-btn w3-green w3-round-large w3-margin-bottom">Случайный
        массив
    </button>
</form>
</body>

</html>