//  -*- mode: java -*-  Time-stamp: <08/06/20(��) 18:16:59 hata>
/*================================================================
 * �v���O������: ja134a.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja133a.htm
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja134a.java >>
//
//  �i�`�����������i�Q�j�F���i�i�e�[�u���A�z�u�j
//
//�@���e�[�u���쐬�菇
//�@�@�i�菇�P�j���ږ���ݒ�
//�@�@�i�菇�Q�j���ڂ�ݒ�
//�@�@�i�菇�R�j�e�[�u���̍쐬
//
//�@��JTable�N���X
//    �e�[�u�����쐬����N���X�B
//
//�@��JTable�N���X�̃R���X�g���N�^
//�@�@public JTable(Object[][] obj, Object[] cname)
//�@�@�@�@�\�F���ږ�cname�������A�Z���̃f�[�^obj�����e�[�u�����쐬����B
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
//import java.awt.event.*; 
import javax.swing.*;
//import javax.swing.table.*;

public class ja134a extends JApplet {

  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();

    // �菇�P�F�e�[�u���̍��ږ���ݒ肷��B
    String[] cname = {
      "���ږ��`","���ږ��a","���ږ��b","���ږ��c"
    };

    // �菇�Q�F�e�[�u���̍��ڂ�ݒ肷��B
    Object[][] cell = {
      { "����a1","����b1","����c1",new Integer(111) },
      { "����a2","����b2","����c2",new Integer(222) },
      { "����a3","����b3","����c3",new Integer(333) },
      { "����a4","����b4","����c4",new Integer(444) },
      { "����a5","����b5","����c5",new Integer(555) },
      { "����a6","����b6","����c6",new Integer(666) },
      { "����a7","����b7","����c7",new Integer(777) },
    };

    // �菇�R�F�e�[�u���̍쐬�B
    JTable table = new JTable(cell,cname);
    // �X�N���[���o�[��ǉ��B
    // �X�N���[���o�[��ǉ����Ȃ��ƁA���ڂ��\������Ȃ��B
    JScrollPane sp = new JScrollPane(table);
    c.add(sp,BorderLayout.CENTER);
  }
}
