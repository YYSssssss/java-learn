/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.96
 * Generated at: 2020-11-27 14:05:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.manage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_005fuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/manage/admin_menu.jsp", Long.valueOf(1606394923945L));
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

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

      out.write("\r\n");
      out.write("    \r\n");
      out.write("  \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\"/>\r\n");
      out.write("    <title>简单通用文章系统后台管理模板</title>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/common.css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/main.css\"/>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"topbar-wrap white\">\r\n");
      out.write("    <div class=\"topbar-inner clearfix\">\r\n");
      out.write("        <div class=\"topbar-logo-wrap clearfix\">\r\n");
      out.write("            <h1 class=\"topbar-logo none\"><a href=\"index.html\" class=\"navbar-brand\">后台管理</a></h1>\r\n");
      out.write("            <ul class=\"navbar-list clearfix\">\r\n");
      out.write("                <li><a class=\"on\" href=\"admin_index.jsp\">首页</a></li>\r\n");
      out.write("                <li><a href=\"#\" target=\"_blank\">网站首页</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"top-info-wrap\">\r\n");
      out.write("            <ul class=\"top-info-list clearfix\">\r\n");
      out.write("                <li><a href=\"#\">管理员</a></li>\r\n");
      out.write("                <li><a href=\"#\">修改密码</a></li>\r\n");
      out.write("                <li><a href=\"#\">退出</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"container clearfix\">\r\n");
      out.write("    <div class=\"sidebar-wrap\">\r\n");
      out.write("        <div class=\"sidebar-title\">\r\n");
      out.write("            <h1>菜单</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"sidebar-content\">\r\n");
      out.write("            <ul class=\"sidebar-list\">\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\"><i class=\"icon-font\">&#xe003;</i>常用操作</a>\r\n");
      out.write("                    <ul class=\"sub-menu\">\r\n");
      out.write("                        <li><a href=\"/Lmonkeyshop/manage/admin_DoUserSelect\"><i class=\"icon-font\">&#xe008;</i>用户管理</a></li>\r\n");
      out.write("                        <li><a href=\"admin_cate.jsp\"><i class=\"icon-font\">&#xe005;</i>分类管理</a></li>\r\n");
      out.write("                        <li><a href=\"admin_product.jsp\"><i class=\"icon-font\">&#xe006;</i>图书管理</a></li>\r\n");
      out.write("                        <li><a href=\"admin_order.jsp\"><i class=\"icon-font\">&#xe004;</i>订单管理</a></li>\r\n");
      out.write("                        <li><a href=\"admin_message.jsp\"><i class=\"icon-font\">&#xe012;</i>留言管理</a></li>\r\n");
      out.write("                        <li><a href=\"admin_news.jsp\"><i class=\"icon-font\">&#xe052;</i>新闻链接</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <a href=\"#\"><i class=\"icon-font\">&#xe018;</i>系统管理</a>\r\n");
      out.write("                    <ul class=\"sub-menu\">\r\n");
      out.write("                        <li><a href=\"system.html\"><i class=\"icon-font\">&#xe017;</i>系统设置</a></li>\r\n");
      out.write("                        <li><a href=\"system.html\"><i class=\"icon-font\">&#xe037;</i>清理缓存</a></li>\r\n");
      out.write("                        <li><a href=\"system.html\"><i class=\"icon-font\">&#xe046;</i>数据备份</a></li>\r\n");
      out.write("                        <li><a href=\"system.html\"><i class=\"icon-font\">&#xe045;</i>数据还原</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>");
      out.write("\r\n");
      out.write("    <!--/sidebar-->\r\n");
      out.write("    <div class=\"main-wrap\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"crumb-wrap\">\r\n");
      out.write("            <div class=\"crumb-list\"><i class=\"icon-font\"></i><a href=\"index.html\">首页</a><span class=\"crumb-step\">&gt;</span><span class=\"crumb-name\">用户管理</span></div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"search-wrap\">\r\n");
      out.write("            <div class=\"search-content\">\r\n");
      out.write("                <form action=\"/Lmonkeyshop/manage/admin_DoUserSelect\" method=\"get\">\r\n");
      out.write("                    <table class=\"search-tab\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th width=\"120\">选择分类:</th>\r\n");
      out.write("                            <td>\r\n");
      out.write("                                <select name=\"search-sort\" id=\"\">\r\n");
      out.write("                                    <option value=\"\">全部</option>\r\n");
      out.write("                                    <option value=\"19\">精品界面</option><option value=\"20\">推荐界面</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </td>\r\n");
      out.write("                            <th width=\"70\">关键字:</th>\r\n");
      out.write("                            <td><input class=\"common-text\" placeholder=\"关键字\" name=\"keywords\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.keywords}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\" id=\"\" type=\"text\"></td>\r\n");
      out.write("                            <td><input class=\"btn btn-primary btn2\" name=\"sub\" value=\"查询\" type=\"submit\"></td>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </table>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div  class=\"result-wrap\">\r\n");
      out.write("            <form action=\"/Lmonkeyshop/manage/admin_douserdel\" id=\"myform\" method=\"post\">\r\n");
      out.write("                <div class=\"result-title\">\r\n");
      out.write("                    <div class=\"result-list\">\r\n");
      out.write("                        <a href=\"admin_useradd.jsp\"><i class=\"icon-font\"></i>新增用户</a>\r\n");
      out.write("                        <a id=\"batchDel\" href=\"javascript:delmore('你确定删除这些用户吗？', 'myform')\"><i class=\"icon-font\"></i>批量删除</a>\r\n");
      out.write("                        <!--  a id=\"updateOrd\" href=\"javascript:void(0)\"><i class=\"icon-font\"></i>更新排序</a -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"result-content\">\r\n");
      out.write("                    <table class=\"result-tab\" width=\"100%\">\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th class=\"tc\" width=\"5%\"><input class=\"allChoose\" name=\"\" onclick=\"selall(this)\" type=\"checkbox\"></th>\r\n");
      out.write("                            <th>ID</th>\r\n");
      out.write("                            <th>姓名</th>\r\n");
      out.write("                            <th>性别</th>\r\n");
      out.write("                            <th>EMAIL</th>\r\n");
      out.write("                            <th>手机</th>\r\n");
      out.write("                            <th>操作</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                        \r\n");
      out.write("                        ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        \r\n");
      out.write("                        <script>\r\n");
      out.write("                        \tfunction Delete(mess, url) {\r\n");
      out.write("                        \t\tif(confirm(mess)) {\r\n");
      out.write("                        \t\t\tlocation.href=url;\r\n");
      out.write("                        \t\t\t\r\n");
      out.write("                        \t\t}\r\n");
      out.write("                        \t}\r\n");
      out.write("                        \t\r\n");
      out.write("                        \tfunction selall(o) {\r\n");
      out.write("                        \t\tvar a = document.getElementsByName('id[]');\r\n");
      out.write("                        \t\r\n");
      out.write("                        \t\r\n");
      out.write("                        \t\t\r\n");
      out.write("                        \t\tfor(var i=0; i<a.length; i++) {\r\n");
      out.write("                        \t\t\ta[i].checked = o.checked;\r\n");
      out.write("                        \t\t}\r\n");
      out.write("                        \t}\r\n");
      out.write("                        \t\r\n");
      out.write("                        \tfunction delmore(mess, formname) {\r\n");
      out.write("                        \t\tif(confirm(mess)) {\r\n");
      out.write("                        \t\t\tvar form = document.getElementById(formname);\r\n");
      out.write("                        \t\t\tform.submit();\r\n");
      out.write("                        \t\t}\r\n");
      out.write("                        \t}\r\n");
      out.write("                        </script>\r\n");
      out.write("                        \r\n");
      out.write("                    </table>\r\n");
      out.write("                    <div class=\"list-page\"> \r\n");
      out.write("\t\t\t\t\t\t共");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tsum}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("条记录，当前");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cpage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write('/');
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tpage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("页\r\n");
      out.write("\t\t\t\t\t\t<a href=\"admin_DoUserSelect?cp=1");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${searchParams}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">首页</a>\r\n");
      out.write("                    \t<a href=\"admin_DoUserSelect?cp=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cpage-1<1?1:cpage-1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${searchParams}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">上一页</a>\r\n");
      out.write("                    \t<a href=\"admin_DoUserSelect?cp=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cpage+1>tpage?tpage:cpage+1}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${searchParams}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">下一页</a>\r\n");
      out.write("                    \t<a href=\"admin_DoUserSelect?cp=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${tpage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${searchParams}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\">尾页</a>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <!--/main-->\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /manage/admin_user.jsp(53,24) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("u");
      // /manage/admin_user.jsp(53,24) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/manage/admin_user.jsp(53,24) '${userlist}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${userlist}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t                        <tr>\r\n");
            out.write("\t                            <td class=\"tc\"><input name=\"id[]\" value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.USER_ID}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("\" type=\"checkbox\"></td>\r\n");
            out.write("\t                            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.USER_ID}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t                            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.USER_NAME}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t                            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.USER_SEX=='T'?\"男\":\"女\"}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t                            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.USER_EMAIL}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t                            <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.USER_MOBILE}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("</td>\r\n");
            out.write("\t                            \r\n");
            out.write("\t                           \r\n");
            out.write("\t                            <td>\r\n");
            out.write("\t                                <a class=\"link-update\" href=\"admin_touserupdate?id=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.USER_ID}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("&cpage=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cpage}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
            out.write("\">修改</a>\r\n");
            out.write("\t                              ");
            if (_jspx_meth_c_005fif_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("\r\n");
            out.write("\t                            </td>\r\n");
            out.write("\t                        </tr>\r\n");
            out.write("                        ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /manage/admin_user.jsp(65,31) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.USER_STATUS ==1 }", java.lang.Boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t                                <a class=\"link-del\" href=\"javascript:Delete('你确定要删除用户【");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.USER_NAME}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(" }】吗？', '/Lmonkeyshop/manage/admin_douserdel?id=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${u.USER_ID}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("&cpage=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cpage }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("')\">删除</a>\r\n");
          out.write("\t                              ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }
}
