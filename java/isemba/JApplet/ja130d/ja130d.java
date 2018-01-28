//  -*- mode: java -*-  Time-stamp: <08/06/20(��) 17:19:50 hata>
/*================================================================
 * �v���O������: ja130d.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja130d.htm
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja130d.java >>
//
//  �i�`�����������i�Q�j�F���i�i���j���[�̊K�w�\���A�C�x���g�����j
//
//  �@���j���[�̊K�w�\���ƃC�x���g������g�ݍ��킹��B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�FJMenuItem�N���X
//�@�@�C�x���g      �FActionEvent�N���X
//�@�@�C�x���g���X�i�FActionListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@actionPerformed���\�b�h
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;
import java.net.URL;

public class ja130d extends JApplet implements ActionListener {
  /**
	 *  @author kahata
	 */
  private static final long serialVersionUID = 1L;
  Container c;
  JMenuItem jmi1,jmi2,jmi3;
//  JPanel pane;
//  private boolean inAnApplet = true;

  //Hack to avoid ugly message about system event access check.
    public ja130d() {
        this(true);
    }

    public ja130d(boolean inAnApplet) {
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }

  public void init() {

    // �A�v���b�g�̃R���e���c�y�C�����擾�B
    c = this.getContentPane();

    // ���j���[�o�[jmb�̍쐬�B
    JMenuBar jmb = new JMenuBar(); 
    // ���j���[�o�[jmb���A�v���b�g���ɒǉ��B
    this.setJMenuBar(jmb); 

    // ���j���[jm�̍쐬�B
    JMenu jm = new JMenu("���j���["); 
    // ���j���[jm�����j���[�o�[jmb���ɒǉ��B
    jmb.add(jm); 

    // ���j���[jm�Ɋ܂܂�郁�j���[jm0,jm1�̍쐬�B
    JMenu jm0 = new JMenu("���ڂȂ�"); 
    JMenu jm1 = new JMenu("���ڂ���"); 
    // ���j���[jm0�����j���[jm���ɒǉ��B
    jm.add(jm0); 
    // �Z�p���[�^�����j���[jm���ɒǉ��B
    jm.addSeparator(); 
    // ���j���[jm1�����j���[jm���ɒǉ��B
    jm.add(jm1); 

    // ���j���[����jmi1,jmi2,jmi3�̍쐬�B
    jmi1 = new JMenuItem("��"); 
    jmi2 = new JMenuItem("��"); 
    jmi3 = new JMenuItem("��"); 
    // ���j���[����jmi1,jmi2,jmi3�����j���[jm1���ɒǉ��B
    jm1.add(jmi1);  
    jm1.add(jmi2); 
    jm1.add(jmi3); 

    // �C�x���g���X�i�̓o�^�B
    jmi1.addActionListener(this);
    jmi2.addActionListener(this);
    jmi3.addActionListener(this);
//    Add Components to a JPanel, using the default FlowLayout. 
//     pane.setLayout(new GridLayout(2,1));
//    super.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
//    setContentPane(pane);
  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == jmi1 ) { c.setBackground(Color.red); }
    if( e.getSource() == jmi2 ) { c.setBackground(Color.yellow); }
    if( e.getSource() == jmi3 ) { c.setBackground(Color.blue); }
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
        Frame frame = new Frame("Application: ja130d");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        ja130d applet = new ja130d(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setSize(300, 200);
        frame.setVisible(true);
        applet.start();
    }
}
