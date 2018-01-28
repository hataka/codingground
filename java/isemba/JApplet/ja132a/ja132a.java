// -*- mode: java -*- Time-stamp: <2009-06-19 17:19:59 kahata>
/*====================================================================
 * name: ja132a.java 
 * created : Time-stamp: <09/06/19(��) 17:19:26 hata>
 * $Id: ja132a.java,v 1.2 2009/06/19 08:23:30 kazuhiko Exp kazuhiko $
 * Programmed by kahata
 * To compile:
 * To run: ja132.java geshi�\���s����聨ja132a.java�ɖ��O�ύX
 * links: http://localhost/wiki/ 
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja132a.htm
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja132a.java >>
//
//  �i�`�����������i�Q�j�F���i�i�c�[���o�[�A�c�[���`�b�v�A�C�x���g�����j
//
//�@������
//�@�@�c�[���o�[�i�����̃{�^�����܂ރo�[�j�̓A�v���b�g�̔C�ӂ̏ꏊ�Ɉړ��ł���B
//�@�@�c�[���`�b�v���g���ƁA�J�[�\�������i�̏�ɒu�����Ƃ������A�w�肳�ꂽ
//�@�@�����񂪕\�������B���i�̊Ȗ��Ȑ����Ɏg����B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�F�}�E�X����
//�@�@�C�x���g�@�@�@�FActionEvent�N���X
//�@�@�C�x���g���X�i�FActionListener�C���^�[�t�F�[�X
//                    actionPerformed���\�b�h
//
//�@��JToolBar�N���X
//    �c�[���o�[�𐶐�����N���X�B
//
//�@��JToolBar�N���X�̃R���X�g���N�^
//�@�@public JToolBar()
//      �@�\�F�c�[���o�[�𐶐�����B
//�@�@public JToolBar(String s)
//      �@�\�F�^�C�g��s�����c�[���o�[�𐶐�����B
//�@�@public JToolBar(String s, int d)
//      �@�\�F�^�C�g��s�A����d�����c�[���o�[�𐶐�����B
//            ���������FSwingConstants.HORIZONTAL  (�f�t�H���g)
//            ���������FSwingConstants.VERTICAL
//
//�@��JToolBar�N���X�̃��\�b�h
//�@�@public void addSeparator()
//      �@�\�F�Z�p���[�^���I�[�ɒǉ�����B
//
//�@��javax.swing.JComponent�N���X����p���������\�b�h
//�@�@public void setToolTipText(String s)
//      �@�\�F�c�[���`�b�v�̃e�L�X�g�Ƃ��āA�\������镶����s��ݒ肷��B
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import java.net.URL;

// �t���[���̒�`�B
public class ja132a extends JApplet implements ActionListener {
  /**
	 *  @author kahata
	 */
  private static final long serialVersionUID = 1L;
  JToolBar tb;
  JButton b1,b2,b3;
  Container c;
//  JPanel pane;
//  private boolean inAnApplet = true;

  //Hack to avoid ugly message about system event access check.
    public ja132a() {
        this(true);
    }

    public ja132a(boolean inAnApplet) {
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }

  public void init() {
    // �t���[���̃R���e���g�y�C�����擾�B
    c = this.getContentPane();

    // �c�[���o�[tb�̍쐬�B
    tb = new JToolBar("�c�[���o�["); 
    c.add(tb,BorderLayout.NORTH);

    // �{�^��b1,b2,b3�̍쐬�B
    b1 = new JButton("��"); 
    b1.setToolTipText("�t���[����Ԃɂ���");
    b2 = new JButton("��"); 
    b2.setToolTipText("�t���[�������ɂ���");
    b3 = new JButton("��"); 
    b3.setToolTipText("�t���[����ɂ���");
    // �{�^��b1,b2,b3�ƃZ�p���[�^���c�[���o�[���ɒǉ��B
    tb.add(b1); 
    tb.add(b2);
    tb.addSeparator();
    tb.add(b3); 

    // �C�x���g���X�i�̓o�^�B
    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);

//    Add Components to a JPanel, using the default FlowLayout. 
//     pane.setLayout(new GridLayout(2,1));
//    super.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
//    setContentPane(pane);
  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == b1 ) { c.setBackground(Color.red); }
    if( e.getSource() == b2 ) { c.setBackground(Color.yellow); }
    if( e.getSource() == b3 ) { c.setBackground(Color.blue); }
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
        JFrame frame = new JFrame("Application: ja132a");
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ja132a applet = new ja132a(false);
        applet.init();

        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
    	frame.setBounds(100, 100, 640,480);
//        frame.setSize(300, 200);
        frame.setVisible(true);
        applet.start();
    }
}
