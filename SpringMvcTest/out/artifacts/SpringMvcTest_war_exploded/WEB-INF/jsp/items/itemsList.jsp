<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: galaxy
  Date: 19-3-31
  Time: 下午7:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<html>
<head>
    <meta http-equiv="content-type" content="text/html;charset=UTF-8">
    <title>查询商品列表</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/item/queryItem.action" method="post">
    查询条件：
    <table width="100%" border="1">
        <tr>
            <td><input type="submit" value="查询"></td>
        </tr>
    </table>
    商品列表：
    <table width="100%" border="1">
        <tr>
            <td>商品名称</td>
            <td>商品价格</td>
            <td>生产日期</td>
            <td>商品描述</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${itemsList}" var="item">
            <tr>
            <td>${item.name}</td>
            <td>${item.price}</td>
            <td>${item.detail}</td>
            <td><a href="${pageContext.request.contextPath}/item/queryItem.action?id=${item.name}">修改</a></td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>