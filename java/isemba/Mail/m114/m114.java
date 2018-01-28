// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: m114.java 
 * created : Time-stamp: <09/07/03(��) 14:44:03 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/m114.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << m114.java >>
//
//�@���[���i�P�j�F�v���p�e�B(���[�U�v���p�e�B�A�ݒ�Ǝ擾)
//
//�@�@���[�U�v���p�e�B�̐ݒ�Ǝ擾�B
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

class m114 {
  public static void main(String args[]) {

    // �v���p�e�B�̃Z�b�g���擾����B
    Properties prop = new Properties();

    // �v���p�e�B(p1)��ݒ肷��B
    String t1 = (String)prop.put("p1","taro");
    System.out.println("�ݒ莞�Fp1 = " + t1);

    // �v���p�e�B(p1)���擾����B
    String t2 = (String)prop.get("p1");
    System.out.println("�擾���Fp1 = " + t2);

    // �v���p�e�B(p2)��ݒ肷��B
    String t3 = (String)prop.put("p2","��Y");
    System.out.println("�ݒ莞�Fp2 = " + t3);

    // �v���p�e�B(p2)���擾����B
    String t4 = (String)prop.get("p2");
    System.out.println("�擾���Fp2 = " + t4);

    // �v���p�e�B�̈ꗗ��W���o�͂ɏo�͂���B
    prop.list(System.out);
  }
} 
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
c:\> javac m114.java
c:\> java m114    
�ݒ莞�Fp1 = null
�擾���Fp1 = taro
�ݒ莞�Fp2 = null
�擾���Fp2 = ��Y
-- listing properties --
p2=��Y
p1=taro
</pre>

</body>
</html>
*/
