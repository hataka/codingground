//  -*- mode: java -*-  Time-stamp: <2008-09-22 08:25:01 kahata>
/*================================================================
 * �v���O������: ja129d.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja129d.htm
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja129d.java >>
//
//  �i�`�����������i�Q�j�F���i�i�p�l���A���̕`��j
//
//      �������g���Đ}�`��`���B
//
//  ��Graphics�N���X�̃��\�b�h
//    public abstract void drawLine(int x0, int y0, int x1, int y1)
//      �@�\�F�_(x0,y0)��(x1,y1)�𒼐��Ō��ԁB
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
import java.net.URL;

public class ja129d extends JApplet {
  JPanel pane;

  private boolean inAnApplet = true;

    //Hack to avoid ugly message about system event access check.
    public ja129d() {
        this(true);
    }

    public ja129d(boolean inAnApplet) {
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
    c.setLayout(new BorderLayout(0,0));

    // �p�l���̍쐬�B
    ja129dp p = new ja129dp();
    p.setBackground(Color.yellow);
    p.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));

    // �p�l�����R���e���c�y�C�����ɒǉ��B
    c.add(p,BorderLayout.CENTER);

//    �����N���X�g�p�̂��ߎ��O��
//    Add Components to a JPanel, using the default FlowLayout.
//    pane.add(p,BorderLayout.CENTER);
//    pane.setBackground(new Color(255,255,204));
//    pane.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
//    setContentPane(pane);
 	resize(800,600);
  }

  // �p�l���̒�`(�����N���X)�B
  class ja129dp extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      int x0,y0,x1,y1,rx,ry;
      x0 = 40; y0 = 40; x1 = x0; y1 = y0; rx = 150; ry = 100;
      for( int i=0; i<=31; i++ ) {
        if( i%4 == 0 ) { x1 = x0 + rx; rx = (int)(0.9*rx); }
        if( i%4 == 1 ) { y1 = y0 + ry; ry = (int)(0.9*ry); }
        if( i%4 == 2 ) { x1 = x0 - rx; rx = (int)(0.9*rx); }
        if( i%4 == 3 ) { y1 = y0 - ry; ry = (int)(0.9*ry); }
        g.drawLine(x0,y0,x1,y1);
        x0 = x1; y0 = y1;
      }
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
        Frame frame = new Frame("Application: ja129d");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        ja129d applet = new ja129d(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
 		frame.setSize(250,220);
        frame.setVisible(true);
    }
}
