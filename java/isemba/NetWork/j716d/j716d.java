// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j716d.java 
 * created : Time-stamp: <09/07/03(��) 12:48:50 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/NETWORK/j716d.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j716d.java >>
//
//  �l�b�g���[�N�i�P�j�FWeb�y�[�W�̕\��(�C�x���g����)
//
//�@�@JEditorPane�N���X���g���ƁAURL�Ŏw�肷��Web�y�[�W��\���ł���B
//�@�@�ߋ��ɂ��ǂ��������N���L�����Ă����A�߂�{�^���őO�̃����N�ɖ߂�B
//
//�@��HyperlinkEvent�N���X
//    �����N�Ɋւ��Ĕ��������C�x���g���A�֌W����I�u�W�F�N�g�ɒʒm���邽�߂Ɏg���B
//
//�@��HyperlinkEvent�N���X�̃��\�b�h
//    public HyperlinkEvent.EventType getEventType()
//�@�@�@�@�\�F�C�x���g�̃^�C�v���擾����B
//    public URL getURL()
//      �@�\�F�����N�̎Q�Ɛ��URL���擾����B 
//
//�@��HyperlinkEvent.EventType�N���X
//�@�@�C�x���g�^(ENTERED, EXITED, ACTIVATED)���`����B
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class j716df extends JFrame implements ActionListener, HyperlinkListener {

  JEditorPane ep;
  JTextField tf;
  JButton b;
  String a[] = new String[100]; // URL��ۑ�����z��B
  int k = 0;

  public j716df(String t) { // �R���X�g���N�^�B 
    super(t);

    // �R���e���c�y�C�����擾�B
    Container c = this.getContentPane();
    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout());

    // ���x���̍쐬�B
    JLabel lab = new JLabel("URL");
    // �e�L�X�g�t�B�[���h�̍쐬�B 
    tf = new JTextField("http://",30);
    // �߂�{�^���̍쐬�B 
    b = new JButton("�߂�");

    // �p�l���̍쐬�B
    JPanel p = new JPanel();
    // �p�l���̃��C�A�E�g�}�l�[�W����FlowLayout�ɐݒ�B
    p.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
    p.setBackground(Color.white);

    // ���x�����p�l�����ɒǉ��B
    p.add(lab);
    // �e�L�X�g�t�B�[���h���p�l�����ɒǉ��B
    p.add(tf);
    // �߂�{�^�����p�l�����ɒǉ��B
    p.add(b);

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
    ep.addHyperlinkListener(this);
    b.addActionListener(this);
  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h
  public void actionPerformed(ActionEvent ae) {
    if( ae.getSource() == tf ) {
      try {
        String url = tf.getText();
        k++; a[k] = url;
        ep.setPage(url);
        ep.setEditable(false);
      } catch( IOException e ) {
        System.out.println(e);
      }
    }
    if( ae.getSource() == b ) {
      String url;
      if( k > 1 ) { 
        url = a[k-1]; k--;
      } else {
        url = a[1];
      } 
      tf.setText(url);
      try {
        ep.setPage(url);
      } catch( IOException e ) {
        System.out.println(e);
      }
    }
  }

  // HyperlinkListener�C���^�[�t�F�[�X�̃��\�b�h
  public void hyperlinkUpdate(HyperlinkEvent he) {
    if( he.getEventType() != HyperlinkEvent.EventType.ACTIVATED ) return;
    String url = he.getURL().toString();
    tf.setText(url);
    k++; a[k] = url;
    try { 
      ep.setPage(url);
    } catch( IOException e ) {
      System.out.println(e);
    }
  }
}

class j716d {
  public static void main(String[] args) {

    // �t���[���̍쐬�B
    j716df jf = new j716df("�t���[��");

    // �u����v�{�^�����N���b�N���ꂽ�Ƃ��A�v���O�������I������B
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // �t���[���̑傫���ݒ�B
    jf.setSize(600,300);

    // �t���[���̕\���B
    jf.setVisible(true);
  }
}
/*
</pre>

<font size=5 color=blue>���s�菇</font><br>

<pre>
% javac j716d.java
% java j716d
</pre>

<font size=5 color=blue>���s����</font>
<br><br>

���s����<br>
<img src="j716d1.jpg" width=600 height=280>
<br><br>

URL�w���<br>
<img src="j716d2.jpg" width=600 height=280>
<br><br>

�����N�w���<br>
<img src="j716d3.jpg" width=600 height=280>
<br><br>

�߂�{�^���N���b�N��<br>
<img src="j716d4.jpg" width=600 height=280>

</body>
</html>
*/
