//  -*- mode: java -*-  Time-stamp: <08/06/19(��) 14:47:43 hata>
/*================================================================
 * �v���O������: ja123.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja24.htm
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja123.java >>
//
//  �i�`�����������i�Q�j�F���i�i�R���{�{�b�N�X�A�z�u�A�C�x���g�����j
//
//�@�@�u�Ԃɐݒ�v���ڂ��N���b�N����ƁA�A�v���b�g�̔w�i�F���ԂɂȂ�B
//�@�@�u�΂ɐݒ�v���ڂ��N���b�N����ƁA�A�v���b�g�̔w�i�F���΂ɂȂ�B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�FJComboBox�N���X
//�@�@�C�x���g      �FActionEvent�N���X
//�@�@�C�x���g���X�i�FActionListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@actionPerformed���\�b�h
//
//�@��JComboBox�N���X
//�@�@�����̍��ڂ���ЂƂI�ԂƂ��AJComboBox�N���X���g���B
//�@�@�ʏ�́A�����̍��ڂ̂ЂƂ��\������Ă��邪�A�R���{�{�b�N�X���N���b�N
//�@�@����ƁA���ڂ̈ꗗ���\������C�ӂ̍��ڂ�I���ł���B
//
//  ��JComboBox�N���X�̃��\�b�h
//    public void addItem(Object obj)                       
//      �@�\�F���ڃ��X�g�̍Ō�ɍ���obj��������B
//    public void insertItemAt(Object obj, int p)                       
//      �@�\�F���ڃ��X�g�̎w�肳�ꂽ�ʒup�ɍ���obj��}������B0���擪�B
//    public void removeItem(Object obj)                       
//      �@�\�F���ڃ��X�g���獀��obj���폜����B
//    public void removeItemAt(int p)                       
//      �@�\�F���ڃ��X�g�̈ʒup���獀�ڂ��폜����B
//    public Object getSelectedItem()
//      �@�\�F���ݑI������Ă��鍀�ڂ�Ԃ��B
//
////////////////////////////////////////////////////////////////////////////////

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
/*
<applet code="ja123.class" width="640" height="480">
</applet>
*/

public class ja123 extends JApplet implements ActionListener {

  JComboBox cb;
  Container c;
  JPanel pane;
  
   private boolean inAnApplet = true;

    //Hack to avoid ugly message about system event access check.
    public ja123() {
        this(true);
    }

    public ja123(boolean inAnApplet) {
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
    c.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

    // �R���{�{�b�N�X�̍쐬�B
    cb = new JComboBox();
    // ���ڂ��R���{�{�b�N�X���ɒǉ��B
    cb.addItem("�Ԃɐݒ�");
    cb.addItem("�΂ɐݒ�");

    // �R���{�{�b�N�X���R���e���c�y�C�����ɒǉ��B
    c.add(cb);

    // �C�x���g���X�i�̓o�^�B
    cb.addActionListener(this);

    //Add Components to a JPanel, using the default FlowLayout. 
    pane.add(cb);
    pane.setBackground(new Color(255,255,204));
    pane.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));

    setContentPane(pane);
  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B
  public void actionPerformed(ActionEvent e) {
    // �R���{�{�b�N�X����C�x���g�����������ꍇ�A���s�����B   
    if( e.getSource() == cb ) {
      String s = (String)cb.getSelectedItem();
//      if( s.equals("�Ԃɐݒ�") ) { c.setBackground(Color.red); }
//      if( s.equals("�΂ɐݒ�") ) { c.setBackground(Color.green); }
      if( s.equals("�Ԃɐݒ�") ) { pane.setBackground(Color.red); }
      if( s.equals("�΂ɐݒ�") ) { pane.setBackground(Color.green); }
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
        Frame frame = new Frame("Application: ja123");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        ja123 applet = new ja123(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
