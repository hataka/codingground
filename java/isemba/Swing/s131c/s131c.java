////////////////////////////////////////////////////////////////////////////////
// << s131c.java >>
//
//  �r���������i�R�j�F�t���[���i���j���[�̊K�w�\���A�\���Ɣ�\���j
//
//  �@���j���[�����j���[���܂ނ��Ƃ��ł���B���Ȃ킿�A���j���[�̊K�w�����\�B
//
//  ��JMenu�N���X�̃��\�b�h
//    public void addSeparator()
//�@�@�@�@�\�F���j���[�̍Ō�ɃZ�p���[�^��}������B
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

class s131c extends JFrame {

  ////////////////////
  // �R���X�g���N�^ //
  ////////////////////
  s131c(String t) {  

    super(t);

    // ���j���[�o�[mb�̍쐬�B
    JMenuBar mb = new JMenuBar(); 
    // ���j���[�o�[mb���t���[���E�B���h�E���ɒǉ��B
    this.setJMenuBar(mb); 

    // ���j���[m�̍쐬�B
    JMenu m = new JMenu("���j���["); 
    // ���j���[m�����j���[�o�[mb�ɒǉ��B
    mb.add(m); 

    // ���j���[m0,m1�̍쐬�B
    JMenu m0 = new JMenu("���ڂȂ�"); 
    JMenu m1 = new JMenu("���ڂ���"); 
    // ���j���[m0�����j���[m�ɒǉ��B
    m.add(m0); 
    // �Z�p���[�^�����j���[m�ɒǉ��B
    m.addSeparator(); 
    // ���j���[m1�����j���[m�ɒǉ��B
    m.add(m1); 

    // ���j���[����mi1,mi2,mi3�̍쐬�B
    JMenuItem mi1 = new JMenuItem("��"); 
    JMenuItem mi2 = new JMenuItem("��"); 
    JMenuItem mi3 = new JMenuItem("��"); 
    // ���j���[����mi1,mi2,mi3�����j���[m1�ɒǉ��B
    m1.add(mi1);  
    m1.add(mi2); 
    m1.add(mi3); 
  }
   
  //////////////////
  // main���\�b�h //
  //////////////////
  public static void main(String[] args) {

    // �t���[���̍쐬�B
    s131c f = new s131c("���j���[�t���t���[��");

    // �t���[���E�B���h�E�̑傫����ݒ�B
    //f.setSize(300,200);
    f.setSize(800,600);

    // �u����v�{�^�����N���b�N���ꂽ�Ƃ��A�v���O�������I������B
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // �t���[���̕\���B
    f.setVisible(true);
  }
}
