////////////////////////////////////////////////////////////////////////////////
// << ja122a.java >>
//
//  �i�`�����������i�Q�j�F���i�i�{�^���A�z�u�j
//
//�@�@�u�ԁv�{�^���Ɓu�΁v�{�^�������C�A�E�g�}�l�[�W��(FlowLayout)��
//�@�@�g���Ĕz�u����B
//
//�@��JButton�N���X
//�@�@on/off�̑I���̂Ƃ���JButton�N���X���g���B
//
//  ��JButton�N���X�̃R���X�g���N�^
//    public JButton(String s)      
//      �@�\�F������s��\������{�^���𐶐�����B
//�@�@
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import javax.swing.*;

public class ja122a extends JApplet {

  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();

    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����FlowLayout�ɐݒ�B
    c.setLayout(new FlowLayout(FlowLayout.CENTER,50,50));

    // �{�^���̍쐬�B
    JButton b1 = new JButton("��");
    JButton b2 = new JButton("��");

    // �{�^�����R���e���c�y�C�����ɒǉ��B
    c.add(b1);
    c.add(b2);
  }
}
/**
<applet code="ja122a.class" width="300" height="200">
</applet>
**/
