// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j342c.java 
 * created : Time-stamp: <09/06/30(��) 20:46:11 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j342c.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j342c.java >>
//
//  �A�v���b�g�i�S�j�F�C�x���g�����i�{�^������A�����N���X�j
//
//�@������
//�@�@�ԂƏ����ꂽ�{�^�����N���b�N����Ɣw�i�F���ԂɂȂ�B
//�@�@�΂Ə����ꂽ�{�^�����N���b�N����Ɣw�i�F���΂ɂȂ�B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�F Button�N���X
//�@�@�C�x���g�N���X�F ActionEvent�N���X
//�@�@�C�x���g���X�i�F ActionListener�C���^�[�t�F�[�X
//
//�@�������N���X
//    �����N���X�ɖ��O��t����͔̂ώG�ł���B�����ŁA���O��t�����ɓ����N���X��
//�@�@�g������@���l����ꂽ�B
//
//�@�@    new �e�N���X��(����) {
//          ����                
//        }                     
//
//�@�@�E�R���p�C�������ƁA�Q�̃N���X�t�@�C�����쐬�����B
//�@�@�@j342c.class, j342c$1.class
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class j342c extends Applet {

  Button b1,b2; 

  public void init() {

    // �{�^���̍쐬�B
    b1 = new Button("��");
    b2 = new Button("��");

    // �{�^�����A�v���b�g�ɒǉ��B
    this.add(b1);
    this.add(b2);

    // �C�x���g���X�i�𓽖��N���X�Ƃ��Ē�`�B
    ActionListener al = new ActionListener() {

      // actionPerformed���\�b�h�̒�`�B
      public void actionPerformed(ActionEvent e) {
      // �{�^�����N���b�N���ꂽ�Ƃ��A���s�����B
        if( e.getSource() == b1 ) { setBackground(Color.red); } 
        if( e.getSource() == b2 ) { setBackground(Color.green); } 
      }
    };                                              

    // �C�x���g���X�i�̓o�^�B
    b1.addActionListener(al); 
    b2.addActionListener(al); 

  }

}
/*
</pre>

<pre>
<font size=5 color=blue>�g�s�l�k�t�@�C��</font><br>
<html>
<head>
  <title>�A�v���b�g</title>
</head>
<body bgcolor=white text=black>
<applet code="j342c.class" width="300" height="100">
</applet>
<body>
<html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j342c.class" width="300" height="100">
</applet>

</body>
</html>
*/
