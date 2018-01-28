// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j851a.java 
 * created : Time-stamp: <09/07/02(��) 17:07:54 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j851a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j851a.java >>
//
//  �f�[�^�\���i�T�j�F�}�b�v�iHashMap�N���X�@J2SE1.4�܂ł̋@�\�j
//
//�@��java.util.HashMap�N���X
//  �@�Epublic class HashMap extends AbstractMap
//                           implements Map, Cloneable, Serializable
//�@�@�EHashMap�N���X�́A�n�b�V�����g���ă}�b�v����������B
//�@�@�E�����F�v�f���ɂ�炸�A�ǉ��E�폜�E�����������ɍs����B
//
//�@��HashMap�N���X�̃R���X�g���N�^
//�@�@public HashMap()
//�@�@�@�@�\�F��̃}�b�v���쐬����B
//
//�@��HashMap�N���X�̃��\�b�h
//�@�@public boolean containsKey(Object obj)
//�@�@�@�@�\�F�L�[obj�����݂��邩�ǂ������ׂ�B
//�@�@public boolean containsValue(Object obj)
//�@�@�@�@�\�F�lobj�����݂��邩�ǂ������ׂ�B
//�@�@public Object get(Object obj)
//�@�@�@�@�\�F�L�[obj�ɑ΂���l��Ԃ��B
//�@�@public Object put(Object k, Object v)
//�@�@�@�@�\�F�L�[k�ƒlv�̑g��ǉ�����B
//�@�@public Object remove(Object k)
//�@�@�@�@�\�F�L�[k�Ƃ��̒l���폜����B
//�@�@public int size()
//�@�@�@�@�\�F�L�[�ƒl�̑g����Ԃ��B
//�@�@public Set keySet()
//      �@�\�F�L�[�̃Z�b�g���擾����B
//�@�@public Collection values()
//      �@�\�F�l�̃Z�b�g���擾����B
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

public class j851a {

  public static void main(String args[]) {

    // ��̃}�b�v���쐬�B
    HashMap<String, String> hm = new HashMap<String, String>();

    // �L�[�ƒl�̑g��ǉ��B
    System.out.println("�ǉ��O(HashMap hm)�F" + hm);
    hm.put("A","Airplane");
    hm.put("B","Book"); hm.put("B","Bird");
    hm.put("C","Car");
    hm.put("D","Door");
    hm.put("E","Earth"); 
    System.out.println("�ǉ���(HashMap hm)�F" + hm);
    System.out.println();

    // �}�b�v�̑g���B 
    System.out.println("�g���E�m�F�O(HashMap hm)�F" + hm);
    System.out.println("hm.size()�F" + hm.size()); 
    System.out.println("�g���E�m�F��(HashMap hm)�F" + hm);
    System.out.println();

    // �L�[�ɑΉ�����l�B
    System.out.println("�m�F�O(HashMap hm)�F" + hm);
    String a = (String)hm.get("A"); 
    System.out.println("(String)hm.get(\"A\")�F" + (String)hm.get("A"));
    System.out.println("�m�F��(HashMap hm)�F" + hm);
    System.out.println();

    // �L�[�̍폜�B
    System.out.println("�L�[�̍폜�O(HashMap hm)�F" + hm);
    System.out.print("hm.remove(\"A\")�F" + hm.remove("A")+"�@");
    System.out.println("hm.size()�F" + hm.size()); 
    System.out.println("�L�[�̍폜��(HashMap hm)�F" + hm);
    System.out.println();
 
    // �L�[�̏W���B
    System.out.println("�m�F�O(HashMap hm)�F" + hm);
    System.out.println("hm.keySet()�F" + hm.keySet()); 
    System.out.println("�m�F��(HashMap hm)�F" + hm);
    System.out.println();

    // �l�̏W���B
    System.out.println("�m�F�O(HashMap hm)�F" + hm);
    System.out.println("hm.values()�F" + hm.values()); 
    System.out.println("�m�F��(HashMap hm)�F" + hm);
  }
}
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j851a.java
��:j851a.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��:�ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j851a
�ǉ��O(HashMap hm)�F{}
�ǉ���(HashMap hm)�F{D=Door, A=Airplane, C=Car, B=Bird, E=Earth}

�g���E�m�F�O(HashMap hm)�F{D=Door, A=Airplane, C=Car, B=Bird, E=Earth}
hm.size()�F5
�g���E�m�F��(HashMap hm)�F{D=Door, A=Airplane, C=Car, B=Bird, E=Earth}

�m�F�O(HashMap hm)�F{D=Door, A=Airplane, C=Car, B=Bird, E=Earth}
(String)hm.get("A")�FAirplane
�m�F��(HashMap hm)�F{D=Door, A=Airplane, C=Car, B=Bird, E=Earth}

�L�[�̍폜�O(HashMap hm)�F{D=Door, A=Airplane, C=Car, B=Bird, E=Earth}
hm.remove("A")�FAirplane�@hm.size()�F4
�L�[�̍폜��(HashMap hm)�F{D=Door, C=Car, B=Bird, E=Earth}

�m�F�O(HashMap hm)�F{D=Door, C=Car, B=Bird, E=Earth}
hm.keySet()�F[D, C, B, E]
�m�F��(HashMap hm)�F{D=Door, C=Car, B=Bird, E=Earth}

�m�F�O(HashMap hm)�F{D=Door, C=Car, B=Bird, E=Earth}
hm.values()�F[Door, Car, Bird, Earth]
�m�F��(HashMap hm)�F{D=Door, C=Car, B=Bird, E=Earth}
</pre>

</body>
</html>
*/
