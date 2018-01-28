// -*- mode: java -*- Time-stamp: <2009-06-19 21:02:38 kahata>
/*====================================================================
 * name: g147a.java 
 * created : Time-stamp: <09/06/19(��) 21:00:14 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: 
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/GUI/g147a.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << g147a.java >>
//
//  �f�t�h�i�R�j�F�f�t�h���i�i�L�����o�X�j
//
//�@�@�L�����o�X���쐬���\������B
//
//�@��Canvas�N���X
//    ��`�̕`��̈��񋟂���B
//�@�@�ECanvas�N���X�̃N���X�K�w
//�@�@�@java.lang.Object --> java.awt.Component --> java.awt.Canvas
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;

class g147a {

  // �R���X�g���N�^�B
  g147a() {
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

    // �L�����o�X�̍쐬�B
    Canvas c = new Canvas();

    // �L�����o�X�̑傫����ݒ�B
    c.setSize(100,100);

    // �L�����o�X�̔w�i�F�����F�ɐݒ�B
    c.setBackground(Color.yellow);

    // �L�����o�X���t���[�����ɒǉ��B
    f.add(c);

    // �t���[���̑傫����ݒ�B
    f.setSize(300,200);
    // �t���[����\���B
    f.setVisible(true);
  }

  public static void main(String[] args) {
    g147a g = new g147a();
  }
}
