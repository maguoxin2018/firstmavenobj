<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/12/5 0005
  Time: 上午 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/Administration.css"/>
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="js/bootstrap.min.js"></script>

</head>
<body>
<div id="center" style="background-color: beige">
    <div id="center1-top">
        <table class="table table-hover" STYLE="width: 98% ; HEIGHT:60PX"  >
            <tr>
                <th>商品类别id</th>
                <th>商品类别名称</th>
                <th>商品父级类别id</th>
                <th>操作</th>
            </tr>
            <c:forEach items="${pageBean.gateGories}" var="gates">
                <tr>
                    <td class="qwe">${gates.shop_gate_id}</td>
                    <td class="qwe">${gates.gate_name}</td>
                    <td class="qwe" >${gates.gate_parent_id}</td>
                    <td class="qwe">
                        <a href="delgate.jsp?id=${gates.shop_gate_id}" target="justgo"><input type="button" id="del" value="删除"></a>
                        <a href="updategate.jsp?id=${gates.shop_gate_id}" target="justgo"><input type="button" value="修改"></a>
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
                        <a href="gateallServlet?pageNum=${pageBean.pageNum-1}" aria-label="Previous">
                            <span aria-hidden="true">上一页</span>
                        </a>
                    </c:if>
                </li>
                <c:forEach  begin="${pageBean.startPage}" end="${pageBean.endPage}" step="1" var="i">
                    <li><a href="gateallServlet?pageNum=${i}">${i}</a></li>
                </c:forEach>
                <li>
                    <c:if test="${pageBean.pageNum<pageBean.allPages}" >
                        <a href="gateallServlet?pageNum=${pageBean.pageNum+1}" aria-label="Next">
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
