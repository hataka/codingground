<!--====================================================================-->
<!-- << db141a.htm >>                                                   -->
<!--                                                                    -->
<!--  JAVA�v���O���~���O�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@  -->
<!--                                                                    -->
<!--====================================================================-->

<html>
<head>
  <title>JAVA�v���O���~���O</title>
</head>

<body bgcolor="white" text="black">

<pre>
<%--============================================================================
  << db141a.jsp >>

  �f�[�^�x�[�X�i�S�j�F�i�r�o����f�[�^�x�[�X�փA�N�Z�X

  ���@�\
  �@����P�F�t�H�[������f�[�^�x�[�X���A�e�[�u�����A���[�U���A�p�X���[�h��
  �@�@�@�@�@���͂���B
�@�@����Q�F���R�[�h�̕\���B
�@�@����R�F���R�[�h�̒ǉ��ƍ폜�B

�@���N���@
    (1)MySQL���N������B
    (2)Tomcat���N������B
�@�@(3)JSP�t�@�C��(db141a.jsp)���쐬���A
�@�@�@�@ %CATALINA_HOME%\webapps\SV\db141a.jsp
       �ɕۑ�����B
    (4)URL(http://localhost:8080/SV/db141a.htm)���w�肷��B
============================================================================--%>

<%@ page contentType="text/html; charset=Shift_JIS" %>
<%@ page import="java.sql.*" %>

<html>
<head><title>�f�[�^�x�[�X����</title></head>
<body>

<%
  // �f�[�^�x�[�X�������A�f�[�^�x�[�X���A�e�[�u�����A���[�U���A�p�X���[�h��
  // �ۑ����Ă������߁A�Z�b�V�����@�\���g���B
  String database=null, table=null, user=null, password=null;

  /////////////////////////////
  // �t�H�[���̃f�[�^���擾�B//
  /////////////////////////////
  request.setCharacterEncoding("JISAutoDetect");
  String cmd = request.getParameter("cmd");

  // [���s]�{�^���ɑΉ����鏈���B
  if( "���s".equals(cmd) ) {
    database = request.getParameter("db1");
    session.setAttribute("DB1",database);
    table = request.getParameter("db2");
    session.setAttribute("DB2",table);
    user = request.getParameter("db3");
    session.setAttribute("DB3",user);
    password = request.getParameter("db4");
    session.setAttribute("DB4",password);
  } else {
    database = (String)session.getAttribute("DB1");
    table = (String)session.getAttribute("DB2");
    user = (String)session.getAttribute("DB3");
    password = (String)session.getAttribute("DB4");
  }
%>

�f�[�^�x�[�X����<br>
�f�[�^�x�[�X�F<%= database %>�@�e�[�u���F<%= table %>
<form action=http://localhost:8080/SV/db141a.jsp method=POST>
  <input type=submit name=cmd value=�\��>
  <input type=submit name=cmd value=����>
  <input type=submit name=cmd value=�ǉ�>
  <input type=submit name=cmd value=�폜>
</form>

<%
  // [����]�{�^���ɑΉ����鏈���B
  if( "����".equals(cmd) ) {
    out.println("�������܂���"
              + "</body>"
              + "</html>");
    return;
  }

  // [�ǉ�]�{�^���ɑΉ����鏈���B
  if( "�ǉ�".equals(cmd) ) {
    out.println("<form action=http://localhost:8080/SV/db141a.jsp "
              + "method=POST>"
              + "�ԍ��F<input type=text size=5 name=a1><br>"
              + "���O�F<input type=text size=20 name=a2><br>"
              + "�Z���F<input type=text size=40 name=a3><br>"
              + "<input type=submit name=add value=�ǉ����s>"
              + "</form>"
              + "</body>"
              + "</html>");
    return;
  }

  // [�폜]�{�^���ɑΉ����鏈���B
  if( "�폜".equals(cmd) ) {
    out.println("<form action=http://localhost:8080/SV/db141a.jsp "
              + "method=POST>"
              + "�폜�����F<input type=text size=20 name=d1><br>"
              + "<input type=submit name=del value=�폜���s>"
              + "</form>"
              + "</body>"
              + "</html>");
    return;
  }
%>

<%
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
        ResultSet rs = st.executeQuery(q3);
        // ���s���ʂ̕\���B
        out.println("[���R�[�h�̕\���J�n]<br>" + "<hr>");
        while( rs.next() ) {
          out.println("�ԍ��F" + rs.getInt("�ԍ�") + "�@"
                    + "���O�F" + rs.getString("���O") + "�@"
                    + "�Z���F" + rs.getString("�Z��") + "<br>"
                    + "<hr>");
        }
        out.println("[���R�[�h�̕\���I��]<br>");
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
        String q3 = "INSERT INTO " + table + " (�ԍ�,���O,�Z��  ) " +
             "VALUES(" + a1 + ",'" + a2 + "','" + a3 +   "')";
        st.executeUpdate(q3);
        // ���s���ʂ̕\���B
        out.println("[���R�[�h�̒ǉ��I��]<br>");
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
        st.executeUpdate(q3);
        String q4 = "SELECT COUNT(*) FROM " + table;
        ResultSet rs = st.executeQuery(q4);
        // ���s���ʂ̕\���B
        while( rs.next() ) {
          out.println("���݂̃��R�[�h���F" + rs.getInt(1  ) + "<br>");
        }
        out.println("[���R�[�h�̍폜�I��]<br>");
      }
      cn.commit(); // �g�����U�N�V���������𐳏�I���B
    } catch( Exception e ) {
      System.out.println(e);
      cn.rollback(); // �g�����U�N�V�����������ُ�I���B
    } finally {
      cn.setAutoCommit(true); // �g�����U�N�V���������̏I���B
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
%>

</body>
</html>
</pre>

<font size=5 color=blue>HTML�t�@�C��(hp141a.htm)</font><br>

<pre>
<!-- << hp141a.htm >> -->
<html>
<head><title>�f�[�^�x�[�X����</title></head>
<body>
�f�[�^�x�[�X����
<form action=http://localhost:8080/SV/db141a.jsp method=POST>
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

URL(http://localhost:8080/SV/hp141a.htm)���w���<br>
<img src="db141aa.jpg" width=400 height=250><br><br>
<img src="db141ab.jpg" width=400 height=250><br><br>

���s���N���b�N��<br>
<img src="db141ac.jpg" width=400 height=250><br><br>

�\�����N���b�N��<br>
<img src="db141ad.jpg" width=400 height=350><br><br>

�������N���b�N��<br>
<img src="db141ae.jpg" width=400 height=250><br><br>

�ǉ����N���b�N��<br>
<img src="db141af.jpg" width=400 height=300><br><br>

�ǉ����s���N���b�N��<br>
<img src="db141ag.jpg" width=400 height=250><br><br>

�\�����N���b�N��<br>
<img src="db141ah.jpg" width=400 height=350><br><br>

�폜���N���b�N��<br>
<img src="db141ai.jpg" width=400 height=300><br><br>

�폜���s���N���b�N��<br>
<img src="db141aj.jpg" width=400 height=300><br><br>

�\�����N���b�N��<br>
<img src="db141ak.jpg" width=400 height=300><br><br>

</body>
</html>
