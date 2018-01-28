// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: db126b.java 
 * created : Time-stamp: <09/07/07(��) 17:15:43 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/db126b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
///////////////////////////////////////////////////////////////////////////////
//  << db126b.java >>
//
//�@�f�[�^�x�[�X�i�Q�j�F�g�����U�N�V���������i�����j
//
//      �f�[�^�x�[�X(db1),�e�[�u��(tb2)�ɑ΂��āA�����̃v���Z�X���A�N�Z�X����
//      �Ƃ��̐������𒲂ׂ�B
//      ���Ȃ킿�A��̃v���Z�X�����񐔃��R�[�h�̍X�V���s���A���̉񐔂̍��v��
//�@�@�@���R�[�h�̋L�^����v���邩�ǂ������݂�B
//
//�@������
//�@�@���O�ɁA�Ǘ���(root)���A���[�U(guest)�ɑ΂��āA�f�[�^�x�[�X(db1)�Ɋ܂܂��
//�@�@�e�[�u��(tb2)�ւ̂��ׂĂ̌�����^���Ă����B
//�@�@���Ȃ킿�A���̃R�}���h�����s���Ă����K�v������B
//�@�@�@mysql> grant all on db1.tb2 to guest@localhost identified by 'anyone';
//
//�@���N���@
//�@�@MySQL�͋N�����Ă���Ƃ���B
//    (1) c:\>javac db126b.java
//    (2) c:\>java db126b �J��Ԃ���
//
///////////////////////////////////////////////////////////////////////////////

import java.sql.*;

class db126b {
  public static void main(String args[]) {

    String database = "db1"; // �f�[�^�x�[�X���B
    String table = "tb2";    // �e�[�u�����B
    int n = Integer.parseInt(args[0]); // �J��Ԃ���args[0]�B
    int n1=0, n2=0, n3=0;
    Connection cn;
    Statement st;
    ResultSet rs=null;

    String url = "jdbc:mysql://localhost/" + database +
                 "?useUnicode=true&characterEncoding=SJIS";
    String user = "guest";
    String passwd = "anyone";

    // ���񐔂̌J��Ԃ��B
    for( int i=1; i<=n; i++ ) {

      try{
        // JDBC�h���C�o�̃��[�h�B
        String driver = "org.gjt.mm.mysql.Driver"; // JDBC�h���C�o�B
        Class.forName(driver);

        // ���[�U(guest)�Ƃ��ăf�[�^�x�[�X�ɐڑ��B
        cn = DriverManager.getConnection(url,user,passwd);

        ///////////////////////////
        // �g�����U�N�V���������B//
        ///////////////////////////
        cn.setAutoCommit(false); // �g�����U�N�V���������̊J�n�B

        // SQL�����f�[�^�x�[�X�ɑ���@�\������Statement�I�u�W�F�N�g���쐬�B
        st = cn.createStatement();

        try{
          ////////////////////////
          // SQL�����쐬�E���s�B//
          ////////////////////////
          String q1 = "USE " + database;
          st.execute(q1);

          // �e�[�u���̃��b�N�B
          String q2 = "LOCK TABLE " + table + " WRITE";
          st.execute(q2);

          // SQL�����쐬�E���s���A���s���ʂ�ResultSet�I�u�W�F�N�g�Ɋi�[����B
          String q3 = "SELECT * FROM " + table;
          rs = st.executeQuery(q3);

          rs.next();
          int m = rs.getInt("�X�V��") + 1;

          String q4 = "UPDATE " + table + " SET �X�V��=" + m;
          st.executeUpdate(q4);

          n1++;
          cn.commit(); // �g�����U�N�V���������𐳏�I���B

        } catch( Exception e ) {
          System.out.println(e);
          n2++;
          cn.rollback(); // �g�����U�N�V�����������ُ�I���B

        } finally {
          n3++;
          cn.setAutoCommit(true); // �g�����U�N�V���������̏I���B
        }

        // �f�[�^�x�[�X�Ƃ̐ڑ������B
        cn.close();

      } catch( Exception e ) {
        System.out.println(e);
      }
    }

    /////////////////////
    // �ŏI���ʂ̏o�́B//
    /////////////////////
    try {
      cn = DriverManager.getConnection(url,user,passwd);
      // SQL�����f�[�^�x�[�X�ɑ���@�\������Statement�I�u�W�F�N�g���쐬�B
      st = cn.createStatement();

      String q1 = "USE " + database;
      st.execute(q1);

      // SQL�����쐬�E���s���A���s���ʂ�ResultSet�I�u�W�F�N�g�Ɋi�[����B
      String q2 = "SELECT * FROM " + table;
      rs = st.executeQuery(q2);

      System.out.println("�e�[�u��(" + table + ")�̓��e");
      while( rs.next() ) {
        System.out.println("�X�V�񐔁F" + rs.getInt("�X�V��"));
      }
      System.out.println();

    } catch( Exception e) { }

    System.out.println("�J��Ԃ��� = " + n);
    System.out.println("����I���� = " + n1);
    System.out.println("�ُ�I���� = " + n2);
    System.out.println("�����I���� = " + n3);
  }
}
/*
</pre>

<font size=5 color=blue>���s����</font><br><br>

�����v���O����(db126b)���قړ����ɋN������B<br>
�ŏI�̍X�V�񐔂��R�O�O�O�ƂȂ�΁A����ɏ�������Ă���B<br><br>

�e�[�u�������b�N�����ꍇ�A��������������Ă���B<br>
<img src="db126ba.jpg" width=500 height=250><br><br>
<img src="db126bb.jpg" width=500 height=250><br><br>
<img src="db126bc.jpg" width=500 height=250><br><br>

�e�[�u�������b�N���Ȃ��ꍇ�A��������������Ă��Ȃ��B<br>
<img src="db126bd.jpg" width=500 height=250><br><br>
<img src="db126be.jpg" width=500 height=250><br><br>
<img src="db126bf.jpg" width=500 height=250><br><br>
</body>
</html>
*/
