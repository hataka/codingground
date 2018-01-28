// -*- mode: java -*- Time-stamp: <2009-07-03 11:53:37 kahata>
/*====================================================================
 * name: j716b.java 
 * created : Time-stamp: <09/07/03(��) 11:52:10 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/NETWORK/j716b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j716b.java >>
//
//  �l�b�g���[�N�i�P�j�FWeb�y�[�W�̕\��(�C�x���g����)
//
//�@�@JEditorPane�N���X���g���ƁAURL�Ŏw�肷��Web�y�[�W��\���ł���B
//
//�@��JEditorPane�N���X�̃��\�b�h
//    public final void setContentType(String type)
//      �@�@�\�F�R���e���c�^�C�vtype��ݒ肷��B
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class j716bf extends JFrame implements ActionListener {

  JEditorPane ep;
  JTextField tf;

  public j716bf(String t) { // �R���X�g���N�^�B 
    super(t);

    // �R���e���c�y�C�����擾�B
    Container c = this.getContentPane();
    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout());

    // ���x���̍쐬�B
    JLabel lab = new JLabel("URL");
    // �e�L�X�g�t�B�[���h�̍쐬�B 
    tf = new JTextField("http://",30);

    // �p�l���̍쐬�B
    JPanel p = new JPanel();
    // �p�l���̃��C�A�E�g�}�l�[�W����FlowLayout�ɐݒ�B
    p.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
    p.setBackground(Color.white);

    // ���x�����p�l�����ɒǉ��B
    p.add(lab);
    // �e�L�X�g�t�B�[���h���p�l�����ɒǉ��B
    p.add(tf);

    // �p�l�����R���e���c�y�C�����ɒǉ��B
    c.add(p,BorderLayout.NORTH);
    
    // �G�f�B�^�y�C���̍쐬�B
    ep = new JEditorPane();
    // �G�f�B�^�y�C����\������X�N���[���y�C���̍쐬�B
    JScrollPane sp = new JScrollPane(ep);

    // �G�f�B�^�y�C����\������X�N���[���y�C�����R���e���c�y�C�����ɒǉ��B
    c.add(sp,BorderLayout.CENTER);

    // �C�x���g���X�i�̓o�^�B
    tf.addActionListener(this);
  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h
  public void actionPerformed(ActionEvent ae) {
    if( ae.getSource() == tf ) {
      try {
        String url = tf.getText();
        ep.setPage(url);
        ep.setEditable(false);
      } catch( IOException e ) {
        System.out.println(e);
      }
    }
  }
}

class j716b {
  public static void main(String[] args) {

    // �t���[���̍쐬�B
    j716bf jf = new j716bf("�t���[��");

    // �u����v�{�^�����N���b�N���ꂽ�Ƃ��A�v���O�������I������B
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // �t���[���̑傫���ݒ�B
    jf.setSize(800,600);

    // �t���[���̕\���B
    jf.setVisible(true);
  }
}
/*
</pre>

<font size=5 color=blue>���s�菇</font><br>

<pre>
% javac j716b.java
% java j716b
</pre>

<font size=5 color=blue>���s����</font>
<br><br>

���s����<br>
<img src="j716b1.jpg" width=600 height=300>
<br><br>

URL�w���<br>
<img src="j716b2.jpg" width=600 height=300>

</body>
</html>
*/
