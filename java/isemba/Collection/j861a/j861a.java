// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j861a.java 
 * created : Time-stamp: <09/07/02(��) 17:38:32 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j861a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j861a.java >>
//
//  �f�[�^�\���i�U�j�F�}�b�v�iTreeMap�N���X�@J2SE1.4�܂ł̋@�\�j
//
//�@��java.util.TreeMap�N���X
//    �Epublic class TreeMap extends AbstractMap
//                           implements SortedMap, Cloneable, Serializable
//�@�@�E�L�[�ƒl�̑g�̏W�܂���}�b�v�Ƃ����B
//�@�@�@�L�[���g���āA�l���擾���邱�Ƃ��ł���B
//�@�@�ETreeMap�N���X�́A�؂��g���ă}�b�v����������B
//�@�@�E�L�[���l���I�u�W�F�N�g�ł���B
//    �E�����F�ǉ��A�擾�A�폜�̑��삪�A�v�f��n�̉���log(n)�̃I�[�_�[�ōs����B
//�@�@�@�@�@�@�v�f�͌��߂�ꂽ�����ɕ���ł���B
//
//�@��TreeMap�N���X�̃R���X�g���N�^
//�@�@public TreeMap()
//�@�@�@�@�\�F��̃}�b�v�𐶐�����B
//
//�@��TreeMap�N���X�̃��\�b�h
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
//�@�@public SortedMap headMap(Object k)
//      �@�\�F�L�[k�����������}�b�v��Ԃ��B
//�@�@public SortedMap tailMap(Object k)
//      �@�\�F�L�[k�ȏ�̃}�b�v��Ԃ��B
//�@�@public SortedMap subMap(Object k1, Object k2)
//      �@�\�F�L�[k1�ȏ�A�L�[k2�ȉ��̃}�b�v��Ԃ��B
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

public class j861a {

  public static void main(String args[]) {

    // ��̃}�b�v�𐶐��B
    TreeMap<String,String> tm = new TreeMap<String,String>();

    // �L�[�ƒl�̑g��ǉ��B
    System.out.println("�ǉ��O(TreeMap tm)�F" + tm);
    tm.put("A","Airplane");
    tm.put("B","Book"); tm.put("B","Bird"); // �ŏ���Book�͏㏑�������B
    tm.put("C","Car"); 
    tm.put("D","Door");
    tm.put("E","Door");
    System.out.println("�ǉ���(TreeMap tm)�F" + tm);
    System.out.println();

    // �}�b�v�̑g���B 
    System.out.println("�g���E�m�F�O(TreeMap tm)�F" + tm);
    System.out.println("tm.size()�F" + tm.size()); 
    System.out.println("�g���E�m�F��(TreeMap tm)�F" + tm);
    System.out.println();

    // �L�[�ɑΉ�����l�B
    System.out.println("�m�F�O(TreeMap tm)�F" + tm);
    String a = (String)tm.get("A"); 
    System.out.println("(String)tm.get(\"A\")�F" + a);
    System.out.println("�m�F��(TreeMap tm)�F" + tm);
    System.out.println();

    // �L�[�̍폜�B
    System.out.println("�L�[�̍폜�O(TreeMap tm)�F" + tm);
    System.out.println("tm.remove(\"A\")�F" + tm.remove("A"));
    System.out.println("�L�[�̍폜��(TreeMap tm)�F" + tm);
    System.out.println();
 
    // �L�[�̏W���B
    System.out.println("�L�[�̏W���E�m�F�O(TreeMap tm)�F" + tm);
    System.out.println("tm.keySet()�F" + tm.keySet()); 
    System.out.println("�L�[�̏W���E�m�F��(TreeMap tm)�F" + tm);
    System.out.println();

    // �l�̏W���B
    System.out.println("�l�̏W���E�m�F�O(TreeMap tm)�F" + tm);
    System.out.println("tm.values()�F" + tm.values()); 
    System.out.println("�l�̏W���E�m�F��(TreeMap tm)�F" + tm);
    System.out.println();

    // �L�[D�����������}�b�v��Ԃ��B
    System.out.println("�L�[D�����������}�b�v��Ԃ�");
    System.out.println("�m�F�O(TreeMap tm)�F" + tm);
    System.out.println("tm.headMap(\"D\")�F" + tm.headMap("D")); 
    System.out.println("�m�F��(TreeMap tm)�F" + tm);
    System.out.println();

    // �L�[D�ȏ�̃}�b�v��Ԃ��B
    System.out.println("�L�[D�ȏ�̃}�b�v��Ԃ�");
    System.out.println("�m�F�O(TreeMap tm)�F" + tm);
    System.out.println("tm.tailMap(\"D\")�F" + tm.tailMap("D")); 
    System.out.println("�m�F��(TreeMap tm)�F" + tm);
    System.out.println();

    // �L�[B�ȏ�A�L�[D�����̃}�b�v��Ԃ��B
    System.out.println("�L�[B�ȏ�A�L�[D�����̃}�b�v��Ԃ�");
    System.out.println("�m�F�O(TreeMap tm)�F" + tm);
    System.out.println("tm.subMap(\"B\",\"D\")�F" + tm.subMap("B","D")); 
    System.out.println("�m�F��(TreeMap tm)�F" + tm);
  }
}
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j861a.java
��:j861a.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��:�ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j861a
�ǉ��O(TreeMap tm)�F{}
�ǉ���(TreeMap tm)�F{A=Airplane, B=Bird, C=Car, D=Door, E=Door}

