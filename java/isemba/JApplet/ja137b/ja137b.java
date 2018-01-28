//  -*- mode: java -*-  Time-stamp: <08/07/16(��) 16:09:13 hata>
/*================================================================
 * �v���O������: ja137b.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja137b.java >>
//
//  �i�`�����������i�Q�j�F���i�i�m�F�_�C�A���O�A�C�x���g�����j
//
//�@�@�m�F�_�C�A���O�������B
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
//�@�@public static void showConfirmDialog(Component parentComponent,
//                                         Object message,
//                                         String title,
//                                         int messageType)
//                                         throws HeadlessException
//�@�@�@�@�\�F�m�F���b�Z�[�W�_�C�A���O��\������B 
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

public class ja137b extends JApplet implements ActionListener {

  Container c;
  JButton b1,b2,b3,b4;

  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    c = this.getContentPane();
    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����GridLayout�ɐݒ�B
    c.setLayout(new GridLayout(4,1));

    // �{�^��b1,b2,b3,b4,b5�̍쐬�B
    b1 = new JButton("OK�E�_�C�A���O");
    b2 = new JButton("OK CANCEL�E�_�C�A���O");        
    b3 = new JButton("YES NO�E�_�C�A���O");        
    b4 = new JButton("YES NO CANCEL�E�_�C�A���O");        

    // �{�^��b1,b2,b3,b4���R���e���c�y�C�����ɒǉ��B
    c.add(b1);
    c.add(b2);
    c.add(b3);
    c.add(b4);

    // �C�x���g���X�i�̓o�^�B
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
 
 	resize(800,600);
  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void actionPerformed(ActionEvent e) {
    int rst = 0;
    if( e.getSource() == b1 ) {
      String title = "confirm dialog";
      String msg = "OK �_�C�A���O�ł�";
      int type = JOptionPane.DEFAULT_OPTION;
      rst = JOptionPane.showConfirmDialog(c,msg,title,type);
    }
    if( e.getSource() == b2 ) {
      String title = "confirm dialog";
      String msg = "OK CANCEL �_�C�A���O�ł�";
      int type = JOptionPane.OK_CANCEL_OPTION;
      rst = JOptionPane.showConfirmDialog(c,msg,title,type);
    }
    if( e.getSource() == b3 ) {
      String title = "confirm dialog";
      String msg = "YES NO �_�C�A���O�ł�";
      int type = JOptionPane.YES_NO_OPTION;
      rst = JOptionPane.showConfirmDialog(c,msg,title,type);
    }
    if( e.getSource() == b4 ) {
      String title = "confirm dialog";
      String msg = "YES NO CANCEL �_�C�A���O�ł�";
      int type = JOptionPane.YES_NO_CANCEL_OPTION;
      rst = JOptionPane.showConfirmDialog(c,msg,title,type);
    }

    if( rst == JOptionPane.YES_OPTION ) {
      String title = "message dialog";
      String msg = "YES ���󗝂��܂���";
      int type = JOptionPane.INFORMATION_MESSAGE;
      JOptionPane.showMessageDialog(c,msg,title,type);
    }
    if( rst == JOptionPane.NO_OPTION ) {
      String title = "message dialog";
      String msg = "NO ���󗝂��܂���";
      int type = JOptionPane.INFORMATION_MESSAGE;
      JOptionPane.showMessageDialog(c,msg,title,type);
    }
    if( rst == JOptionPane.CANCEL_OPTION ) {
      String title = "message dialog";
      String msg = "CANCEL ���󗝂��܂���";
      int type = JOptionPane.INFORMATION_MESSAGE;
      JOptionPane.showMessageDialog(c,msg,title,type);
    }
  }
}
