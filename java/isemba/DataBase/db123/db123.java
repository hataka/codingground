// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: db123.java 
 * created : Time-stamp: <09/07/03(��) 22:50:46 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/db123.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
///////////////////////////////////////////////////////////////////////////////
//  << db123.java >>
//
//�@�f�[�^�x�[�X�i�Q�j�F�g�����U�N�V���������i���R�[�h�̌����j
//
//�@���֘A����SQL�̍\��
//
//�@�@SELECT * FROM �e�[�u���� WHERE ��������
//    �@�Ӗ��F�e�[�u�����̗�ɂ����āA���������𖞂������̂�I�ԁB
//
//�@������
//�@�@���O�ɁA�Ǘ���(root)���A���[�U(guest)�ɑ΂��āA�f�[�^�x�[�X(db1)�Ɋ܂܂��
//�@�@�e�[�u��(tb1)�ւ̂��ׂĂ̌�����^���Ă����B
//�@�@���Ȃ킿�A���̃R�}���h�����s���Ă����K�v������B
//�@�@�@mysql> grant all on db1.tb1 to guest@localhost identified by 'anyone';
//
//�@���N���@
//�@�@MySQL�͋N�����Ă���Ƃ���B
//    (1) c:\>javac db123.java
//    (2) c:\>java db123
//
///////////////////////////////////////////////////////////////////////////////

import java.sql.*;

class db123 {
  public static void main(String args[]) {

//  String database = args[0]; // �f�[�^�x�[�X���B
//  String table = args[1];    // �e�[�u�����B
    String database = "test";  // �f�[�^�x�[�X���B
    String table = "tb1";      // �e�[�u�����B

    try{
      // JDBC�h���C�o�̃��[�h�B
      String driver = "org.gjt.mm.mysql.Driver"; // JDBC�h���C�o�B
      Class.forName(driver);

      // �f�[�^�x�[�X�ɐڑ��B
      String url = "jdbc:mysql://localhost/" + database + 
                   "?useUnicode=true&characterEncoding=SJIS"; // �f�[�^�x�[�X�B
//    String user = "guest";
//    String passwd = "anyone";
      String user = "root";
      String passwd = "kahata1015";
      Connection cn = DriverManager.getConnection(url,user,passwd);

      ///////////////////////////
      // �g�����U�N�V���������B//
      ///////////////////////////
      cn.setAutoCommit(false); // �g�����U�N�V���������̊J�n�B

      try{
        // SQL�����f�[�^�x�[�X�ɑ���@�\������Statement�I�u�W�F�N�g���쐬�B
        Statement st = cn.createStatement();

        ////////////////////////
        // SQL�����쐬�E���s�B//
        ////////////////////////
        String q1 = "USE " + database;
        st.execute(q1);

        String q2 = "CREATE TABLE " + table
                  + "(�ԍ� INTEGER PRIMARY KEY, ���O varchar(20)," 
                  + " �Z�� varchar(80) )";
        st.execute(q2);

        String q3 = "LOCK TABLE " + table + " WRITE";
        st.execute(q3);

        String q4 = "INSERT INTO " + table + " (�ԍ�,���O,�Z��) " +
                    "VALUES(1,'���ˑ��Y','��錧���ˎs')";
        st.executeUpdate(q4);

        String q5 = "INSERT INTO " + table + " (�ԍ�,���O,�Z��) " + 
                    "VALUES(2,'�����Ԏq','��錧�����s')";
        st.executeUpdate(q5);

        // SQL�����쐬�E���s���A���s���ʂ�ResultSet�I�u�W�F�N�g�Ɋi�[����B
        String q6 = "SELECT * FROM " + table + " WHERE ���O='�����Ԏq'";
        ResultSet rs = st.executeQuery(q6);

        /////////////////////
        // ���s���ʂ̕\���B//
        /////////////////////
        System.out.println("�f�[�^�x�[�X�F"+database);
        System.out.println("�e�[�u���F"+table);
        while( rs.next() ) {
          System.out.println("�ԍ��F" + rs.getInt("�ԍ�"));
          System.out.println("���O�F" + rs.getString("���O"));
          System.out.println("�Z���F" + rs.getString("�Z��"));
        }

        String q7 = "DROP TABLE " + table;
        st.execute(q7);
        System.out.print("�f�[�^�x�[�X(" + database + ") ");
        System.out.println("�e�[�u��(" + table + ")���폜���܂���");


        String q8 = "SHOW TABLES";
//      ResultSet rs = st.executeQuery(q9);
        rs = st.executeQuery(q8);

        // (�菇�T)���s���ʂ̕\���B
        System.out.println("�f�[�^�x�[�X�F" + database);
        System.out.println("�e�[�u���ꗗ");
        while( rs.next() ) {
          System.out.println(rs.getString(1));
        }

        cn.commit(); // �g�����U�N�V���������𐳏�I���B

      } catch( Exception e ) {
        System.out.println(e);
        cn.rollback(); // �g�����U�N�V�����������ُ�I���B

      } finally {
        cn.setAutoCommit(true); 
      }

      // �f�[�^�x�[�X�Ƃ̐ڑ������B
      cn.close();

    } catch( Exception e ) {
      System.out.println(e); 
    }
  }
} 
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
c:\> javac db123.java
c:\> java db123�@db1 tb1
�f�[�^�x�[�X�Fdb1
�e�[�u���Ftb1
�ԍ��F2
���O�F�����Ԏq
�Z���F��錧�����s
</pre>

</body>
</html>
*/
