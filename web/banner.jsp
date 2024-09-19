<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.util.logging.Logger"%>
<%@page import="java.util.logging.Level"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!-- banner -->
<div class="banner" style="margin-bottom: 100px">
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
            
            <div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
                <ul class="nav navbar-nav nav_1">
                    <%
                       
                        Logger logger = Logger.getLogger("MyLogger");
                        try {
                            ResultSet rsi = food.DataUtility.executeDQL("SELECT category_name,id FROM category ORDER BY category_name");
                            if (rsi != null) {
                                while (rsi.next()) {
                                    int cid = rsi.getInt("id");
                                    
                                    ResultSet rsc = food.DataUtility.executeDQL("SELECT category_name FROM category WHERE id NOT IN (SELECT id FROM subcat)");
                                    if (rsc.next()) {
                    %>
                                        <li><a href="#"><%= rsi.getString("category_name") %></a></li>
                    <%
                                    } else {
                    %>
                                        <li class="dropdown mega-dropdown active">
                                            <a href="#" class="dropdown-toggle" data-toggle="dropdown"><%= rsi.getString("category_name") %><span class="caret"></span></a>
                                            <div class="dropdown-menu mega-dropdown-menu w3ls_vegetables_menu">
                                                <div class="w3ls_vegetables">
                                                    <ul>
                    <%
                                                        ResultSet rssc = food.DataUtility.executeDQL("SELECT subcat_name,id FROM subcat WHERE catid = '"+cid+"' ORDER BY subcat_name;");
                                                        if (rssc != null) {
                                                            while (rssc.next()) {
                    %>
                                               <li><a href="products.jsp?productid=<%= rssc.getString("id")%>"><%= rssc.getString("subcat_name") %></a></li>
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
            <!-- /.navbar-collapse -->
        </nav>
    </div>
    <div class="w3l_banner_nav_right">
        <section class="slider">
            <div class="flexslider">
                <ul class="slides">
                    <li>
                        <div class="w3l_banner_nav_right_banner">
                            <h3>Make your <span>food</span> with Spicy.</h3>
                            <div class="more">
                                <a href="#" class="button--saqui button--round-l button--text-thick" data-text="Shop now">Shop now</a>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="w3l_banner_nav_right_banner1">
                            <h3>Make your <span>food</span> with Spicy.</h3>
                            <div class="more">
                                <a href="#" class="button--saqui button--round-l button--text-thick" data-text="Shop now">Shop now</a>
                            </div>
                        </div>
                    </li>
                    <li>
                        <div class="w3l_banner_nav_right_banner2">
                            <h3>upto <i>50%</i> off.</h3>
                            <div class="more">
                                <a href="#" class="button--saqui button--round-l button--text-thick" data-text="Shop now">Shop now</a>
                            </div>
                        </div>
                    </li>
                </ul>
            </div>
        </section>
        <!-- flexSlider -->
        <link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" property="" />
        <script defer src="js/jquery.flexslider.js"></script>
        <script type="text/javascript">
            $(window).load(function () {
                $('.flexslider').flexslider({
                    animation: "slide",
                    start: function (slider) {
                        $('body').removeClass('loading');
                    }
                });
            });
        </script>
        <script>
            function getSubCat(id) {
                $("#subcatidsel").html('<option>Loading...</option>');
                $.ajax({
                    type: "GET",
                    url: "getSubCatByCatId.jsp",
                    data: {catid: id},
                    success: function (data) {
                        $("#subcatidsel").html(data);
                    },
                    error: function (xhr, status, error) {
                        console.error("AJAX Error:", status, error);
                        $("#subcatidsel").html('<option value="">Failed to load subcategories</option>');
                    }
                });
            }
        </script>
        <!-- //flexSlider -->
    </div>
    <div class="clearfix"></div>
</div>
<!-- banner -->
