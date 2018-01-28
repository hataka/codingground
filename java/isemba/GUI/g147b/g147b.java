// -*- mode: java -*- Time-stamp: <2009-06-19 21:23:02 kahata>
/*====================================================================
 * name: g147b.java 
 * created : Time-stamp: <09/06/19(��) 21:20:14 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links:
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/GUI/g147b.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << g147b.java >>
//
//  �f�t�h�i�R�j�F�f�t�h���i�i�L�����o�X�j
//
//�@�@�L�����o�X���쐬���\������B
//    �L�����o�X���ɕ������`�悷��B
//
//�@��Graphics�N���X
//    �O���t�B�b�N�X�R���e�L�X�g(���z�I�ȉ�ʁB�`��̑ΏۂɈˑ����Ȃ�)��񋟂���B
//
//�@��Graphics�N���X�̃��\�b�h
//    public abstract void drawString(String s, int x, int y)
//�@�@�@�@�\�F������s���ʒu(x,y)�ɕ`�悷��B
//            x�͐����������Ay�͐����������B
//�@
//�@��Canvas�N���X�̃��\�b�h
//    public void paint(Graphics g)
//�@�@�@�@�\�F�L�����o�X���y�C���g����B
//            g�́A�y�C���g�Ɏg�p����O���t�B�b�N�X�R���e�L�X�g
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;

class g147b extends Canvas {

  // �R���X�g���N�^�B
  g147b() {
    // �t���[���̍쐬�B
    Frame f = new Frame("�t���[��");

    // �u����v�{�^�����N���b�N���ꂽ�Ƃ��A�v���O�������I������B
    f.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent evt) {
            System.exit(0);
            }
    });

    // �t���[���Ƀ��C�A�E�g�}�l�[�W��(FlowLayout)��ݒ�B
    f.setLayout(new FlowLayout(FlowLayout.LEFT,20,20));

    // �L�����o�X�̑傫����ݒ�B
    this.setSize(100,100);

    // �L�����o�X�̔w�i�F�����F�ɐݒ�B
    this.setBackground(Color.yellow);

    // �L�����o�X���t���[�����ɒǉ��B
    f.add(this);

    // �t���[���̑傫����ݒ�B
    f.setSize(300,200);
    // �t���[����\���B
    f.setVisible(true);

  }

  // paint���\�b�h���I�[�o�[���C�h�B
  public void paint(Graphics g) {
    g.drawString("����ɂ���",20,40);
  }

  public static void main(String[] args) {
    g147b g = new g147b();
  }
}
