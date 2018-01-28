//  -*- mode: java -*-  Time-stamp: <08/06/19(��) 15:52:17 hata>
/*================================================================
 * �v���O������: ja123.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja24.htm
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja125.java >>
//
//  �i�`�����������i�Q�j�F���i�i���W�I�{�^���A�z�u�A�C�x���g�����j
//
//�@�@�u�ԁv���ڂ��`�F�b�N����ƁA���x���Ɂu�ԁv�̕������\�������B
//�@�@�u�v���ڂ��`�F�b�N����ƁA���x���Ɂu�v�̕������\�������B
//�@�@�u���v���ڂ��`�F�b�N����ƁA���x���Ɂu���v�̕������\�������B
//�@    �����̍��ڂ̒�����P�������I�������B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�FJRadioButton�N���X
//�@�@�C�x���g      �FActionEvent�N���X
//�@�@�C�x���g���X�i�FActionListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@actionPerformed���\�b�h
//
//�@��JRadioButton�N���X�AButtonGroup�N���X
//    �����̍��ڂ̒��ł����P������on�ƂȂ�Ƃ��AJRadioButton�N���X�A
//�@�@ButtonGroup�N���X���g���B
//
//    �EButtonGroup�N���X�́AJRadioButton�̓���𐧌䂷��B���Ȃ킿�A����
//�@�@�@�P��true�ƂȂ�B�\�������Ƃ��ɂ܂Ƃ߂�ɂ̓p�l�����g���āA�p�l����
//�@�@�@�ǉ�����K�v������B
//
//  ��ButtonGroup�N���X�̃R���X�g���N�^
//    public ButtonGroup()                       
//      �@�\�F�{�^���O���[�v���쐬�B
//
//  ��ButtonGroup�N���X�̃��\�b�h
//�@  public void add(AbstractButton b)
//�@�@�@�@�\�F�{�^���O���[�v�Ƀ{�^����ǉ�����B 
//
//  ��JRadioButton�N���X�̃R���X�g���N�^
//    JRadioButton(String s, boolean b)     
//      �@�\�F������s�̃��W�I�{�^��������Ԃ�b�ɐݒ肷��B
//
//  ��JPanel�N���X�̃R���X�g���N�^
//    public JPanel()
//�@�@�@�@�\�FJPanel���쐬����B
//
////////////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;

public class ja125 extends JApplet implements ActionListener {

   Container c;
  JPanel pane;
   ButtonGroup bg;
  JRadioButton r1,r2,r3; 
  JLabel lab;
  JPanel p;

   private boolean inAnApplet = true;

    //Hack to avoid ugly message about system event access check.
    public ja125() {
        this(true);
    }

    public ja125(boolean inAnApplet) {
        this.inAnApplet = inAnApplet;
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }

  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    c = this.getContentPane();
    // �p�l���̍쐬�B
    pane = new JPanel();
    // �p�l���̍쐬�B
    p = new JPanel();

    // �A�v���b�g�̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout(10,10));

    // �p�l���̃��C�A�E�g�}�l�[�W����FlowLayout�ɐݒ�B
    p.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
    p.setBackground(Color.green);

    // ���x���̍쐬�B
    lab = new JLabel("�����ɕ\�������");

    // �p�l���ƃ��x�����R���e���c�y�C�����ɒǉ��B
    c.add("North",p);
    c.add("Center",lab);

    // ���W�I�{�^���̍쐬�B
    r1 = new JRadioButton("��",true);
    r2 = new JRadioButton("��",false);
    r3 = new JRadioButton("��",false);

    // �{�^���O���[�v�̍쐬�B
    bg = new ButtonGroup();
    // ���W�I�{�^�����{�^���O���[�v�ɓo�^�B
    bg.add(r1);
    bg.add(r2);
    bg.add(r3);

    // ���W�I�{�^�����p�l���ɒǉ��B
    p.add(r1);
    p.add(r2);
    p.add(r3);

    // �C�x���g���X�i�̓o�^�B
    r1.addActionListener(this);
    r2.addActionListener(this);
    r3.addActionListener(this);

    //Add Components to a JPanel, using the default FlowLayout. 
    pane.add("North",p);
    pane.add("Center",lab);
    pane.setBackground(new Color(255,255,204));
    pane.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));

    setContentPane(pane);
  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == r1 ) { lab.setText("��");p.setBackground(Color.red); }
    if( e.getSource() == r2 ) { lab.setText("��");p.setBackground(Color.blue); }
    if( e.getSource() == r3 ) { lab.setText("��");p.setBackground(Color.yellow); }
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
        Frame frame = new Frame("Application: ja125");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        ja125 applet = new ja125(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
