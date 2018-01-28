//  -*- mode: java -*-  Time-stamp: <08/06/20(��) 18:02:01 hata>
/*================================================================
 * �v���O������: ja131.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja131.htm
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja131.java >>
//
//  �i�`�����������i�Q�j�F���i�i�|�b�v�A�b�v���j���[�A�C�x���g�����j
//
//�@������
//�@�@�A�v���b�g���ŉE�{�^�����N���b�N(�|�b�v�A�b�v�g���K�[�Ƃ���)�����Ƃ��A
//�@�@���̈ʒu�Ƀ|�b�v�A�b�v���j���[��\������B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�F�}�E�X����
//�@�@�C�x���g�@�@�@�FMouseEvent�N���X
//�@�@�C�x���g���X�i�FMouseListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@mousePressed, mouseReleased, mouseClicked, mouseEntered,
//�@�@�@�@�@�@�@�@�@  mouseExited ���\�b�h
//                    ActionListener�C���^�[�t�F�[�X
//                    actionPerformed���\�b�h
//
//�@��JPopupMeuu�N���X
//    �|�b�v�A�b�v���j���[�𗘗p����Ƃ��AJPopupMenu�N���X���g���B
//
//�@��JPopupMenu�̃R���X�g���N�^
//�@�@public JPopupmenu(String s)
//      �@�\�F�^�C�g��s�̃|�b�v�A�b�v���j���[���쐬����B
//
//�@��JPopupMenu�N���X�̃��\�b�h
//�@�@public void show(Component c, int x, int y)
//      �@�\�F���ic�̈ʒu(x,y)�Ƀ|�b�v�A�b�v���j���[��\������B
//
//�@��MouseEvent�N���X�̃��\�b�h
//�@�@public boolean isPopupTrigger()
//      �@�\�F�C�x���g���|�b�v�A�b�v�g���K�[�Ȃ�true�A���̏ꍇfalse�B
//
//�@��java.awt.event.ComponentEvent�N���X����p���������\�b�h 
//�@�@public Component getComponent()
//      �@�\�F�C�x���g�\�[�X���擾����B
// 
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import java.net.URL;

public class ja131 extends JApplet implements ActionListener, MouseListener {
  /**
	 *  @author kahata
	 */
  private static final long serialVersionUID = 1L;
  Container c;
  JPopupMenu pm;
  JMenuItem jmi1,jmi2,jmi3;
//  JPanel pane;
//  private boolean inAnApplet = true;

  //Hack to avoid ugly message about system event access check.
    public ja131() {
        this(true);
    }

    public ja131(boolean inAnApplet) {
        if (inAnApplet) {
            getRootPane().putClientProperty("defeatSystemEventQueueCheck",
                                            Boolean.TRUE);
        }
    }


  public void init() {
    // �A�v���b�g�̃R���e���g�y�C�����擾�B
    c = this.getContentPane();

    // �|�b�v�A�b�v���j���[pm�̍쐬�B
    pm = new JPopupMenu();
    
    // ���j���[����jmi1,jmi2,jmi3�̍쐬�B
    jmi1 = new JMenuItem("��"); 
    jmi2 = new JMenuItem("��"); 
    jmi3 = new JMenuItem("��"); 
    // ���j���[����jmi1,jmi2,jmi3���|�b�v�A�b�v���j���[pm���ɒǉ��B
    pm.add(jmi1);  
    pm.add(jmi2);  
    pm.add(jmi3);  

    // �C�x���g���X�i�̓o�^�B
    jmi1.addActionListener(this);
    jmi2.addActionListener(this);
    jmi3.addActionListener(this);
    this.addMouseListener(this);
//    Add Components to a JPanel, using the default FlowLayout. 
//     pane.setLayout(new GridLayout(2,1));
//    super.setBorder(BorderFactory.createMatteBorder(1,1,2,2,Color.black));
//    setContentPane(pane);
  }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h(���j���[�̃C�x���g����)�B
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == jmi1 ) { c.setBackground(Color.red); }
    if( e.getSource() == jmi2 ) { c.setBackground(Color.yellow); }
    if( e.getSource() == jmi3 ) { c.setBackground(Color.blue); }
  }

  // MouseListener�C���^�[�t�F�[�X�̃��\�b�h(�}�E�X�̃C�x���g����)�B
  public void mouseReleased(MouseEvent e) {
    if(e.isPopupTrigger()) {
      pm.show(e.getComponent(), e.getX(), e.getY());
    } 
  }
  public void mousePressed(MouseEvent e) { }
  public void mouseClicked(MouseEvent e) { }
  public void mouseEntered(MouseEvent e) { }
  public void mouseExited(MouseEvent e) { }

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
        Frame frame = new Frame("Application: ja131");

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        ja131 applet = new ja131(false);
        applet.init();
        frame.add(applet, BorderLayout.CENTER);
        frame.pack();
        frame.setSize(300, 200);
        frame.setVisible(true);
        applet.start();
    }
}
