//  -*- mode: java -*-  Time-stamp: <08/06/20(��) 08:21:18 hata>
/*================================================================
 * �v���O������: ja129h.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja129h.htm
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja129h.java >>
//
//  �i�`�����������i�Q�j�F���i�i�p�l���A�C�x���g�����A�^�C�}�[�j
//
//�@�@�^�C�}�[���쐬����B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�FTimer�N���X
//�@�@�C�x���g      �FActionEvent�N���X
//�@�@�C�x���g���X�i�FActionListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@actionPerformed���\�b�h
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;

public class ja129h extends JApplet implements ActionListener {
  /**
	 *  @author kahata
	 */
	private static final long serialVersionUID = 1L;

  JButton b1,b2,b3;
  JLabel lab;
  boolean running = false;
  int n = 0;
  Timer timer = new Timer(1000,this);
  JPanel pane;
//  private boolean inAnApplet = true;

  //Hack to avoid ugly message about system event access check.
    public ja129h() {
        this(true);
    }

    public ja129h(boolean inAnApplet) {
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }

  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();
    pane = new JPanel();
    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����GridLayout�ɐݒ�B
    c.setLayout(new GridLayout(2,1));

    // �{�^���ƃ��x���ƃp�l���̍쐬�B
    b1 = new JButton("�N��");
    b2 = new JButton("��~");
    b3 = new JButton("���Z�b�g");
    lab = new JLabel();
    JPanel p = new JPanel();
    // �{�^�����p�l�����ɒǉ��B
    p.add(b1);
    p.add(b2);
    p.add(b3);
    // �p�l���ƃ��x�����R���e���c�y�C�����ɒǉ��B
    c.add(p);
    c.add(lab);

    // �C�x���g���X�i�̓o�^�B
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);

    // �����̃t�H���g�A�傫����ݒ�B
    Font f = new Font("Serif", Font.BOLD, 40); 
    lab.setFont(f);        

//    Add Components to a JPanel, using the default FlowLayout. 
    pane.setLayout(new GridLayout(2,1));
    pane.add(p);
    pane.add(lab);
    pane.setBackground(new Color(255,255,204));
    pane.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
    setContentPane(pane);
  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B            
  public void actionPerformed(ActionEvent e) {             
    if( running ) {
      n++; lab.setText("�^�C�}�[�F " + n);   
    }                     
    if( e.getSource() == b1 ) { running = true; }      
    if( e.getSource() == b2 ) { running = false; }        
    if( e.getSource() == b3 ) { 
      n = 0; lab.setText("�^�C�}�[�F " + n); 
      running = true;
    }        
  }

  public void start() { timer.start(); }

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
        Frame frame = new Frame("Application: ja129h");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        ja129h applet = new ja129h(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setSize(300, 130);
        frame.setVisible(true);
        applet.start();
    }
}
