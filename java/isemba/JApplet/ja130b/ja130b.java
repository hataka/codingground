//  -*- mode: java -*-  Time-stamp: <08/06/20(��) 16:50:15 hata>
/*================================================================
 * �v���O������: ja130b.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja130b.htm
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja130b.java >>
//
//  �i�`�����������i�Q�j�F���i�i���j���[�A�C�x���g�����j
//
//�@�@���j���[���ڂ́u�ԁv��I������ƁA�A�v���b�g�̔w�i�F���ԂɂȂ�B
//�@�@���j���[���ڂ́u�΁v��I������ƁA�A�v���b�g�̔w�i�F���΂ɂȂ�B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�FJMenuItem�N���X
//�@�@�C�x���g      �FActionEvent�N���X
//�@�@�C�x���g���X�i�FActionListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@actionPerformed���\�b�h
//
////////////////////////////////////////////////////////////////////////////////
// <applet codebase = "./" code="ja130b.class" width=800 height=600></applet>

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URL;

public class ja130b extends JApplet implements ActionListener {
  /**
	 *  @author kahata
	 */
	private static final long serialVersionUID = 1L;
  Container c;
  JMenuItem jm1,jm2;
//  JPanel pane;
//  private boolean inAnApplet = true;

  //Hack to avoid ugly message about system event access check.
    public ja130b() {
        this(true);
    }

    public ja130b(boolean inAnApplet) {
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }

  public void init() {

    // �R���e���c�y�C���̎擾�B
    c = this.getContentPane();
//    pane = new JPanel();

    // ���j���[�o�[�̍쐬�B
    JMenuBar jmb = new JMenuBar();
    // ���j���[�o�[(jmb)���A�v���b�g���ɒǉ��B 
    this.setJMenuBar(jmb);

    // ���j���[�̍쐬�B
    JMenu jm = new JMenu("�w�i�̐F");
    // ���j���[(jm)�����j���[�o�[(jmb)���ɒǉ��B
    jmb.add(jm); 

    // ���j���[���ڂ̍쐬�B
    jm1 = new JMenuItem("��");
    jm2 = new JMenuItem("��");
    // ���j���[����(jm1,jm2)�����j���[(jm)���ɒǉ��B
    jm.add(jm1);
    jm.add(jm2);

    // �C�x���g���X�i�̓o�^�B
    jm1.addActionListener(this);
    jm2.addActionListener(this);

//    Add Components to a JPanel, using the default FlowLayout. 
//     pane.setLayout(new GridLayout(2,1));
//    super.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
//    setContentPane(pane);
  }        

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void actionPerformed(ActionEvent e) {
    if(e.getSource() == jm1 ) { c.setBackground(Color.red); }
    if(e.getSource() == jm2 ) { c.setBackground(Color.green); }
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
        Frame frame = new Frame("Application: ja130b");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        ja130b applet = new ja130b(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setSize(300, 200);
        frame.setVisible(true);
        applet.start();
    }
}
