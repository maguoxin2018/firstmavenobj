<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/5 0005
  Time: 上午 8:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/Administration.css"/>
</head>
<body>
    <div style="display: flex;justify-content: center;align-items: center;height: 100%">
        <form action="insertgateServlet" method="post">
        <ul style="list-style: none;text-align: center">
            <li>类别id</li>
            <li><input type="text" class="asd" name="shop_gate_id"></li>
            <br>
            <li>类别名称</li>
            <li><input type="text" class="asd" name="gate_name"></li>
            <br>
            <li>类别父级id</li>
            <li><input type="text" class="asd" name="gate_parent_id"></li>
        </ul>
            <input type="submit" >
         </form>
    </div>
</body>
</html>
