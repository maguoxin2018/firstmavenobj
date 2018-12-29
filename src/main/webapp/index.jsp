<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/4 0004
  Time: 上午 11:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html >
<head>
    <meta charset="UTF-8">
    <title>登录</title>
    <%--<link href='https://fonts.googleapis.com/css?family=Titillium+Web:400,300,600' rel='stylesheet' type='text/css'>--%>
    <link rel="stylesheet" href="../css/normalize.min.css">
    <link rel="stylesheet" href="../css/style.css">
    <script type="text/javascript" src="js/register.js"></script>
</head>

<body style="background-image:url(img/背景.jpg);background-size: cover;width: 1300px;height: 600px">

<div class="form">

    <ul class="tab-group">
        <li class="tab"><a href="#login">登录</a></li>
        <li class="tab"><a href="#signup">注册</a></li>
    </ul>

    <div class="tab-content">
        <div id="login">
            <h1>欢迎回来!</h1>
            <form action="loginServlet" method="post">
                <div class="field-wrap">
                    <label>用户名<span class="req">:</span></label>
                    <input type="text" name="user_name" value="${username}"/>
                </div>
                <div class="field-wrap">
                    <label>密码<span class="req">:</span></label>
                    <input type="password" name="user_psw" value="${password}"/>
                </div>
                <p class="forgot"><a href="#">忘记密码?</a></p>
                <button class="button button-block"/>登录</button>
            </form>
        </div>


        <div id="signup"><h1>免费注册</h1>
            <form action="registerServlet" method="post">
                <div class="field-wrap">
                    <label>用户名<span class="req">:</span></label>
                    <input type="text" name="user_name" id="username"value="${username}" />
                    <span id="span1" style="color: red"></span>
                </div>
                <div class="field-wrap">
                    <label>Email<span class="req">:</span></label>
                    <input type="email"name="user_email" id="useremail"/>
                    <span id="span2" style="color: red"></span>
                </div>
                <div class="field-wrap">
                    <label>密码<span class="req">:</span></label>
                    <input type="password" name="user_psw" id="userpsw"/>
                    <span id="span3" style="color: red"></span>
                </div>
                <div class="field-wrap">
                    <label>手机号码<span class="req">:</span></label>
                    <input type="text" name="user_telphone" id="usertelphone"/>
                    <span id="span4" style="color: red ;text-align: center" ></span>
                </div>
                <button type="submit" id="tijiao" class="button button-block"/>提交</button>
            </form>
        </div>
    </div>

</div> <!-- /form -->
<script type="text/javascript" src="../js/jquery.min.js"></script>

<script type="text/javascript" src="../js/index.js"></script>

</body>
</html>
