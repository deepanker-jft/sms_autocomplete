<%--
  Created by IntelliJ IDEA.
  User: amit
  Date: 2/1/17
  Time: 11:39 AM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta content="main" name="layout">
    <title></title>
</head>

<body>
    <g:hasErrors>
        <g:renderErrors  bean="${country}" as = 'list'>
        </g:renderErrors>
    </g:hasErrors>
</body>
</html>