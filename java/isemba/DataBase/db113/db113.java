// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: db113.java 
 * created : Time-stamp: <09/07/02(��) 19:45:29 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/db113.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << db113.java >>
//
//�@�f�[�^�x�[�X�i�P�j�F�e�[�u���̍쐬�E�폜�E�ꗗ
//
//�@���֘A����SQL�̍\��
//
//�@�@USE �f�[�^�x�[�X��
//�@�@�@�Ӗ��F���p����f�[�^�x�[�X��I������B
//�@�@SHOW TABLES
//�@�@�@�Ӗ��F�e�[�u���̈ꗗ��\������B
//    CREATE TABLE �e�[�u���� (�� �f�[�^�^ �I�v�V����,�c)
//�@�@�@�Ӗ��F�e�[�u�����쐬����B
//    DROP TABLE �e�[�u����
//�@�@�@�Ӗ��F�e�[�u�����폜����B
//
//�@��Statement�C���^�[�t�F�[�X�̃��\�b�h
//    public boolean execute(String sql) throws SQLException
//      �@�\�F�C�ӂ�SQL��sql���w��ł���B
//            ���ʂ�ResultSet�I�u�W�F�N�g�̏ꍇ��true�A���ʂ��Ȃ��ꍇ��false�B
//
//�@���N���@
//�@�@MySQL�͋N�����Ă�����̂Ƃ���B
//    (1) c:\>javac db113.java
//    (2) �V�K�e�[�u���쐬
//        c:\>java db113 �f�[�^�x�[�X�� create �V�K�e�[�u����
//    (3) �e�[�u���ꗗ
//        c:\>java db113 �f�[�^�x�[�X�� show
//    (4) �e�[�u���폜
//        c:\>java db113 �f�[�^�x�[�X�� drop �e�[�u����
//    (5) �e�[�u���ꗗ
//        c:\>java db113 �f�[�^�x�[�X�� show
//
////////////////////////////////////////////////////////////////////////////////

import java.sql.*;

class db113 {
  public static void main(String args[]) {

    String database = args[0]; // �f�[�^�x�[�X���B
    String cmd = args[1];      // �T�u�R�}���h�B
    String table = "";         // �e�[�u�����B
    if( args.length == 3 ) { table = args[2]; }  

    try{
      // (�菇�P)JDBC�h���C�o�̃��[�h�B
      String driver = "org.gjt.mm.mysql.Driver";
      Class.forName(driver);

      // (�菇�Q)���[�U(guest)�Ƃ��ăf�[�^�x�[�X(db1)�ɐڑ��B
      String url = "jdbc:mysql://localhost/" + database; 
//      String user = "guest";
//      String passwd = "anyone";
      String user = "root";
      String passwd = "kahata1015";
      Connection cn = DriverManager.getConnection(url,user,passwd);

      // (�菇�R)SQL�����f�[�^�x�[�X�ɑ���@�\������Statement�I�u�W�F�N�g���쐬�B
      Statement st = cn.createStatement();

      // (�菇�S)SQL�����쐬�E���s����B
      String q1 = "USE " + database;
      st.execute(q1);

      // (�菇�S)�T�u�R�}���h(create)�̏����BSQL�����쐬�E���s����B
      if( cmd.equals("create") ) {
        String q2 = "CREATE TABLE " + table
                  + "(�ԍ� INTEGER PRIMARY KEY, ���O varchar(20)," 
                  + " �Z�� varchar(80) )";
        st.execute(q2);
        System.out.print("�f�[�^�x�[�X(" + database + ") ");
        System.out.println("�e�[�u��(" + table + ")���쐬���܂���");
      }

      // (�菇�S)�T�u�R�}���h(drop)�̏����BSQL�����쐬�E���s����B
      if( cmd.equals("drop") ) {
        String q3 = "DROP TABLE " + table;
        st.execute(q3);
        System.out.print("�f�[�^�x�[�X(" + database + ") ");
        System.out.println("�e�[�u��(" + table + ")���폜���܂���");
      }

      // (�菇�S)�T�u�R�}���h(show)�̏����B
      // SQL�����쐬�E���s���A���s���ʂ�ResultSet�I�u�W�F�N�g�Ɋi�[����B
      if( cmd.equals("show") ) {
        String q4 = "SHOW TABLES";
        ResultSet rs = st.executeQuery(q4);
        // (�菇�T)���s���ʂ̕\���B
        System.out.println("�f�[�^�x�[�X�F" + database);
        System.out.println("�e�[�u���ꗗ");
        while( rs.next() ) {
          System.out.println(rs.getString(1));
        }
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
c:\> javac db113.java

c:\> java db113 db1 create tb1
�f�[�^�x�[�X(db1) �e�[�u��(tb1)���쐬���܂���

c:\> java db113 db1 show
�f�[�^�x�[�X�Fdb1
�e�[�u���ꗗ
tb1

c:\> java db113 db1 drop tb1
�f�[�^�x�[�X(db1) �e�[�u��(tb1)���폜���܂���

c:\> java db113 db1 show
�f�[�^�x�[�X�Fdb1
�e�[�u���ꗗ
</pre>

</body>
</html>
*/
