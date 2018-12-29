<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/1 0001
  Time: 下午 3:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/Administration.css"/>
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>
</head>
<body>
<div id="center">
    <div id="center1-top">
        <table class="table table-hover" STYLE="width: 98% ; HEIGHT:60PX"  >
            <tr>
                <th>商品ID</th>
                <th>商品名称</th>
                <th>商品图片</th>
                <th>商品描述</th>
                <th>商品价格</th>
                <th>商品父级ID</th>
                <th>商品库存</th>
                <th>是否上架</th>
                <th>商品操作</th>
            </tr>
            <c:forEach items="${pageBean.shops}" var="shop">
                <tr>
                    <td class="qwe">${shop.shop_id}</td>
                    <td class="qwe">${shop.shop_name}</td>
                    <td class="qwe"><img src="http://10.25.148.187/photo/${shop.shop_img}" style="width: 100px;height: 70px"></td>
                    <td class="qwe">${shop.shop_des}</td>
                    <td class="qwe">${shop.shop_price}</td>
                    <td class="qwe">${shop.shop_gate_id}</td>
                    <td class="qwe">${shop.shop_stock}</td>
                    <td class="qwe">${shop.shop_isgc}</td>
                    <td class="qwe">
                        <a href="del?id=${shop.shop_id}"><input type="button" id="del" value="删除"></a>
                        <a href="shoponeServlet?id=${shop.shop_id}"><input type="button" value="修改"></a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <div id="center1-buttom">
        <nav aria-label="Page navigation">
            <ul class="pagination">
                <li>
                    <c:if test="${pageBean.pageNum>1}">
                    <a href="shopallServlet?pageNum=${pageBean.pageNum-1}" aria-label="Previous">
                        <span aria-hidden="true">上一页</span>
                    </a>
                    </c:if>
                </li>
                <c:forEach  begin="${pageBean.startPage}" end="${pageBean.endPage}" step="1" var="i">
                <li><a href="shopallServlet?pageNum=${i}">${i}</a></li>
                </c:forEach>
                <li>
                    <c:if test="${pageBean.pageNum<pageBean.allPages}" >
                        <a href="shopallServlet?pageNum=${pageBean.pageNum+1}" aria-label="Next">
                            <span aria-hidden="true">下一页</span>
                        </a>
                    </c:if>
                 </li>
            </ul>
        </nav>
    </div>
</div>
<script type="text/javascript" src="js/del.js"></script>
</body>
</html>