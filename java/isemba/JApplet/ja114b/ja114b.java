////////////////////////////////////////////////////////////////////////////////
// << ja114b.java >>
//
//  �i�`�����������i�P�j�F���C�A�E�g�}�l�[�W���[�iBoxLayout�j
//
//�@�@���i�͍�����E��(�܂��͏ォ�牺��)�z�u�����B
//�@�@�A�v���b�g�̑傫�����ς���Ă��z�u�͕ς��Ȃ��B
//
//�@��BoxLayout�N���X�̃R���X�g���N�^
//    public BoxLayout(Container target, int axis)
//      �@�\�F���i�����axis�ɔz�u���郌�C�A�E�g�}�l�[�W�����쐬����B
//            target�F �ݒ肷��R���e�i�B
//            BoxLayout.X_AXIS�F ������E�ցB
//            BoxLayout.Y_AXIS�F �ォ�牺�ցB
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

public class ja114b extends JApplet {

  public void init() {
    // �A�v���b�g�̃R���e���c�y�C�����擾�B
    Container c = getContentPane();
    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����BoxLayout�ɐݒ�B
    c.setLayout(new BoxLayout(c, BoxLayout.Y_AXIS));

    // �{�^���ƃ��x���̍쐬�B
    JButton b1 = new JButton("�{�^���P");
    JButton b2 = new JButton("�{�^���Q");
    JLabel lab = new JLabel("���x��");

    // �{�^���ƃ��x�����R���e���c�y�C�����ɒǉ��B
    c.add(b1);
    c.add(lab);
    c.add(b2);
  }
}
/**
<applet code="ja114b.class" width="640" height="480">
</applet>
*/
