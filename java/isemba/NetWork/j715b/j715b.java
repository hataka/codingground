// -*- mode: java -*- Time-stamp: <2009-07-03 11:43:15 kahata>
/*====================================================================
 * name: j715b.java 
 * created : Time-stamp: <09/07/03(��) 11:41:30 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/NETWORK/j715b.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j715b.java >>
//
//  �l�b�g���[�N�i�P�j�FJEditorPane�N���X(HTML�e�L�X�g�̕\���j
//
//�@�@JEditorPane�N���X�̊�{�I�ȋ@�\(HTML�e�L�X�g�̕\��)�������B
//
//�@��JEditorPane�N���X�̃R���X�g���N�^
//    public JEditorPane(String type, String text)
//�@�@�@�@�\�F�R���e���c�^�C�vtype���w�肵�āA�e�L�X�gtext���܂ރG�f�B�^�y�C����
//�@�@�@�@�@�@�쐬����B
//�@�@�@�@�@�@plain/text�F�v���[���e�L�X�g
//�@�@�@�@�@�@text/html �FHTML�e�L�X�g
//�@�@�@�@�@�@text/rtf  �FRTF�e�L�X�g
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import javax.swing.*;

class j715bf extends JFrame {

  public j715bf(String t) { // �R���X�g���N�^�B 
    super(t);

    // �R���e���c�y�C�����擾�B
    Container c = this.getContentPane();

    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout(10,10));

    // �G�f�B�^�y�C�����쐬���AHTML�e�L�X�g���܂܂���B
    String s1 = "<html>";
    String s2 = "<head><title>HTML�e�L�X�g</title></head>";
    String s3 = "<body><font size=7 color=red>���{��</font></body>";
    String s4 = "</html>";
    JEditorPane ep = new JEditorPane("text/html",s1+s2+s3+s4);
    // �G�f�B�^�y�C�����R���e���c�y�C�����ɒǉ��B
    c.add(ep,BorderLayout.CENTER);
  }
}

class j715b {
  public static void main(String[] args) {

    // �t���[���̍쐬�B
    j715bf jf = new j715bf("�t���[��");

    // �u����v�{�^�����N���b�N���ꂽ�Ƃ��A�v���O�������I������B
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // �t���[���̑傫���ݒ�B
    jf.setSize(300,200);

    // �t���[���̕\���B
    jf.setVisible(true);
  }
}
/*
</pre>

<font size=5 color=blue>���s�菇</font><br>

<pre>
% javac j715b.java
% java j715b
</pre>

<font size=5 color=blue>���s����</font>
<br><br>

���s����<br>
<img src="j715b.jpg" width=300 height=200>

</body>
</html>
*/
