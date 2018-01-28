// -*- mode: java -*- Time-stamp: <2009-07-02 19:40:13 kahata>
/*====================================================================
 * name: db112.java 
 * created : Time-stamp: <09/06/30(��) 10:22:03 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/db112.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << db112.java >>
//
//�@�f�[�^�x�[�X�i�P�j�F�f�[�^�x�[�X�̈ꗗ
//
//�@�@���[�U(guest)��MySQL�ɃA�N�Z�X���A���p�ł���f�[�^�x�[�X�̈ꗗ��
//�@�@�\������B
//
//�@���֘A����SQL�̍\��
//
//�@�@SHOW DATABASES
//�@�@�@�Ӗ��F�����̃f�[�^�x�[�X���ꗗ�\������B
//
//�@��java.sql.Statement�C���^�[�t�F�[�X
//�@�@SQL�������s���A�쐬���ꂽ���ʂ�Ԃ����߂Ɏg�p�����B 
//
//�@��Statement�C���^�[�t�F�[�X�̃��\�b�h
//�@�@public ResultSet executeQuery(String sql) throws SQLException
//�@�@�@�@�\�FResultSet�I�u�W�F�N�g��Ԃ�SQL��sql�����s����B
//
//�@��java.sql.ResultSet�C���^�[�t�F�[�X
//�@�@ResultSet�I�u�W�F�N�g�ɂ́A�f�[�^�x�[�X�ɑ���ꂽSQL���̎��s���ʂ�
//�@�@�ۑ������B 
//�@�@ResultSet�I�u�W�F�N�g�ɂ̓|�C���^������ASQL�������s���ꂽ����A
//�@�@�|�C���^�́A�擪�s�̑O���w���Ă���Bnext���\�b�h�̍ŏ��̌Ăяo���ɂ���āA
//�@�@�擪�s���w���悤�ɂȂ�B
//
//�@��ResultSet�C���^�[�t�F�[�X�̃��\�b�h
//    public String getString(int n) throws SQLException
//�@�@�@�@�\�FResultSet�I�u�W�F�N�g�̌��ݍs�ɂ���w�肳�ꂽ��(n�Ԗ�)�̒l���A
//�@�@�@�@�@�@String�Ƃ��Ď擾����B
//    public boolean next() throws SQLException
//�@�@�@�@�\�F�|�C���^�����݂̈ʒu����ЂƂi�߂�B
//�@        �@�f�[�^���Ȃ��ꍇ�� false��Ԃ��B
//
//�@���N���@
//�@�@MySQL�͂��łɋN�����Ă���Ƃ���B
//    (1) c:\>javac db112.java
//    (2) c:\>java db112 show
//
////////////////////////////////////////////////////////////////////////////////

import java.sql.*;

class db112 {
  public static void main(String args[]) {

//    String cmd = args[0]; // �T�u�R�}���h�B
    String cmd = "show"; // �T�u�R�}���h�B

    try{
      // (�菇�P)JDBC�h���C�o�̃��[�h�B
      String driver = "org.gjt.mm.mysql.Driver"; 
      Class.forName(driver);

      // (�菇�Q)�f�[�^�x�[�X�ɐڑ�(���[�U(guest))�B
      String url = "jdbc:mysql://localhost/";  
//    String user = "guest";
//    String passwd = "anyone";
      String user = "root";
      String passwd = "kahata1015";
      Connection cn = DriverManager.getConnection(url,user,passwd);

      // (�菇�R)SQL�����f�[�^�x�[�X�ɑ���@�\������Statement�I�u�W�F�N�g���쐬�B
      Statement st = cn.createStatement();

      // (�菇�S)�T�u�R�}���h(show)�̏����B
      // SQL�����쐬�E���s���A���s���ʂ�ResultSet�I�u�W�F�N�g�Ɋi�[����B
      if( cmd.equals("show") ) {
        String q = "SHOW DATABASES";
        ResultSet rs = st.executeQuery(q);
 
        // (�菇�T)���s���ʂ̕\���B
        System.out.println("�f�[�^�x�[�X�ꗗ");
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
c:\> javac db112.java
c:\> java db112 show
�f�[�^�x�[�X�ꗗ
db1
</pre>

</body>
</html>
*/
