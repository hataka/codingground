// -*- mode: java -*- Time-stamp: <2009-06-19 16:26:18 kahata>
/*====================================================================
 * name: s131d.java 
 * created : Time-stamp: <09/06/19(��) 16:24:27 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links:
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/SWING/s131d.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << s131d.java >>
//
//  �r���������i�R�j�F�t���[���i���j���[�̊K�w�\���A�C�x���g�����j
//
//�@�@���j���[�̊K�w�\���ƃC�x���g������g�ݍ��킹��B
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;

class s131d extends JFrame implements ActionListener {

  JMenuBar mb;
  JMenu m,m0,m1;
  JMenuItem mi1,mi2,mi3;
  Container c;

  ////////////////////
  // �R���X�g���N�^ //
  ////////////////////
  s131d(String t) { 

    super(t);

    // �t���[���̃R���e���c�y�C�����擾�B
    c = this.getContentPane();

    // ���j���[�o�[mb�̍쐬�B
    mb = new JMenuBar(); 
    // ���j���[�o�[mb���t���[�����ɒǉ��B
    this.setJMenuBar(mb); 

    // ���j���[m�̍쐬�B
    m = new JMenu("���j���["); 
    // ���j���[m�����j���[�o�[mb�ɒǉ��B
    mb.add(m); 

    // ���j���[m0,m1�̍쐬�B
    m0 = new JMenu("���ڂȂ�"); 
    m1 = new JMenu("���ڂ���"); 
    // ���j���[m0�����j���[m�ɒǉ��B
    m.add(m0); 
    // �Z�p���[�^�����j���[jm�ɒǉ��B
    m.addSeparator(); 
    // ���j���[m1�����j���[m�ɒǉ��B
    m.add(m1); 

    // ���j���[����mi1,mi2,mi3�̍쐬�B
    mi1 = new JMenuItem("��"); 
    mi2 = new JMenuItem("��"); 
    mi3 = new JMenuItem("��"); 
    // ���j���[����mi1,mi2,mi3�����j���[m1�ɒǉ��B
    m1.add(mi1);  
    m1.add(mi2); 
    m1.add(mi3); 

    // �C�x���g���X�i�̓o�^�B
    mi1.addActionListener(this);
    mi2.addActionListener(this);
    mi3.addActionListener(this);
  }

  //////////////////////////////////////////////
  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h //
  //////////////////////////////////////////////
  public void actionPerformed(ActionEvent e) {
    if( e.getSource() == mi1 ) { c.setBackground(Color.red); }
    if( e.getSource() == mi2 ) { c.setBackground(Color.yellow); }
    if( e.getSource() == mi3 ) { c.setBackground(Color.blue); }
  }
    
  //////////////////
  // main���\�b�h //
  //////////////////
  public static void main(String[] args) {

    // �t���[���̍쐬�B
    s131d f = new s131d("���j���[�t���t���[��");

    // �t���[���E�B���h�E�̑傫����ݒ�B
    //f.setSize(300,200);
    f.setSize(800,600);

    // �u����v�{�^�����N���b�N���ꂽ�Ƃ��A�v���O�������I������B
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // �t���[���̕\���B
    f.setVisible(true);
  }
}
