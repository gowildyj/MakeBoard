/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.9
 * Generated at: 2023-05-21 04:52:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width\" , initial-scale=\"1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("<title>JSP 게시판 웹사이트</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	<nav class=\"navbar navbar-default\">\n");
      out.write("		<div class=\"navbar-header\">\n");
      out.write("			<button type=\"button\" class=\"navbar-toggle collapsed\"\n");
      out.write("				data-toggle=\"collapse\"\n");
      out.write("				data-target=\"#bs-example-navbar-cpllapse-1 aria-expanded=false\">\n");
      out.write("				<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\n");
      out.write("					class=\"icon-bar\"></span>\n");
      out.write("			</button>\n");
      out.write("			<a class=\"navbar-brand\" href=\"main.jsp\">JSP 게시판 웹사이트</a>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"collapse navbar-collapse\"\n");
      out.write("			id=\"bs-example-navbar-collapse-1\">\n");
      out.write("			<ul class=\"nav navbar-nav\">\n");
      out.write("				<li><a href=\"main.jsp\">메인</a>\n");
      out.write("				<li><a href=\"bbs.jsp\">게시판</a>\n");
      out.write("			</ul>\n");
      out.write("			<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("				<li class=\"dropdown\"><a href=\"#\" class=\"dropdown-toggle\"\n");
      out.write("					data-toggle=\"dropdown\" role=\"button\" aria-haspopup=\"true\"\n");
      out.write("					aria-expanded=\"false\">접속하기<span class=\"caret\"></span></a>\n");
      out.write("					<ul class=\"dropdown-menu\">\n");
      out.write("						<li class=\"active\"><a href=\"login.jsp\">로그인</a></li>\n");
      out.write("						<li><a href=\"join.jsp\">회원가입</a></li>\n");
      out.write("					</ul></li>\n");
      out.write("			</ul>\n");
      out.write("		</div>\n");
      out.write("	</nav>\n");
      out.write("	<div class=\"container\">\n");
      out.write("		<div class=\"col-lg-4\">\n");
      out.write("			<div class=\"col-lg-4\">\n");
      out.write("				<div class=\"jumbotron\" style=\"padding-top: 20px;\">\n");
      out.write("					<form method=\"post\" action=\"joinAction.jsp\">\n");
      out.write("						<h3 style=\"text-align: center;\">회원가입 화면</h3>\n");
      out.write("						<div class=\"form-group\">\n");
      out.write("							<input type=\"text\" class=\"form-control\" placeholder=\"아이디\"\n");
      out.write("								name=\"userID\" maxlength=\"20\">\n");
      out.write("						</div>\n");
      out.write("						<div class=\"form-group\">\n");
      out.write("							<input type=\"password\" class=\"form-control\" placeholder=\"비밀번호\"\n");
      out.write("								name=\"userPassword\" maxlength=\"20\">\n");
      out.write("						</div>\n");
      out.write("						<div class=\"form-group\">\n");
      out.write("							<input type=\"text\" class=\"form-control\" placeholder=\"이름\"\n");
      out.write("								name=\"userName\" maxlength=\"20\">\n");
      out.write("						</div>\n");
      out.write("						<div class=\"form-group\" style=\"text-align: center;\">\n");
      out.write("							<div class=\"btn-group\" data-toggle=\"buttons\">\n");
      out.write("								<label class=\"btn btn-primary active\"> \n");
      out.write("									<input type=\"radio\" name=\"userGender\" autocomplete=\"off\" value=\"남자\" checked>남자\n");
      out.write("								</label>\n");
      out.write("								<label class=\"btn btn-primary\"> \n");
      out.write("									<input type=\"radio\" name=\"userGender\" autocomplete=\"off\" value=\"여자\" checked>여자\n");
      out.write("								</label>\n");
      out.write("							</div>\n");
      out.write("						</div>\n");
      out.write("						<div class=\"form-group\">\n");
      out.write("							<input type=\"email\" class=\"form-control\" placeholder=\"이메일\"\n");
      out.write("								name=\"userEmail\" maxlength=\"20\">\n");
      out.write("						</div>\n");
      out.write("						<input type=\"submit\" class=\"btn btn-primary form-control\"\n");
      out.write("							value=\"회원가입 \">\n");
      out.write("					</form>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("	<script src=\"https://code.jquery.com/jquery-3.1.1.min.js\"></script>\n");
      out.write("	<script src=\"js/bootstrap.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
