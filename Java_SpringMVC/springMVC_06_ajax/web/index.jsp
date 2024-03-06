<%--
  Created by IntelliJ IDEA.
  User: de-luce
  Date: 2024/3/3
  Time: 12:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>

    <script src="${pageContext.request.contextPath}/static/js/jquery-3.7.1.js"></script>

    <script>
        function blurtest() {
            $.post({
                url: "${pageContext.request.contextPath}/a1",
                data: {"name": $("username").val()},
                success: function (data) {
                    alert(data);
                }
            })
        }
    </script>

</head>
<body>

<%--失去焦点发送请求到后台--%>
用户名：<input type="text" id="username" onblur="blurtest()">

</body>
</html>
