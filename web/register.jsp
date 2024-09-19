<%-- 
    Document   : register
    Created on : 26 Jul, 2024, 1:29:46 PM
    Author     : JATIN GUPTA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
 <%

            if (request.getParameter("Username") != null) {
                String Username = request.getParameter("Username");
                String Password = request.getParameter("Password");
                String Email = request.getParameter("Email");
                String Phone = request.getParameter("Phone");
                String sql = "INSERT INTO USER(NAME,gmail,pass,phone_no)VALUES('" + Username + "','" + Email + "','" + Password + "','" + Phone + "')";
               
                int rru = food.DataUtility.executeDML(sql);
            }

           

        %>
