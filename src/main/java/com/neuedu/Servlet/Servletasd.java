package com.neuedu.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servletasd extends HttpServlet {

    public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        response.setContentType("text/html;charset=utf-8");
        //定义输出流
        PrintWriter out = response.getWriter();
        //获取前端页面输入数据
        String user_name = request.getParameter("user_name");
//        //测试打印，测试接收前台数据是否成功
//        System.out.println(username);
        //进行比较并作出响应。
        if(user_name==null || user_name.equals("")) {
            out.println("请输入用户名 ");
        } else if("sa".equals(user_name)) {
            out.println("该用户名已经存在");
        } else {
            out.println("可以注册");
        }

    }
}
