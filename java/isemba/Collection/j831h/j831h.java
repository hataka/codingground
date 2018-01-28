// -*- mode: java -*- Time-stamp: <2009-07-02 08:46:40 kahata>
/*====================================================================
 * name: j831h.java 
 * created : Time-stamp: <09/07/02(��) 08:43:33 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j831h.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j831h.java >>
//
//  �f�[�^�\���i�R�j�F���X�g�iHashSet�N���X�A�W���Ɣz��̑��ݕϊ��j
//
//�@�@�W���Ɣz��̑��ݕϊ����s���B
//�@�@�z�񂩂�W���ւ̕ϊ��̓��X�g����čs���B
//
//�@��HashSet�N���X�̃R���X�g���N�^
//    public HashSet(Collection c)
//�@�@�@�@�\�F�R���N�V����c�̗v�f���i�[����W�����쐬����B
//
//�@��HashSet�N���X�̃��\�b�h
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

public class j831h {
  public static void main(String args[]) {

    // ��̏W�����쐬�B
    HashSet<String> hs = new HashSet<String>();

    // �v�f��ǉ��B
    hs.add("ddd");
    hs.add("aaa");
    hs.add("eee");
    hs.add("ccc");
    hs.add("bbb");

    // �W���̕\���B
    System.out.println("�W���F" + hs);
    System.out.println();

    // �W������z��ւ̕ϊ��ƕ\���B
    String s[] = new String[hs.size()];
    hs.toArray(s);
    System.out.println("�W������z��ւ̕ϊ���̔z��");
    for( int i=0; i<s.length; i++ ) { System.out.print(" " + s[i]); }
    System.out.println(); System.out.println();

    // �z�񂩂烊�X�g�֕ϊ��B
    List<String> a = (List<String>)Arrays.asList(s);
    System.out.println("�z�񂩂烊�X�g�ւ̕ϊ���̃��X�g");
    for( int i=0; i<a.size(); i++ ) { System.out.print(" " + a.get(i)); }
    System.out.println(); System.out.println();

    // ���X�g����W���֕ϊ��B
    HashSet<String> g = new HashSet<String>(a);
    System.out.println("���X�g����W���ւ̕ϊ���̏W���F" + g);

  }

}
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j831h.java
��: j831h.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��: �ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j831h
�W���F[ccc, aaa, eee, ddd, bbb]

�W������z��ւ̕ϊ���̔z��
 ccc aaa eee ddd bbb

�z�񂩂烊�X�g�ւ̕ϊ���̃��X�g
 ccc aaa eee ddd bbb

���X�g����W���ւ̕ϊ���̏W���F[ccc, aaa, eee, ddd, bbb]
</pre>

</body>
</html>
*/
