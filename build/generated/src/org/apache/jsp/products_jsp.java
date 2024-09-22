package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.ResultSet;
import java.sql.ResultSet;

public final class products_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/top.jsp");
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Products</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"Grocery Store Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("<script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("\t\tfunction hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("<!-- font-awesome icons -->\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" /> \n");
      out.write("<!-- //font-awesome icons -->\n");
      out.write("<!-- js -->\n");
      out.write("<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("<!-- //js -->\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Ubuntu:400,300,300italic,400italic,500,500italic,700,700italic' rel='stylesheet' type='text/css'>\n");
      out.write("<link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,300italic,400italic,600,600italic,700,700italic,800,800italic' rel='stylesheet' type='text/css'>\n");
      out.write("<!-- start-smoth-scrolling -->\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\tjQuery(document).ready(function($) {\n");
      out.write("\t\t$(\".scroll\").click(function(event){\t\t\n");
      out.write("\t\t\tevent.preventDefault();\n");
      out.write("\t\t\t$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\n");
      out.write("\t\t});\n");
      out.write("\t});\n");
      out.write("</script>\n");
      out.write("<!-- start-smoth-scrolling -->\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- header -->\n");
      out.write("                      \n");
      out.write("\t<div class=\"agileits_header\">\n");
      out.write("\t\t<div class=\"w3l_offers\">\n");
      out.write("\t\t\t<a href=\"products.html\">Today's special Offers !</a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"w3l_search\">\n");
      out.write("\t\t\t<form action=\"#\" method=\"post\">\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"Product\" value=\"Search a product...\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Search a product...';}\" required=\"\">\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\" \">\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"product_list_header\">  \n");
      out.write("\t\t\t<form action=\"#\" method=\"post\" class=\"last\">\n");
      out.write("                <fieldset>\n");
      out.write("                    <input type=\"hidden\" name=\"cmd\" value=\"_cart\" />\n");
      out.write("                    <input type=\"hidden\" name=\"display\" value=\"1\" />\n");
      out.write("                    <input type=\"submit\" name=\"submit\" value=\"View your cart\" class=\"button\" />\n");
      out.write("                </fieldset>\n");
      out.write("            </form>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"w3l_header_right\">\n");
      out.write("\t\t\t<ul>\n");
      out.write("\t\t\t\t<li class=\"dropdown profile_details_drop\">\n");
      out.write("\t\t\t\t\t<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-user\" aria-hidden=\"true\"></i><span class=\"caret\"></span></a>\n");
      out.write("\t\t\t\t\t<div class=\"mega-dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t<div class=\"w3ls_vegetables\">\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"dropdown-menu drp-mnu\">\n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"userregisterform.jsp\">Login</a></li> \n");
      out.write("\t\t\t\t\t\t\t\t<li><a href=\"userregisterform.jsp\">Sign Up</a></li>\n");
      out.write("\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t</div>                  \n");
      out.write("\t\t\t\t\t</div>\t\n");
      out.write("\t\t\t\t</li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"w3l_header_right1\">\n");
      out.write("\t\t\t<h2><a href=\"mail.html\">Contact Us</a></h2>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t</div>\n");
      out.write("<!-- script-for sticky-nav -->\n");
      out.write("\t<script>\n");
      out.write("\t$(document).ready(function() {\n");
      out.write("\t\t var navoffeset=$(\".agileits_header\").offset().top;\n");
      out.write("\t\t $(window).scroll(function(){\n");
      out.write("\t\t\tvar scrollpos=$(window).scrollTop(); \n");
      out.write("\t\t\tif(scrollpos >=navoffeset){\n");
      out.write("\t\t\t\t$(\".agileits_header\").addClass(\"fixed\");\n");
      out.write("\t\t\t}else{\n");
      out.write("\t\t\t\t$(\".agileits_header\").removeClass(\"fixed\");\n");
      out.write("\t\t\t}\n");
      out.write("\t\t });\n");
      out.write("\t\t \n");
      out.write("\t});\n");
      out.write("\t</script>\n");
      out.write("<!-- //script-for sticky-nav -->\n");
      out.write("\t<div class=\"logo_products\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"w3ls_logo_products_left\">\n");
      out.write("\t\t\t\t<h1><a href=\"index.jsp\"><span>Food</span> Point</a></h1>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"w3ls_logo_products_left1\">\n");
      out.write("\t\t\t\t<ul class=\"special_items\">\n");
      out.write("\t\t\t\t\t<li><a href=\"about.html\">About Us</a><i>/</i></li>\n");
      out.write("\t\t\t\t        <li><a href=\"services.html\">Services</a><i>/</i></li>\n");
      out.write("                                        <li><a href=\"/food_point/admin/web/login.jsp\">Are You A Retailer?</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"w3ls_logo_products_left1\">\n");
      out.write("\t\t\t\t<ul class=\"phone_email\">\n");
      out.write("\t\t\t\t\t<li><i class=\"fa fa-phone\" aria-hidden=\"true\"></i>(+91) 94562-54251</li>\n");
      out.write("\t\t\t\t\t<li><i class=\"fa fa-envelope-o\" aria-hidden=\"true\"></i><a href=\"jating2753@gmail.com\">jating2753@gmail.com</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //header -->\n");
      out.write("\n");
      out.write("        <!-- products-breadcrumb -->\n");
      out.write("        <div class=\"products-breadcrumb\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <ul>\n");
      out.write("                    <li><i class=\"fa fa-home\" aria-hidden=\"true\"></i><a href=\"index.html\">Home</a><span>|</span></li>\n");
      out.write("                    <li>Products Page</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- //products-breadcrumb -->\n");
      out.write("        <!-- banner -->\n");
      out.write("        <div class=\"banner\">\n");
      out.write("            <div class=\"w3l_banner_nav_left\">\n");
      out.write("                <nav class=\"navbar nav_bottom\">\n");
      out.write("                    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                    <div class=\"navbar-header nav_2\">\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggle collapsed navbar-toggle1\" data-toggle=\"collapse\" data-target=\"#bs-megadropdown-tabs\">\n");
      out.write("                            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                            <span class=\"icon-bar\"></span>\n");
      out.write("                        </button>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"bs-megadropdown-tabs\">\n");
      out.write("                        <ul class=\"nav navbar-nav nav_1\">\n");
      out.write("                            ");


                                Logger logger = Logger.getLogger("MyLogger");
                                try {
                                    ResultSet rsi = food.DataUtility.executeDQL("SELECT category_name, id FROM category ORDER BY category_name");
                                    if (rsi != null) {
                                        while (rsi.next()) {
                                            int cid = rsi.getInt("id");

                                            ResultSet rsc = food.DataUtility.executeDQL("SELECT category_name FROM category WHERE id NOT IN (SELECT id FROM subcat)");
                                            if (rsc.next()) {
                            
      out.write("\n");
      out.write("                            <li><a href=\"#\">");
      out.print( rsi.getString("category_name"));
      out.write("</a></li>\n");
      out.write("                                ");

                                } else {
                                
      out.write("\n");
      out.write("                            <li class=\"dropdown mega-dropdown active\">\n");
      out.write("                                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">");
      out.print( rsi.getString("category_name"));
      out.write("<span class=\"caret\"></span></a>\n");
      out.write("                                <div class=\"dropdown-menu mega-dropdown-menu w3ls_vegetables_menu\">\n");
      out.write("                                    <div class=\"w3ls_vegetables\">\n");
      out.write("                                        <ul>\n");
      out.write("                                            ");

                                                ResultSet rssc = food.DataUtility.executeDQL("SELECT subcat_name FROM subcat WHERE catid = '" + cid + "' ORDER BY subcat_name;");
                                                if (rssc != null) {
                                                    while (rssc.next()) {
                                            
      out.write("\n");
      out.write("                                            <li><a href=\"#\">");
      out.print( rssc.getString("subcat_name"));
      out.write("</a></li>\n");
      out.write("                                            <hr>\n");
      out.write("                                            ");

                                                    }
                                                } else {
                                                    logger.log(Level.WARNING, "No subcategories found for category: " + cid);
                                                }
                                            
      out.write("\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </li>\n");
      out.write("                            ");

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
                            
      out.write("\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"w3l_banner_nav_right\">\n");
      out.write("                <div class=\"w3l_banner_nav_right_banner3\">\n");
      out.write("                    <h3>Best Deals For New Products<span class=\"blink_me\"></span></h3>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"w3ls_w3l_banner_nav_right_grid w3ls_w3l_banner_nav_right_grid_popular\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h3>Products</h3>\n");
      out.write("                <div class=\"w3ls_w3l_banner_nav_right_grid1\">\n");
      out.write("                    <h6>Food</h6>\n");
      out.write("                    ");

                        String sql = "";
                        if (request.getParameter("productid") != null) {
                            int productid = Integer.parseInt(request.getParameter("productid"));
                            sql = "SELECT * FROM product WHERE subcatid = " + productid;
                        }
                        ResultSet ps = food.DataUtility.executeDQL(sql);
                        while (ps.next()) {
                    
      out.write("\n");
      out.write("                    <div class=\"col-md-3 w3ls_w3l_banner_left\">\n");
      out.write("                        <div class=\"hover14 column\">\n");
      out.write("                            <div class=\"agile_top_brand_left_grid w3l_agile_top_brand_left_grid\">\n");
      out.write("\n");
      out.write("                                <div class=\"agile_top_brand_left_grid1\">\n");
      out.write("                                    <figure>\n");
      out.write("                                        <form action=\"cart.jsp\" method=\"post\"> \n");
      out.write("                                            <div class=\"snipcart-item block\">\n");
      out.write("                                                <div class=\"snipcart-thumb\">\n");
      out.write("                                                    <a href=\"#\"><img src=\"images/");
      out.print( ps.getString("img1"));
      out.write("\" alt=\" \" class=\"img-responsive\" style=\"height: 140px;\" width=\"140px\"/></a>\n");
      out.write("                                                    <p>");
      out.print( ps.getString("product_name"));
      out.write("</p>\n");
      out.write("                                                    <h4>&#8377;");
      out.print( ps.getString("product_price"));
      out.write("</h4>\n");
      out.write("                                                </div>\n");
      out.write("                                                <input type=\"number\" name=\"qty\" value=\"1\" min=\"1\" required/>\n");
      out.write("                                                <input type=\"hidden\" name=\"product_name\" value=\"");
      out.print(ps.getString("product_name"));
      out.write("\"/>\n");
      out.write("                                                <input type=\"hidden\" name=\"productid\" value=\"");
      out.print(ps.getString("id"));
      out.write("\"/>\n");
      out.write("                                                <input type=\"hidden\" name=\"product_price\" value=\"");
      out.print(ps.getString("product_price"));
      out.write("\"/>\n");
      out.write("                                                <input type=\"submit\" name=\"submit\" value=\"Add to cart\" class=\"button\" />\n");
      out.write("                                            </div>\n");
      out.write("                                        </form>\n");
      out.write("\n");
      out.write("                                    </figure>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    ");

                        }

                    
      out.write("\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- //brands -->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- newsletter -->\n");
      out.write("\t<div class=\"newsletter\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"w3agile_newsletter_left\">\n");
      out.write("\t\t\t\t<h3>sign up for our newsletter</h3>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"w3agile_newsletter_right\">\n");
      out.write("\t\t\t\t<form action=\"#\" method=\"post\">\n");
      out.write("\t\t\t\t\t<input type=\"email\" name=\"Email\" value=\"Email\" onfocus=\"this.value = '';\" onblur=\"if (this.value == '') {this.value = 'Email';}\" required=\"\">\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"subscribe now\">\n");
      out.write("\t\t\t\t</form>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //newsletter -->\n");
      out.write("<!-- footer -->\n");
      out.write("\t<div class=\"footer\">\n");
      out.write("\t\t<div class=\"container\">\n");
      out.write("\t\t\t<div class=\"col-md-4 w3_footer_grid\">\n");
      out.write("\t\t\t\t<h3>information</h3>\n");
      out.write("\t\t\t\t<ul class=\"w3_footer_grid_list\">\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<li><a href=\"about.html\">About Us</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"services.html\">Services</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"short-codes.html\">Are You Retailer?</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4 w3_footer_grid\">\n");
      out.write("\t\t\t\t<h3>policy info</h3>\n");
      out.write("\t\t\t\t<ul class=\"w3_footer_grid_list\">\n");
      out.write("\t\t\t\t\t<li><a href=\"faqs.html\">FAQ</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"privacy.html\">privacy policy</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"privacy.html\">terms of use</a></li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"col-md-4 w3_footer_grid\">\n");
      out.write("\t\t\t\t<h3>Our Vendors</h3>\n");
      out.write("\t\t\t\t<ul class=\"w3_footer_grid_list\">\n");
      out.write("                                     ");

                              
                                ResultSet rsf = food.DataUtility.executeDQL("SELECT shop_name FROM retailer ORDER BY shop_name");
                               
                                while (rsf.next()) {
                          
                            
      out.write("\n");
      out.write("                            <li><a href=\"#\">");
      out.print(rsf.getString("shop_name"));
      out.write("</a></li>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t<div class=\"agile_footer_grids\">\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3_footer_grid agile_footer_grids_w3_footer\">\n");
      out.write("\t\t\t\t\t<div class=\"w3_footer_grid_bottom\">\n");
      out.write("\t\t\t\t\t\t<h4>100% secure payments</h4>\n");
      out.write("\t\t\t\t\t\t<img src=\"images/card.png\" alt=\" \" class=\"img-responsive\" />\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3 w3_footer_grid agile_footer_grids_w3_footer\">\n");
      out.write("\t\t\t\t\t<div class=\"w3_footer_grid_bottom\">\n");
      out.write("\t\t\t\t\t\t<h5>connect with us</h5>\n");
      out.write("\t\t\t\t\t\t<ul class=\"agileits_social_icons\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"facebook\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"twitter\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"google\"><i class=\"fa fa-google-plus\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"instagram\"><i class=\"fa fa-instagram\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\" class=\"dribbble\"><i class=\"fa fa-dribbble\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"clearfix\"> </div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"wthree_footer_copy\">\n");
      out.write("\t\t\t\t<p> Design by <a href=\"#\">Jatin Gupta</a></p>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("<!-- //footer -->\n");
      out.write("<!-- Bootstrap Core JavaScript -->\n");
      out.write("<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("<script>\n");
      out.write("$(document).ready(function(){\n");
      out.write("    $(\".dropdown\").hover(            \n");
      out.write("        function() {\n");
      out.write("            $('.dropdown-menu', this).stop( true, true ).slideDown(\"fast\");\n");
      out.write("            $(this).toggleClass('open');        \n");
      out.write("        },\n");
      out.write("        function() {\n");
      out.write("            $('.dropdown-menu', this).stop( true, true ).slideUp(\"fast\");\n");
      out.write("            $(this).toggleClass('open');       \n");
      out.write("        }\n");
      out.write("    );\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("<!-- here stars scrolling icon -->\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\t\t$(document).ready(function() {\n");
      out.write("\t\t\t/*\n");
      out.write("\t\t\t\tvar defaults = {\n");
      out.write("\t\t\t\tcontainerID: 'toTop', // fading element id\n");
      out.write("\t\t\t\tcontainerHoverID: 'toTopHover', // fading element hover id\n");
      out.write("\t\t\t\tscrollSpeed: 1200,\n");
      out.write("\t\t\t\teasingType: 'linear' \n");
      out.write("\t\t\t\t};\n");
      out.write("\t\t\t*/\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t$().UItoTop({ easingType: 'easeOutQuart' });\n");
      out.write("\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t});\n");
      out.write("\t</script>\n");
      out.write("<!-- //here ends scrolling icon -->\n");
      out.write("<script src=\"js/minicart.js\"></script>\n");
      out.write("<script>\n");
      out.write("\t\tpaypal.minicart.render();\n");
      out.write("\n");
      out.write("\t\tpaypal.minicart.cart.on('checkout', function (evt) {\n");
      out.write("\t\t\tvar items = this.items(),\n");
      out.write("\t\t\t\tlen = items.length,\n");
      out.write("\t\t\t\ttotal = 0,\n");
      out.write("\t\t\t\ti;\n");
      out.write("\n");
      out.write("\t\t\t// Count the number of each item in the cart\n");
      out.write("\t\t\tfor (i = 0; i < len; i++) {\n");
      out.write("\t\t\t\ttotal += items[i].get('quantity');\n");
      out.write("\t\t\t}\n");
      out.write("\n");
      out.write("\t\t\tif (total < 3) {\n");
      out.write("\t\t\t\talert('The minimum order quantity is 3. Please add more to your shopping cart before checking out');\n");
      out.write("\t\t\t\tevt.preventDefault();\n");
      out.write("\t\t\t}\n");
      out.write("\t\t});\n");
      out.write("\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap Core JavaScript -->\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $(\".dropdown\").hover(\n");
      out.write("                        function () {\n");
      out.write("                            $('.dropdown-menu', this).stop(true, true).slideDown(\"fast\");\n");
      out.write("                            $(this).toggleClass('open');\n");
      out.write("                        },\n");
      out.write("                        function () {\n");
      out.write("                            $('.dropdown-menu', this).stop(true, true).slideUp(\"fast\");\n");
      out.write("                            $(this).toggleClass('open');\n");
      out.write("                        }\n");
      out.write("                );\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!-- here stars scrolling icon -->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $().UItoTop({easingType: 'easeOutQuart'});\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <!-- //here ends scrolling icon -->\n");
      out.write("        <script src=\"js/minicart.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            paypal.minicart.render();\n");
      out.write("\n");
      out.write("            paypal.minicart.cart.on('checkout', function (evt) {\n");
      out.write("                var items = this.items(),\n");
      out.write("                        len = items.length,\n");
      out.write("                        total = 0,\n");
      out.write("                        i;\n");
      out.write("\n");
      out.write("\n");
      out.write("                for (i = 0; i < len; i++) {\n");
      out.write("                    total += items[i].get('quantity');\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                if (total < 3) {\n");
      out.write("                    alert('The minimum order quantity is 3. Please add more to your shopping cart before checking out');\n");
      out.write("                    evt.preventDefault();\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
