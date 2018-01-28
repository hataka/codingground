//  -*- mode: java -*-  Time-stamp: <08/07/16(��) 15:54:01 hata>
/*================================================================
 * �v���O������: ja135c.java
  * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja135c.java >>
//
//  �i�`�����������i�Q�j�F���i�i�X�v���b�g�y�C���A�z�u�j
//
//�@�@�\���̈�S�̂��㉺�ɂQ�����A�㕔�����E�ɂQ��������B
//
//�@��JSplitPane�N���X�̃R���X�g���N�^
//    public JSplitPane(int d, Component c1, Component c2)
//    �@�@�\�Fd�Ő����܂��͐��������̉�ʕ������w�肷��B
//    �@�@�@  �@HORIZONTAL_SPLIT  ���������i���E�j�ɕ����B
//    �@�@�@  �@VERTICAL_SPLIT    ���������i�㉺�j�ɕ����B
//�@�@�@�@�@�@c1�͍�(��)�Ɋ��蓖�Ă��镔�i�B
//�@�@�@�@�@�@c2�͉E(��)�Ɋ��蓖�Ă��镔�i�B
//
//�@��JSplitPane�N���X�̃��\�b�h
//    void setOneTouchExpandable(boolean b)
//    �@�@�\�Ftrue�̏ꍇ�A�����^�b�`�g���@�\���L���ɂȂ�B
//
////////////////////////////////////////////////////////////////////////////////
//<applet code="ja135c.class" width="300" height="200"></applet>
import java.awt.*; 
import javax.swing.*;

public class ja135c extends JApplet {

  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();
    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W���[��BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout());

    // �U�̃{�^�����쐬�B
    JButton b1 = new JButton("�{�^���P");
    JButton b2 = new JButton("�{�^���Q");
    JButton b3 = new JButton("�{�^���R");
    JButton b4 = new JButton("�{�^���S");
    JButton b5 = new JButton("�{�^���T");
    JButton b6 = new JButton("�{�^���U");

    // ���E�ɕ����B
    JSplitPane sp1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
    // �A���X�V�@�\��ݒ�B
    sp1.setContinuousLayout(true);
    // �����Ƀ{�^��b1�����蓖�Ă�B
    sp1.setLeftComponent(b1);
    // �E���Ƀ{�^��b2,b3�����蓖�Ă�B
    JPanel p1 = new JPanel();
    p1.add(b2);
    p1.add(b3);
    sp1.setRightComponent(p1);

    // �㉺�ɕ����B
    JSplitPane sp2 = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
    // �����^�b�`�g���@�\��ݒ�B
    sp2.setOneTouchExpandable(true);
    // �㕔�ɃX�v���b�g�y�C��sp1�����蓖�Ă�B
    sp2.setLeftComponent(sp1);
    // �����Ƀ{�^��b4,b5,b6�����蓖�Ă�B
    JPanel p2 = new JPanel();
    p2.add(b4);
    p2.add(b5);
    p2.add(b6);
    sp2.setRightComponent(p2);
    
    // �X�v���b�g�y�C�����R���e���c�y�C�����ɒǉ��B
    c.add(sp2,BorderLayout.CENTER);
  }
}
