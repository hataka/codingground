// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: db105.java 
 * created : Time-stamp: <09/06/30(��) 10:19:36 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/db105.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
///////////////////////////////////////////////////////////////////////////////
//  << db105.java >>
//
//�@�f�[�^�x�[�X�i�O�j�FJDBC�h���C�o
//
//�@�@Java�̃v���O��������MySQL�̃f�[�^�x�[�X�֐ڑ�����ɂ�JDBC�h���C�o��
//�@�@�K�v�ł���B
//
//  ��JDBC�h���C�o�̃_�E�����[�h
//  �i�P�jWeb�u���E�U�ŁAhttp://www.mysql.com/�ɐڑ�����B
//        Downloads ���ڂ�MySQL Connectors���N���b�N����B
//�@�i�Q�jhttp://dev.mysql.com/downloads/connector/�ɐ؂�ւ��B
//  �@    Connector/J���ڂ���
//          �t�@�C��(mysql-connector-java-3.1.10.zip)
//        ���_�E�����[�h����B
//�@�i�R�j�_�E�����[�h���n�܂�̂ŁA�ۑ�����f�X�N�g�b�v�ɂ���B�@�@
//  �@    �t�@�C��(mysql-connector-java-3.1.10.zip)���f�X�N�g�b�v�ɕۑ������B
//
//  ���t�@�C��(mysql-connector-java-3.1.10.zip)�������񂳂�Ă��Ȃ����Ƃ̊m�F�B
//    �_�E�����[�h�y�[�W�ɋL�ڂ���Ă���
//�@�@�@MD5�`�F�b�N�T��(0358f500fde7a5969f491472d13c4f84) 
//    ��md5�R�}���h�̎��s���ʂ��r����v���Ă��邩�ǂ������m�F����B
//    ��v���Ă����OK�B
//    Windows��md5�R�}���h�́Ahttp://www.fourmilab.ch/md5/ ������肷��B 
//�@�@�E���s��
//      md5�R�}���h(md5.exe)�ƃt�@�C��(mysql-connector-java-3.1.10.zip)��
//      �f�B���N�g��(c:\temp)�ɃR�s�[���m�F����B
//
//      C:\temp>md5 mysql-connector-java-3.1.10.zip
//      0358F500FDE7A5969F491472D13C4F84  mysql-connector-java-3.1.10.zip
//
//  ��MySQL�̃C���X�g�[��
//�@�i�P�jZIP�`���̃t�@�C��(mysql-connector-java-3.1.10.zip)���𓀂���B
//        �𓀐�f�B���N�g�����f�X�N�g�b�v�Ƃ���B
//�@�i�Q�j�f�X�N�g�b�v�Ƀf�B���N�g��(mysql-connector-java-3.1.10)���쐬�����B
//        �f�X�N�g�b�v��̃f�B���N�g��(mysql-connector-java-3.1.10
//        \mysql-connector-java-3.1.10)���̃t�@�C��
//�@�@�@�@(mysql-connector-java-3.1.10-bin.jar)��JDBC�h���C�o�����݂���B
//�@�i�R�jJDBC�h���C�o�����ϐ�CLASSPATH�ɒǉ�����B
//        �������AJDBC�h���C�o�́A
//�@�@�@�@�@�@c:\mysql-connector-java-3.1.10
//              \mysql-connector-java-3.1.10-bin.jar
//�@�@�@�@�ɑ��݂���B
//
//�@��Tomcat�ɑg�ݍ��ށB
//�@�@�t�@�C��(mysql-connector-java-3.1.10-bin.jar)��
//    %CATALINA_HOME%\shared\lib�̉��ɃR�s�[����B���̌�A�ċN������B
//�@�@
///////////////////////////////////////////////////////////////////////////////
/*
</pre>

</body>
</html>
*/
