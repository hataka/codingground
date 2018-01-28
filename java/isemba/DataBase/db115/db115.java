// -*- mode: java -*- Time-stamp: <2009-07-02 20:56:41 kahata>
/*====================================================================
 * name: db115.java 
 * created : Time-stamp: <09/07/02(��) 20:54:22 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/db115.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << db115.java >>
//
//�@�f�[�^�x�[�X�i�P�j�F�e�[�u���̍쐬(���R�[�h�̌���)
//
//�@���֘A����SQL�̍\��
//
//�@�@SELECT * FROM �e�[�u���� WHERE ��������
//    �@�Ӗ��F�e�[�u�����̗�ɂ����āA���������𖞂������̂�I�ԁB
//
//�@���N���@
//�@�@MySQL�͋N�����Ă�����̂Ƃ���B
//    (1) c:\>javac db115.java
//    (2) c:\>java db115 db1 tb1
//
////////////////////////////////////////////////////////////////////////////////

import java.sql.*;

class db115 {
  public static void main(String args[]) {

//  String database = args[0]; // �f�[�^�x�[�X���B
//  String table = args[1];    // �e�[�u�����B
    String database = "test";  // �f�[�^�x�[�X���B
    String table = "tb1";      // �e�[�u�����B

    try{
      // (�菇�P)JDBC�h���C�o�̃��[�h�B
      String driver = "org.gjt.mm.mysql.Driver";
      Class.forName(driver);

      // (�菇�Q)���[�U(guest)�Ƃ��ăf�[�^�x�[�X(db1)�ɐڑ��B
      // �e�[�u���œ��{��������ꍇ�A����(useUnicode=true&characterEncoding=SJIS)
      // ���w�肷��B
      String url = "jdbc:mysql://localhost/" + database +  
                   "?useUnicode=true&characterEncoding=SJIS"; // �f�[�^�x�[�X�B
//    String user = "guest";
//    String passwd = "anyone";
      String user = "root";
      String passwd = "kahata1015";
      Connection cn = DriverManager.getConnection(url,user,passwd);

      // (�菇�R)SQL�����f�[�^�x�[�X�ɑ���@�\������Statement�I�u�W�F�N�g���쐬�B
      Statement st = cn.createStatement();

      // (�菇�S)SQL�����쐬�E���s����B
        String q1 = "USE " + database;
        st.execute(q1);                     


        String q2 = "CREATE TABLE " + table
                  + "(�ԍ� INTEGER PRIMARY KEY, ���O varchar(20)," 
                  + " �Z�� varchar(80) )";
        st.execute(q2);

        String q3 = "INSERT INTO " + table + " (�ԍ�,���O,�Z��) " +
                    "VALUES(1,'���ˑ��Y','��錧���ˎs')";
        st.executeUpdate(q3);

        String q4 = "INSERT INTO " + table + " (�ԍ�,���O,�Z��) " + 
                    "VALUES(2,'�����Ԏq','��錧�����s')";
        st.executeUpdate(q4);


        // SQL�����쐬�E���s���A���s���ʂ�ResultSet�I�u�W�F�N�g�Ɋi�[����B
        String q5 = "SELECT * FROM " + table + " WHERE ���O='�����Ԏq'";
        ResultSet rs = st.executeQuery(q5);

      // (�菇�T)���s���ʂ̕\���B
        System.out.println("�f�[�^�x�[�X�F" + database);
        System.out.println("�e�[�u���F" + table);
        while( rs.next() ) {
          System.out.println("�ԍ��F" + rs.getInt("�ԍ�"));
          System.out.println("���O�F" + rs.getString("���O"));
          System.out.println("�Z���F" + rs.getString("�Z��"));
        }


        String q6 = "DROP TABLE " + table;
        st.execute(q6);
        System.out.print("�f�[�^�x�[�X(" + database + ") ");
        System.out.println("�e�[�u��(" + table + ")���폜���܂���");


        String q7 = "SHOW TABLES";
        rs = st.executeQuery(q7);
        // (�菇�T)���s���ʂ̕\���B
        System.out.println("�f�[�^�x�[�X�F" + database);
        System.out.println("�e�[�u���ꗗ");
        while( rs.next() ) {
          System.out.println(rs.getString(1));
        }


      // (�菇�U)�f�[�^�x�[�X�Ƃ̐ڑ������B
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
c:\> javac db115.java
c:\> java db115 db1 tb1
�f�[�^�x�[�X�Fdb1
�e�[�u���Ftb1
�ԍ��F2
���O�F�����Ԏq
�Z���F��錧�����s
</pre>

</body>
</html>
*/
