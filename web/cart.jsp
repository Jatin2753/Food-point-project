<%@ page import="java.util.Random" %>
<%@ page import="java.util.logging.Logger" %>
<%@ page import="java.util.logging.Level" %>

<%
    if (session.getAttribute("cart") == null) {
        session.setAttribute("cart", "FD" + new Random().nextInt());
    }

    String product_name = request.getParameter("product_name");
    String product_price = request.getParameter("product_price");
    String productid = request.getParameter("productid");
    String img = request.getParameter("img");
    String qty = request.getParameter("qty");

    double total = Double.parseDouble(qty) * Double.parseDouble(product_price);

    String sql = "INSERT INTO tblshopingcart(pid, product_name, rate, img, qty, total, sessionid, dateon) " +
                 "VALUES('" + productid + "', '" + product_name + "', " + product_price + ", '" + img + "', " + qty + ", " + total + ", '" + session.getAttribute("cart").toString() + "', NOW());";
    
    int r = food.DataUtility.executeDML(sql);
    
       response.sendRedirect("checkout.jsp");
%>
