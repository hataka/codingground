//  -*- mode: java -*-  Time-stamp: <08/06/19(��) 13:58:18 hata>
/*================================================================
 * �v���O������: ja124.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja24.htm
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja124.java >>
//
//  �i�`�����������i�Q�j�F���i�i�`�F�b�N�{�b�N�X�A�z�u�A�C�x���g�����j
//
//�@�@�u�ԁv���ڂ��`�F�b�N����ƁA���x���̔w�i�F���ԂɂȂ�B
//�@�@�u���v���ڂ��`�F�b�N����ƁA���x���̔w�i�F�����ɂȂ�B
//�@�@�u�v���ڂ��`�F�b�N����ƁA���x���̔w�i�F���ɂȂ�B
//�@�@ �����̍��ڂ�I���ł���B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�FJCheckBox�N���X
//�@�@�C�x���g      �FActionEvent�N���X
//�@�@�C�x���g���X�i�FActionListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@actionPerformed���\�b�h
//
//  ��JCheckBox�N���X
//    �������ڂ̒����畡���̑I��������Ƃ��AJCheckBox�N���X���g���B
//
//  ��JCheckBox�N���X�̃R���X�g���N�^
//    JCheckBox(String s, boolean b)                       
//      �@�\�F������s�����ڂɉ�����Bb��true�̂Ƃ��`�F�b�N����Ă����ԁA
//�@�@�@�@�@�@false�̂Ƃ��`�F�b�N����Ă��Ȃ���Ԃɐݒ肳���B
//
//  ��JCheckBox�N���X�̃��\�b�h
//    boolean isSelected()                       
//      �@�\�F�`�F�b�N��Ԃ�Ԃ��Btrue�܂���false�B
//    void setSelected(boolean b)                       
//      �@�\�F�`�F�b�N�{�b�N�X��b�ɐݒ肷��B
//
////////////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
/*
<applet code="ja124.class" width="640" height="480">
</applet>
*/

public class ja124 extends JApplet implements ActionListener {

  Container c;
  JCheckBox c1,c2,c3;
  JLabel lab1,lab2,lab3;

    private boolean inAnApplet = true;
//    private boolean inAnApplet = false;

    //Hack to avoid ugly message about system event access check.
    public ja124() {
        this(true);
    }

    public ja124(boolean inAnApplet) {


        this.inAnApplet = inAnApplet;
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }
  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    c = this.getContentPane();

    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����GridLayout�ɐݒ�B
    c.setLayout(new GridLayout(2,3,10,10));

    // �`�F�b�N�{�b�N�X�{�^���̍쐬�B
    c1 = new JCheckBox("��");
    c2 = new JCheckBox("��");
    c3 = new JCheckBox("��");
    // �`�F�b�N�{�b�N�X�{�^�����R���e���c�y�C���ɒǉ��B
    c.add(c1);
    c.add(c2);
    c.add(c3);

    // ���x���̍쐬�B
    lab1 = new JLabel("���x���P");
    lab2 = new JLabel("���x���Q");
    lab3 = new JLabel("���x���R");
    // ���x�����R���e���c�y�C���ɒǉ��B
    c.add(lab1);
    c.add(lab2);
    c.add(lab3);

    // �C�x���g���X�i�̓o�^�B
    c1.addActionListener(this);
    c2.addActionListener(this);
    c3.addActionListener(this);

    //Add Components to a JPanel, using the default FlowLayout. 
    JPanel pane = new JPanel();
    pane.setLayout(new GridLayout(2,3,10,10));
    pane.add(c1);
    pane.add(c2);
    pane.add(c3);
    pane.add(lab1);
    pane.add(lab2);
    pane.add(lab3);
    pane.setBackground(new Color(255,255,204));
    pane.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));

    setContentPane(pane);
  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void actionPerformed(ActionEvent e) {
    if( c1.isSelected() ) { 
      lab1.setBackground(Color.red); lab1.setOpaque(true);
    } else {
      lab1.setBackground(Color.lightGray); lab1.setOpaque(true);
    }
    if( c2.isSelected() ) { 
      lab2.setBackground(Color.blue); lab2.setOpaque(true);
    } else {
      lab2.setBackground(Color.lightGray); lab2.setOpaque(true);
    }
    if( c3.isSelected() ) { 
      lab3.setBackground(Color.yellow); lab3.setOpaque(true);
    } else {
      lab3.setBackground(Color.lightGray); lab3.setOpaque(true);
    }
  }

    /* One day, JApplet will make this method obsolete. */
    protected URL getURL(String filename) {
        URL codeBase = getCodeBase();
        URL url = null;

        try {
            url = new URL(codeBase, filename);
        } catch (java.net.MalformedURLException e) {
            System.out.println("Couldn't create image: badly specified URL");
            return null;
        }

        return url;
    }

	 protected URL getURL(URL codeBase, String filename) {
        URL url = null;
        try {
            url = new URL(codeBase, filename);
        } catch (java.net.MalformedURLException e) {
            System.out.println("Couldn't create image: badly specified URL");
            return null;
        }
        return url;
   }

    public static void main(String[] args) {
        Frame frame = new Frame("Application: ja124");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        ja124 applet = new ja124(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
