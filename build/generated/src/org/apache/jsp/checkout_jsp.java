package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.ResultSet;

public final class checkout_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

    
    double gtotal = 0, tax = 0, dis = 0;

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
      out.write("                    <li>Check Out</li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");

            if(request.getParameter("del")!=null){
                String del=request.getParameter("del");
                String sql="DELETE FROM tblshopingcart WHERE id=" + del;
                int rdel = food.DataUtility.executeDML(sql);
            }
            
      out.write("\n");
      out.write("            \n");
      out.write("              <div class=\"checkout\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h3>My Shopping Bag</h3>\n");
      out.write("                <div class=\"table-responsive checkout-right animated wow slideInUp\" data-wow-delay=\".5s\">\n");
      out.write("                    <table class=\"timetable_sub\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Remove</th>\n");
      out.write("                                <th>Product Name</th>\n");
      out.write("                                <th>Product</th>\n");
      out.write("                                <th>Quantity</th>\n");
      out.write("                                <th>Rate</th>\n");
      out.write("                                <th>Total</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("            ");

            try{
                if(session.getAttribute("cart")!=null){
                  String sessionid=session.getAttribute("cart").toString();
                  String sql="SELECT tblshopingcart.id,tblshopingcart.qty,tblshopingcart.rate,tblshopingcart.sessionid,tblshopingcart.total,product.product_name,product.img1 FROM product INNER JOIN tblshopingcart ON product.id=tblshopingcart.pid WHERE sessionid='"+sessionid+"'";
                  ResultSet proc = food.DataUtility.executeDQL(sql);
                   gtotal = 0;
                                    while (proc.next()) {
                                        gtotal += proc.getFloat("total");
                                        
                                        
                                        
      out.write("\n");
      out.write("                                          <tr class=\"rem1\">\n");
      out.write("                            <td class=\"invert-closeb\">\n");
      out.write("                                <form method=\"post\" name=\"del\" action=\"checkout.jsp\">\n");
      out.write("                                    <input type=\"hidden\" name=\"delid\" value=\"\" />\n");
      out.write("                                    <div class=\"rem\">\n");
      out.write("                                        <button type=\"submit\" class=\"close1\"></button>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </td>\n");
      out.write("                            <td class=\"invert\"></td>\n");
      out.write("                            <td class=\"invert-image\"><img style=\"height:120px;\"  src=\"product-image/\" alt=\" \" class=\"img-responsive\"  /> </td>\n");
      out.write("                            <td class=\"invert\">\n");
      out.write("                                <div class=\"quantity\"> \n");
      out.write("                                    <div class=\"quantity-select\">                           \n");
      out.write("                                    </div>\n");
      out.write("                                    <form method=\"post\"  action=\"checkout.jsp\">\n");
      out.write("                                        <input type=\"hidden\" name=\"updid\" value=\"\" />\n");
      out.write("                                        <input type=\"number\"  name=\"qty\" value=\"\" />\n");
      out.write("                                        <input type=\"hidden\" name=\"rate\" value=\"\" />\n");
      out.write("                                        <br>\n");
      out.write("                                        <div class=\"rem\">\n");
      out.write("                                            <button type=\"submit\" class=\"btn btn-info\">Update</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </td>\n");
      out.write("                            <td class=\"invert\">&#8377;  </td>\n");
      out.write("                            <td class=\"invert\">&#8377; </td>\n");
      out.write("                        </tr>\n");
      out.write("                                        \n");
      out.write("                                        ");

                                    }
            }
            }catch(Exception obj){
                
            }
        
      out.write("\n");
      out.write("      \n");
      out.write("                      \n");
      out.write("                        <!--quantity-->\n");
      out.write("                        <script>\n");
      out.write("                            $('.value-plus').on('click', function () {\n");
      out.write("                                var divUpd = $(this).parent().find('.value'), newVal = parseInt(divUpd.text(), 10) + 1;\n");
      out.write("                                divUpd.text(newVal);\n");
      out.write("                            });\n");
      out.write("\n");
      out.write("                            $('.value-minus').on('click', function () {\n");
      out.write("                                var divUpd = $(this).parent().find('.value'), newVal = parseInt(divUpd.text(), 10) - 1;\n");
      out.write("                                if (newVal >= 1)\n");
      out.write("                                    divUpd.text(newVal);\n");
      out.write("                            });\n");
      out.write("                        </script>\n");
      out.write("                        <!--quantity-->\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"checkout-left\">\t\n");
      out.write("                    <div class=\"checkout-right-basket animated wow slideInRight\" data-wow-delay=\".5s\">\n");
      out.write("                        <a href=\".\"><span class=\"glyphicon glyphicon-menu-left\" aria-hidden=\"true\"></span>Back To Shopping</a>\n");
      out.write("                        <a href=\"place-order.jsp\">Place Order <span class=\"glyphicon glyphicon-menu-right\" aria-hidden=\"true\"></span></a>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"checkout-left-basket animated wow slideInLeft\" data-wow-delay=\".5s\">\n");
      out.write("                        <h4>Shopping basket</h4>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>Total <i >-</i>  <span>   &#8377;</span></li>\n");
      out.write("                            <li>Tax <i>-</i> <span>&#8377; </span></li>\n");
      out.write("                            <li>Grand Total <i>-</i> <span>&#8377;</span></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clearfix\"> </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\t\n");
      out.write("        ");
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
