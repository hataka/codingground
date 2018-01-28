// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: m112.java 
 * created : Time-stamp: <09/07/02(��) 21:40:16 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/m112.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << m112.java >>
//
//�@���[���i�P�j�F�v���p�e�B(�V�X�e���v���p�e�B�A�ꗗ)
//
//�@�@�V�X�e���v���p�e�B�̈ꗗ�B
//
//�@��java.lang.System�N���X�̃��\�b�h
//�@�@public static Properties getProperties()
//    �@�@�\:�V�X�e���v���p�e�B�����肵�A�V�X�e���v���p�e�B�̃Z�b�g��Ԃ��B
//           �V�X�e���v���p�e�B�̃Z�b�g�ɂ́A�v���p�e�B���Ƃ��̒l���܂܂��B
//
//�@��java.util.Properties�N���X
//  �@Properties�N���X�́A�v���p�e�B�̃Z�b�g��\���B
//�@�@�v���p�e�B�̃Z�b�g���̃v���p�e�B���Ƃ��̒l�́A������ł���B 
//
//�@��java.util.Properties�N���X�̃��\�b�h
//�@�@public void list(PrintStream out)
//    �@�@�\:�o�̓X�g���[��out�Ƀv���p�e�B���X�g���o�͂���B
//
////////////////////////////////////////////////////////////////////////////////

import java.util.Properties;

class m112 {
  public static void main(String args[]) {

    // �V�X�e���v���p�e�B�̃Z�b�g���擾����B
    Properties prop = System.getProperties();

    // �V�X�e���v���p�e�B�̈ꗗ��W���o�͂ɏo�͂���B
    prop.list(System.out);
  }
} 
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
c:\> javac m112.java
c:\> java m112
-- listing properties --
java.runtime.name=Java(TM) 2 Runtime Environment, Stand...
sun.boot.library.path=C:\Program Files\Java\jre1.5.0_04\bin
user.country=JP
java.runtime.version=1.5.0_04-b05
os.arch=x86
os.name=Windows XP
os.version=5.1
user.name=��Y
java.class.path=c:\jakarta-tomcat-4.1.31\common\lib\s...
java.home=C:\Program Files\Java\jre1.5.0_04
user.language=ja
java.version=1.5.0_04
�����r���������ȗ�����
</pre>

</body>
</html>
*/
