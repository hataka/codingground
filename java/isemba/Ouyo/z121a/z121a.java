<!--====================================================================-->
<!-- << z121a.htm >>                                                    -->
<!--                                                                    -->
<!--  JAVA�v���O���~���O�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@�@  -->
<!--                                                                    -->
<!--====================================================================-->

<html>
<head>
  <title>JAVA�v���O���~���O</title>
</head>

<body bgcolor="white" text="black">

<pre>
////////////////////////////////////////////////////////////////////////////////
// << z121a.java >>
//
//  ���p�F�W�����P��(Applet�N���X)
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class z121a extends Applet implements ActionListener {

  int bnum,flag,rand;
  Button b0,b1,b2,b3;

  public void init() {

    // ���C�A�E�g�}�l�[�W���̃f�B�t�H���g�ݒ�������B
    this.setLayout(null);

    // �A�v���b�g�̔w�i�F��ݒ�
    this.setBackground(Color.orange);

    // �{�^���̍쐬�ƈʒu�̌���B
    b0 = new Button("�O�[");
    b0.setBounds(50,20,50,30);
    b1 = new Button("�`���L");
    b1.setBounds(110,20,50,30);
    b2 = new Button("�p�[");
    b2.setBounds(170,20,50,30);
    b3 = new Button("�J�n");
    b3.setBounds(230,20,50,30);

    // �{�^���̔z�u�B
    this.add(b0);
    this.add(b1);
    this.add(b2);
    this.add(b3);

    // �����ݒ�B
    flag = 0; // �J�n�{�^�����N���b�N�����O��0�A�N���b�N���1�ɂȂ�B

    // �C�x���g���X�i�̓o�^�B
    b0.addActionListener(this);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B 
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == b0 ) { bnum = 0; }
    if( e.getSource() == b1 ) { bnum = 1; }
    if( e.getSource() == b2 ) { bnum = 2; }
    if( e.getSource() == b3 ) { bnum = 3; }
    repaint();
  }

  public void paint(Graphics g) {

    // �\���F�ƃt�H���g�̕ύX�B
    g.setColor(Color.white);
    g.setFont(new Font("Serif",Font.BOLD,20));

    // ����񂯂�J�n���b�Z�[�W�Ə����ݒ�B
    if( bnum == 3 ) {
      g.drawString("����񂯂�E�J�n",20,100);
      flag = 1;
    }

    // ���[�U���̎�̕\���B
    if( (flag == 1)&&(bnum == 0) ) { g.drawString("���Ȃ��̓O�[�@�@",20,70); }
    if( (flag == 1)&&(bnum == 1) ) { g.drawString("���Ȃ��̓`���L�@",20,70); }
    if( (flag == 1)&&(bnum == 2) ) { g.drawString("���Ȃ��̓p�[�@�@",20,70); }

    // �R���s���[�^���̎�̕\���B
    if( (flag == 1)&&(bnum != 3) ) {
      rand = (int)(Math.random()*3);
      if( rand == 0 ) { g.drawString("�R���s���[�^�̓O�[",20,90); }
      if( rand == 1 ) { g.drawString("�R���s���[�^�̓`���L",20,90); }
      if( rand == 2 ) { g.drawString("�R���s���[�^�̓p�[",20,90); }

      // �\���F�ƃt�H���g�̕ύX�B
      g.setColor(Color.red);
      g.setFont(new Font("SansSerif",Font.BOLD,24));

      // �����̔���ƌ��ʂ̕\���B
      if( rand == bnum ) {
        g.drawString("������",20,120);
      } else if( (rand == 0)&&(bnum == 2)||
                 (rand == 1)&&(bnum == 0)||
                 (rand == 2)&&(bnum == 1) ) {
        g.drawString("���Ȃ��̏���",20,120);
      } else {
        g.drawString("���Ȃ��̕���",20,120);
      }
    }
  }
}
</pre>

<pre>
<font size=5 color=blue>�g�s�l�k�t�@�C��</font><br>
<html>
<head>
  <title>���p�F����񂯂�</title>
</head>
<body bgcolor=white text=black>
<applet code="z121a.class" width="300" height="150">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="z121a.class" width="300" height="150">
</applet>

</body>
</html>
