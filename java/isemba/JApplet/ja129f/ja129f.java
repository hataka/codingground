//  -*- mode: java -*-  Time-stamp: <08/06/20(��) 04:21:57 hata>
/*================================================================
 * �v���O������: ja129f.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja129f.htm
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja129f.java >>
//
//  �i�`�����������i�Q�j�F���i�i�p�l���A�C�x���g�����j
//
//�@�@��������ړ�����B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�FTimer�N���X
//�@�@�C�x���g      �FActionEvent�N���X
//�@�@�C�x���g���X�i�FActionListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@actionPerformed���\�b�h
//
////////////////////////////////////////////////////////////////////////////////
/* <applet code="ja129f.class" width="640" height="480"></applet> */

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import java.net.URL;

public class ja129f extends JApplet implements ActionListener {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

  j129fp p;
  Timer timer;
  int x,y;
  Dimension d;
  String str="JAVA�A�v���b�g";
  Font f;
 JPanel pane;

  //Hack to avoid ugly message about system event access check.
    public ja129f() {
        this(true);
    }

    public ja129f(boolean inAnApplet) {
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }


  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();
//    pane = new JPanel();

    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout(20,20));

    // �p�l���̍쐬�B
    p = new j129fp();
    p.setBackground(Color.yellow);
 
    // �p�l�����R���e���c�y�C�����ɒǉ��B
    c.add(p,BorderLayout.CENTER);

    // �^�C�}�[�̍쐬�B
    timer = new Timer(500, this);         

    // �A�v���b�g�̑傫���̎擾�B
    d = this.getSize();
    x = d.width;
    y = d.height/2;

    // �����̃t�H���g�A�X�^�C���A�傫����ݒ�B
    f = new Font("Serif",Font.BOLD,30);

//    �����N���X�g�p�̂��ߎ��O��
//    Add Components to a JPanel, using the default FlowLayout. 
//    pane.add(p,BorderLayout.CENTER);
//    pane.setBackground(new Color(255,255,204));
//    pane.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
//    setContentPane(pane);
  }

  // �p�l���̍쐬(�����N���X)�B
  class j129fp extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    public void paintComponent(Graphics g) {
      super.paintComponent(g);    
      x = x - 5;
      if( x < 0 ) { x = d.width; }
      g.setFont(f);
      g.setColor(Color.black);
      g.drawString(str,x,y);
    }
  } 

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void actionPerformed(ActionEvent e) {
    repaint();
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
        Frame frame = new Frame("Application: ja129f");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        ja129f applet = new ja129f(false);
        applet.init();
//        applet.start();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        applet.start();
    }
}
