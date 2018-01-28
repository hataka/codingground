// -*- mode: java -*- Time-stamp: <2009-07-03 14:41:22 kahata>
/*====================================================================
 * name: m111.java 
 * created : Time-stamp: <09/07/03(��) 14:40:32 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/MAIL/m111.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << m111.java >>
//
//�@���[���i�P�j�F�v���p�e�B(�V�X�e���v���p�e�B�A�ݒ�Ǝ擾)
//
//�@�@�V�X�e���v���p�e�B�̐ݒ�Ǝ擾�B
//
//�@���v���p�e�B
//�@�@�E�v���p�e�B�́A���ϐ���V�F���ϐ��̂悤�ɃV�X�e����A�v���P�[�V������
//�@�@�@����ۑ�����d�g�݂ł���B
//    �E�v���p�e�B�́A�v���p�e�B���ƃv���p�e�B�l����\�������B
//�@�@�E�V�X�e���v���p�e�B(�V�X�e���Ɋւ�����j�ƃ��[�U�v���p�e�B������B
//
//    �@�V�X�e���v���p�e�B�̗�
//�@�@�@�@�@�v���p�e�B���@�@�@����
//          ----------------------------------------
//�@�@�@�@�@java.version      Java�̃o�[�W����
//          java.home         JRE�̃C���X�g�[����
//          os.version        OS�̃o�[�W����
//          os.name           OS��
//          user.name         ���[�U��
//          ----------------------------------------
//
//�@��java.lang.System�N���X�̃��\�b�h
//    public static String getProperty(String s)
//      �@�\�F�v���p�e�B��s�ɂ���Ď������V�X�e���v���p�e�B�l���擾����B 
//            ������Ȃ��ꍇ�́Anull ���Ԃ����B
//    public static String setProperty(String s1, String s2)
//�@�@�@�@�\�F�V�X�e���v���p�e�B��s1�ƁA���̒ls2��ݒ肷��B
//            �߂�l�́A�V�X�e���v���p�e�B�̈ȑO�̒l�A�Ȃ��ꍇ�́Anull�B
//
////////////////////////////////////////////////////////////////////////////////

import java.util.Properties;

class m111 {
  public static void main(String args[]) {

    // �V�X�e���v���p�e�B(user.name)���擾����B
    String t1 = System.getProperty("user.name");
    System.out.println("�ύX�O�Fuser.name = " + t1);

    // �V�X�e���v���p�e�B(user.name)��ύX����B
    String t2 = System.setProperty("user.name","taro");
    System.out.println("�ύX���Fuser.name = " + t2);

    // �V�X�e���v���p�e�B(user.name)���擾����B
    String t3 = System.getProperty("user.name");
    System.out.println("�ύX��Fuser.name = " + t3);

  }
} 
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
c:\> javac m111.java
c:\> java m111
�ύX�O�Fuser.name = ��Y
�ύX���Fuser.name = ��Y
�ύX��Fuser.name = taro

c:\> java m111
�ύX�O�Fuser.name = ��Y
�ύX���Fuser.name = ��Y
�ύX��Fuser.name = taro

���̌��ʁA�V�X�e���v���p�e�B�̕ύX���L���Ȃ̂̓v���O�������݂̂ŁA
�ċN�����ꂽ�ꍇ�A�����ݒ�ɖ߂邱�Ƃ��킩��B
</pre>

</body>
</html>
*/
