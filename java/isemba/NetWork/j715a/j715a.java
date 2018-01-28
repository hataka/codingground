// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j715a.java 
 * created : Time-stamp: <09/07/03(��) 10:44:02 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVE/NETWORK/j715a.htm
 * description: Java �v���O���~���O(��b�Ɖ��p)  ��g��Y
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j715a.java >>
//
//  �l�b�g���[�N�i�P�j�FJEditorPane�N���X(�v���[���e�L�X�g�̕\���j
//
//�@�@JEditorPane�N���X�̊�{�I�ȋ@�\(�v���[���e�L�X�g�̕\��)�������B
//
//�@��JEditorPane�N���X
//    �v���[���e�L�X�g�AHTML�e�L�X�g�ARTF�e�L�X�g�̕\���E�ҏW���ł���N���X�B
//    �ERTF(Rich Text Format)
//    �@���[�h�p�b�h�œǂݏ������邱�Ƃ��ł��镶���`���ŁA�e�L�X�g�ȊO�ɁA
//�@�@�@�����̑傫����t�H���g�Ȃǂ̏�񂪖��ߍ��܂�Ă���B
//
//�@��JEditorPane�N���X�̃R���X�g���N�^
//    public JEditorPane(String type, String text)
//�@�@�@�@�\�F�R���e���c�^�C�vtype���w�肵�āA�e�L�X�gtext���܂ރG�f�B�^�y�C����
//�@�@�@�@�@�@�쐬����B
//�@�@�@�@�@�@plain/text�F�v���[���e�L�X�g
//�@�@�@�@�@�@text/html �FHTML�e�L�X�g
//�@�@�@�@�@�@text/rtf  �FRTF�e�L�X�g
//
//  ��JFrame�N���X
//    Frame�N���X�ƈقȂ�AJFrame�N���X�ɂ̓��[�U���E�B���h�E�����Ƃ���
//�@�@������w��ł���B�f�t�H���g�ł́A�t���[�����B���B
//�@�@�ύX����ɂ́AsetDefaultCloseOperation���\�b�h���g���B
//
//  ��JFrame�N���X�̃R���X�g���N�^
//    public JFrame(String s) throws HeadlessException
//      �@�\�F�^�C�g��s�ŁA�s���̃t���[�����쐬����B
//
//  ��JFrame�N���X�̃��\�b�h
//    public void setDefaultCloseOperation(int op)
//      �@�\�F�t���[�������Ƃ��̓���op��ݒ肷��B
//�@�@�@�@�@�@EXIT_ON_CLOSE�F�A�v���P�[�V�������I������B
//
//�@��java.awt.Component�N���X����p���������\�b�h
//    public void setSize(int w, int h)
//      �@�\�F���i�̃T�C�Y���A��w�A����h�ɕύX����B 
//    public void setVisible(boolean b)
//      �@�\�Fb��true�̏ꍇ�A���i��\���Afalse�̏ꍇ�A��\���ɂ���B 
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import javax.swing.*;

class j715af extends JFrame {

  public j715af(String t) { // �R���X�g���N�^�B 
    super(t);

    // �R���e���c�y�C�����擾�B
    Container c = this.getContentPane();

    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout(10,10));

    // �G�f�B�^�y�C�����쐬���A�v���[���e�L�X�g���܂܂���B
    String s1 = "0123456789";
    String s2 = "abcdefg\n";
    String s3 = "���{��";
    JEditorPane ep = new JEditorPane("plain/text",s1+s2+s3);
    // �G�f�B�^�y�C�����R���e���c�y�C�����ɒǉ��B
    c.add(ep,BorderLayout.CENTER);
  }
}

class j715a {
  public static void main(String[] args) {

    // �t���[���̍쐬�B
    j715af jf = new j715af("�t���[��");

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
% javac j715a.java
% java j715a
</pre>

<font size=5 color=blue>���s����</font>
<br><br>

���s����<br>
<img src="j715a.jpg" width=300 height=200>

</body>
</html>
*/
