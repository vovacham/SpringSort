<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Ошибка</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/w3.css"/>
</head>
<body>


<form class="w3-selection w3-light-grey w3-padding">
    <h2>Ошибка</h2>
    <%
        if (request.getAttribute("error") != null) {
            String err = (String) request.getAttribute("error");

            if (err.equals("NumberFormatException")) {
                out.print("<div class=\"w3-container\" <p><font size=4>" + "Некорректный ввод данных, повторите ввод" + "</font></p>\n" + "</div>");
                out.print("<div class=\"w3-container\" <p><font size=4>" + "Введенные данные: " + request.getAttribute("mass") + "</font></p>\n" + "</div>");
            }
        }
    %>
</form>

<div>
    <button class="w3-btn w3-green w3-round-large w3-margin-bottom" onclick="location.href='/sort'">На
        главную
    </button>
</div>

</body>
</html>
