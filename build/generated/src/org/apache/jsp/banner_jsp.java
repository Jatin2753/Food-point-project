package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;
import java.util.logging.Level;

public final class banner_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!-- banner -->\n");
      out.write("<div class=\"banner\" style=\"margin-bottom: 100px\">\n");
      out.write("    <div class=\"w3l_banner_nav_left\">\n");
      out.write("        <nav class=\"navbar nav_bottom\">\n");
      out.write("            <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("            <div class=\"navbar-header nav_2\">\n");
      out.write("                <button type=\"button\" class=\"navbar-toggle collapsed navbar-toggle1\" data-toggle=\"collapse\" data-target=\"#bs-megadropdown-tabs\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </button>\n");
      out.write("            </div> \n");
      out.write("            \n");
      out.write("            <div class=\"collapse navbar-collapse\" id=\"bs-megadropdown-tabs\">\n");
      out.write("                <ul class=\"nav navbar-nav nav_1\">\n");
      out.write("                    ");

                       
                        Logger logger = Logger.getLogger("MyLogger");
                        try {
                            ResultSet rsi = food.DataUtility.executeDQL("SELECT category_name,id FROM category ORDER BY category_name");
                            if (rsi != null) {
                                while (rsi.next()) {
                                    int cid = rsi.getInt("id");
                                    
                                    ResultSet rsc = food.DataUtility.executeDQL("SELECT category_name FROM category WHERE id NOT IN (SELECT id FROM subcat)");
                                    if (rsc.next()) {
                    
      out.write("\n");
      out.write("                                        <li><a href=\"#\">");
      out.print( rsi.getString("category_name") );
      out.write("</a></li>\n");
      out.write("                    ");

                                    } else {
                    
      out.write("\n");
      out.write("                                        <li class=\"dropdown mega-dropdown active\">\n");
      out.write("                                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">");
      out.print( rsi.getString("category_name") );
      out.write("<span class=\"caret\"></span></a>\n");
      out.write("                                            <div class=\"dropdown-menu mega-dropdown-menu w3ls_vegetables_menu\">\n");
      out.write("                                                <div class=\"w3ls_vegetables\">\n");
      out.write("                                                    <ul>\n");
      out.write("                    ");

                                                        ResultSet rssc = food.DataUtility.executeDQL("SELECT subcat_name,id FROM subcat WHERE catid = '"+cid+"' ORDER BY subcat_name;");
                                                        if (rssc != null) {
                                                            while (rssc.next()) {
                    
      out.write("\n");
      out.write("                                               <li><a href=\"products.jsp?productid=");
      out.print( rssc.getString("id"));
      out.write('"');
      out.write('>');
      out.print( rssc.getString("subcat_name") );
      out.write("</a></li>\n");
      out.write("                                                                <hr>\n");
      out.write("                    ");

                                                            }
                                                        } else {
                                                            logger.log(Level.WARNING, "No subcategories found for category: " + cid);
                                                        }
                    
      out.write("\n");
      out.write("                                                    </ul>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </li>\n");
      out.write("                    ");

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
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- /.navbar-collapse -->\n");
      out.write("        </nav>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"w3l_banner_nav_right\">\n");
      out.write("        <section class=\"slider\">\n");
      out.write("            <div class=\"flexslider\">\n");
      out.write("                <ul class=\"slides\">\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"w3l_banner_nav_right_banner\">\n");
      out.write("                            <h3>Make your <span>food</span> with Spicy.</h3>\n");
      out.write("                            <div class=\"more\">\n");
      out.write("                                <a href=\"#\" class=\"button--saqui button--round-l button--text-thick\" data-text=\"Shop now\">Shop now</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"w3l_banner_nav_right_banner1\">\n");
      out.write("                            <h3>Make your <span>food</span> with Spicy.</h3>\n");
      out.write("                            <div class=\"more\">\n");
      out.write("                                <a href=\"#\" class=\"button--saqui button--round-l button--text-thick\" data-text=\"Shop now\">Shop now</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <div class=\"w3l_banner_nav_right_banner2\">\n");
      out.write("                            <h3>upto <i>50%</i> off.</h3>\n");
      out.write("                            <div class=\"more\">\n");
      out.write("                                <a href=\"#\" class=\"button--saqui button--round-l button--text-thick\" data-text=\"Shop now\">Shop now</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- flexSlider -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\" media=\"screen\" property=\"\" />\n");
      out.write("        <script defer src=\"js/jquery.flexslider.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(window).load(function () {\n");
      out.write("                $('.flexslider').flexslider({\n");
      out.write("                    animation: \"slide\",\n");
      out.write("                    start: function (slider) {\n");
      out.write("                        $('body').removeClass('loading');\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            function getSubCat(id) {\n");
      out.write("                $(\"#subcatidsel\").html('<option>Loading...</option>');\n");
      out.write("                $.ajax({\n");
      out.write("                    type: \"GET\",\n");
      out.write("                    url: \"getSubCatByCatId.jsp\",\n");
      out.write("                    data: {catid: id},\n");
      out.write("                    success: function (data) {\n");
      out.write("                        $(\"#subcatidsel\").html(data);\n");
      out.write("                    },\n");
      out.write("                    error: function (xhr, status, error) {\n");
      out.write("                        console.error(\"AJAX Error:\", status, error);\n");
      out.write("                        $(\"#subcatidsel\").html('<option value=\"\">Failed to load subcategories</option>');\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <!-- //flexSlider -->\n");
      out.write("    </div>\n");
      out.write("    <div class=\"clearfix\"></div>\n");
      out.write("</div>\n");
      out.write("<!-- banner -->\n");
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
