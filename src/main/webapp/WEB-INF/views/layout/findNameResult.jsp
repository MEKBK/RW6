<%--
  Created by IntelliJ IDEA.
  User: kai
  Date: 2021/3/19
  Time: 16:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%--<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">--%>
<html>
<head>
    <title>测试-数据穿透缓存</title>
</head>

<body>
<form>
    <h1>查询结果</h1>
    姓名 ：${excellentStudent.name}<br>
    职位 ：${excellentStudent.position}<br>
    薪水 ：${excellentStudent.salary}<br>
    介绍:${excellentStudent.description}<br>
    图片位置:${excellentStudent.image}<br>
</form>
</body>
</html>
