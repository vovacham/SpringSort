<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Аутентификация</title>
    <link rel="stylesheet" href="/resources/w3.css"/>
</head>
<body>

 <%
    if (request.getAttribute("err") != null) {
        String errStr = (String) request.getAttribute("err");

        if (errStr.equals("userExist")) {
            out.print("<div class=\"w3-container\" <p><font size=4>" + "Пользователь существует, повторите ввод" + "</font></p>\n" + "</div>");
        }
    }
%>

<form action="${pageContext.request.contextPath}/reg" method="post" class="w3-selection w3-light-grey w3-padding">
    <h2>Добавление нового пользователя</h2>
    <input type="text" name="username" class="w3-input w3-animate-input w3-border w3-round-large"
           style="width: 30%"><br/>
    <input type="password" name="password" class="w3-input w3-animate-input w3-border w3-round-large"
           style="width: 30%"><br/>
    <button type="submit" name="OK" value="OK" class="w3-btn w3-green w3-round-large w3-margin-bottom">OK
    </button>
</form>
</body>

</html>
