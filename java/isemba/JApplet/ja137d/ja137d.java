//  -*- mode: java -*-  Time-stamp: <08/07/16(��) 16:31:25 hata>
/*================================================================
 * �v���O������: ja137d.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja137d.java >>
//
//  �i�`�����������i�Q�j�F���i�i�F�I���_�C�A���O�A�C�x���g�����j
//
//�@�@�F�I���_�C�A���O�������B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�FJButton�N���X
//�@�@�C�x���g      �FActionEvent�N���X
//�@�@�C�x���g���X�i�FActionListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@actionPerformed���\�b�h
//
//�@��JColorChooser�N���X
//�@�@�_�C�A���O�������N���X�B
//
//�@��JColorChooser�N���X�̃��\�b�h
//    public static Color showDialog(Component component,
//                                   String title,
//                                   Color initialColor)
//                                   throws HeadlessException
//      �@�\�F�F�I���_�C�A���O��\������B
//�@�@�@�@�@�@OK�{�^�����������ƁA�I�����ꂽ�F��Ԃ��B
//�@�@�@�@�@�@Cancel�{�^�����������ƁAnull ��Ԃ��B 
//            component   �F �_�C�A���O�̐e�ƂȂ�R���|�[�l���g�B
//            title       �F �_�C�A���O�̃^�C�g��������B
//            initialColor�F �����F�̃Z�b�g�B 
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
<applet code="ja137d.class" width="300" height="200">
</applet>
*/

public class ja137d extends JApplet implements ActionListener {

  Container c;
  JButton b;
  JLabel lab;
  Color color;
  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    c = this.getContentPane();
    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����GridLayout�ɐݒ�B
    c.setLayout(new GridLayout(2,1));

    // �{�^��b�̍쐬�B
    b = new JButton("�F�I���_�C�A���O");
    // �{�^��b���R���e���c�y�C�����ɒǉ��B
    c.add(b);

    // ���x��lab�̍쐬�B
    lab = new JLabel("�I��F");
    Font f = new Font("Serif",Font.BOLD,40);
    lab.setFont(f);
    // ���x��lab���R���e���c�y�C�����ɒǉ��B
    c.add(lab);

    // �C�x���g���X�i�̓o�^�B
    b.addActionListener(this);
  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void actionPerformed(ActionEvent e) {
    String rst = "";
    if( e.getSource() == b ) {
      String title = "color choose dialog";
      Color col = new Color(0,0,0);
      color = JColorChooser.showDialog(c,title,col);
      lab.setForeground(color);
    }
  }
}
