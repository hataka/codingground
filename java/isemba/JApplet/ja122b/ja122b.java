////////////////////////////////////////////////////////////////////////////////
// << ja122b.java >>
//
//  �i�`�����������i�Q�j�F���i�i�{�^���A�z�u�A�C�x���g�����j
//
//�@�@�u�ԁv�{�^�����N���b�N����ƁA�A�v���b�g�̔w�i�F���ԂɂȂ�B
//�@�@�u�΁v�{�^�����N���b�N����ƁA�A�v���b�g�̔w�i�F���΂ɂȂ�B
//
//  ���C�x���g����
//
//    ���[�U���{�^�����N���b�N����ƁA�C�x���g�Ƃ������Ƃ��Ă܂Ƃ߂���B
//�@�@���̃C�x���g�́A�C�x���g���X�i�ɓn���ꏈ�������B
//�@�@���̂悤�ȏ����`�����C�x���g�����Ƃ����B
//
//�@�@�E�C�x���g�̔������ƂȂ�R���|�[�l���g���C�x���g�\�[�X�Ƃ����B
//�@�@�E�C�x���g���X�i�́A���X�i�[�C���^�[�t�F�[�X���������Ă���N���X�ŁA
//�@�@�@�󗝂����C�x���g���������郁�\�b�h���L�q�����B
//�@�@�E�C�x���g�����Ɋ֘A����N���X�́Ajava.awt�p�b�P�[�W��java.awt.event
//�@�@�@�p�b�P�[�W�ɑ��݂���B
//
//�@���C�x���g�����̎d�g��
//
//�@�@(1)�C�x���g�\�[�X����C�x���g����������B
//�@�@   �C�x���g�ɂ́A���̎�ނ��ƂɑΉ�����N���X(�{�^�����삩�甭������
//       �C�x���g�ɂ�ActionEvent�N���X������)����`����Ă���A�C�x���g��
//       ��������ƁA���̃I�u�W�F�N�g�������B
//�@�@(2)�C�x���g�̃I�u�W�F�N�g�́A�C�x���g���X�i�̃I�u�W�F�N�g�ɑ����
//       ���������B
//       ���炩���߁A�C�x���g���X�i�̃I�u�W�F�N�g���C�x���g�\�[�X�̃I�u�W�F�N�g
//       �ɓo�^���Ă����K�v������B
//
//�@�@�E�C�x���g���X�i�́A�C�x���g�ɑΉ����郊�X�i�[�C���^�[�t�F�[�X����������
//�@�@�@���Ƃ��v�������B�Ⴆ�΁A�{�^���̃C�x���gActionEvent����������
//�@�@�@�C�x���g���X�i�́AActionListener�Ƃ����C���^�[�t�F�[�X���̃��\�b�h
//�@�@�@(actionPerformed)�ɏ����菇���L�q���邱�ƂɂȂ�
//
//�@���C�x���g�����v���O�����̏�����
//
//�@�@���̂Q�_���L�q���邱�Ƃ��K�v�B
//�@�i�菇�P�j���X�i�[�C���^�[�t�F�[�X���������郊�X�i�N���X���`����B
//�@�i�菇�Q�j�C�x���g�\�[�X�̃I�u�W�F�N�g�ɁA�C�x���g���X�i�̃I�u�W�F�N�g��
//�@�@�@�@�@�@�o�^����
//�@
//�@�@�@�@�@�@�C�x���g�\�[�X�̃I�u�W�F�N�g.addEventListener(�C�x���g���X�i��
//�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�I�u�W�F�N�g)
//
//�@���A�v���b�g�Ń{�^���̏ꍇ
//
//    import java.awt.*; // �C�x���g�����֘A�N���X���C���|�[�g�B
//    import java.awt.event.*; // �C�x���g�����֘A�N���X���C���|�[�g�B
//    import javax.swing.*;
//
//    public class �N���X�� extends JApplet implements ActionListener {
//      �E�E�E                         // �A�v���b�g���g���C�x���g���X�i�ɂȂ�B
//      public void init() {
//        b = new Button("�{�^��");
//        �C�x���g�\�[�X�̃I�u�W�F�N�g(b)�ɁA�C�x���g���X�i�̃I�u�W�F�N�g
//�@�@�@�@(actionPerformed���\�b�h����������I�u�W�F�N�g�A���̏ꍇ�A
//�@�@�@�@�A�v���b�g���g�ɂȂ�̂ŁAthis)��o�^����B
//        b.addActionListener(this); 
//      }
//      public void actionPerformed(ActionEvent e) (
//        �C�x���g�����������B
//      }
//      �E�E�E
//    }
//
//�@��ActionListener�C���^�[�t�F�[�X
//�@�@java.awt.event.ActionListener
//
//�@��ActionListener�C���^�[�t�F�[�X�̃��\�b�h
//    void actionPerformed(ActionEvent e)
//      �@�\�F�C�x���g�����������Ƃ��Ăяo�����B
//      �@�@�@ActionEvent�I�u�W�F�N�ge�ɂ́A�C�x���g�������̏󋵂��L�^����Ă���B
//
//�@��ActionEvent�N���X
//�@�@java.awt.event.ActionEvent
//
//�@��javax.swing.AbstractButton�N���X����p���������\�b�h
//    public void addActionListener(ActionListener al)
//      �@�\�F�{�^����ActionListener al��ǉ�����B 
//
//�@��java.util.EventObject�N���X����p���������\�b�h
//�@�@public Object getSource()
//�@�@�@�@�\�F�C�x���g���ŏ��ɔ��������I�u�W�F�N�g��Ԃ��B
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ja122b extends JApplet implements ActionListener {

  JButton b1,b2; // �R���X�g���N�^�ƃ��\�b�h(actionPerformed)�Ŏg���邽�߁A
                 // �C���X�^���X�ϐ��ɂ���B
  Container c;   // b1,b2�Ɠ��l�B

  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    c = this.getContentPane();

    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����FlowLayout�ɐݒ�B
    c.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));

    // �{�^�������B
    b1 = new JButton("��");
    b2 = new JButton("��");

    // �{�^�����R���e���c�y�C�����ɒǉ��B
    c.add(b1);
    c.add(b2);

    // �C�x���g���X�i�̓o�^�B
    b1.addActionListener(this);
    b2.addActionListener(this);
  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void actionPerformed(ActionEvent e) {
    // �{�^�����N���b�N���ꂽ�Ƃ��A���s�����B
    if( e.getSource() == b1 ) { c.setBackground(Color.red); }
    if( e.getSource() == b2 ) { c.setBackground(Color.green); }
  }
}
/**
<applet code="ja122b.class" width="300" height="200">
</applet>
**/
