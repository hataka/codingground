//  -*- mode: java -*-  Time-stamp: <08/07/16(��) 15:58:06 hata>
/*================================================================
 * �v���O������: ja136.java
  * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja136.java >>
//
//  �i�`�����������i�Q�j�F���i�i�^�u�y�C���A�z�u�j
//
//�@�@���i�Ƀ^�u��t����B�^�u���N���b�N�����ƕ��i��\������B
//
//�@��JTabbedPane�N���X
//�@�@�^�u�y�C�����쐬����N���X�B
//
//�@��JTabbedPane�N���X�̃R���X�g���N�^
//    public JTabbedPane()
//    �@�@�\�F�^�u�y�C���𐶐�����B
//
//�@��JTabbedPane�N���X�̃��\�b�h
//    public void addTab(String s, Component c)
//    �@�@�\�F�^�u����s�Ƃ��镔�ic��ǉ�����B
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

public class ja136 extends JApplet {

  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();

    // ���x��lab1,lab2,lab3�̍쐬�B
    JLabel lab1 = new JLabel("���x���P");
    JLabel lab2 = new JLabel("���x���Q");
    JLabel lab3 = new JLabel("���x���R");

    // �^�u�y�C��tp�̍쐬�B
    JTabbedPane tp = new JTabbedPane();
    // �^�u�y�C��tp���Ƀ��x��lab1��ǉ��B
    tp.addTab("�^�u�P",lab1);

    // �p�l��p���쐬�B
    JPanel p = new JPanel();
    // ���x��lab2,lab3���p�l��p���ɒǉ��B
    p.add(lab2);
    p.add(lab3);
    // �^�u�y�C��tp���Ƀp�l��p��ǉ��B
    tp.addTab("�^�u�Q",p);

    // �^�u�y�C��tp���R���e���c�y�C�����ɒǉ��B
    c.add(tp,BorderLayout.CENTER);
  }
}
