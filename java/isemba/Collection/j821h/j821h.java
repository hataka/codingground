// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j821h.java 
 * created : Time-stamp: <09/07/01(��) 11:10:52 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j821h.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j821h.java >>
//
//  �f�[�^�\���i�P�j�F���X�g�iLinkedList�N���X�A���X�g�Ɣz��̑��ݕϊ��j
//
//�@�@���X�g�Ɣz��̑��ݕϊ����s���B
//
//�@��LinkedList�N���X�̃��\�b�h
//    public Object[] toArray(Object[] s)
//�@�@�@�@�\�F���X�g���ɕۑ�����Ă鏇���Ɠ��������ŗv�f���i�[����Ă���z��s
//�@�@�@�@�@�@��Ԃ��B�Ԃ����z��s�̌^�͎w�肳�ꂽ�z��̌^�ɂȂ�B
//
//�@��java.util.Arrays�N���X
//�@�@�EArrays�N���X���g���āA�z��̃\�[�g�⌟�����s�����Ƃ��ł���B
//�@�@�EArrays�N���X�̃��\�b�h�́A�N���X���\�b�h�Ȃ̂ŁA�I�u�W�F�N�g���쐬������
//�@�@�@�g�����Ƃ��ł���B
//
//�@��Arrays�N���X�̃��\�b�h
//    static List asList(Object[] a)
//�@�@�@�@�\�F�z��a���烊�X�g��Ԃ��B���̃��X�g�̃T�C�Y�̕ύX�͂ł��Ȃ��B
//�@�@�@�@�@�@���������āA�v�f�̒ǉ��E�폜�͂ł��Ȃ����A�ύX�͂ł���B
//�@�@�@�@�@�@�܂��A���X�g�ւ̕ύX�́A���̂܂ܔz��ɏ������܂��B
//
///////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

public class j821h {

  public static void main(String args[]) {

    // ��̃��X�g���쐬�B
    LinkedList<String> a = new LinkedList<String>();

    // �v�f��ǉ��B
    a.add("ddd");
    a.add("aaa");
    a.add("bbb");
    a.add("eee");
    a.add("ccc");

    // ���X�g�̕\���B
    System.out.println("�ϊ��O���X�g�F" + a);
    System.out.println();

    // ���X�g����z��ւ̕ϊ��ƕ\���B
    String s[] = new String[a.size()];
    a.toArray(s);
    System.out.println("���X�g����z��ւ̕ϊ���̔z��");
    for( int i=0; i<s.length; i++ ) { System.out.print(" " + s[i]); }
    System.out.println(); System.out.println();

    // �z�񂩂烊�X�g�֕ϊ��B
    List<String> b = Arrays.asList(s);
    System.out.println("�z�񂩂烊�X�g�ւ̕ϊ���̃��X�g�F" + b);

  }

}
/*
</pre>

<font size=5 color=blue>���s����</font><br>

<pre>
% javac j821h.java
��: j821h.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��: �ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j821h
�ϊ��O���X�g�F[ddd, aaa, bbb, eee, ccc]

���X�g����z��ւ̕ϊ���̔z��
 ddd aaa bbb eee ccc

�z�񂩂烊�X�g�ւ̕ϊ���̃��X�g�F[ddd, aaa, bbb, eee, ccc]
</pre>

</body>
</html>
*/
