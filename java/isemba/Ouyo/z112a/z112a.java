<!--====================================================================-->
<!-- << z112a.htm >>                                                    -->
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
// << z112a.java >>
//
//  ���p�F�d��(JApplet�N���X)
//
//�@�@�d��̃f�U�C��
//
////////////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.awt.*;

public class z112a extends JApplet {

  Container c;
  JLabel lab;
  JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
  int x0,y0,w,h;

  public void init() {

    // �A�v���b�g����R���e���c�y�C�����擾�B
    c = this.getContentPane();
    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W���̃f�B�t�H���g�ݒ�������B
    c.setLayout(null);

    // �R���e���c�y�C���̔w�i�F��ݒ�
    c.setBackground(Color.lightGray);

    // �p�����[�^�B
    x0 = 20; // �d��̍������x���W�B
    y0 = 20; // �d��̍������y���W�B
    w = 50;  // �����L�[�{�^���̕��B
    h = 30;  // �����L�[�{�^���̍����B

    // ���x���̍쐬�B
    lab = new JLabel("",SwingConstants.CENTER);
    lab.setBackground(Color.yellow); // ���x���̔w�i�F��ݒ�B
    lab.setForeground(Color.black);  // ���x���̑O�i�F��ݒ�B 
    lab.setOpaque(true);

    // ���x���̔z�u�B
    lab.setBounds(x0,y0,3*w,h);
    c.add(lab);

    // �����L�[�A���Z�L�[�A���L�[�A�N���A�L�[�̍쐬�B
    b0 = new JButton("�O");
    b1 = new JButton("�P");
    b2 = new JButton("�Q");
    b3 = new JButton("�R");
    b4 = new JButton("�S");
    b5 = new JButton("�T");
    b6 = new JButton("�U");
    b7 = new JButton("�V");
    b8 = new JButton("�W");
    b9 = new JButton("�X");
    b10 = new JButton("�{");
    b11 = new JButton("�|");
    b12 = new JButton("��");
    b13 = new JButton("�b");

    // �����L�[�A���Z�L�[�A���L�[�A�N���A�L�[�̔z�u�B
    b7.setBounds(x0,y0+h,w,h);
    b8.setBounds(x0+w,y0+h,w,h);
    b9.setBounds(x0+2*w,y0+h,w,h);
    b4.setBounds(x0,y0+2*h,w,h);
    b5.setBounds(x0+w,y0+2*h,w,h);
    b6.setBounds(x0+2*w,y0+2*h,w,h);
    b1.setBounds(x0,y0+3*h,w,h);
    b2.setBounds(x0+w,y0+3*h,w,h);
    b3.setBounds(x0+2*w,y0+3*h,w,h);
    b0.setBounds(x0,y0+4*h,w,h);
    b10.setBounds(x0+w,y0+4*h,w,h);
    b11.setBounds(x0+2*w,y0+4*h,w,h);
    b12.setBounds(x0,y0+5*h,3*w,h);
    b13.setBounds(x0,y0+6*h,3*w,h);
    c.add(b0); c.add(b1); c.add(b2); c.add(b3); c.add(b4);
    c.add(b5); c.add(b6); c.add(b7); c.add(b8); c.add(b9);
    c.add(b10); c.add(b11); c.add(b12); c.add(b13);

    // ���L�[�̐ݒ�B
    b12.setBackground(Color.green); // ���L�[�̔w�i�F��ݒ�B
    b12.setForeground(Color.white); // ���L�[�̑O�i�F��ݒ�B

    // �N���A�L�[�̐ݒ�B
    b13.setBackground(Color.red);   // �N���A�L�[�̔w�i�F��ݒ�B
    b13.setForeground(Color.white); // �N���A�L�[�̑O�i�F��ݒ�B
  }
}
</pre>

<pre>
<font size=5 color=blue>�g�s�l�k�t�@�C��</font><br>
<html>
<head>
  <title>���p�F�d��</title>
</head>
<body bgcolor=white text=black>
<applet code="z112a.class" width="200" height="250">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="z112a.class" width="200" height="250">
</applet>

</body>
</html>
