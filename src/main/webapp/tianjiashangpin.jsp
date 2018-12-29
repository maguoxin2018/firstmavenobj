<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/1 0001
  Time: 下午 3:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/Administration.css"/>
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="js/addshop.js"></script>
</head>
<body>
<div id="center1">
    <form action="insertServlet" method="post" enctype="multipart/form-data">
        <div class="inspect">
            <div class="inspect-left">
                <ul>
                    <li>商品ID</li>
                    <li><input type="text" name="shop_id" class="asd"></li>
                    <li >商品名称</li>
                    <li><input type="text" name="shop_name"  class="asd"></li>
                    <li>商品描述</li>
                    <li><input type="text" name="shop_des"  class="asd"></li>
                    <li>商品价格</li>
                    <li><input type="text" name="shop_price" class="asd"></li>
                    <li>商品父级ID</li>
                    <li><input type="text" name="shop_gate_id"  class="asd"></li>
                </ul>
            </div>
            <div class="inspect-right">
                <ul>
                    <li>商品库存</li>
                    <li><input type="text" name="shop_stock"  class="asd"></li>
                    <li>是否上架</li>
                    <li><input type="text" name="shop_isgc"  class="asd"></li>
                    <br>
                    <li><img  id="imgs" style="width: 240px;height: 150px"></li>
                    <li><a href="javascript:;" class="file">选择图片<input type="file" name="shop_img" id="shop_img" ></a></li>
                    <li><span>${message}</span></li>
                </ul>
            </div>
        </div>
        <div style="display: flex;align-items: center"><input type="submit" style="display: block; margin: 0 auto;width: 100px;height: 30px" value="添加商品"></div>
    </form>
</div>
</body>
</html>