�g���E�m�F�O(TreeMap tm)�F{A=Airplane, B=Bird, C=Car, D=Door, E=Door}
tm.size()�F5
�g���E�m�F��(TreeMap tm)�F{A=Airplane, B=Bird, C=Car, D=Door, E=Door}

�m�F�O(TreeMap tm)�F{A=Airplane, B=Bird, C=Car, D=Door, E=Door}
(String)tm.get("A")�FAirplane
�m�F��(TreeMap tm)�F{A=Airplane, B=Bird, C=Car, D=Door, E=Door}

�L�[�̍폜�O(TreeMap tm)�F{A=Airplane, B=Bird, C=Car, D=Door, E=Door}
tm.remove("A")�FAirplane
�L�[�̍폜��(TreeMap tm)�F{B=Bird, C=Car, D=Door, E=Door}

�L�[�̏W���E�m�F�O(TreeMap tm)�F{B=Bird, C=Car, D=Door, E=Door}
tm.keySet()�F[B, C, D, E]
�L�[�̏W���E�m�F��(TreeMap tm)�F{B=Bird, C=Car, D=Door, E=Door}

�l�̏W���E�m�F�O(TreeMap tm)�F{B=Bird, C=Car, D=Door, E=Door}
tm.values()�F[Bird, Car, Door, Door]
�l�̏W���E�m�F��(TreeMap tm)�F{B=Bird, C=Car, D=Door, E=Door}

�L�[D�����������}�b�v��Ԃ�
�m�F�O(TreeMap tm)�F{B=Bird, C=Car, D=Door, E=Door}
tm.headMap("D")�F{B=Bird, C=Car}
�m�F��(TreeMap tm)�F{B=Bird, C=Car, D=Door, E=Door}

�L�[D�ȏ�̃}�b�v��Ԃ�
�m�F�O(TreeMap tm)�F{B=Bird, C=Car, D=Door, E=Door}
tm.tailMap("D")�F{D=Door, E=Door}
�m�F��(TreeMap tm)�F{B=Bird, C=Car, D=Door, E=Door}

�L�[B�ȏ�A�L�[D�����̃}�b�v��Ԃ�
�m�F�O(TreeMap tm)�F{B=Bird, C=Car, D=Door, E=Door}
tm.subMap("B","D")�F{B=Bird, C=Car}
�m�F��(TreeMap tm)�F{B=Bird, C=Car, D=Door, E=Door}
</pre>

</body>
</html>
*/
