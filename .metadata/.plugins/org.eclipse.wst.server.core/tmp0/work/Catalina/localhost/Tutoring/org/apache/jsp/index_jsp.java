/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.64
 * Generated at: 2022-07-20 09:10:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/include/footer.jsp", Long.valueOf(1597885966000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1597885966000L));
    _jspx_dependants.put("/include/header.jsp", Long.valueOf(1658308200612L));
    _jspx_dependants.put("jar:file:/D:/third_project/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/COBS/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fchoose;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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
    _005fjspx_005ftagPool_005fc_005fchoose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fchoose.release();
    _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write('\n');
      out.write("\n");
      out.write("    \n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("  <meta charset=\"utf-8\">\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("  <meta name=\"description\" content=\"\">\n");
      out.write("  <meta name=\"author\" content=\"\">\n");
      out.write("  <title>영어 수업</title>\n");
      out.write("  <!-- Bootstrap core CSS -->\n");
      out.write("  <link href=\"/Tutoring/vendor/bootstrap/css/bootstrap.css\"  rel=\"stylesheet\">\n");
      out.write("  <!-- Custom fonts for this template -->\n");
      out.write("  <link href=\"/Tutoring/vendor/fontawesome-free/css/all.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"/Tutoring/vendor/simple-line-icons/css/simple-line-icons.css\"  rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic\"  rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("  <!-- Custom styles for this template -->\n");
      out.write("  <link href=\"/Tutoring/css/landing-page.css\" rel=\"stylesheet\">\n");
      out.write("  \n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\n");
      out.write("  <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\n");
      out.write("  \n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("  <!-- Navigation -->\n");
      out.write("  <nav class=\"navbar navbar-light bg-light static-top\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("         <a class=\"navbar-brand\" href=\"/Tutoring/index.jsp\"><img src=\"../Tutoring/img/logo1.png\" alt=\"CBS\"></a>\n");
      out.write("         <a class=\"navbar-nav\" href=\"/Tutoring/include/about.jsp\">와이저</a>\n");
      out.write("         <a class=\"navbar-nav\" href=\"/Tutoring/class/courseList\">과정</a>\n");
      out.write("    </div>\n");
      out.write("      ");
      if (_jspx_meth_c_005fchoose_005f0(_jspx_page_context))
        return;
      out.write("  \n");
      out.write("  	\n");
      out.write("  </nav>\n");
      out.write("  \n");
      out.write("<!-- Bootstrap core JavaScript -->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"/Tutoring/vendor/jquery/jquery.js\"></script>\n");
      out.write("<script src=\"/Tutoring/vendor/bootstrap/js/bootstrap.bundle.js\"></script>");
      out.write("\n");
      out.write("<style>\n");
      out.write("h1{\n");
      out.write("	text-align: left;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("  <!-- Masthead -->\n");
      out.write("  <header class=\"masthead text-white text-center\">\n");
      out.write("    <div class=\"overlay\"></div>\n");
      out.write("       \n");
      out.write("        <div class=\"mainLine\">\n");
      out.write("          <span style=\"width: 100%; height: 200px;\"></span>\n");
      out.write("          <h1 style=\"color:#484848; font-size: 48px; line-height: 1.5em;\">생생한 원어민 화상영어,<br/> 지금바로 시작하세요!</h1>\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("          <form>\n");
      out.write("            <div class=\"form-row\" style=\"width: 30%;\">\n");
      out.write("              <div class=\"col-12 col-md-9 mb-2 mb-md-0\">\n");
      out.write("                <input type=\"email\" class=\"form-control form-control-lg\" placeholder=\"  이메일 주소\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-12 col-md-3\">\n");
      out.write("                <input type=\"button\" value=\"회원가입\" class=\"btn btn-block btn-lg btn-primary\" onclick=\"location.href='/Tutoring/member/insert'\">\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("  </header>\n");
      out.write("\n");
      out.write("  <!-- Icons Grid -->\n");
      out.write("  <section class=\"features-icons bg-light text-center\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-4\">\n");
      out.write("          <div class=\"features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3\">\n");
      out.write("            <div class=\"features-icons-icon d-flex\">\n");
      out.write("              <i class=\"icon-screen-desktop m-auto text-primary\"></i>\n");
      out.write("            </div>\n");
      out.write("            <h3>수업</h3>\n");
      out.write("            <p class=\"lead mb-0\">튜터와 만들어 나가는 유연한 학습 스케쥴</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-4\">\n");
      out.write("          <div class=\"features-icons-item mx-auto mb-5 mb-lg-0 mb-lg-3\">\n");
      out.write("            <div class=\"features-icons-icon d-flex\">\n");
      out.write("              <i class=\"icon-layers m-auto text-primary\"></i>\n");
      out.write("            </div>\n");
      out.write("            <h3>커리큘럼</h3>\n");
      out.write("            <p class=\"lead mb-0\">내 레벨에 맞춰 선택해 더욱 체계적인 수업 진행</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-4\">\n");
      out.write("          <div class=\"features-icons-item mx-auto mb-0 mb-lg-3\">\n");
      out.write("            <div class=\"features-icons-icon d-flex\">\n");
      out.write("              <i class=\"icon-check m-auto text-primary\"></i>\n");
      out.write("            </div>\n");
      out.write("            <h3>수료증</h3>\n");
      out.write("            <p class=\"lead mb-0\">10시간 이상 수업 시, 캠블리 수료증 발급</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  <!-- Testimonials -->\n");
      out.write("  <section class=\"testimonials text-center bg-light\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <h2 class=\"mb-5\">유학 없이도 유창하게 영어로 말할 수 있어요!</h2>\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-4\">\n");
      out.write("          <div class=\"testimonial-item mx-auto mb-5 mb-lg-0\">\n");
      out.write("            <img class=\"img-fluid rounded-circle mb-3\" src=\"img/testimonials-1.jpg\" alt=\"\">\n");
      out.write("            <h5>Margaret E.</h5>\n");
      out.write("            <p class=\"font-weight-light mb-0\">\"I have been teaching English for 3 years. I am very patient, kind and I love to learn about new cultures and your thoughts about life.\"</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-4\">\n");
      out.write("          <div class=\"testimonial-item mx-auto mb-5 mb-lg-0\">\n");
      out.write("            <img class=\"img-fluid rounded-circle mb-3\" src=\"img/testimonials-2.jpg\" alt=\"\">\n");
      out.write("            <h5>Fred S.</h5>\n");
      out.write("            <p class=\"font-weight-light mb-0\">\"A conversationalist, I have worked internationally in business (operations, sales, training and HR) and am also licensed to teach scuba!\"</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-4\">\n");
      out.write("          <div class=\"testimonial-item mx-auto mb-5 mb-lg-0\">\n");
      out.write("            <img class=\"img-fluid rounded-circle mb-3\" src=\"img/testimonials-3.jpg\" alt=\"\">\n");
      out.write("            <h5>Sarah W.</h5>\n");
      out.write("            <p class=\"font-weight-light mb-0\">\"I own and run a small business, am easy to speak to and hold a TEFL qualification. I look forward to meeting you!\"</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("  <!-- Call to Action -->\n");
      out.write("  <section class=\"call-to-action text-white text-center\">\n");
      out.write("    <div class=\"overlay\"></div>\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-xl-9 mx-auto\">\n");
      out.write("          <h2 class=\"mb-4\">내게 꼭 맞는 튜터를 찾아보세요</h2>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-md-10 col-lg-8 col-xl-7 mx-auto\">\n");
      out.write("          <form>\n");
      out.write("            <div class=\"form-row\">\n");
      out.write("              <div class=\"col-12 col-md-9 mb-2 mb-md-0\">\n");
      out.write("                <input type=\"email\" class=\"form-control form-control-lg\" placeholder=\"  이메일 주소\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"col-12 col-md-3\">\n");
      out.write("                 <input type=\"button\" value=\"회원가입\" class=\"btn btn-block btn-lg btn-primary\" onclick=\"location.href='/Tutoring/member/insert'\">\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </section>\n");
      out.write("\n");
      out.write("<style>\n");
      out.write("footer{\n");
      out.write("	clear: both;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write(" <!-- Footer -->\n");
      out.write("  <footer class=\"footer bg-light\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-lg-6 h-100 text-center text-lg-left my-auto\">\n");
      out.write("          <ul class=\"list-inline mb-2\">\n");
      out.write("            <li class=\"list-inline-item\">\n");
      out.write("              <a href=\"#\">About</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"list-inline-item\">&sdot;</li>\n");
      out.write("            <li class=\"list-inline-item\">\n");
      out.write("              <a href=\"#\">Contact</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"list-inline-item\">&sdot;</li>\n");
      out.write("            <li class=\"list-inline-item\">\n");
      out.write("              <a href=\"#\">Terms of Use</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"list-inline-item\">&sdot;</li>\n");
      out.write("            <li class=\"list-inline-item\">\n");
      out.write("              <a href=\"#\">Privacy Policy</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("          <p class=\"text-muted small mb-4 mb-lg-0\">&copy; Your Website 2020. All Rights Reserved.</p>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-lg-6 h-100 text-center text-lg-right my-auto\">\n");
      out.write("          <ul class=\"list-inline mb-0\">\n");
      out.write("            <li class=\"list-inline-item mr-3\">\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <i class=\"fab fa-facebook fa-2x fa-fw\"></i>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"list-inline-item mr-3\">\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <i class=\"fab fa-twitter-square fa-2x fa-fw\"></i>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"list-inline-item\">\n");
      out.write("              <a href=\"#\">\n");
      out.write("                <i class=\"fab fa-instagram fa-2x fa-fw\"></i>\n");
      out.write("              </a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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

  private boolean _jspx_meth_c_005fchoose_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_005fchoose_005f0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _005fjspx_005ftagPool_005fc_005fchoose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    boolean _jspx_th_c_005fchoose_005f0_reused = false;
    try {
      _jspx_th_c_005fchoose_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fchoose_005f0.setParent(null);
      int _jspx_eval_c_005fchoose_005f0 = _jspx_th_c_005fchoose_005f0.doStartTag();
      if (_jspx_eval_c_005fchoose_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("     	");
          if (_jspx_meth_c_005fwhen_005f0(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\n");
          out.write("    	");
          if (_jspx_meth_c_005fwhen_005f1(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\n");
          out.write("    	");
          if (_jspx_meth_c_005fwhen_005f2(_jspx_th_c_005fchoose_005f0, _jspx_page_context))
            return true;
          out.write("\n");
          out.write("     ");
          int evalDoAfterBody = _jspx_th_c_005fchoose_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fchoose_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fchoose.reuse(_jspx_th_c_005fchoose_005f0);
      _jspx_th_c_005fchoose_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fchoose_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fchoose_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f0_reused = false;
    try {
      _jspx_th_c_005fwhen_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /include/header.jsp(38,6) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty sessionScope.userid}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f0 = _jspx_th_c_005fwhen_005f0.doStartTag();
      if (_jspx_eval_c_005fwhen_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("		    <ul class=\"navbar-nav\">\n");
          out.write("		      <li class=\"nav-item\">\n");
          out.write("		      	<a class=\"btn btn-gray\" href=\"/Tutoring/member/login\">로그인</a>\n");
          out.write("			    <a class=\"btn btn-primary\" href=\"/Tutoring/member/insert\">회원가입</a>\n");
          out.write("		      </li>\n");
          out.write("		  	</ul>\n");
          out.write("    	");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f0);
      _jspx_th_c_005fwhen_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f1_reused = false;
    try {
      _jspx_th_c_005fwhen_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /include/header.jsp(46,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.admin==1}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f1 = _jspx_th_c_005fwhen_005f1.doStartTag();
      if (_jspx_eval_c_005fwhen_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("		    <ul class=\"navbar-nav\">\n");
          out.write("		      <li class=\"nav-item\">\n");
          out.write("		      	<a class=\"btn btn-gray\" href=\"/Tutoring/member/Adminview\">관리자</a>\n");
          out.write("			    <a class=\"btn btn-primary\" href=\"/Tutoring/member/logout\">로그아웃</a>\n");
          out.write("		      </li>\n");
          out.write("		  	</ul>\n");
          out.write("    	");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f1);
      _jspx_th_c_005fwhen_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fwhen_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fchoose_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_005fwhen_005f2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    boolean _jspx_th_c_005fwhen_005f2_reused = false;
    try {
      _jspx_th_c_005fwhen_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fwhen_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fchoose_005f0);
      // /include/header.jsp(54,5) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fwhen_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.admin==0}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fwhen_005f2 = _jspx_th_c_005fwhen_005f2.doStartTag();
      if (_jspx_eval_c_005fwhen_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    		<ul class=\"navbar-nav\">\n");
          out.write("		      <li class=\"nav-item\">\n");
          out.write("		      	<a class=\"btn btn-gray\" href=\"/Tutoring/member/view\">내계정</a>\n");
          out.write("			    <a class=\"btn btn-info\" href=\"/Tutoring/member/logout\">로그아웃</a>\n");
          out.write("		      </li>\n");
          out.write("		  	</ul>\n");
          out.write("    	");
          int evalDoAfterBody = _jspx_th_c_005fwhen_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fwhen_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fwhen_0026_005ftest.reuse(_jspx_th_c_005fwhen_005f2);
      _jspx_th_c_005fwhen_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fwhen_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fwhen_005f2_reused);
    }
    return false;
  }
}
