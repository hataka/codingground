<!--====================================================================-->
<!-- << z122a.htm >>                                                    -->
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
// << z122a.java >>
//
//  ���p�F�W�����P��(JApplet�N���X)
//
////////////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class z122a extends JApplet implements ActionListener {

  int bnum,flag,rand;
  JButton b0,b1,b2,b3;

  public void init() {

    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();

    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout());

    // �p�l���̍쐬�B
    z122ap p = new z122ap();

    // �p�l���̔w�i�F��ݒ�
    p.setBackground(Color.orange);

    // �p�l���̃��C�A�E�g�}�l�[�W���̃f�B�t�H���g�ݒ�������B
    p.setLayout(null);

    // �p�l�����R���e���c�y�C�����ɒǉ��B
    c.add(p,BorderLayout.CENTER);

    // �{�^���̍쐬�ƈʒu�̌���B
    b0 = new JButton("�O�[");
    b0.setBounds(20,20,90,30);
    b1 = new JButton("�`���L");
    b1.setBounds(110,20,90,30);
    b2 = new JButton("�p�[");
    b2.setBounds(200,20,90,30);
    b3 = new JButton("�J�n");
    b3.setBounds(290,20,90,30);

    // �{�^�����p�l�����ɒǉ��B
    p.add(b0);
    p.add(b1);
    p.add(b2);
    p.add(b3);

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

  // �p�l���̒�`(�����N���X)�B
  class z122ap extends JPanel {
    public void paintComponent(Graphics g) {                                
      super.paintComponent(g);                                              
                                                                            
      // �\���F�ƃt�H���g�̕ύX�B                                           
      g.setColor(Color.white);                                              
      g.setFont(new Font("Serif",Font.BOLD,20));                            
                                                                            
      // ����񂯂�J�n���b�Z�[�W�Ə����ݒ�B                               
      if( bnum == 3 ) {                                                     
        g.drawString("����񂯂�E�J�n",20,100);                            
        flag = 1;                                                           
      }                                                                     
                                                                            
      // ���[�U���̎�̕\���B                                               
      if( (flag==1)&&(bnum==0) ) { g.drawString("���Ȃ��̓O�[�@�@",20,70); }
      if( (flag==1)&&(bnum==1) ) { g.drawString("���Ȃ��̓`���L�@",20,70); }
      if( (flag==1)&&(bnum==2) ) { g.drawString("���Ȃ��̓p�[�@�@",20,70); }
                                                                            
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
}
</pre>

<pre>
<font size=5 color=blue>�g�s�l�k�t�@�C��</font><br>
<html>
<head>
  <title>���p�F����񂯂�</title>
</head>
<body bgcolor=white text=black>
<applet code="z122a.class" width="400" height="150">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="z122a.class" width="400" height="150">
</applet>

</body>
</html>
