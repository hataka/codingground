// -*- mode: java -*- Time-stamp: <2009-07-03 15:50:37 kahata>
/*====================================================================
 * name: db114.java 
 * created : Time-stamp: <09/07/02(��) 20:38:17 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/DATABASE/db114.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << db114.java >>
//
//�@�f�[�^�x�[�X�i�P�j�F�e�[�u���̍쐬(���R�[�h�̓o�^�ƕ\��)
//
//�@���֘A����SQL�̍\��
//
//�@�@INSERT INTO �e�[�u���� (��,�c) VALUES(�f�[�^,�c)
//    �@�Ӗ��F�e�[�u���Ƀ��R�[�h��ǉ�����B
//�@�@SELECT * FROM �e�[�u����
//    �@�Ӗ��F�e�[�u���ɂ����āA���ׂẴ��R�[�h��I�ԁB
//
//�@��Statement�C���^�[�t�F�[�X�̃��\�b�h
//�@�@public ResultSet executeQuery(String sql) throws SQLException
//�@�@�@�@�\�FResultSet�I�u�W�F�N�g��Ԃ�SQL��sql�����s����B
//�@�@public int executeUpdate(String sql) throws SQLException
//�@�@�@�@�\�FINSERT���AUPDATE���A�܂���DELETE�������s����B
//    public boolean execute(String sql) throws SQLException
//      �@�\�F�C�ӂ�SQL��sql���w��ł���B
//            ���ʂ�ResultSet�I�u�W�F�N�g�̏ꍇ��true�A���ʂ��Ȃ��ꍇ��false�B
//
//�@��ResultSet�C���^�[�t�F�[�X�̃��\�b�h
//    public int getInt(String s) throws SQLException
//�@�@�@�@�\�FResultSet�I�u�W�F�N�g�̌��ݍs�ɂ���w�肳�ꂽ��s�̒l���A
//�@�@�@�@�@�@�����Ƃ��Ď擾����B
//    public String getString(String s) throws SQLException
//�@�@�@�@�\�FResultSet�I�u�W�F�N�g�̌��ݍs�ɂ���w�肳�ꂽ��s�̒l���A
//�@�@�@�@�@�@������Ƃ��Ď擾����B
//
//�@���N���@
//�@�@MySQL�͋N�����Ă�����̂Ƃ���B
//    (1) c:\>javac db114.java
//    (2) c:\>java db114 db1 tb1
//
////////////////////////////////////////////////////////////////////////////////

import java.sql.*;

class db114 {
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
        String q0 = "USE " + database;
        st.execute(q0);                     


//        String q1 = "DROP TABLE " + table;
//        st.execute(q1);
//        System.out.print("�f�[�^�x�[�X(" + database + ") ");
//        System.out.println("�e�[�u��(" + table + ")���폜���܂���");


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
        String q5 = "SELECT * FROM " + table;
        ResultSet rs = st.executeQuery(q5);

      // (�菇�T)���s���ʂ̕\���B
        System.out.println("�e�[�u��(" + table + ")���쐬���܂���");
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

        String q8 = "DROP TABLE " + table;
        st.execute(q8);
        System.out.print("�f�[�^�x�[�X(" + database + ") ");
        System.out.println("�e�[�u��(" + table + ")���폜���܂���");

        String q9 = "SHOW TABLES";
        rs = st.executeQuery(q9);
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
c:\> javac db114.java
c:\> java db114 db1 tb1
�f�[�^�x�[�X�Fdb1
�e�[�u���Ftb1
�ԍ��F1
���O�F���ˑ��Y
�Z���F��錧���ˎs
�ԍ��F2
���O�F�����Ԏq
�Z���F��錧�����s
</pre>

</body>
</html>
*/
