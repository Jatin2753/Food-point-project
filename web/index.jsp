<%@page import="java.sql.ResultSet"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Food Point</title>
        <%@include file="top.jsp" %>
    </head>

    <body>
        <%@include file="header.jsp" %>
        <%@include file="banner.jsp" %>

        <!-- fresh-vegetables (using top-brands design) -->
        <div class="top-brands">
            <div class="container">
                <h3>Most Frequent Orders</h3>
                <div class="agile_top_brands_grids">
                    <%
                        // Query for products with a limit of 4
                        ResultSet rsp = food.DataUtility.executeDQL("SELECT * FROM product ORDER BY product_name LIMIT 4");
                        while (rsp.next()) {
                    %>
                    <div class="col-md-3 top_brand_left">
                        <div class="hover14 column">
                            <div class="agile_top_brand_left_grid">
                                <div class="agile_top_brand_left_grid1">
                                     <figure>
                                        <form action="cart.jsp" method="post"> 
                                            <div class="snipcart-item block">
                                                <div class="snipcart-thumb">
                                                    <a href="#"><img src="images/<%= rsp.getString("img1")%>" alt=" " class="img-responsive" style="height: 140px;" width="140px"/></a>
                                                    <p><%= rsp.getString("product_name")%></p>
                                                    <h4>&#8377;<%= rsp.getString("product_price")%></h4>
                                                </div>
                                                <input type="number" name="qty" value="1" min="1" required/>
                                                <input type="hidden" name="product_name" value="<%=rsp.getString("product_name")%>"/>
                                                <input type="hidden" name="productid" value="<%=rsp.getString("id")%>"/>
                                                <input type="hidden" name="product_price" value="<%=rsp.getString("product_price")%>"/>
                                                <input type="submit" name="submit" value="Add to cart" class="button" />
                                            </div>
                                        </form>

                                    </figure>
                                </div>
                            </div>
                        </div>
                    </div>
                    <%
                        }
                    %>
                </div>
            </div>
        </div>
        <!-- //fresh-vegetables -->

        <!-- top-brands (using fresh-vegetables design) -->
        <div class="fresh-vegetables">
            <div class="container">
                <h3>Our Dealers</h3>
                <div class="w3l_fresh_vegetables_grids">
                    <div class="col-md-12 w3l_fresh_vegetables_grid_right">
                        <div class="row">
                            <%
                              
                                ResultSet rsr = food.DataUtility.executeDQL("SELECT * FROM retailer ORDER BY shop_name");
                                int count = 0;
                                while (rsr.next()) {
                                    if (count % 4 == 0 && count > 0) {
                            %></div><div class="row"><%
                                    }
                            %>
                            <div class="col-md-3 w3l_fresh_vegetables_grid">
                                <div class="w3l_fresh_vegetables_grid1">
                                    <img src="images/<%=rsr.getString("img")%>" alt=" " class="img-responsive" style="height: 200px" width="200px" />
                                    <h4><%=rsr.getString("owner_name")%></h4>
                                    <p><%=rsr.getString("shop_name")%></p>
                                   
                                </div>
                            </div>
                            <%
                                count++;
                                }
                            %>
                        </div>
                        <div class="clearfix"> </div>
                    </div>
                    <div class="clearfix"> </div>
                </div>
            </div>
        </div>
        <!-- //top-brands -->

        <%@include file="footer.jsp" %>
    </body>
</html>
