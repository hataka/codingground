//  -*- mode: java -*-  Time-stamp: <08/06/19(��) 20:03:06 hata>
/*================================================================
 * �v���O������: ja128.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja128.htm
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja128.java >>
//
//  �i�`�����������i�Q�j�F���i�i�e�L�X�g�G���A�A�z�u�A�C�x���g�����j
//
//�@�@�Q�̃e�L�X�g�G���A�Ɓu���ʁv�{�^���A�u�����v�{�^�������B
//�@�@�e�L�X�g�G���A���ŕҏW���ł���B
//�@�@�ŏ��̃e�L�X�g�G���A�ɂ̓X�N���[���o�[��t����B�X�N���[���o�[��t����ɂ́A
//�@�@�e�L�X�g�G���A���X�N���[���y�C���ɓ����K�v������B
//�@�@�e�L�X�g�G���A�ɕ\��������Ȃ��e�L�X�g�����͂����Ǝ����I�ɃX�N���[���o�[
//�@�@�������B�e�L�X�g�G���A�ɂ��ׂẴe�L�X�g���\���ł���悤�ɂȂ�ƃX�N���[
//�@�@���o�[�͏�����B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�FJTextArea�N���X
//�@�@�C�x���g      �FActionEvent�N���X
//�@�@�C�x���g���X�i�FActionListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@actionPerformed���\�b�h
//    �e�L�X�g�G���A�Ń��^�[���L�[�������Ă��C�x���g�͔������Ȃ��B
//    ���̕��i�Ƒg�ݍ��킹�ė��p����B
//
//  ��JTextArea�N���X
//    ���[�U����̓���(������)�p�̗�(�����s������)�ŁA�ҏW����Ƃ��AJTextArea
//�@�@�N���X���g���B
//
//  ��JTextArea�N���X�̃R���X�g���N�^
//    public JTextArea(int r, int c)                       
//      �@�\�Fr�s�Ac��̃e�L�X�g�G���A���쐬����B
//    public JTextArea(String s, int r, int c)                       
//      �@�\�F������s��\������r�sc��̃e�L�X�g�G���A���쐬����B
//
//  ��JTextArea�N���X�̃��\�b�h
//    public void append(String s)                       
//      �@�\�F������s�������e�L�X�g�̖����ɒǉ�����B
//
////////////////////////////////////////////////////////////////////////////////
//<applet code="ja128.class" width="300" height="200"></applet>
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import java.net.URL;

public class ja128 extends JApplet implements ActionListener {

	Container c;
	JPanel pane;
	JTextArea t1, t2;
	JButton b1, b2;

	private boolean inAnApplet = true;

	// Hack to avoid ugly message about system event access check.
	public ja128() {
		this(true);
	}

	public ja128(boolean inAnApplet) {
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
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

		// �e�L�X�g�G���A�̍쐬�B
		t1 = new JTextArea("����ɂ���\n����w\n�H�w��\n���H�w��", 3, 20);
		JScrollPane sp = new JScrollPane(t1);
		t2 = new JTextArea(3, 20);

		// �{�^���̍쐬�B
		b1 = new JButton("����");
		b2 = new JButton("����");

		// �X�N���[���y�C���A�{�^���A�e�L�X�g�G���A���R���e���c�y�C�����ɒǉ��B
		c.add(sp);
		c.add(b1);
		c.add(b2);
		c.add(t2);

		// �C�x���g���X�i�̓o�^�B
		b1.addActionListener(this);
		b2.addActionListener(this);

		// Add Components to a JPanel, using the default FlowLayout.
		pane.add(sp);
		pane.add(b1);
		pane.add(b2);
		pane.add(t2);
		pane.setBackground(new Color(255, 255, 204));
		pane
				.setBorder(BorderFactory.createMatteBorder(1, 1, 2, 2,
						Color.black));
		setContentPane(pane);
	}

	// ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			String s = t1.getText();
			t2.setText(s);
		}
		if (e.getSource() == b2) {
			String s = " ";
			t2.setText(s);
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
		Frame frame = new Frame("Application: ja128");

		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});

		ja128 applet = new ja128(false);
		applet.init();
		frame.add(applet, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}
}
