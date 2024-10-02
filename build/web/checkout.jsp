<%!    
    double gtotal = 0, tax = 0, dis = 0;
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Products</title>
        <%@ include file="top.jsp" %>
    </head>
    <body>
        <%@ include file="header.jsp" %>
        <!-- products-breadcrumb -->
        <div class="products-breadcrumb">
            <div class="container">
                <ul>
                    <li><i class="fa fa-home" aria-hidden="true"></i><a href="index.html">Home</a><span>|</span></li>
                    <li>Check Out</li>
                </ul>
            </div>
        </div>
        <%
            if(request.getParameter("del") != null){
                String del = request.getParameter("del");
                String sql = "DELETE FROM tblshopingcart WHERE id=" + del;
                int rdel = food.DataUtility.executeDML(sql);
            }
            if(request.getParameter("upid")!=null){
                String uid = request.getParameter("updid");
                        int qty = Integer.parseInt(request.getParameter("qty"));
                        
                        Double rate = Double.parseDouble(request.getParameter("rate"));
                        double total = qty * rate;
                        
                        String sql1 = "update tblshopingcart set qty=" + qty + ", total='" + total + "' where id=" + uid;
                        
                        int r = food.DataUtility.executeDML(sql1);
            }
        %>
        
        <div class="checkout">
            <div class="container">
                <h3>My Shopping Bag</h3>
                <div class="table-responsive checkout-right animated wow slideInUp" data-wow-delay=".5s">
                    <table class="timetable_sub">
                        <thead>
                            <tr>
                                <th>Remove</th>
                                <th>Product Name</th>
                                <th>Product</th>
                                <th>Quantity</th>
                                <th>Rate</th>
                                <th>Total</th>
                            </tr>
                        </thead>
                        <%
                        try {
                            if (session.getAttribute("cart") != null) {
                                String sessionid = session.getAttribute("cart").toString();
                                String sql = "SELECT tblshopingcart.id, tblshopingcart.qty, tblshopingcart.rate, tblshopingcart.sessionid, tblshopingcart.total, product.product_name, product.img1 FROM product INNER JOIN tblshopingcart ON product.id=tblshopingcart.pid WHERE sessionid='" + sessionid + "'";
                                ResultSet proc = food.DataUtility.executeDQL(sql);
                                gtotal = 0;
                                
                                while (proc.next()) {
                                    gtotal += proc.getFloat("total");
                        %>
                        <tr class="rem1">
                            <td class="invert-closeb">
                                <form method="post" name="del" action="checkout.jsp">
                                    <input type="hidden" name="del" value="<%= proc.getInt("id") %>" />
                                    <div class="rem">
                                        <button type="submit" class="close1"></button>
                                    </div>
                                </form>
                            </td>
                            <td class="invert"><%= proc.getString("product_name") %></td>
                            <td class="invert-image"><img style="height:120px;" src="images/<%= proc.getString("img1") %>" alt=" " class="img-responsive" /> </td>
                            <td class="invert">
                                <div class="quantity"> 
                                    <div class="quantity-select"> 
                                    </div>
                                    <form method="post" action="checkout.jsp">
                                        <input type="hidden" name="updid" value="<%= proc.getInt("id") %>" />
                                        <input type="number" name="qty" value="<%= proc.getInt("qty") %>" />
                                        <input type="hidden" name="rate" value="<%= proc.getFloat("rate") %>" />
                                        <br>
                                        <div class="rem">
                                            <button type="submit" class="btn btn-info" name="upid">Update</button>
                                        </div>
                                    </form>
                                </div>
                            </td>
                            <td class="invert">&#8377; <%= proc.getFloat("rate") %></td>
                            <td class="invert">&#8377; <%= proc.getFloat("total") %></td>
                        </tr>
                        <%
                                }
                            }
                        } catch (Exception obj) {
                            
                        }
                        %>
                    </table>
                </div>
                <div class="checkout-left">    
                    <div class="checkout-right-basket animated wow slideInRight" data-wow-delay=".5s">
                        <a href="."><span class="glyphicon glyphicon-menu-left" aria-hidden="true"></span>Back To Shopping</a>
                        <a href="payment.jsp">Place Order <span class="glyphicon glyphicon-menu-right" aria-hidden="true"></span></a>
                    </div>
                    <div class="checkout-left-basket animated wow slideInLeft" data-wow-delay=".5s">
                        <h4>Shopping basket</h4>
                        <ul>
                            <li>Total <i>-</i>  <span>&#8377; <%= gtotal %></span></li>
                            <li>Tax <i>-</i> <span>&#8377; <%= tax %></span></li>
                            <li>Grand Total <i>-</i> <span>&#8377; <%= gtotal + tax %></span></li>
                        </ul>
                    </div>
                    <div class="clearfix"></div>
                </div>
            </div>
        </div>    
        <%@ include file="footer.jsp" %>
    </body>
</html>
