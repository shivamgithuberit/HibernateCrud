package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EmpView_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link rel=\"stylesheet\" type=\"text/css\" href=\"Studenttable.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <h1>Data of the Students </h1>\n");
      out.write("         \n");
      out.write("          <thead>\n");
      out.write("    <tr>\n");
      out.write("      <th class=\"serial-number\">S.No.</th>\n");
      out.write("      <th class=\"enroll-number\">Enroll No.</th>\n");
      out.write("      <th class=\"name\">Name</th>\n");
      out.write("      <th class=\"email\">Email</th>\n");
      out.write("      <th class=\"physics\">Physics</th>\n");
      out.write("      <th class=\"chemistry\">Chemistry</th>\n");
      out.write("      <th class=\"math\">Math</th>\n");
      out.write("      <th class=\"english\">English</th>\n");
      out.write("      <th class=\"hindi\">Hindi</th>\n");
      out.write("      <th class=\"percentage\">Percentage</th>\n");
      out.write("      <th class=\"status\">Status</th>\n");
      out.write("      <th class=\"edit\">Edit</th>\n");
      out.write("      <th class=\"delete\">Delete</th>\n");
      out.write("    </tr>\n");
      out.write("          </thead>\n");
      out.write("</table>\n");
      out.write("        \n");
      out.write("       \n");
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
