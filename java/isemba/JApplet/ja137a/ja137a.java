//  -*- mode: java -*-  Time-stamp: <08/07/16(��) 16:01:34 hata>
/*================================================================
 * �v���O������: ja137a.java
  * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja137a.java >>
//
//  �i�`�����������i�Q�j�F���i�i���b�Z�[�W�_�C�A���O�A�C�x���g�����j
//
//�@�@�ȒP�ȃ��b�Z�[�W��\������E�B���h�E���_�C�A���O�Ƃ����B
//�@�@����񎦂�����A���[�U����̉������󂯕t�����肷��B
//
//�@�@�_�C�A���O�ɂ́A���[�U�ւ̃��b�Z�[�W��`����_�C�A���O(���b�Z�[�W
//�@�@�_�C�A���O)�ƁAyes/no/cancel ���̊m�F�����߂�m�F�_�C�A���O(�m�F�_�C�A���O)
//�@�@������B
//
//�@�@�_�C�A���O�́A�E�B���h�E�E�^�C�g���A���b�Z�[�W�A�I�v�V�����{�^������
//�@�@�\�������B
//�@�@
//�@�@���ׂẴ_�C�A���O�̓��[�_���ł���B���Ȃ킿�A�_�C�A���O��̃{�^����
//�@�@�N���b�N�����܂ŁA���̃E�B���h�E�̑���͋֎~�����B
//�@�@
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
//�@�@public static void showMessageDialog(Component parentComponent,
//                                         Object message,
//                                         String title,
//                                         int messageType)
//                                         throws HeadlessException
//�@�@�@�@�\�F���b�Z�[�W�_�C�A���O��\������B 
//            parentComponent�F �_�C�A���O�̐e�ƂȂ�R���|�[�l���g�B
//            message        �F �_�C�A���O�ɕ\�����郁�b�Z�[�W�B
//            title          �F �_�C�A���O�̃^�C�g��������
//            messageType    �F �\������郁�b�Z�[�W�̎�ށB
//                              ERROR_MESSAGE�AINFORMATION_MESSAGE�A
//                              WARNING_MESSAGE�AQUESTION_MESSAGE�APLAIN_MESSAGE
//
////////////////////////////////////////////////////////////////////////////////
//<applet codebase = "./" code="ja137a.class" width=640 height=480></applet>

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ja137a extends JApplet implements ActionListener {

  Container c;
  JButton b1,b2,b3,b4,b5;

  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    c = this.getContentPane();
    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����GridLayout�ɐݒ�B
    c.setLayout(new GridLayout(5,1));

    // �{�^��b1,b2,b3,b4,b5�̍쐬�B
    b1 = new JButton("�G���[���b�Z�[�W�E�_�C�A���O");
    b2 = new JButton("��񃁃b�Z�[�W�E�_�C�A���O");        
    b3 = new JButton("�x�����b�Z�[�W�E�_�C�A���O");        
    b4 = new JButton("���⃁�b�Z�[�W�E�_�C�A���O");        
    b5 = new JButton("�ʏ탁�b�Z�[�W�E�_�C�A���O");        

    // �{�^��b1,b2,b3,b4,b5���R���e���c�y�C�����ɒǉ��B
    c.add(b1);
    c.add(b2);
    c.add(b3);
    c.add(b4);
    c.add(b5);

    // �C�x���g���X�i�̓o�^�B
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == b1 ) {
      String title = "message dialog";
      String msg = "�G���[���b�Z�[�W�E�_�C�A���O�ł�";
      int type = JOptionPane.ERROR_MESSAGE;
      JOptionPane.showMessageDialog(c,msg,title,type);
    }
    if( e.getSource() == b2 ) {
      String title = "message dialog";
      String msg = "��񃁃b�Z�[�W�E�_�C�A���O�ł�";
      int type = JOptionPane.INFORMATION_MESSAGE;
      JOptionPane.showMessageDialog(c,msg,title,type);
    }
    if( e.getSource() == b3 ) {
      String title = "message dialog";
      String msg = "�x�����b�Z�[�W�E�_�C�A���O�ł�";
      int type = JOptionPane.WARNING_MESSAGE;
      JOptionPane.showMessageDialog(c,msg,title,type);
    }
    if( e.getSource() == b4 ) {
      String title = "message dialog";
      String msg = "���⃁�b�Z�[�W�E�_�C�A���O�ł�";
      int type = JOptionPane.QUESTION_MESSAGE;
      JOptionPane.showMessageDialog(c,msg,title,type);
    }
    if( e.getSource() == b5 ) {
      String title = "message dialog";
      String msg = "�ʏ탁�b�Z�[�W�E�_�C�A���O�ł�";
      int type = JOptionPane.PLAIN_MESSAGE;
      JOptionPane.showMessageDialog(c,msg,title,type);
    }
  }
}
