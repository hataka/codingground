// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j372a.java 
 * created : Time-stamp: <09/07/01(��) 09:44:45 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j372a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j372a.java >>
//
//  �`�����������i�U�j�F���i�i�|�b�v�A�b�v���j���[�A�z�u�A�C�x���g�����j
//
//�@�@�|�b�v�A�b�v���j���[���쐬���\������B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�F�}�E�X�N���X
//�@�@�C�x���g�N���X�FMouseEvent�N���X
//�@�@�C�x���g���X�i�FMouseListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@mouseClicked���\�b�h�A���̑�
//
//�@��java.awt.PopupMeuu�N���X
//    �|�b�v�A�b�v���j���[�𗘗p����Ƃ��APopupMenu�N���X���g���B
//
//�@��PopupMenu�̃R���X�g���N�^
//�@�@PopupMenu(String s)
//      �@�\�F�^�C�g��s�̃|�b�v�A�b�v���j���[�𐶐�����B
//
//�@��PopupMenu�N���X�̃��\�b�h
//�@�@public void show(Component c, int x, int y)
//      �@�\�F�ʒu(x,y)�Ƀ|�b�v�A�b�v���j���[��\������B
//
//  ��MenuItem�N���X�̃R���X�g���N�^
//�@�@MenuItem(String s)
//      �@�\�F���j���[����s���쐬����B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
  
public class j372a extends Applet implements MouseListener {

  PopupMenu pm;
  MenuItem mi1,mi2,mi3;

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����FlowLayout�ɐݒ�B
    this.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // �|�b�v�A�b�v���j���[�̍쐬�ƃA�v���b�g���ɒǉ��B
    pm = new PopupMenu();
    this.add(pm); 

    // ���j���[���ڂ̍쐬�ƃ|�b�v�A�b�v���j���[�ɒǉ��B
    mi1 = new MenuItem("��"); 
    mi2 = new MenuItem("��"); 
    mi3 = new MenuItem("��"); 
    pm.add(mi1);  
    pm.add(mi2); 
    pm.add(mi3); 

    // �C�x���g���X�i�̓o�^�B
    this.addMouseListener(this);

  }

  // MouseListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void mouseClicked(MouseEvent me) { 
    pm.show(this, me.getX(), me.getY()); 
  }
  public void mousePressed(MouseEvent me) { }
  public void mouseReleased(MouseEvent me) { }
  public void mouseEntered(MouseEvent me) { }
  public void mouseExited(MouseEvent me) { }

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
<applet code="j372a.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j372a.class" width="300" height="160">
</applet>

</body>
</html>
*/
