////////////////////////////////////////////////////////////////////////////////
// << s133.java >>
//
//  �r���������i�R�j�F�t���[���i�c�[���o�[�A�c�[���`�b�v�A�C�x���g�����j
//
//�@�@�c�[���o�[�i�����̃{�^�����܂ރo�[�j�̓t���[���̔C�ӂ̏ꏊ�Ɉړ��ł���B
//�@�@�c�[���`�b�v���g���ƁA�J�[�\�����R���|�[�l���g�̏�ɒu�����Ƃ������A
//�@�@�w�肳�ꂽ�����񂪕\�������B�R���|�[�l���g�̊Ȗ��Ȑ����Ɏg����B
//
//�@��javax.swing.JToolBar�N���X
//    �c�[���o�[���쐬����N���X�B
//
//�@��JToolBar�N���X�̃R���X�g���N�^
//�@�@public JToolBar()
//      �@�\�F�c�[���o�[���쐬����B
//�@�@public JToolBar(String s)
//      �@�\�F�^�C�g��s�����c�[���o�[���쐬����B
//�@�@public JToolBar(String s, int d)
//      �@�\�F�^�C�g��s�A����d�����c�[���o�[���쐬����B
//            ���������FSwingConstants.HORIZONTAL (�f�t�H���g)
//            ���������FSwingConstants.VERTICAL
//
//�@��JToolBar�N���X�̃��\�b�h
//�@�@public void addSeparator()
//      �@�\�F�Z�p���[�^��ǉ�����B
//
//�@��javax.swing.JComponent�N���X����p���������\�b�h
//�@�@public void setToolTipText(String s)
//      �@�\�F�c�[���`�b�v�̃e�L�X�g�Ƃ��āA�\������镶����s��ݒ肷��B
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

class s133 extends JFrame implements ActionListener {

  JToolBar tb;
  JButton b1,b2,b3;
  Container c;

  ////////////////////
  // �R���X�g���N�^ //
  ////////////////////
  s133(String t) { 

    super(t);

    // �t���[���̃R���e���c�y�C�����擾�B
    c = this.getContentPane();

    // �c�[���o�[tb�̍쐬�B
    tb = new JToolBar("�c�[���o�["); 
    c.add(tb,BorderLayout.NORTH);

    // �{�^��b1,b2,b3�̍쐬�B
    b1 = new JButton("��"); 
    b1.setToolTipText("�t���[����Ԃɂ���");
    b2 = new JButton("��"); 
    b2.setToolTipText("�t���[�������ɂ���");
    b3 = new JButton("��"); 
    b3.setToolTipText("�t���[����ɂ���");
    // �{�^��b1,b2,3�ƃZ�p���[�^���c�[���o�[�ɒǉ��B
    tb.add(b1); 
    tb.add(b2);
    tb.addSeparator();
    tb.add(b3); 

    // �C�x���g���X�i�̓o�^�B
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
  }

  //////////////////////////////////////////////
  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h //
  //////////////////////////////////////////////
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == b1 ) { c.setBackground(Color.red); }
    if( e.getSource() == b2 ) { c.setBackground(Color.yellow); }
    if( e.getSource() == b3 ) { c.setBackground(Color.blue); }
  }
    
  //////////////////
  // main���\�b�h //
  //////////////////
  public static void main(String[] args) {

    // �t���[���̍쐬�B
    s133 f = new s133("�c�[���o�[�t���t���[��");

    // �t���[���̑傫����ݒ�B
    //f.setSize(300,200);
    f.setSize(640,480);

    // �u����v�{�^�����N���b�N���ꂽ�Ƃ��A�v���O�������I������B
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // �t���[���̕\���B
    f.setVisible(true);
  }
}
