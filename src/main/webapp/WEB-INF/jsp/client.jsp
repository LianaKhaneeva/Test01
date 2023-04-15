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

        <div class="col-6">
            <h1>Ваш клиент!</h1>
            <h3>Имя:${L.getName()}</h3>
            <h3>Номер телефона: ${L.getPhone()}</h3>
            <h3>Город нахождения: ${L.getCity()}</h3>
            <h3>Вес груза:${L.getNeed_w()}</h3>
            <h3>Город доставки: ${L.getNeed_sity()}</h3>
            <h3>Объем груза ${L.getNeed_v()}</h3>
            <h3>Дата отправки: ${L.getDate_otpr()}</h3>

        </div>

        <%--@elvariable id="driver_d" type="com"--%>
        <form:form method = "POST" action = "/sdelD/${L.getId()}" modelAttribute="driver_d">
            <table>
                <tr>
                    <td><form:label path = "phone">Введите ваш номер:+7</form:label></td>
                    <td><form:input path = "phone" /></td>
                </tr>


                <tr>
                    <td colspan = "2">
                        <input type = "submit" value = "Submit"/>
                    </td>
                </tr>
            </table>
        </form:form>
    </div>
</div>
</body>
</html>