// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j841i.java 
 * created : Time-stamp: <09/07/02(��) 16:57:45 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j841i.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j841i.java >>
//
//  �f�[�^�\���i�S�j�F�W���iTreeSet�N���X�AArrays�N���X�j
//
//�@�@Arrays�N���X���g���Ĕz��̏������s���B
//
//�@��java.util.Arrays�N���X
//�@�@�EArrays�N���X���g���āA�z��̃\�[�g�⌟�����s�����Ƃ��ł���B
//�@�@�EArrays�N���X�̃��\�b�h�́A�N���X���\�b�h�Ȃ̂ŁA�I�u�W�F�N�g���쐬������
//�@�@�@�g�����Ƃ��ł���B
//
//�@��Arrays�N���X�̃��\�b�h
//�@�@static int binarySearch(Object[] a, Object b)
//    �@�@�\�F�o�C�i���[�T�[�`�@��Object�^�z��a����lb����������B
//�@�@�@�@�@�@Object�^�z��́A�\�[�g����Ă���K�v������B
//            �z�񒆂ɒlb����������ꍇ�A�ǂ̈ʒu���͂킩��Ȃ��B
//�@�@static void sort(Object[] a)
//�@�@�@�@�\�FObject�^�z��a��v�f�Ɏ��R�ȏ����ŏ����Ƀ\�[�g����B
//
///////////////////////////////////////////////////////////////////////////////
 
import java.util.*;

public class j841i {

  public static void main(String args[]) {

    // ��̏W�����쐬�B
    TreeSet<String> ts = new TreeSet<String>();

    // �v�f��ǉ��B
    ts.add("ddd");
    ts.add("aaa");
    ts.add("bbb");
    ts.add("eee");
    ts.add("ccc");

    // �W���̕\���B
    System.out.println("�W���F" + ts);
    System.out.println();

    // �W������z��ւ̕ϊ��ƕ\���B
    String s[] = new String[ts.size()];
    ts.toArray(s);
    System.out.println("�ϊ���̔z��");
    for( int i=0; i<s.length; i++ ) { System.out.print(" " + s[i]); }
    System.out.println(); System.out.println();

    // �z��̃\�[�g�B
    Arrays.sort(s);
    System.out.println("�\�[�g��̔z��");
    for( int i=0; i<s.length; i++ ) { System.out.print(" " + s[i]); }
    System.out.println(); System.out.println();

    // �z�񂩂�v�f��T���B
    System.out.println("�v�f�̒T��");
    int k = Arrays.binarySearch(s,"ccc");
    System.out.println("Arrays.binarySearch(s,\"ccc\")=" + k);
    k = Arrays.binarySearch(s,"fff");
    System.out.println("Arrays.binarySearch(s,\"fff\")=" + k);
    System.out.println();
  }
}
/*
</pre>

<font size=5 color=blue>���s����</font>

<pre>
% javac j841i.java
��:j841i.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��:�ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j841i
�W���F[aaa, bbb, ccc, ddd, eee]

�ϊ���̔z��
 aaa bbb ccc ddd eee

�\�[�g��̔z��
 aaa bbb ccc ddd eee

�v�f�̒T��
Arrays.binarySearch(s,"ccc")=2
Arrays.binarySearch(s,"fff")=-6
</pre>

</body>
</html>
*/
