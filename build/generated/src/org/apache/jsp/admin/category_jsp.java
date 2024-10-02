package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.math.BigInteger;

public final class category_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/admin/links.jsp");
    _jspx_dependants.add("/admin/footer.jsp");
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
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Category Add</title>\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"Shoppy Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \n");
      out.write("              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\">\n");
      out.write("        <!-- Custom Theme files -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("        <!--js-->\n");
      out.write("        <script src=\"js/jquery-2.1.1.min.js\"></script> \n");
      out.write("        <!--icons-css-->\n");
      out.write("        <link href=\"css/font-awesome.css\" rel=\"stylesheet\"> \n");
      out.write("        <!--Google Fonts-->\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Carrois+Gothic' rel='stylesheet' type='text/css'>\n");
      out.write("        <link href='//fonts.googleapis.com/css?family=Work+Sans:400,500,600' rel='stylesheet' type='text/css'>\n");
      out.write("        <!--//skycons-icons-->");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                overflow-x: hidden;\n");
      out.write("            }\n");
      out.write("            .cat-input {\n");
      out.write("                padding: 10px 130px;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            textarea {\n");
      out.write("                padding: 10px 380px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>    \n");
      out.write("        ");
      out.write("\n");
      out.write("      \n");
      out.write("        <!-- /script-for sticky-nav -->\n");
      out.write("        <!--inner block start here-->\n");
      out.write("        ");

            out.print("hii");
            if (request.getParameter("catname") != null) {
                out.print("call1");
                String catname = request.getParameter("catname");
                out.print(catname);
                String catorder = request.getParameter("catorder");
                out.print(catorder);
                String catdesc = request.getParameter("catdesc");
                out.print(catdesc);
                String sql = "INSERT INTO category(category_name, category_desc, category_order, dateon) VALUES('" + catname + "', '" + catdesc + "', " + catorder + ", NOW());";
                out.print(sql);
                int r = food.DataUtility.executeDML(sql);
                out.print(r);
            }
        
      out.write("\n");
      out.write("      \n");
      out.write("        <div class=\"inner-block\" style=\"height: 630px\">\n");
      out.write("            <div class=\"cols-grids panel-widget\">\n");
      out.write("                <h2>Category Add</h2>\n");
      out.write("                <form method=\"post\" action=\"category.jsp\">               \n");
      out.write("                    <div class=\"row mb40\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <label>Category Name</label><br>\n");
      out.write("                            <input type=\"text\" placeholder=\"Enter Category Name\" class=\"cat-input\" name=\"catname\" required>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <label>Category Order</label><br>\n");
      out.write("                            <input type=\"text\" placeholder=\"Enter Category Order\" class=\"cat-input\" name=\"catorder\" required>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"row mb40\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <label>Category Description</label><br>\n");
      out.write("                            <textarea name=\"catdesc\" required placeholder=\"Enter Description\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                    <div class=\"col-lg-12\">\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-success\">Submit</button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("              \n");
      out.write("            </div>    \n");
      out.write("        </div>\n");
      out.write("      <!--inner block end here-->\n");
      out.write("        <!--copy rights start here-->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("   <div class=\"copyrights\">\n");
      out.write("                    <p>© 2016 Shoppy. All Rights Reserved | Design by  <a href=\"http://w3layouts.com/\" target=\"_blank\">W3layouts</a> </p>\n");
      out.write("                </div>\t\n");
      out.write("\n");
      out.write("        <!--COPY rights end here-->\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<!--slider menu-->\n");
      out.write("\n");
      out.write("<div class=\"clearfix\"> </div>\n");
      out.write("</div>\n");
      out.write("<!--slide bar menu end here-->\n");
      out.write("<script>\n");
      out.write("    var toggle = true;\n");
      out.write("\n");
      out.write("    $(\".sidebar-icon\").click(function () {\n");
      out.write("        if (toggle)\n");
      out.write("        {\n");
      out.write("            $(\".page-container\").addClass(\"sidebar-collapsed\").removeClass(\"sidebar-collapsed-back\");\n");
      out.write("            $(\"#menu span\").css({\"position\": \"absolute\"});\n");
      out.write("        }\n");
      out.write("        else\n");
      out.write("        {\n");
      out.write("            $(\".page-container\").removeClass(\"sidebar-collapsed\").addClass(\"sidebar-collapsed-back\");\n");
      out.write("            setTimeout(function () {\n");
      out.write("                $(\"#menu span\").css({\"position\": \"relative\"});\n");
      out.write("            }, 400);\n");
      out.write("        }\n");
      out.write("        toggle = !toggle;\n");
      out.write("    });\n");
      out.write("</script>\n");
      out.write("<!--scrolling js-->\n");
      out.write("<script src=\"js/jquery.nicescroll.js\"></script>\n");
      out.write("<script src=\"js/scripts.js\"></script>\n");
      out.write("<!--//scrolling js-->\n");
      out.write("<script src=\"js/bootstrap.js\"></script>\n");
      out.write("<!-- mother grid end here-->\n");
      out.write("</body>\n");
      out.write("</html>");
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
