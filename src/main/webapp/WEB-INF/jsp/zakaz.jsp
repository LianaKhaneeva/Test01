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

    <h3>Введите номер клиента</h3>
    <%--@elvariable id="client_d" type="com"--%>
    <form:form method = "POST" action = "/zakaz" modelAttribute="client_d">
        <table>
            <tr>
                <td><form:label path = "phone">Номер телефона:+7</form:label></td>
                <td><form:input path = "phone" /></td>
            </tr>

            <tr>
                <td colspan = "2">
                    <input type = "submit" value = "Submit"/>
                </td>
            </tr>
        </table>
    </form:form>
    <table class="table">
         <thead>
         <tr>
             <th scope="col">ID</th>
             <th scope="col">Дата создания</th>
             <th scope="col">Имя водителя</th>
             <th scope="col">Номер водителя</th>
             <th scope="col">Имя клиента</th>
             <th scope="col">Номер клиента</th>
             <th scope="col">Откуда</th>
             <th scope="col">Куда</th>
             <th scope="col">Дата отправки</th>
         </tr>
         </thead>
        <tbody>
        <c:forEach items="${List}" var="L">
            <tr>
                <th scope="row">${L.getId_zakaz()}</th>
                <th >${L.getDate()}</th>
                <td> ${L.getDriver().getName()}</td>
                <td> ${L.getDriver().getPhone()}</td>
                <td> ${L.getClient().getName()}</td>
                <td> ${L.getClient().getPhone()}</td>
                <td> ${L.getClient().getCity()}</td>
                <td> ${L.getClient().getNeed_sity()}</td>
                <td> ${L.getClient().getDate_otpr()}</td>




            </tr>
        </c:forEach>

        </tbody>
    </table>
</div>
</div>
</body>
</html>