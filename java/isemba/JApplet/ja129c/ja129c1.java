////////////////////////////////////////////////////////////////////////////////
// << ja129c.java >>
//
//  �i�`�����������i�Q�j�F���i�i�p�l���A�����̐F�j
//
//�@�@�F�̐ݒ��\���ɂ́AColor�N���X���g���B
//
//�@��Color�N���X
//�@�@�F�̃f�[�^�⑀�삪��`����Ă���N���X�B
//
//�@��Color�N���X�̃R���X�g���N�^
//    public Color(int r, int g, int b)
//      �@�\�F�F�̐����B
//      r   �F�Ԃ̐����̋���(0-255)
//      g   �F�΂̐����̋���(0-255)
//      b   �F�̐����̋���(0-255)
//
//�@�@�EColor�N���X�ɗp�ӂ���Ă���F
//�@�@�@magenta�F�Â����F�@�@ �@black�F���@�@white�F��     yellow�F��
//�@�@�@darkGray�F�Â��D�F�@�@�@gray�F�D�F   cyan�F��F�@  blue�F�@
//�@�@�@lightGray�F���邢�D�F �@red�F�ԁ@�@  orange�F��@�@green�F�΁@
//�@�@�@pink�F���邢���F        
//
//�@��Graphics�N���X�̃��\�b�h   
//    public abstract void setFont(Font font)
//  �@  �@�\�F�ȍ~�ɕ\������O���t�B�b�N�X�̃t�H���g��font�ɐݒ�B
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

public class ja129c extends JApplet {

  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();

    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout(0,0));

    // �p�l���̍쐬�B
    ja129cp p = new ja129cp();
    p.setBackground(Color.lightGray);
 
    // �p�l�����R���e���c�y�C�����ɒǉ��B
    c.add(p,BorderLayout.CENTER);
  }

  // �p�l���̒�`(�����N���X)�B
  class ja129cp extends JPanel {
    public void paintComponent(Graphics g) {                       
      super.paintComponent(g);                                     
      g.setFont(new Font("Serif",Font.BOLD,48));         
      g.setColor(new Color(255,0,0)); // �F��Ԃɐݒ�B  
      g.drawString("��",50,50);                          
      g.setColor(Color.blue); // �F��ɐݒ�B          
      g.drawString("��",50,100);                         
      g.setColor(Color.yellow); // �F�����ɐݒ�B        
      g.drawString("��",50,150);                         
    }                                                              
  }
}
/**
<applet code="ja129c.class" width="300" height="200">
</applet>
**/
