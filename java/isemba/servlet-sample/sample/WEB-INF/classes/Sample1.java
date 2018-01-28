// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: Sample1.java 
 * created : Time-stamp: <09/06/22(月) 15:32:42 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run: http://localhost:8080/servlet-sample/Sample1
 * links:  http://www.javadrive.jp/servlet/ini/index4.html
 * description:
 * ====================================================================*/
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Sample1 extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{

        response.setContentType("text/html; charset=Shift_JIS");
        PrintWriter out = response.getWriter();

        out.println(createHTML("GET"));

        out.close();
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws IOException, ServletException{

        response.setContentType("text/html; charset=Shift_JIS");
        PrintWriter out = response.getWriter();

        out.println(createHTML("POST"));

        out.close();
    }

    protected String createHTML(String methodType){
        StringBuffer sb = new StringBuffer();

        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>サンプル</title>");
        sb.append("</head>");
        sb.append("<body>");

        sb.append("<p>");
        sb.append(methodType);
        sb.append("メソッドで呼び出されました</p>");

        sb.append("<p><a href=\"/servlet-sample/Sample1\">リンク</a></p>");

        sb.append("<form action=\"/servlet-sample/Sample1\" method=\"get\">");
        sb.append("<input type=\"submit\" value=\"GETで送信\">");
        sb.append("</form>");

        sb.append("<form action=\"/servlet-sample/Sample1\" method=\"post\">");
        sb.append("<input type=\"submit\" value=\"POSTで送信\">");
        sb.append("</form>");

        sb.append("</body>");
        sb.append("</html>");

        return (new String(sb));
    }
}
