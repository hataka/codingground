// -*- mode: java -*- Time-stamp: <2009-06-18 12:53:26 kahata>
/*====================================================================
 * name: j716a.java 
 * created : Time-stamp: <09/06/18(��) 12:47:59 hata>
 * $Id$
 * To compile:
 * To run:
 * links:
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/NETWORK/j716a.htm
 * description:
 *================================================================*/
//////////////////////////////////////////////////////////////////////
// << j716a.java >>
//
//  �l�b�g���[�N�i�P�j�FWeb�y�[�W�̕\��
//
//�@�@JEditorPane�N���X���g���ƁAURL�Ŏw�肷��Web�y�[�W��\���ł���B
//
//�@��JEditorPane�N���X�̃R���X�g���N�^
//    public JEditorPane()
//      �@�\�F�G�f�B�^�y�C�����쐬����B
//
//�@��JEditorPane�N���X�̃��\�b�h
//    public void setPage(String url) throws IOException
//�@�@�@�@�\�Furl�ɂ���Ďw�肳�ꂽWeb�y�[�W��\������B
//
//�@��javax.swing.text.JTextComponent�N���X����p���������\�b�h
//    public void setEditable(boolean b)
//      �@�\�F�G�f�B�^�y�C�����ҏW�\���ǂ�����ݒ肷��B
//�@�@�@�@�@�@b��true�̏ꍇ�A�ҏW�\�Afalse�̏ꍇ�A�ҏW�s�B
//
//�@��JScrollPane�N���X
//    ���i�̃X�N���[���\�ȃr���[��񋟂���B
//
//�@��JScrollPane�̃R���X�g���N�^
//    public JScrollPane(Component comp)
//      �@�\�F���icomp��\������X�N���[���y�C�����쐬����B
//
//////////////////////////////////////////////////////////////////////

import java.io.*;
import java.awt.*;
import javax.swing.*;

class j716af extends JFrame {

  public j716af(String t) { // �R���X�g���N�^�B 
    super(t);

    // �R���e���c�y�C�����擾�B
    Container c = this.getContentPane();

    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout(10,10));

    // �G�f�B�^�y�C�����쐬���AWeb�y�[�W���܂܂���B
    JEditorPane ep = new JEditorPane();
    try {
//      ep.setPage("http://www.google.co.jp/");
      ep.setPage("http://localhost/java/isemba/NetWork/j716a/test.html");
      ep.setEditable(false);
    } catch( IOException e ) {
      System.out.println(e);
    }
    // �G�f�B�^�y�C����\������X�N���[���y�C���̍쐬�B
    JScrollPane sp = new JScrollPane(ep);

    // �G�f�B�^�y�C����\������X�N���[���y�C�����R���e���c�y�C�����ɒǉ��B
    c.add(sp,BorderLayout.CENTER);
  }
}

class j716a {
  public static void main(String[] args) {

    // �t���[���̍쐬�B
    j716af jf = new j716af("�t���[��");

    // �u����v�{�^�����N���b�N���ꂽ�Ƃ��A�v���O�������I������B
    jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // �t���[���̑傫���ݒ�B
    jf.setSize(800,600);

    // �t���[���̕\���B
    jf.setVisible(true);
  }
}
