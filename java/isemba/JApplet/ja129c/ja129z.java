// -*- mode: java -*- Time-stamp: <2009-06-19 13:31:33 kahata>
/*====================================================================
 * name: ja129c.java 
 * created : Time-stamp: <09/06/19(��) 13:29:27 hata>
 * $Id: ja129c.java,v 1.2 2009/06/19 04:31:42 kazuhiko Exp kazuhiko $
 * Programmed by kahata
 * To compile:
 * To run:
 * links: 
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja129c.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << ja129c.java >>
//
//  �i�`�����������i�Q�j�F���i�i�p�l���A�����̐F�j
//
//�@�@�F�̐ݒ��\���ɂ́AColor�N���X���g���B
//
//�@��Color�N���X
//�@�@�F�̃f�[�^�⑀�삪��`����Ă���N���X�B
//
//�@��Color�N���X�̃R���X�g���N�^
//    public Color(int r, int g, int b)
//      �@�\�F�F�̐����B
//      r   �F�Ԃ̐����̋���(0-255)
//      g   �F�΂̐����̋���(0-255)
//      b   �F�̐����̋���(0-255)
//
//�@�@�EColor�N���X�ɗp�ӂ���Ă���F
//�@�@�@magenta�F�Â����F�@�@ �@black�F���@�@white�F��     yellow�F��
//�@�@�@darkGray�F�Â��D�F�@�@�@gray�F�D�F   cyan�F��F�@  blue�F�@
//�@�@�@lightGray�F���邢�D�F �@red�F�ԁ@�@  orange�F��@�@green�F�΁@
//�@�@�@pink�F���邢���F        
//
//�@��Graphics�N���X�̃��\�b�h   
//    public abstract void setFont(Font font)
//  �@  �@�\�F�ȍ~�ɕ\������O���t�B�b�N�X�̃t�H���g��font�ɐݒ�B
//
/////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;
import java.awt.event.*; 
import javax.swing.event.*;
import java.net.URL;

public class ja129c extends JApplet {
  JPanel pane;

  private boolean inAnApplet = true;

    //Hack to avoid ugly message about system event access check.
    public ja129c() {
        this(true);
    }

    public ja129c(boolean inAnApplet) {
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
    	ja129cp p = new ja129cp();
    	p.setBackground(Color.lightGray);
    	p.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
 
    	// �p�l�����R���e���c�y�C�����ɒǉ��B
    	c.add(p,BorderLayout.CENTER);

	//    �����N���X�g�p�̂��ߎ��O��
//    Add Components to a JPanel, using the default FlowLayout. 
//    pane.add(p,BorderLayout.CENTER);
//    pane.setBackground(new Color(255,255,204));
//    pane.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
//    setContentPane(pane);
  }

  // �p�l���̒�`(�����N���X)�B
  class ja129cp extends JPanel {
    public void paintComponent(Graphics g) {                       
      super.paintComponent(g);                                     
      g.setFont(new Font("Serif",Font.BOLD,48));         
      g.setColor(new Color(255,0,0)); // �F��Ԃɐݒ�B  
      g.drawString("��",50,50);                          
      g.setColor(Color.blue); // �F��ɐݒ�B          
      g.drawString("��",50,100);                         
      g.setColor(Color.yellow); // �F�����ɐݒ�B        
      g.drawString("��",50,150);                         
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
        JFrame frame = new JFrame("Application: ja129c");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ja129c applet = new ja129c(false);
        applet.init();

        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
    	frame.setBounds(100, 100, 640, 480);
        frame.setVisible(true);
    }
}
