// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j372b.java 
 * created : Time-stamp: <09/07/01(��) 09:45:20 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j372b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j372b.java >>
//
//  �`�����������i�U�j�F���i�i�|�b�v�A�b�v���j���[�A�z�u�A�C�x���g�����j
//
//�@�@�|�b�v�A�b�v���j���[���쐬���\������B
//�@�@���ځu�ԁv�u�v�u���v��I������ƁA�A�v���b�g�̔w�i�F���ς��B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�F�}�E�X�N���X
//�@�@�C�x���g�N���X�FMouseEvent�N���X�AActionEvent�N���X
//�@�@�C�x���g���X�i�FMouseListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@mouseClicked���\�b�h�A���̑�
//                    ActionListener�C���^�[�t�F�[�X
//                    actionPerformed���\�b�h
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
  
public class j372b extends Applet implements ActionListener,MouseListener {

  PopupMenu pm;
  MenuItem mi1,mi2,mi3;

  public void init() {

    // �A�v���b�g�̔w�i�F���D�F�ɐݒ�B
    this.setBackground(Color.lightGray);

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����FlowLayout�ɐݒ�B
    this.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // �|�b�v�A�b�v���j���[�̍쐬�B
    pm = new PopupMenu();

    // �|�b�v�A�b�v���j���[���A�v���b�g���ɒǉ��B
    this.add(pm); 

    // ���j���[���ڂ̍쐬�B
    mi1 = new MenuItem("��"); 
    mi2 = new MenuItem("��"); 
    mi3 = new MenuItem("��"); 

    // ���j���[���ڂ��|�b�v�A�b�v���j���[�ɒǉ��B
    pm.add(mi1);  
    pm.add(mi2); 
    pm.add(mi3); 

    // �C�x���g���X�i�̓o�^�B
    mi1.addActionListener(this);
    mi2.addActionListener(this);
    mi3.addActionListener(this);
    this.addMouseListener(this);

  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void actionPerformed(ActionEvent ae) {
    if( ae.getSource() == mi1 ) { this.setBackground(Color.red); }
    if( ae.getSource() == mi2 ) { this.setBackground(Color.yellow); }
    if( ae.getSource() == mi3 ) { this.setBackground(Color.blue); }
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
<applet code="j372b.class" width="300" height="160">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="j372b.class" width="300" height="160">
</applet>

</body>
</html>
*/
