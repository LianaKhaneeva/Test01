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

    <table class="table">
        <thead>
        <tr>
            <th scope="col">Имя</th>
            <th scope="col">Номер</th>
            <th scope="col">Город</th>
            <th scope="col">Вес(Т)</th>
            <th scope="col">Объем(m^3)</th>
            <th scope="col">Выбрать</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${List}" var="L">
            <tr>
                <th scope="row">${L.getName()}</th>
                <td> ${L.getPhone()}</td>
                <td> ${L.getCity()}</td>
                <td> ${L.getMax_w()}</td>
                <td> ${L.getV()}</td>
               <td> <a href="http://localhost:8080/ChoiseD/${L.getId()}" class="btn btn-primary">Выбрать</a></td>

            </tr>
        </c:forEach>

        </tbody>
    </table>
    </div>
</div>
</body>
</html>