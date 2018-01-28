// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: db111.java 
 * created : Time-stamp: <09/06/30(��) 10:20:51 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/db111.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << db111.java >>
//
//�@�f�[�^�x�[�X�i�P�j�F�f�[�^�x�[�X���p�̏���
//
//�@���f�[�^�x�[�X���p�̎菇
//
//�@�@(�菇�P)JDBC�h���C�o�̃��[�h�B
//            ���p����f�[�^�x�[�X(MySQL)��JDBC�h���C�o��JDBC�h���C�o�}�l�[�W��
//�@�@�@�@�@�@�ɓo�^����B
//�@�@(�菇�Q)�f�[�^�x�[�X�ɐڑ��B
//�@�@(�菇�R)SQL�����f�[�^�x�[�X�ɑ���@�\������Statement�I�u�W�F�N�g���쐬�B
//�@�@(�菇�S)SQL�����쐬�E���s���A���s���ʂ�ResultSet�I�u�W�F�N�g�Ɋi�[����B
//�@�@(�菇�T)���s���ʂ̕\���B
//�@�@(�菇�U)�f�[�^�x�[�X�Ƃ̐ڑ������B
//
//�@��java.lang.Class�N���X�̃��\�b�h
//    public static Class forName(String s) throws ClassNotFoundException
//      �@�\�F�w�肳�ꂽ������s�����N���X�܂��̓C���^�t�F�[�X�̃I�u�W�F�N�g��
//�@�@�@�@�@�@�Ԃ��B
//�@�@�@�@�@  forName("X") �̌Ăяo���ɂ���āAX �Ƃ����N���X�������������B 
//
//�@��java.sql.DriverManager�N���X
//�@�@JDBC�h���C�o���Ǘ����邽�߂̃N���X�B
//
//�@��DriverManager�N���X�̃��\�b�h
//    public static Connection getConnection(String url,
//                                           String user,
//                                           String password)
//                                           throws SQLException
//�@�@�@�@�\�F�w�肳�ꂽ�f�[�^�x�[�X���w��URL�ւ̐ڑ������݂�B
//            url - jdbc:subprotocol://subname�`���Ńf�[�^�x�[�X���w��B
//                  MySQL��subname�`���́A�z�X�g��/�f�[�^�x�[�X��?���� �ƂȂ�B
//�@�@�@�@�@�@�@�@�@[��] jdbc:mysql://localhost/mydbase
//            user - MySQL�ɓo�^���ꂽ���[�U��
//            password - MySQL�ɓo�^���ꂽ���[�U�̃p�X���[�h 
//
//�@��java.sql.Connection�C���^�[�t�F�[�X
//�@�@����̃f�[�^�x�[�X�Ƃ̐ڑ�(�Z�b�V����)��\������B�ڑ��̃R���e�L�X�g����
//�@�@SQL�������s���ꌋ�ʂ��Ԃ����B
//
//�@��Connection�C���^�[�t�F�[�X�̃��\�b�h
//�@�@public Statement createStatement() throws SQLException
//�@�@�@�@�\�FSQL�����f�[�^�x�[�X�ɑ��邽�߂�Statement�I�u�W�F�N�g���쐬����B
//
//�@���N���@
//�@�@MySQL��Windows�N�����ɋN������Ă���Ƃ���B
//    (1) c:\>javac db111.java
//    (2) c:\>java db111
//
////////////////////////////////////////////////////////////////////////////////

import java.sql.*;

class db111 {
  public static void main(String args[]) {

    try{
      // (�菇�P)JDBC�h���C�o�̃��[�h�B
      // MySQL��JDBC�h���C�o�́A�N���X��(org.git.mm.mysql.Driver)�����B
      // ���̃h���C�o�́AJAR�t�@�C��(mysql-connector-java-3.1.10-bin.jar)��
      // �i�[����Ă���B
      String driver = "org.gjt.mm.mysql.Driver"; 
      // JDBC�h���C�o�[�͎������g��JDBC�h���C�o�}�l�[�W���ɓo�^����B
      Class.forName(driver);

      // (�菇�Q)���[�U(guest)�A�p�X���[�h(anyone)�Ƃ��ăf�[�^�x�[�X(db1)�ɐڑ��B
      String url = "jdbc:mysql://localhost/test";  
      String user = "root";
      String passwd = "kahata1015";
      Connection cn = DriverManager.getConnection(url,user,passwd);

      System.out.println("�f�[�^�x�[�X�ւ̐ڑ�����");

      // (�菇�R)SQL�����f�[�^�x�[�X�ɑ���@�\������Statement�I�u�W�F�N�g���쐬�B

      // (�菇�S)SQL�����쐬�E���s���A���s���ʂ�ResultSet�I�u�W�F�N�g�Ɋi�[����B

      // (�菇�T)���s���ʂ̕\���B

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
c:\> javac db111.java
c:\> java db111 

�f�[�^�x�[�X�ւ̐ڑ�����
</pre>

</body>
</html>
*/
