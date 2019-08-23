//package com.ryuhinata.myapplication;
//
//import java.io.IOException;
//import java.io.PrintWriter;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import com.google.gson.JsonObject;
//
//public class CheckAppVersion extends HttpServlet {
//    private static final long serialVersionUID = 1L;
//
//    public CheckAppVersion() {
//        super();
//    }
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        doPost(request,response);
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//
//        PrintWriter out = response.getWriter();
//        response.setContentType("text/html");
//
//        //send a JSON response with the app Version and file URI
//        JsonObject myObj = new JsonObject();
//        myObj.addProperty("success", true);
//        myObj.addProperty("latestVersion", 2);
//        myObj.addProperty("appURI", "http://demo.mysamplecode.com/Servlets_JSP/apps/MyAndroidApp.apk");
//        out.println(myObj.toString());
//        out.close();
//
//
//    }
//
//}
