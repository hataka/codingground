<!--====================================================================-->
<!-- << z111b.htm >>                                                    -->
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
// << z111b.java >>
//
//  ���p�F�d��(Applet�N���X)
//
//�@�@�d��̃f�U�C���ɃC�x���g����(�L�[�̃N���b�N���ɃL�[�̕�����\������
//�@�@�\������)��ǉ��B
//
////////////////////////////////////////////////////////////////////////////////

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class z111b extends Applet implements ActionListener {

  Label lab;
  Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13;
  int x0,y0,w,h;

  public void init() {
 
    // ���C�A�E�g�}�l�[�W���̃f�B�t�H���g�ݒ�������B
    this.setLayout(null);

    // �A�v���b�g�̔w�i�F��ݒ�
    this.setBackground(Color.lightGray);

    // �p�����[�^�B
    x0 = 20; // �d��̍������x���W�B
    y0 = 20; // �d��̍������y���W�B
    w = 50;  // �����L�[�{�^���̕��B
    h = 30;  // �����L�[�{�^���̍����B

    // ���x���̍쐬�B
    lab = new Label("",Label.RIGHT);
    lab.setBackground(Color.yellow); // ���x���̔w�i�F��ݒ�B
    lab.setForeground(Color.black);  // ���x���̑O�i�F��ݒ�B

    // ���x���̔z�u�B
    lab.setBounds(x0,y0,3*w,h);
    this.add(lab);

    // �����L�[�A���Z�L�[�A���L�[�A�N���A�L�[�̍쐬�B
    b0 = new Button("�O");
    b1 = new Button("�P");
    b2 = new Button("�Q");
    b3 = new Button("�R");
    b4 = new Button("�S");
    b5 = new Button("�T");
    b6 = new Button("�U");
    b7 = new Button("�V");
    b8 = new Button("�W");
    b9 = new Button("�X");
    b10 = new Button("�{");
    b11 = new Button("�|");
    b12 = new Button("��");
    b13 = new Button("�b");

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
    this.add(b0); this.add(b1); this.add(b2); this.add(b3); this.add(b4);
    this.add(b5); this.add(b6); this.add(b7); this.add(b8); this.add(b9);
    this.add(b10); this.add(b11); this.add(b12); this.add(b13);

    // ���L�[�̐ݒ�B
    b12.setBackground(Color.green); // ���L�[�̔w�i�F��ݒ�B
    b12.setForeground(Color.white); // ���L�[�̑O�i�F��ݒ�B

    // �N���A�L�[�̐ݒ�B
    b13.setBackground(Color.red);   // �N���A�L�[�̔w�i�F��ݒ�B
    b13.setForeground(Color.white); // �N���A�L�[�̑O�i�F��ݒ�B

    // �C�x���g���X�i�̓o�^�B
    b0.addActionListener(this);
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b10.addActionListener(this);
    b11.addActionListener(this);
    b12.addActionListener(this);
    b13.addActionListener(this);
  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == b0 ) { lab.setText("�O"); }
    if( e.getSource() == b1 ) { lab.setText("�P"); }
    if( e.getSource() == b2 ) { lab.setText("�Q"); }
    if( e.getSource() == b3 ) { lab.setText("�R"); }
    if( e.getSource() == b4 ) { lab.setText("�S"); }
    if( e.getSource() == b5 ) { lab.setText("�T"); }
    if( e.getSource() == b6 ) { lab.setText("�U"); }
    if( e.getSource() == b7 ) { lab.setText("�V"); }
    if( e.getSource() == b8 ) { lab.setText("�W"); }
    if( e.getSource() == b9 ) { lab.setText("�X"); }
    if( e.getSource() == b10 ) { lab.setText("�{"); }
    if( e.getSource() == b11 ) { lab.setText("�|"); }
    if( e.getSource() == b12 ) { lab.setText("��"); }
    if( e.getSource() == b13 ) { lab.setText("�b"); }
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
<applet code="z111b.class" width="200" height="250">
</applet>
</body>
</html>
</pre>

<font size=5 color=blue>���s����</font><br>

<applet code="z111b.class" width="200" height="250">
</applet>

</body>
</html>
