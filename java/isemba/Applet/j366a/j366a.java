// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j366a.java 
 * created : Time-stamp: <09/07/01(��) 08:33:57 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j366a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j366a.java >>
//
//  �`�����������i�U�j�F���i�i���X�g�A�z�u�j
//
//�@�@�����̍��ڂ��畡���̍��ڂ�I�����郊�X�g���쐬���\������B
//
//  ��java.awt.List�N���X
//    �����̍��ڂ��畡���̍��ڂ�I������Ƃ��AList�N���X���g���B
//
//  ��List�N���X�̃R���X�g���N�^
//    List(int r, boolean b)                       
//      �@�\�Fr�s���̃��X�g���쐬����Bb��true�̏ꍇ�A�������ڑI�����\�ƂȂ�B
//            b��false�̏ꍇ�A�����I�����s�B
//
//  ��List�N���X�̃��\�b�h
//    public void add(String s)
//�@�@�@�@�\�F������s�����X�g�̍Ō�ɒǉ�����B  
//�@�@public void add(String s, int n)
//�@�@�@�@�\�F������s�����X�g�̈ʒun�ɒǉ�����Bn��0�ȏ�B
//�@�@�@�@�@�@n��0�����܂��̓��X�g�����ڐ��ȏ�̏ꍇ�́A���X�g�̖����ɒǉ������B 
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*; 

public class j366a extends Applet {

  List list;

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����FlowLayout�ɐݒ�B
    this.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // ���X�g�̍쐬�B
    list = new List(3,true);      
    list.add("���ڂP"); 
    list.add("���ڂQ");
    list.add("���ڂS"); 
    list.add("���ڂR",2);
    list.add("���ڂT");

    // ���X�g���A�v���b�g���ɒǉ��B
    this.add(list);

  }

}
/*
</pre>

<font size=5 color=blue>�g�s�l�k�t�@�C��</font><br>

<pre>
<html>
<head>
  <title>�A�v���b�g</title>
</head>
<body bgcolor=white text=black>
<applet code="j366a.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j366a.class" width="300" height="160">
</applet>

</body>
</html>
*/
