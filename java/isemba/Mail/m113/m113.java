// -*- mode: java -*- Time-stamp: <2009-07-03 14:43:35 kahata>
/*====================================================================
 * name: m113.java 
 * created : Time-stamp: <09/07/03(��) 14:43:03 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/MAIL/m113.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << m113.java >>
//
//�@���[���i�P�j�F�v���p�e�B(�V�X�e���v���p�e�B�A�ݒ�Ǝ擾)
//
//�@�@�V�X�e���v���p�e�B�̐ݒ�Ǝ擾�B
//
//�@��java.util.Properties�N���X
//  �@Properties�N���X�́A�v���p�e�B�̃Z�b�g��\���B
//�@�@�v���p�e�B�̃Z�b�g���̃v���p�e�B���Ƃ��̒l�́A������ł���B 
//    public class Properties extends Hashtable<Object,Object>
//
//�@��java.util.Hashtable<K,V>�N���X
//�@�@���̃N���X�́A�n�b�V���e�[�u������������B�L�[�ƒl�̑g�����B
//
//�@��java.util.Hashtable<K,V>�N���X�̃��\�b�h
//    public V get(Object key)
//�@�@�@�@�\�F�L�[key�ɑΉ��Â����Ă���l���擾����B 
//    public V put(K key,V value)
//      �@�\�F�n�b�V���e�[�u���ɂ����āA�L�[key���A�lvalue�ɑΉ��Â���B
//            �߂�l�́A�n�b�V���e�[�u���̎w�肳�ꂽ�L�[�̑O�̒l�B
//�@�@�@�@�@  ���ꂪ�Ȃ��ꍇ�� null�B 
//
////////////////////////////////////////////////////////////////////////////////

import java.util.Properties;

class m113 {
  public static void main(String args[]) {

    // �V�X�e���v���p�e�B�̃Z�b�g���擾����B
    Properties prop = System.getProperties();

    // �V�X�e���v���p�e�B(user.name)���擾����B
    String t1 = (String)prop.get("user.name");
    System.out.println("�ύX�O�Fuser.name = " + t1);

    // �V�X�e���v���p�e�B(user.name)��ύX����B
    String t2 = (String)prop.put("user.name","taro");
    System.out.println("�ύX���Fuser.name = " + t2);

    // �V�X�e���v���p�e�B(user.name)���擾����B
    String t3 = (String)prop.get("user.name");
    System.out.println("�ύX��Fuser.name = " + t3);

  }
} 
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
c:\> javac m113.java
c:\> java m113
�ύX�O�Fuser.name = ��Y
�ύX���Fuser.name = ��Y
�ύX��Fuser.name = taro

c:\> java m113
�ύX�O�Fuser.name = ��Y
�ύX���Fuser.name = ��Y
�ύX��Fuser.name = taro

���̌��ʁA�V�X�e���v���p�e�B�̕ύX���L���Ȃ̂̓v���O�������݂̂ŁA
�ċN�����ꂽ�ꍇ�A�����ݒ�ɖ߂邱�Ƃ��킩��B
</pre>

</body>
</html>
*/
