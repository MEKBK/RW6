<%--
  Created by IntelliJ IDEA.
  User: kai
  Date: 2021/3/19
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<c:set value="${pageContext.request.contextPath}" var="path" scope="page"/>
<div align="center">
<form action="${path}/findPage" method="post" enctype="multipart/form-data" accept-charset="UTF-8">
    <%--<form action="FIND">--%>
    <h1>查询用户</h1>
    <fieldset>
        姓名 ：<input type="text" placeholder="姓名" name="name"><br/>

        <p id="buttons">
            <input  id="submit" type="submit" value="查询">
        </p>
    </fieldset>
</form>
</div>
</body>
</html>
