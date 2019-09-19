<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Аутентификация</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/w3.css"/>
</head>
<body>
<form action="${pageContext.request.contextPath}/login" method="post" class="w3-selection w3-light-grey w3-padding">
    <h2>Введите имя/пароль</h2>
    <input type="text" name="login" class="w3-input w3-animate-input w3-border w3-round-large"
           style="width: 30%"><br/>
    <input type="password" name="password" class="w3-input w3-animate-input w3-border w3-round-large"
           style="width: 30%"><br/>
    <button type="submit" name="OK" value="OK" class="w3-btn w3-green w3-round-large w3-margin-bottom">OK
    </button>
</form>

<div>
    <button class="w3-btn w3-green w3-round-large w3-margin-bottom" onclick="location.href='/reg'">Регистрация
    </button>
</div>

</body>

</html>
