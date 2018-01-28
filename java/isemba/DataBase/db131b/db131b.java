// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: db131b.java 
 * created : Time-stamp: <09/07/07(��) 17:31:40 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/db131b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
///////////////////////////////////////////////////////////////////////////////
//  << db131b.java >>
//
//�@�f�[�^�x�[�X�i�R�j�F�T�[�u���b�g����f�[�^�x�[�X�փA�N�Z�X
//
//�@���@�\
//�@�@����P�F�t�H�[������f�[�^�x�[�X���A�e�[�u�����A���[�U���A�p�X���[�h��
//�@�@�@�@�@�@���͂���B
//�@�@����Q�F���R�[�h�̕\���B
//�@�@����R�F���R�[�h�̒ǉ��ƍ폜�B
//
//�@���N���@
//    (1)MySQL���N������B
//    (2)Tomcat���N������B
//�@�@(3)Java�t�@�C��(db131b.java)���R���p�C�����Aclass�t�@�C��(db131b.class)��
//       �쐬����B
//       �������AJava�t�@�C��(db131b.java)�́A
//�@�@�@�@   %CATALINA_HOME%\webapps\SV\WEB-INF\classes\db131b.java
//   �@�@class�t�@�C��(db131b.class)�́A
//   �@�@�@�@%CATALINA_HOME%\webapps\SV\WEB-INF\classes\db131b.class
//       �ɕۑ�����B
//    (4)HTML�t�@�C��(hp131b.htm)�́A
//   �@�@�@�@%CATALINA_HOME%\webapps\SV\hp131b.htm
//       �ɕۑ�����B
//    (5)URL(http://localhost:8080/SV/hp131b.htm)���w�肷��B
//
///////////////////////////////////////////////////////////////////////////////

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class db131b extends HttpServlet {
  public void doPost(HttpServletRequest request, HttpServletResponse response)
                     throws ServletException,IOException {

    // �f�[�^�x�[�X�������A�f�[�^�x�[�X���A�e�[�u�����A���[�U���A�p�X���[�h��
    // �ۑ����Ă������߁A�Z�b�V�����@�\���g���B
    HttpSession hs = request.getSession();
    String database, table, user, password;
    ResultSet rs=null;

    /////////////////////////////
    // �t�H�[���̃f�[�^���擾�B//
    /////////////////////////////
    request.setCharacterEncoding("JISAutoDetect");
    String cmd = request.getParameter("cmd");

    // �f�[�^�x�[�X���A�e�[�u�����A���[�U���A�p�X���[�h�̕ۑ��Ɖ񕜁B
    if( "���s".equals(cmd) ) {
      database = request.getParameter("db1");
      hs.setAttribute("DB1",database);
      table = request.getParameter("db2");
      hs.setAttribute("DB2",table);
      user = request.getParameter("db3");
      hs.setAttribute("DB3",user);
      password = request.getParameter("db4");
      hs.setAttribute("DB4",password);
    } else {
      database = (String)hs.getAttribute("DB1");
      table = (String)hs.getAttribute("DB2");
      user = (String)hs.getAttribute("DB3");
      password = (String)hs.getAttribute("DB4");
    }

    //////////////////////////
    // HTML�����̏o��(�J�n) //
    //////////////////////////

    // �R���e���c�^�C�v�̎w��B
    response.setContentType("text/html; charset=Shift_JIS");
    PrintWriter pw = response.getWriter();

    // �e�{�^���ɋ��ʂ̏����B
    pw.println("<html>"
         + "<head><title>�f�[�^�x�[�X����</title></head>"
         + "<body>"
         + "�f�[�^�x�[�X����<br>"
         + "�f�[�^�x�[�X�F" + database + "�@"
         + "�e�[�u���F" + table + "�@"
         + "<form action=http://localhost:8080/SV/servlet/db131b method=POST>"
         + "<input type=submit name=cmd value=�\��>"
         + "<input type=submit name=cmd value=����>"
         + "<input type=submit name=cmd value=�ǉ�>"
         + "<input type=submit name=cmd value=�폜>"
         + "</form>");

    // [����]�{�^���ɑΉ����鏈���B
    if( "����".equals(cmd) ) {
      pw.println("�������܂���"
               + "</body>"                                             
               + "</html>");                                           
      pw.flush();                                                        
      pw.close();  
      return;                
    }                      

    // [�ǉ�]�{�^���ɑΉ����鏈���B
    if( "�ǉ�".equals(cmd) ) {
      pw.println("<form action=http://localhost:8080/SV/servlet/db131b "   
               + "method=POST>"                                         
               + "�ԍ��F<input type=text size=5 name=a1><br>"           
               + "���O�F<input type=text size=20 name=a2><br>"          
               + "�Z���F<input type=text size=40 name=a3><br>"          
               + "<input type=submit name=add value=�ǉ����s>"               
               + "</form>"   
               + "</body>"                                             
               + "</html>");                                           
      pw.flush();                                                        
      pw.close();                                                        
      return;                
    }                                                                     

    // [�폜]�{�^���ɑΉ����鏈���B       
    if( "�폜".equals(cmd) ) {           
      pw.println("<form action=http://localhost:8080/SV/servlet/db131b "  
               + "method=POST>"                                        
               + "�폜�����F<input type=text size=20 name=d1><br>"     
               + "<input type=submit name=del value=�폜���s>"         
               + "</form>"                                             
               + "</body>"                                             
               + "</html>");                                           
      pw.flush();                                                        
      pw.close();                                                        
      return;                
    }                                                                    

    ////////////////////////////
    // �f�[�^�x�[�X����(�J�n) //
    ////////////////////////////
    try{
      // JDBC�h���C�o�̃��[�h�B
      String driver = "org.gjt.mm.mysql.Driver"; // JDBC�h���C�o�B
      Class.forName(driver);

      // �f�[�^�x�[�X�ɐڑ��B
      String url = "jdbc:mysql://localhost/" + database + 
                   "?useUnicode=true&characterEncoding=SJIS"; // �f�[�^�x�[�X�B
      Connection cn = DriverManager.getConnection(url,user,password);

      ////////////////////////////////
      // �g�����U�N�V��������(�J�n) //
      ////////////////////////////////
      cn.setAutoCommit(false); 
      try{
        // SQL�����f�[�^�x�[�X�ɑ���@�\������Statement�I�u�W�F�N�g���쐬�B
        Statement st = cn.createStatement();

        // [�\��]�{�^���ɑΉ����鏈���B
        if( "�\��".equals(cmd) ) {
          // SQL�����쐬�����s�B
          String q1 = "USE " + database;
          st.execute(q1);
          String q2 = "LOCK TABLE " + table + " WRITE";
          st.execute(q2);
          String q3 = "SELECT * FROM " + table;
          rs = st.executeQuery(q3);

          // ���s���ʂ̕\���B
          pw.println("[���R�[�h�̕\���J�n]<br>" + "<hr>");
          while( rs.next() ) {
          pw.println("�ԍ��F" + rs.getInt("�ԍ�") + "�@"
                   + "���O�F" + rs.getString("���O") + "�@"
                   + "�Z���F" + rs.getString("�Z��") + "<br>"
                   + "<hr>"); 
          }
          pw.println("[���R�[�h�̕\���I��]<br>");
        }

        // [�ǉ����s]�{�^���ɑΉ����鏈���B
        String add = request.getParameter("add");
        if( "�ǉ����s".equals(add) ) {
          String a1 = request.getParameter("a1");
          String a2 = request.getParameter("a2");
          String a3 = request.getParameter("a3");
          // SQL�����쐬�����s�B
          String q1 = "USE " + database;
          st.execute(q1);
          String q2 = "LOCK TABLE " + table + " WRITE";
          st.execute(q2);
          String q3 = "INSERT INTO " + table + " (�ԍ�,���O,�Z��) " + 
               "VALUES(" + a1 + ",'" + a2 + "','" + a3 + "')";
          st.executeUpdate(q3);
          // ���s���ʂ̕\���B
          pw.println("[���R�[�h�̒ǉ��I��]<br>");
        }

        // [�폜���s]�{�^���ɑΉ����鏈���B
        String del = request.getParameter("del");
        if( "�폜���s".equals(del) ) {
          String d1 = request.getParameter("d1");
          // SQL�����쐬�����s�B
          String q1 = "USE " + database;
          st.execute(q1);
          String q2 = "LOCK TABLE " + table + " WRITE";
          st.execute(q2);
          String q3 = "DELETE FROM " + table + " WHERE " + d1;
          String q4 = "SELECT COUNT(*) FROM " + table;
          st.executeUpdate(q3);
          rs = st.executeQuery(q4);
          // ���s���ʂ̕\���B
          while( rs.next() ) {
            pw.println("���݂̃��R�[�h���F" + rs.getInt(1) + "<br>"); 
          }
          pw.println("[���R�[�h�̍폜�I��]<br>");
        }

        cn.commit(); // �g�����U�N�V���������𐳏�I���B
      } catch( Exception e ) {
        System.out.println(e);
        cn.rollback(); // �g�����U�N�V�����������ُ�I���B
      } finally {
        cn.setAutoCommit(true); 
      }
      ////////////////////////////////
      // �g�����U�N�V��������(�I��) //
      ////////////////////////////////

      // �f�[�^�x�[�X�Ƃ̐ڑ������B
      cn.close();
    } catch( Exception e ) {
      System.out.println(e); 
    }
    ////////////////////////////
    // �f�[�^�x�[�X����(�I��) //
    ////////////////////////////

    pw.println("</body>"                                             
             + "</html>");                                           
    pw.flush();                                                        
    pw.close();                                                        
    //////////////////////////
    // HTML�����̏o��(�I��) //
    //////////////////////////
  }
} 
/*
</pre>

<font size=5 color=blue>HTML�t�@�C��(hp131b.htm)</font><br>

<pre>
<!-- << hp131b.htm >> -->
<html>
<head><title>�f�[�^�x�[�X����</title></head>
<body>
�f�[�^�x�[�X����
<form action=http://localhost:8080/SV/servlet/db131b method=POST>
�f�[�^�x�[�X�F<input type=text size=30 name=db1><br>
�e�[�u���@�@�F<input type=text size=30 name=db2><br>
���[�U�@�@�@�F<input type=text size=20 name=db3><br>
�p�X���[�h�@�F<input type=password size=20 name=db4><br>
<input type=submit name=cmd value=���s>
</form>
</body>
</html>
 
</pre>

<font size=5 color=blue>���s����</font><br><br>

URL(http://localhost:8080/SV/hp131b.htm)���w���<br>
<img src="db131ba.jpg" width=400 height=250><br><br>
<img src="db131bb.jpg" width=400 height=250><br><br>

���s���N���b�N��<br>
<img src="db131bc.jpg" width=400 height=250><br><br>

�\�����N���b�N��<br>
<img src="db131bd.jpg" width=400 height=350><br><br>

�������N���b�N��<br>
<img src="db131be.jpg" width=400 height=250><br><br>

�ǉ����N���b�N��<br>
<img src="db131bf.jpg" width=400 height=300><br><br>

�ǉ����s���N���b�N��<br>
<img src="db131bg.jpg" width=400 height=250><br><br>

�\�����N���b�N��<br>
<img src="db131bh.jpg" width=400 height=350><br><br>

�폜���N���b�N��<br>
<img src="db131bi.jpg" width=400 height=300><br><br>

�폜���s���N���b�N��<br>
<img src="db131bj.jpg" width=400 height=300><br><br>

�\�����N���b�N��<br>
<img src="db131bk.jpg" width=400 height=300><br><br>

</body>
</html>
*/
