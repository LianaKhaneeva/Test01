<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Сайт покупи роботов</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
</head>
<body>
<jsp:include page="mapping_page.jsp"/>
<div class="container-fluid">

    <div class="row">

        <%--@elvariable id="driver_d" type="com"--%>
        <form:form method = "POST" action = "/regDr" modelAttribute="driver_d">
            <table>
                <tr>
                    <td><h1>Я водитель</h1></td>
                </tr>
                <tr>
                    <td><form:label path = "phone">Номер телефона:+7</form:label></td>
                    <td><form:input path = "phone" /></td>
                </tr>
                <tr>
                    <td><form:label path = "password">Пароль: </form:label></td>
                    <td><form:input path = "password" /></td>
                </tr>
                <tr>
                    <td><form:label path = "name">ФИО:</form:label></td>
                    <td><form:input path = "name" /></td>
                </tr>
                <tr>
                    <td><form:label path = "city">Город: </form:label></td>
                    <td><form:input path = "city" /></td>
                </tr>
                <tr>
                    <td><form:label path = "CAname">Марка авто:</form:label></td>
                    <td><form:input path = "CAname" /></td>
                </tr>
                <tr>
                    <td><form:label path = "model">Модель авто: </form:label></td>
                    <td><form:input path = "model" /></td>
                </tr>
                <tr>
                    <td><form:label path = "PRname">Название прицепа:</form:label></td>
                    <td><form:input path = "PRname" /></td>
                </tr>
                <tr>
                    <td><form:label path = "V">Максимальный объем груза(m^3):</form:label></td>
                    <td><form:input path = "V" /></td>
                </tr>
                <tr>
                    <td><form:label path = "max_w">Максимальный вес груза(т):</form:label></td>
                    <td><form:input path = "max_w" /></td>
                </tr>

                <tr>
                    <td colspan = "2">
                        <input type = "submit" value = "Submit"/>
                    </td>
                </tr>
            </table>
        </form:form>
        <div>

            <a href="http://localhost:8080/registration">Я клиент</a>
        </div>
    </div>
</div>
</body>
</html>