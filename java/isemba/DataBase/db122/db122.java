// -*- mode: java -*- Time-stamp: <2009-07-03 16:28:12 kahata>
/*====================================================================
 * name: db122.java 
 * created : Time-stamp: <09/07/03(��) 16:22:25 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/db122.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
///////////////////////////////////////////////////////////////////////////////
//  << db122.java >>
//
//�@�f�[�^�x�[�X�i�Q�j�F�g�����U�N�V���������i���R�[�h�̓o�^�ƕ\���j
//
//�@���֘A����SQL�̍\��
//
//�@�@INSERT INTO �e�[�u���� (��,�c) VALUES(�f�[�^,�c)
//    �@�Ӗ��F�e�[�u���Ƀ��R�[�h��ǉ�����B
//�@�@SELECT * FROM �e�[�u����
//    �@�Ӗ��F�e�[�u���ɂ����āA���ׂẴ��R�[�h��I�ԁB
//�@�@LOCK TABLE �e�[�u���� WRITE
//    �@�Ӗ��F�e�[�u����r���I�ɐ�L���A���̃��[�U����̏����������Ȃ��B
//�@�@LOCK TABLE �e�[�u���� READ
//    �@�Ӗ��F���̃��[�U�Ƀe�[�u������̓ǂݍ��݂̂݋����B
//�@�@UNLOCK TABLE �e�[�u����
//    �@�Ӗ��F�e�[�u���ւ̃��b�N����������B
//
//�@��java.sql.Statement�C���^�[�t�F�[�X
//�@�@SQL�������s���A�쐬���ꂽ���ʂ�Ԃ����߂Ɏg�p�����B 
//
//�@��Statement�C���^�[�t�F�[�X�̃��\�b�h
//�@�@public ResultSet executeQuery(String sql) throws SQLException
//�@�@�@�@�\�FResultSet�I�u�W�F�N�g��Ԃ�SQL��sql�����s����B
//�@�@public int executeUpdate(String sql) throws SQLException
//�@�@�@�@�\�FINSERT���AUPDATE���A�܂���DELETE�������s����B
//    public boolean execute(String sql) throws SQLException
//      �@�\�F�C�ӂ�SQL��sql���w��ł���B
//            ���̌��ʂ�ResultSet�I�u�W�F�N�g�̏ꍇ��true�A�X�V�J�E���g�܂���
//�@�@�@�@�@�@���ʂ��Ȃ��ꍇ��false�B
//
//�@��ResultSet�C���^�[�t�F�[�X�̃��\�b�h
//    public int getInt(String s) throws SQLException
//�@�@�@�@�\�FResultSet�I�u�W�F�N�g�̌��ݍs�ɂ���w�肳�ꂽ��s�̒l���AJava��
//�@�@�@�@�@�@int�^�Ƃ��Ď擾����B 
//    public String getString(String s) throws SQLException
//�@�@�@�@�\�FResultSet�I�u�W�F�N�g�̌��ݍs�ɂ���w�肳�ꂽ��s�̒l���AJava��
//�@�@�@�@�@�@String�^�Ƃ��Ď擾����B 
//
//�@������
//�@�@���O�ɁA�Ǘ���(root)���A���[�U(guest)�ɑ΂��āA�f�[�^�x�[�X(db1)�Ɋ܂܂��
//�@�@�e�[�u��(tb1)�ւ̂��ׂĂ̌�����^���Ă����B
//�@�@���Ȃ킿�A���̃R�}���h�����s���Ă����K�v������B
//�@�@�@mysql> grant all on db1.tb1 to guest@localhost identified by 'anyone';
//
//�@���N���@
//�@�@MySQL�͂��łɋN�����Ă���Ƃ���B
//    (1) c:\>javac db122.java
//    (2) c:\>java db122 db1 tb1
//
///////////////////////////////////////////////////////////////////////////////

import java.sql.*;

class db122 {
  public static void main(String args[]) {

//  String database = args[0]; // �f�[�^�x�[�X���B
//  String table = args[1];    // �e�[�u�����B
    String database = "test";  // �f�[�^�x�[�X���B
    String table = "tb1";      // �e�[�u�����B

    try{
      // JDBC�h���C�o�̃��[�h�B
      String driver = "org.gjt.mm.mysql.Driver"; // JDBC�h���C�o�B
      Class.forName(driver);

      // ���[�U(guest)�Ƃ��ăf�[�^�x�[�X�ɐڑ��B
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
        // SQL�����f�[�^�x�[�X�ɑ���@�\������Statement�I�u�W�F�N�g�𐶐�����B
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
        String q6 = "SELECT * FROM " + table;
        ResultSet rs = st.executeQuery(q6);

        /////////////////////
        // ���s���ʂ̕\���B//
        /////////////////////
        System.out.println("�f�[�^�x�[�X�F" + database);
        System.out.println("�e�[�u���F" + table);
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
c:\> javac db122.java
c:\> java db122�@db1 tb1
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
