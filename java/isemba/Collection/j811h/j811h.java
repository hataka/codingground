// -*- mode: java -*- Time-stamp: <2009-06-18 13:47:03 kahata>
/*====================================================================
 * name: j811h.java 
 * created : Time-stamp: <09/06/18(��) 10:40:59 hata>
 * $Id$
 * To compile:
 * To run:
 * links:
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/COLLECTION/j811h.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << j811h.java >>
//
//  �f�[�^�\���i�P�j�F���X�g�iArrayList�N���X�A���X�g�Ɣz��̑��ݕϊ��j
//
//�@�@���X�g�Ɣz��̑��ݕϊ����s���B
//
//�@��ArrayList�N���X�̃��\�b�h
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

public class j811h {

  public static void main(String args[]) {

    // ��̃��X�g���쐬�B
    ArrayList<String> a = new ArrayList<String>();

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
    List<String> b = (List<String>)Arrays.asList(s);
    System.out.println("�z�񂩂烊�X�g�ւ̕ϊ���̃��X�g�F" + b);
  }
}
/*
���s����
% javac j811h.java
��: j811h.java �̑���́A���`�F�b�N�܂��͈��S�ł͂���܂���B
��: �ڍׂɂ��ẮA-Xlint:unchecked �I�v�V�������w�肵�čăR���p�C�����Ă��������B

% java j811h
�ϊ��O���X�g�F[ddd, aaa, bbb, eee, ccc]

���X�g����z��ւ̕ϊ���̔z��
 ddd aaa bbb eee ccc

�z�񂩂烊�X�g�ւ̕ϊ���̃��X�g�F[ddd, aaa, bbb, eee, ccc]
*/
