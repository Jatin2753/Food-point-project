<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.util.logging.Logger" %>
<%@ page import="java.util.logging.Level" %>

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
                    <li>Products Page</li>
                </ul>
            </div>
        </div>
        <!-- //products-breadcrumb -->
        <!-- banner -->
        <div class="banner">
            <div class="w3l_banner_nav_left">
                <nav class="navbar nav_bottom">
                    <!-- Brand and toggle get grouped for better mobile display -->
                    <div class="navbar-header nav_2">
                        <button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                    </div>
                    <!-- Collect the nav links, forms, and other content for toggling -->
                    <div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
                        <ul class="nav navbar-nav nav_1">
                            <%

                                Logger logger = Logger.getLogger("MyLogger");
                                try {
                                    ResultSet rsi = food.DataUtility.executeDQL("SELECT category_name, id FROM category ORDER BY category_name");
                                    if (rsi != null) {
                                        while (rsi.next()) {
                                            int cid = rsi.getInt("id");

                                            ResultSet rsc = food.DataUtility.executeDQL("SELECT category_name FROM category WHERE id NOT IN (SELECT id FROM subcat)");
                                            if (rsc.next()) {
                            %>
                            <li><a href="#"><%= rsi.getString("category_name")%></a></li>
                                <%
                                } else {
                                %>
                            <li class="dropdown mega-dropdown active">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><%= rsi.getString("category_name")%><span class="caret"></span></a>
                                <div class="dropdown-menu mega-dropdown-menu w3ls_vegetables_menu">
                                    <div class="w3ls_vegetables">
                                        <ul>
                                            <%
                                                ResultSet rssc = food.DataUtility.executeDQL("SELECT subcat_name FROM subcat WHERE catid = '" + cid + "' ORDER BY subcat_name;");
                                                if (rssc != null) {
                                                    while (rssc.next()) {
                                            %>
                                            <li><a href="#"><%= rssc.getString("subcat_name")%></a></li>
                                            <hr>
                                            <%
                                                    }
                                                } else {
                                                    logger.log(Level.WARNING, "No subcategories found for category: " + cid);
                                                }
                                            %>
                                        </ul>
                                    </div>
                                </div>
                            </li>
                            <%
                                            }
                                        }
                                    } else {
                                        logger.log(Level.WARNING, "No categories found.");
                                    }
                                } catch (SQLException e) {
                                    logger.log(Level.SEVERE, "SQL Exception: " + e.getMessage(), e);
                                } catch (Exception e) {
                                    logger.log(Level.SEVERE, "Exception: " + e.getMessage(), e);
                                }
                            %>
                        </ul>
                    </div>
                </nav>
            </div>
            <div class="w3l_banner_nav_right">
                <div class="w3l_banner_nav_right_banner3">
                    <h3>Best Deals For New Products<span class="blink_me"></span></h3>
                </div>
            </div>
            <div class="clearfix"></div>
        </div>

        <div class="w3ls_w3l_banner_nav_right_grid w3ls_w3l_banner_nav_right_grid_popular">
            <div class="container">
                <h3>Products</h3>
                <div class="w3ls_w3l_banner_nav_right_grid1">
                    <h6>Food</h6>
                    <%
                        String sql = "";
                        if (request.getParameter("productid") != null) {
                            int productid = Integer.parseInt(request.getParameter("productid"));
                            sql = "SELECT * FROM product WHERE subcatid = " + productid;
                        }
                        ResultSet ps = food.DataUtility.executeDQL(sql);
                        while (ps.next()) {
                    %>
                    <div class="col-md-3 w3ls_w3l_banner_left">
                        <div class="hover14 column">
                            <div class="agile_top_brand_left_grid w3l_agile_top_brand_left_grid">

                                <div class="agile_top_brand_left_grid1">
                                    <figure>
                                        <form action="cart.jsp" method="post"> 
                                            <div class="snipcart-item block">
                                                <div class="snipcart-thumb">
                                                    <a href="#"><img src="images/<%= ps.getString("img1")%>" alt=" " class="img-responsive" style="height: 140px;" width="140px"/></a>
                                                    <p><%= ps.getString("product_name")%></p>
                                                    <h4>&#8377;<%= ps.getString("product_price")%></h4>
                                                </div>
                                                <input type="number" name="qty" value="1" min="1" required/>
                                                <input type="hidden" name="product_name" value="<%=ps.getString("product_name")%>"/>
                                                <input type="hidden" name="productid" value="<%=ps.getString("id")%>"/>
                                                <input type="hidden" name="product_price" value="<%=ps.getString("product_price")%>"/>
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
                    <div class="clearfix"> </div>
                </div>
            </div>
        </div>
        <!-- //brands -->
        <%@ include file="footer.jsp" %>
        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>
        <script>
            $(document).ready(function () {
                $(".dropdown").hover(
                        function () {
                            $('.dropdown-menu', this).stop(true, true).slideDown("fast");
                            $(this).toggleClass('open');
                        },
                        function () {
                            $('.dropdown-menu', this).stop(true, true).slideUp("fast");
                            $(this).toggleClass('open');
                        }
                );
            });
        </script>
        <!-- here stars scrolling icon -->
        <script type="text/javascript">
            $(document).ready(function () {
                $().UItoTop({easingType: 'easeOutQuart'});
            });
        </script>
        <!-- //here ends scrolling icon -->
        <script src="js/minicart.js"></script>
        <script>
            paypal.minicart.render();

            paypal.minicart.cart.on('checkout', function (evt) {
                var items = this.items(),
                        len = items.length,
                        total = 0,
                        i;


                for (i = 0; i < len; i++) {
                    total += items[i].get('quantity');
                }

                if (total < 3) {
                    alert('The minimum order quantity is 3. Please add more to your shopping cart before checking out');
                    evt.preventDefault();
                }
            });
        </script>
    </body>
</html>
