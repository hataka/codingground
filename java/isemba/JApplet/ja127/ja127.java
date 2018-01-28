//  -*- mode: java -*-  Time-stamp: <08/06/19(��) 19:48:39 hata>
/*================================================================
 * �v���O������: ja127.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja127.htm
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja127.java >>
//
//  �i�`�����������i�Q�j�F���i�i�e�L�X�g�t�B�[���h�A�z�u�A�C�x���g�����j
//
//�@�@�e�L�X�g�t�B�[���h���g���ăf�[�^����͂ł���B
//�@�@�e�L�X�g�t�B�[���h���Q�쐬����B
//�@�@�O�҂͌Œ肵�����A��҂͓��͂��ꂽ������ɉ����ĕ���ύX����B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�FJTextField�N���X
//�@�@�C�x���g      �FActionEvent�N���X
//�@�@�C�x���g���X�i�FActionListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@actionPerformed���\�b�h
//
//  ��JTextField�N���X
//    ���[�U����̓���(������)�p�̗��ŁA�P�s���̕ҏW����Ƃ��AJTextField�N���X
//�@�@���g���B
//
//  ��JTextField�N���X�̃R���X�g���N�^
//    public JTextField(int c)                       
//      �@�\�Fc�������̗����쐬����B
//    public JTextField(String s, int c)                       
//      �@�\�Fc�������̗���p�ӂ��A������s��\������B
//
//  ��JTextComponent�N���X�̃��\�b�h
//    public String getText()                       
//      �@�\�F�e�L�X�g�R���|�[�l���g�̕�������擾����B
//    public void setText(String s)                       
//      �@�\�F�e�L�X�g�R���|�[�l���g�ɕ�����s��ݒ肷��B
//
//  ��java.awt.Container�N���X����p���������\�b�h
//    public void validate()                       
//      �@�\�F�R���e�i���i�[���Ă��镔�i���ǉ��܂��͕ύX���ꂽ�Ƃ��A�Ĕz�u���s���B
//
//�@���N���X�̊K�w�֌W
//�@�@javax.swing.txt.JTextComponent --> javax.swing.JTextField
//
//  ��String�N���X�̃��\�b�h
//    String trim()            
//      �@�\�F���̕�����̑O�ォ��󔒂���菜���B
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import javax.swing.event.*;
import java.net.URL;

public class ja127 extends JApplet implements ActionListener {

  Container c;
  JPanel pane;
  JTextField t1,t2; 
  JLabel lab;

   private boolean inAnApplet = true;

    //Hack to avoid ugly message about system event access check.
    public ja127() {
        this(true);
    }

    public ja127(boolean inAnApplet) {
        this.inAnApplet = inAnApplet;
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }

  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    c = this.getContentPane();
    pane = new JPanel();

    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����FlowLayout�ɐݒ�B
    c.setLayout(new FlowLayout(FlowLayout.CENTER,30,30));

    // �e�L�X�g�t�B�[���h�̍쐬�B
    t1 = new JTextField("�Œ蕝�FGood Morning ���͂悤",20);
    t2 = new JTextField("�ϕ��F",20);

    // �e�L�X�g�t�B�[���h���R���e���c�y�C�����ɒǉ��B
    c.add(t1,BorderLayout.NORTH); 
    c.add(t2,BorderLayout.CENTER);

    // ���x���̍쐬�B
    lab = new JLabel("�����ɕ\������");

    // ���x�����R���e���c�y�C�����ɒǉ��B
    c.add(lab,BorderLayout.SOUTH); 

    // �C�x���g���X�i�̓o�^�B
    t1.addActionListener(this);
    t2.addActionListener(this);

    //Add Components to a JPanel, using the default FlowLayout. 
    pane.add(t1,BorderLayout.NORTH); 
    pane.add(t2,BorderLayout.CENTER);
    pane.add(lab,BorderLayout.SOUTH); 
    pane.setBackground(new Color(255,255,204));
    pane.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
    setContentPane(pane);
  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == t1 ) { 
      String s1 = t1.getText(); lab.setText(s1); 
    }
    if( e.getSource() == t2 ) {
      String s2 = t2.getText().trim(); 
      int len = s2.length();
      t2.setColumns(len+2); // 2�����]���Ɋm�ہB
      c.validate();
      lab.setText(s2);
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
        Frame frame = new Frame("Application: ja127");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        ja127 applet = new ja127(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
