//  -*- mode: java -*-  Time-stamp: <08/07/16(��) 16:22:22 hata>
/*================================================================
 * �v���O������: ja137c.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja137c.java >>
//
//  �i�`�����������i�Q�j�F���i�i���̓_�C�A���O�A�C�x���g�����j
//
//�@�@���̓_�C�A���O�������B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�FJButton�N���X
//�@�@�C�x���g      �FActionEvent�N���X
//�@�@�C�x���g���X�i�FActionListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@actionPerformed���\�b�h
//
//�@��JOptionPane�N���X
//�@�@�_�C�A���O�������N���X�B
//
//�@��JOptionPane�N���X�̃��\�b�h
//�@�@public static String showInputDialog(Component parentComponent,
//                                         Object message,
//                                         String title,
//                                         int messageType)
//                                         throws HeadlessException
//�@�@�@�@�\�F���̓_�C�A���O��\������B 
//            parentComponent�F �_�C�A���O�̐e�ƂȂ�R���|�[�l���g�B
//            message        �F �_�C�A���O�ɕ\�����郁�b�Z�[�W�B
//            title          �F �_�C�A���O�̃^�C�g��������
//            messageType    �F �\������郁�b�Z�[�W�̎�ށB
//                              ERROR_MESSAGE�AINFORMATION_MESSAGE�A
//                              WARNING_MESSAGE�AQUESTION_MESSAGE�APLAIN_MESSAGE
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/*
<applet code="ja137c.class" width="640" height="480">
</applet>
*/

public class ja137c extends JApplet implements ActionListener {

  Container c;
  JButton b;
  JLabel lab;

  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    c = this.getContentPane();
    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����GridLayout�ɐݒ�B
    c.setLayout(new GridLayout(2,1));

    // �{�^��b�̍쐬�B
    b = new JButton("���̓_�C�A���O");
    // �{�^��b���R���e���c�y�C�����ɒǉ��B
    c.add(b);

    // ���x��lab�̍쐬�B
    lab = new JLabel("���̓f�[�^");
    // ���x��lab���R���e���c�y�C�����ɒǉ��B
    c.add(lab);

    // �C�x���g���X�i�̓o�^�B
    b.addActionListener(this);
  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void actionPerformed(ActionEvent e) {
    String rst = "";
    if( e.getSource() == b ) {
      String title = "input dialog";
      String msg = "���̓_�C�A���O�ł��B���͂��Ă�������";
      int type = JOptionPane.QUESTION_MESSAGE;
      rst = JOptionPane.showInputDialog(c,msg,title,type);
      lab.setText(rst);
    }
  }
}
