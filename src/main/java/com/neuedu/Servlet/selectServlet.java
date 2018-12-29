package com.neuedu.Servlet;
//
//import com.neuedu.business.asDaoBusiness;
//import com.neuedu.business.asDaoBusinessImp;
//import com.neuedu.pojos.Boys;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//@WebServlet(name = "shopallServlet",value = "/shopallServlet")
//public class selectServlet extends HttpServlet {
//    @Override
//    public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
////      req.setCharacterEncoding("utf-8");
//        asDaoBusiness asDaoBusiness = new asDaoBusinessImp();
//        List<Boys> allselect = asDaoBusiness.allselect();
//        System.out.println(allselect);
//        req.setAttribute("allselect",allselect);
//        req.getRequestDispatcher("asdasd.jsp").forward(req,resp);
//    }
//}
