//  -*- mode: java -*-  Time-stamp: <08/06/19(��) 20:29:01 hata>
/*================================================================
 * �v���O������: ja129a.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja129a.htm
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja129a.java >>
//
//  �i�`�����������i�Q�j�F���i�i�p�l���A�����̕`��j
//
//�@�@������}�`�̕`��́A�p�l���Ƃ����R���|�[�l���g�ɍs���B
//�@�@�p�l���́A�R���e���c�y�C���ɒǉ������B
//�@�@�p�l���̓R���e�i�ł���A������}�`��`��ł���R���|�[�l���g�ł�����B
//
//  ��JPanel�N���X
//    ���i���O���[�v�������āA�e�O���[�v���ƂɈقȂ郌�C�A�E�g�}�l�[�W���[��
//�@�@�w�肷��Ƃ��AJPanel�N���X���g����B
//    �f�B�t�H���g���C�A�E�g�}�l�[�W���[�́AFlowLayout�ł���B
//
//�@��JComponent�N���X�̃��\�b�h
//�@�@void paintComponent(Graphics g)
//    �@�@�\�F���̃��\�b�h���I�[�o�[���C�h���āA�`�揈���������B
//            �e�N���X�ɑ΂��āAsuper.paintComponent() �����s����K�v������B
//
////////////////////////////////////////////////////////////////////////////////
//<applet code="ja129a.class" width="640" height="480"></applet>
import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import java.net.URL;

public class ja129a extends JApplet {
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JPanel pane;

  //Hack to avoid ugly message about system event access check.
    public ja129a() {
        this(true);
    }

    public ja129a(boolean inAnApplet) {
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
    c.setLayout(new BorderLayout());

    // �p�l���̍쐬�B
    ja129ap p = new ja129ap();
    p.setBackground(Color.yellow);
 
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
  class ja129ap extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
      super.paintComponent(g);
      g.drawString("����ɂ���",50,50);
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
//      Frame frame = new Frame("Application: ja129a");
        JFrame frame = new JFrame("Application: ja129a");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
/*
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
*/
        ja129a applet = new ja129a(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
    	frame.setBounds(100, 100, 400,280);
        frame.setVisible(true);
    }
}
