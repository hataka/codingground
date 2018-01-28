////////////////////////////////////////////////////////////////////////////////
// << s132.java >>
//
//  �r���������i�R�j�F�t���[���i�|�b�v�A�b�v���j���[�A�C�x���g�����j
//
//�@�@�t���[�����ŉE�{�^�����N���b�N(�|�b�v�A�b�v�g���K�[�Ƃ���)�����Ƃ��A
//�@�@���̈ʒu�Ƀ|�b�v�A�b�v���j���[��\������B
//
//�@��javax.swing.JPopupMeuu�N���X
//    �|�b�v�A�b�v���j���[�𗘗p����Ƃ��AJPopupMenu�N���X���g���B
//
//�@��JPopupMenu�̃R���X�g���N�^
//�@�@public JPopupmenu(String s)
//      �@�\�F�^�C�g��s�̃|�b�v�A�b�v���j���[�𐶐�����B
//
//�@��JPopupMenu�N���X�̃��\�b�h
//�@�@public void show(Component c, int x, int y)
//      �@�\�F�|�b�v�A�b�v���j���[���\������镔�i�̈ʒu(x,y)��
//�@�@�@�@�@�@�|�b�v�A�b�v���j���[��\������B
//
//�@��MouseEvent�N���X�̃��\�b�h
//�@�@public boolean isPopupTrigger()
//      �@�\�F�C�x���g���|�b�v�A�b�v�g���K�[�Ȃ�true�A���̏ꍇfalse�B
//
//�@��ComponentEvent�N���X�̃��\�b�h        
//�@�@public Component getComponent()
//      �@�\�F�C�x���g�\�[�X�ƂȂ�R���|�[�l���g�̎Q�Ƃ�Ԃ��B
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

class s132 extends JFrame implements ActionListener, MouseListener {

  JPopupMenu pm;
  JMenuItem mi1,mi2,mi3;
  Container c;

  ////////////////////
  // �R���X�g���N�^ //
  ////////////////////
  s132(String t) {  

    super(t);

    // �t���[���̃R���e���c�y�C�����擾�B
    c = this.getContentPane();

    // �|�b�v�A�b�v���j���[pm�̍쐬�B
    pm = new JPopupMenu();

    // ���j���[����mi1,mi2,mi3�̍쐬�B
    mi1 = new JMenuItem("��"); 
    mi2 = new JMenuItem("��"); 
    mi3 = new JMenuItem("��"); 
    // ���j���[����mi1,mi2,mi3���|�b�v�A�b�v���j���[pm�ɒǉ��B
    pm.add(mi1);  
    pm.add(mi2);  
    pm.add(mi3);  

    // �C�x���g���X�i�̓o�^�B
    mi1.addActionListener(this);
    mi2.addActionListener(this);
    mi3.addActionListener(this);
    this.addMouseListener(this);
  }

  //////////////////////////////////////////////////////////////////////
  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h(���j���[�̃C�x���g����) //
  //////////////////////////////////////////////////////////////////////
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == mi1 ) { c.setBackground(Color.red); }
    if( e.getSource() == mi2 ) { c.setBackground(Color.yellow); }
    if( e.getSource() == mi3 ) { c.setBackground(Color.blue); }
  }

  ///////////////////////////////////////////////////////////////////
  // MouseListener�C���^�[�t�F�[�X�̃��\�b�h(�}�E�X�̃C�x���g����) //
  ///////////////////////////////////////////////////////////////////
  public void mouseReleased(MouseEvent e) {
    if(e.isPopupTrigger()) {
      pm.show(e.getComponent(), e.getX(), e.getY());
    } 
  }
  public void mousePressed(MouseEvent e) { }
  public void mouseClicked(MouseEvent e) { }
  public void mouseEntered(MouseEvent e) { }
  public void mouseExited(MouseEvent e) { }

  //////////////////
  // main���\�b�h //
  //////////////////
  public static void main(String[] args) {

    // �t���[���̍쐬�B
    s132 f = new s132("�|�b�v�A�b�v���j���[�t���t���[��");

    // �t���[���̑傫����ݒ�B
    //f.setSize(300,200);
    f.setSize(640,480);

    // �u����v�{�^�����N���b�N���ꂽ�Ƃ��A�v���O�������I������B
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // �t���[���̕\���B
    f.setVisible(true);
  }
}
