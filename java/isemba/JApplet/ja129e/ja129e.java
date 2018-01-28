//  -*- mode: java -*-  Time-stamp: <08/06/19(��) 21:51:15 hata>
/*================================================================
 * �v���O������: ja129e.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja129e.htm
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja129e.java >>
//
//  �i�`�����������i�Q�j�F���i�i�p�l���A�C�x���g�����j
//
//�@�@�p�l���̔w�i�F�������_���ɕω�������B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�FTimer�N���X
//�@�@�C�x���g      �FActionEvent�N���X
//�@�@�C�x���g���X�i�FActionListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@actionPerformed���\�b�h
//
//�@��javax.swing.Timer�N���X
//    1 �ȏ�̃A�N�V�����C�x���g���A�w�肳�ꂽ�x�����Ԃ̌o�ߌ��
//�@�@�C�x���g���X�i�ɒʒm����B
//
//�@��javax.swing.Timer�N���X�̃R���X�g���N�^
//    public Timer(int delay,  ActionListener listener)
//�@�@�@�@�\�Fdelay(�~���b�P��)���ƂɃ��X�i�[�֒ʒm����Timer �𐶐�����B
//
//�@��javax.swing.Timer�N���X�̃��\�b�h
//    public void start()
//      �@�\�FTimer ���N�����A���X�i�[�ւ̃A�N�V�����C�x���g�̑��M���J�n����B
//    public void stop()
//�@�@�@�@�\�FTimer ���~���A���X�i�[�ւ̃A�N�V�����C�x���g�̑��M���~����B
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import javax.swing.event.*;
import java.net.URL;

public class ja129e extends JApplet implements ActionListener {
  JPanel p;
  Timer timer;
  JPanel pane;

  private boolean inAnApplet = true;

    //Hack to avoid ugly message about system event access check.
    public ja129e() {
        this(true);
    }

    public ja129e(boolean inAnApplet) {
        this.inAnApplet = inAnApplet;
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }

  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();

    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout(20,20));

    // �p�l���̍쐬�B
    p = new JPanel();
    p.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
 
    // �p�l�����R���e���c�y�C�����ɒǉ��B
    c.add(p,BorderLayout.CENTER);

    // �^�C�}�[�̍쐬�B
    timer = new Timer(2000, this);

//    �����N���X�g�p�̂��ߎ��O��
//    Add Components to a JPanel, using the default FlowLayout. 
//    pane.add(p,BorderLayout.CENTER);
//    pane.setBackground(new Color(255,255,204));
//    pane.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
//    setContentPane(pane);
  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void actionPerformed(ActionEvent e) {
    Color color = new Color((int)(Math.random()*256),
                            (int)(Math.random()*256),
                            (int)(Math.random()*256));
    p.setBackground(color);
  }

  public void start() {
    timer.start();
  }

  public void stop() {
    timer.stop();
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
        Frame frame = new Frame("Application: ja129e");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        ja129e applet = new ja129e(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
