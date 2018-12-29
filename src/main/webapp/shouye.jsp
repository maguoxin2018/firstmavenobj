<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/4 0004
  Time: 上午 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport"content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>测试</title>
  <script src="js/adapter.js"></script> <!--rem适配js-->
  <link rel="stylesheet" href="css/base.css"> <!--初始化文件-->
  <link rel="stylesheet" href="css/menu.css"> <!--主样式-->
  <link rel="stylesheet" href="css/Administration.css"/>
  <%--<script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>--%>
  <%--<script type="text/javascript" src="js/Administration.js"></script>--%>
</head>
<body>
<div id="message" >
  <div id="title" style="color: white">
    <div id="title1">您好:${username}</div>
    <div id="title2">XXX管理平台</div>
    <div id="title3">
      <span><a href="index.jsp" style="color: white">重新登陆</a></span>&nbsp&nbsp
      <span><a href="xiaohui" style="color: white">注销</a></span>
    </div>
  </div>
  <div id="total">
    <div id="left">
      <div id="menu">
        <!--显示菜单-->
        <div id="open">
          <div class="navH">商品管理</div>
          <div class="navBox">
            <ul>
              <li><h2 class="obtain">商品管理<i></i></h2>
                <div class="secondary">
                  <a href="shopallServlet" target="justgo"><h3>查看商品</h3></a>
                  <a href="tianjiashangpin.jsp" target="justgo"><h3>添加商品</h3></a>
                  <%--<a href="updategate.jsp" target="justgo"><h3>修改类别</h3></a>--%>
                  <%--<a href="delgate.jsp" target="justgo"><h3>删除类别</h3></a>--%>
                </div>
              </li>
              <li><h2 class="obtain">类别管理<i></i></h2>
                <div class="secondary">
                  <a href="gateallServlet" target="justgo"><h3>查看类别</h3></a>
                  <a href="insertCate.jsp" target="justgo" ><h3>增加类别</h3></a>
                </div>
              </li>
              <a href="guanyu.jsp" target="justgo"><li><h2 class="obtain">关于<i></i></h2></li></a>
              <a href="huanying.jsp" target="justgo"><li><h2 class="obtain">首页<i></i></h2></li></a>
            </ul>
          </div>
        </div>
    </div>
      <script src="js/menu.js"></script> <!--控制js-->
  </div>

  <div id="right">
    <iframe src="huanying.jsp" width="100%" height="100%" name="justgo"></iframe>
  </div>
</div>
</div>

</body>
</html>
