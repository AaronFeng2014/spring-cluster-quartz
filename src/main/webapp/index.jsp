<%@ page import="org.springframework.web.context.WebApplicationContext" %>
<%@ page import="org.springframework.web.context.support.WebApplicationContextUtils" %>
<%--
  Created by IntelliJ IDEA.
  User: FengHaixin
  Date: 2016-05-17
  Time: 9:25
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>This is my JSP</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";

    WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(application);

    String[] names = context.getBeanDefinitionNames();
%>
<body>

<h1>Spring中已经初始化的bean如下：</h1>
<%
    if (names != null && names.length > 0)
    {
        for (int i = 0, len = names.length; i < len; i++)
        {
            out.println(names[i]);
        }
    }
%>
</body>
</html>


