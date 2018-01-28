//  -*- mode: java -*-  Time-stamp: <08/06/19(��) 16:29:46 hata>
/*================================================================
 * �v���O������: ja126.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja126.htm
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja126.java >>
//
//  �i�`�����������i�Q�j�F���i�i���X�g�A�z�u�A�C�x���g�����j
//
//�@�@���X�g���̕������ڂ�I�����A���x���ɕ\������B
//�@�@���ڂ��N���b�N���ĕ����̍��ڂ�I������B
//
//    �E�N���b�N�������ڂ���AShift�L�[�������Ȃ���N���b�N�������ڂ܂ł�
//�@�@�@�A�����đI�������B
//�@�@�ECntl�L�[�������Ȃ���I���������ڂ���є�тɑI�������B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�FJList�N���X
//�@�@�C�x���g      �FListSelectionEvent�N���X
//�@�@�C�x���g���X�i�FListSelectionListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@valueChanged���\�b�h
//
//�@�@�@�@javax.swing.event.ListSelectionEvent
//�@�@�@�@javax.swing.event.ListSelectionListener
//
//  ��JList�N���X
//    �����̍��ڂ��畡���̍��ڂ�I������Ƃ��AJList�N���X���g���B
//�@
//  ��JList�N���X�̃R���X�g���N�^
//    public JList(Object[] item)                       
//      �@�\�F�z��item�̗v�f��\�����郊�X�g���쐬����B
//
//  ��JList�N���X�̃��\�b�h
//    public Object[] getSelectedValues()                       
//      �@�\�F�I������Ă��鍀�ڂ����ׂĎ擾����B
//    public void setVisibleRowCount(int r)                       
//      �@�\�F���ڂ�r�ȓ��̏ꍇ�A�X�N���[���o�[�͕\������Ȃ��Br���z����ƁA
//�@�@�@�@�@�@�X�N���[���o�[���\�������B
//
//  ��JScrollPane�N���X
//    ���i���X�N���[�����߂̃N���X�ŁA���i�Ɋ܂܂�鑽���̃f�[�^��
//�@�@�\������Ƃ��Ɏg����B
//
//  ��JScrollPane�N���X�̃R���X�g���N�^
//�@  public JScrollPane(Component v)
//      �@�\�F���iv�̃f�[�^��\������JScrollPane���쐬����B
//�@�@�@�@�@�@���i�̃f�[�^�������A�\���̈�𒴂���ꍇ�A��������ѐ���
//�@�@�@�@�@�@�X�N���[���o�[�̗������\�������B
// 
//�@��ListSelectionListener�C���^�[�t�F�[�X�̃��\�b�h
//    void valueChanged(ListSelectionEvent e)
//      �@�\�F�C�x���g�����������Ƃ��Ăяo�����B
//            ListSelectionEvent�I�u�W�F�N�ge�ɃC�x���g�̏󋵂��L�^����Ă���B
//
////////////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.swing.event.*;


public class ja126 extends JApplet implements ListSelectionListener {
  Container c;
  JPanel pane;
  JLabel lab;
  JList lt;
 
   private boolean inAnApplet = true;

    //Hack to avoid ugly message about system event access check.
    public ja126() {
        this(true);
    }

    public ja126(boolean inAnApplet) {
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

    // ���X�g�̍쐬�B
    String a[] = new String[8];
    a[0] = "���ڂP"; a[1] = "���ڂQ"; a[2] = "���ڂR"; a[3] = "���ڂS";
    a[4] = "���ڂT"; a[5] = "���ڂU"; a[6] = "���ڂV"; a[7] = "���ڂW";
    lt = new JList(a);  
    lt.setVisibleRowCount(5);                 

    // �X�N���[���y�C�����쐬�B
    // ���X�g�͎����I�ɃX�N���[�����Ȃ��̂ŁA���X�g���X�N���[���y�C���ɓ����B
    JScrollPane sp = new JScrollPane(lt);

    // ���x���̍쐬�B
    lab = new JLabel("�����ɕ\�������");

    // �X�N���[���y�C���ƃ��x�����R���e���c�y�C�����ɒǉ��B
    c.add(sp, BorderLayout.NORTH);
    c.add(lab, BorderLayout.CENTER);

    // �C�x���g���X�i�̓o�^�B
    lt.addListSelectionListener(this);

    //Add Components to a JPanel, using the default FlowLayout. 
    pane.add(sp, BorderLayout.NORTH);
    pane.add(lab, BorderLayout.CENTER);
    pane.setBackground(new Color(255,255,204));
    pane.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
    setContentPane(pane);
  }

  // ListSelectionListener�C���^�[�t�F�[�X�̃��\�b�h
  public void valueChanged(ListSelectionEvent e) {
    Object[] item = lt.getSelectedValues();
    String t = "";
    for( int i=0; i<item.length; i++ ) {
      String s = (String)item[i];
      t = t + "�@" + s;
    }
    lab.setText(t);
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
        Frame frame = new Frame("Application: ja126");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        ja126 applet = new ja126(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
