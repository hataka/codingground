////////////////////////////////////////////////////////////////////////////////
// << ja121a.java >>
//
//  �i�`�����������i�Q�j�F���i�i���x���j
//
//�@�@�Z���������\������B
//
//�@��JLabel�N���X
//�@�@�������C���[�W��\������Ƃ���JLabel�N���X���g���B
//
//�@��JLabel�N���X�̃R���X�g���N�^
//    public JLabel()
//    �@�@�\�F��̕������\������B��ŁA�����񂪐ݒ肳���ƁA
//�@�@�@�@�@�@���������͍������A���������ɒ������������B
//    public JLabel(String s)
//    �@�@�\�F������s��\������B
//            ���������͍������A���������ɒ������������B 
// aaaaa����
//�@��JLabel�N���X�̃��\�b�h
//    public void setText(String s)
//    �@�@�\�F�\�����镶����s��ݒ肷��B
//            �e�N���X�́Ajavax.swing.JComponent�N���X�ł���B
//
////////////////////////////////////////////////////////////////////////////////

//<applet code="ja121a.class" width="300" height="200"></applet>

import java.awt.*;
import javax.swing.*;

public class ja121a extends JApplet {

  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();

    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout(10,10));

    // ���x���P�̍쐬�B
    JLabel lab1 = new JLabel();
    lab1.setText("���x���P");

    // ���x���Q�̍쐬�B
    JLabel lab2 = new JLabel("���x���Q");

    // ���x�����R���e���c�y�C�����ɒǉ��B
    c.add(lab1,BorderLayout.NORTH);
    c.add(lab2,BorderLayout.CENTER);
  }
}
