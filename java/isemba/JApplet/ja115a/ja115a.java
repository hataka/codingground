// -*- mode: java -*-  Time-stamp: <2010-04-16 13:14:24 kahata>
/*================================================================
 * file: ja115a.java
 * path; F:\java\isemba\JApplet\ja115a\ja115a.java
 * url:  http://localhost/java/isemba/JApplet/ja115a/ja115a.java
 * created: Time-stamp: <2010-04-16 13:14:24 kahata>
 * $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: 
 * description: 
 *
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja115a.java >>
//
//  �i�`�����������i�P�j�F���C�A�E�g�}�l�[�W���[�iCardLayout�A�z�u�j
//
//�@�@�R���e�i���ɒǉ�����镔�i�́A�J�[�h�Ƃ��Ĉ����A�P�x�ɂP���̃J�[�h�݂̂�
//�@�@�\�������
//�@�@�J�[�h�͏��Ԃɂ߂�������A�w�肵���J�[�h��\��������ł���B
//
//�@��CardLayout�N���X�̃R���X�g���N�^        
//�@�@public CardLayout(int h, int v)
//      �@�\�F���������̊Ԋuh����ѐ��������̊Ԋuv�ŁA�J�[�h���C�A�E�g���쐬����B
//
//�@��Container�N���X�̃��\�b�h
//  �@public Component add(Component comp, String obj)
//      �@�\�F���icomp�����̃R���e�i�ɕ�����obj�Ɗ֘A�Â��Ēǉ�����B
//
//�@��CardLayout�N���X�̃��\�b�h        
//    public void first(Container parent)
//�@�@�@�@�\�F�R���e�iparent�̍ŏ��̃J�[�h�ɐ؂�ւ���B
//    public void next(Container parent)
//�@�@�@�@�\�F�R���e�iparent�̎��̃J�[�h�ɐ؂�ւ���B���ݕ\������Ă���J�[�h��
//�@�@�@�@�@�@�Ō�̃J�[�h�ł���ꍇ�A�ŏ��̃J�[�h�ɐ؂�ւ���B
//    public void show(Container parent, String obj)
//�@�@�@�@�\�F������obj�Ɗ֘A�Â��Ă��̃��C�A�E�g�ɒǉ����ꂽ���i�ɐ؂�ւ���B
////////////////////////////////////////////////////////////////////////////////
//<applet code="ja115a.class" width="300" height="200"></applet>
import java.awt.*; 
import javax.swing.*;

public class ja115a extends JApplet {

  Container c;
  CardLayout cl;

  public void init() {
    // �A�v���b�g�̃R���e���c�y�C�����擾�B
    c = this.getContentPane();
    // CardLayout�I�u�W�F�N�g�̍쐬�B
    cl = new CardLayout(10,20); 
    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����CardLayout�ɐݒ�B
    c.setLayout(cl);

    // ���x���̍쐬�B
    JLabel lab1 = new JLabel("���x���P");
    JLabel lab2 = new JLabel("���x���Q");
    JLabel lab3 = new JLabel("���x���R");

    // ���x���ɖ��O��t���ăR���e���c�y�C�����ɒǉ��B   
    c.add(lab1,"FIRST");
    c.add(lab2,"SECOND");
    c.add(lab3,"THIRD");
  }

  public void start() {
    cl.show(c,"SECOND");
  }
}
