// -*- mode: java -*- Time-stamp: <2009-07-04 08:19:06 kahata>
/*====================================================================
 * name: db124.java 
 * created : Time-stamp: <09/07/04(�y) 08:13:51 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/db124.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
///////////////////////////////////////////////////////////////////////////////
//  << db124.java >>
//
//�@�f�[�^�x�[�X�i�Q�j�F�g�����U�N�V���������i���R�[�h�̍폜�j
//
//�@���֘A����SQL�̍\��
//
//�@�@DELETE FROM �e�[�u���� WHERE �폜����
//    �@�Ӗ��F�e�[�u���ɂ����āA�폜�����𖞂������̂��폜����B
//
//�@������
//�@�@���O�ɁA�Ǘ���(root)���A���[�U(guest)�ɑ΂��āA�f�[�^�x�[�X(db1)�Ɋ܂܂��
//�@�@�e�[�u��(tb1)�ւ̂��ׂĂ̌�����^���Ă����B
//�@�@���Ȃ킿�A���̃R�}���h�����s���Ă����K�v������B
//�@�@�@mysql> grant all on db1.tb1 to guest@localhost identified by 'anyone';
//
//�@���N���@
//�@�@MySQL�͋N�����Ă���Ƃ���B
//    (1) c:\>javac db124.java
//    (2) c:\>java db124
//
///////////////////////////////////////////////////////////////////////////////

import java.sql.*;

class db124 {
  public static void main(String args[]) {

//  String database = args[0]; // �f�[�^�x�[�X���B
//  String table = args[1];    // �e�[�u�����B
    String database = "test";  // �f�[�^�x�[�X���B
    String table = "tb1";      // �e�[�u�����B

    try{
      // JDBC�h���C�o�̃��[�h�B
      String driver = "org.gjt.mm.mysql.Driver"; // JDBC�h���C�o�B
      Class.forName(driver);

      // �f�[�^�x�[�X�ւ̐ڑ��B
      String url = "jdbc:mysql://localhost/" + database + 
                   "?useUnicode=true&characterEncoding=SJIS"; // �f�[�^�x�[�X�B
//    String user = "guest";
//    String passwd = "anyone";
      String user = "root";
      String passwd = "kahata1015";
      Connection cn = DriverManager.getConnection(url,user,passwd);

      System.out.println("�f�[�^�x�[�X�F"+database);
      System.out.println("�e�[�u���F"+table);
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
        // SQL�����쐬�E���s���A���s���ʂ�ResultSet�I�u�W�F�N�g�Ɋi�[����B
        System.out.println("SELECT * FROM " + table + " WHERE ���O='�����Ԏq'" + " �����s���܂��� ");

        /////////////////////
        // ���s���ʂ̕\���B//
        /////////////////////
 //       System.out.println("�f�[�^�x�[�X�F"+database);
 //       System.out.println("�e�[�u���F"+table);
        while( rs.next() ) {
          System.out.println("�ԍ��F" + rs.getInt("�ԍ�"));
          System.out.println("���O�F" + rs.getString("���O"));
          System.out.println("�Z���F" + rs.getString("�Z��"));
        }

        String q7 = "DELETE FROM " + table + " WHERE �ԍ�=2";
        st.executeUpdate(q7);
        System.out.println("DELETE FROM " + table + " WHERE �ԍ�=2" + " �����s���܂���");

        String q8 = "SELECT * FROM " + table;
        rs = st.executeQuery(q8);

        /////////////////////
        // ���s���ʂ̕\���B//
        /////////////////////
//        System.out.println("�f�[�^�x�[�X�F"+database);
//        System.out.println("�e�[�u���F"+table);
        while( rs.next() ) {
          System.out.println("�ԍ��F" + rs.getInt("�ԍ�"));
          System.out.println("���O�F" + rs.getString("���O"));
          System.out.println("�Z���F" + rs.getString("�Z��"));
        }

        String q9 = "DROP TABLE " + table;
        st.execute(q9);
        System.out.print("�f�[�^�x�[�X(" + database + ") ");
        System.out.println("�e�[�u��(" + table + ")���폜���܂���");


        String q10 = "SHOW TABLES";
//      ResultSet rs = st.executeQuery(q10);
        rs = st.executeQuery(q10);

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
c:\> javac db124.java
c:\> java db124
�f�[�^�x�[�X�Fdb1
�e�[�u���Ftb1
�ԍ��F1
���O�F���ˑ��Y
�Z���F��錧���ˎs
</pre>

</body>
</html>
*/
