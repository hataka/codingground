// -*- mode: java -*- Time-stamp: <2009-07-02 16:53:46 kahata>
/*====================================================================
 * name: j841h.java 
 * created : Time-stamp: <09/07/02(��) 16:52:14 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j841h.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j841h.java >>
//
//  �f�[�^�\���i�S�j�F�W���iTreeSet�N���X�A�W���Ɣz��̑��ݕϊ��j
//
//�@�@�W���Ɣz��̑��ݕϊ����s���B
//�@�@�z�񂩂�W���ւ̕ϊ��̓��X�g����čs���B
//
//�@��TreeSet�N���X�̃R���X�g���N�^
//    public TreeSet(Collection c)
//�@�@�@�@�\�F�R���N�V����c�̗v�f�̎��R�ȏ����Â��ɂ��������W�����쐬����B
//
//�@��TreeSet�N���X�̃��\�b�h
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

public class j841h {

  public static void main(String args[]) {

    // ��̏W�����쐬�B
    TreeSet<String> ts = new TreeSet<String>();

    // �v�f��ǉ��B
    ts.add("ddd");
    ts.add("aaa");
    ts.add("eee");
    ts.add("ccc");
    ts.add("bbb");

    // �W���̕\���B
    System.out.println("�W���F" + ts);
    System.out.println();

    // �W������z��ւ̕ϊ��ƕ\���B
    String s[] = new String[ts.size()];
    ts.toArray(s);
    System.out.println("�W������z��ւ̕ϊ���̔z��");
    for( int i=0; i<s.length; i++ ) { System.out.print(" " + s[i]); }
    System.out.println(); System.out.println();

    // �z�񂩂烊�X�g�֕ϊ��B
    List<String> a = (List<String>)Arrays.asList(s);
    System.out.println("�z�񂩂烊�X�g�ւ̕ϊ���̃��X�g");
    for( int i=0; i<a.size(); i++ ) { System.out.print(" " + a.get(i)); }
    System.out.println(); System.out.println();

    // ���X�g����W���֕ϊ��B
    TreeSet<String> g = new TreeSet<String>(a);
    System.out.println("���X�g����W���ւ̕ϊ���̏W���F" + g);
  }
}
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j841h.java
��:j841h.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��:�ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j841h
�W���F[aaa, bbb, ccc, ddd, eee]

�W������z��ւ̕ϊ���̔z��
 aaa bbb ccc ddd eee

�z�񂩂烊�X�g�ւ̕ϊ���̃��X�g
 aaa bbb ccc ddd eee

���X�g����W���ւ̕ϊ���̏W���F[aaa, bbb, ccc, ddd, eee]
</pre>

</body>
</html>
*/
