package org.apache.jsp.admin.web;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>food court login form  Flat Responsive Widget Template :: w3layouts</title>\n");
      out.write("        <!-- metatags-->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("        <meta name=\"keywords\" content=\"food court login form a Flat Responsive Widget,Login form widgets, Sign up Web \tforms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements\" />\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\n");
      out.write("            function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <!-- Meta tag Keywords -->\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("        <!--online fonts-->\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Lobster&amp;subset=cyrillic,latin-ext,vietnamese\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Righteous&amp;subset=latin-ext\" rel=\"stylesheet\">\n");
      out.write("        <!--//online fonts-->\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

           if (request.getParameter("Gmail") != null) {
              
    String gmail = request.getParameter("Gmail");  
    String pass = request.getParameter("Password"); 
    String id=request.getParameter("id");
    String sqlreg = "SELECT * FROM retailer WHERE gmail='" + gmail + "' AND pass ='" + pass + "'";
   
    ResultSet rl = food.DataUtility.executeDQL(sqlreg);
   
    if (rl.next()) {
    session.setAttribute("login", gmail);
    session.setAttribute("userId", rl.getInt("id")); 
    response.sendRedirect("../ProductAdd.jsp"); 
} else {
     out.println("<script>alert('Invalid user name or password')</script>");
}

}

        
      out.write("\n");
      out.write("        <h1>f<span>oo</span>d c<span>o</span>urt l<span>o</span>g<span>in</span> f<span>o</span>rm</h1>\n");
      out.write("        <div class=\"wthree-form\">\n");
      out.write("            <h2>Fill out the form below to login</h2>\n");
      out.write("            <div class=\"w3l-login form\">\n");
      out.write("                <form action=\"login.jsp\" method=\"post\">\n");
      out.write("                    <div class=\"form-sub-w3\">\n");
      out.write("                        <input type=\"text\" name=\"Gmail\" placeholder=\"Gmail\" required=\"\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-sub-w3\">\n");
      out.write("                        <input type=\"password\" name=\"Password\" placeholder=\"Password\" required=\"\"/>\n");
      out.write("                        <input type=\"hidden\" name=\"id\" >\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <label class=\"anim\">\n");
      out.write("                        <a href=\"Register.jsp\">New Here ?</a>\n");
      out.write("                    </label>\n");
      out.write("                    <div class=\"submit-agileits\">\n");
      out.write("                        <input type=\"submit\" value=\"Login\">\n");
      out.write("                    </div>\n");
      out.write("                    <a href=\"resetpass.jsp\">Forgot Password ?</a>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
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
