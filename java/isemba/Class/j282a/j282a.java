// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j282a.java 
 * created : Time-stamp: <09/06/29(��) 17:30:51 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j282a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j282a.java >>
//
//  �N���X�i�W�j�F�p�b�P�[�W�i�p�b�P�[�W�̍쐬�j
//
//�@�@�p�b�P�[�W�쐬�@���m�F����B
//�@�@�@
//�@�@�i�P�j�p�b�P�[�W�w����܂ރ\�[�X�t�@�C�����쐬�B
//�@�@�i�Q�j�R���p�C�������s�B
//
//          % javac -d . �N���X��.java
//�@
//          �J�����g�f�B���N�g�� ------- �N���X��.java
//                                   |
//                                   --- pack1 --- �N���X��.class
//                                        
////////////////////////////////////////////////////////////////////////////////

package pack1; // �p�b�P�[�W���ipack1�j

public class j282a { // �O������A�N�Z�X�����̂ŁApublic�w�������B

  int a = 111; // �w��̂Ȃ��t�B�[���h�ϐ��B
  public int pa = 222; // public�w��̂���t�B�[���h�ϐ��B

  String m() { // �w��̂Ȃ����\�b�h�B
    return "�w��̂Ȃ����\�b�h(m)";
  }

  public String pm() { // public�w��̂��郁�\�b�h�B
    return "public�w��̂��郁�\�b�h(pm)";
  }
}
/*
���s����
% javac -d . j282a.java
*/
