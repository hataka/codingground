//  -*- mode: java -*-  Time-stamp: <08/06/20(��) 18:16:59 hata>
/*================================================================
 * �v���O������: ja133a.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja133a.htm
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja133a.java >>
//
//  �i�`�����������i�Q�j�F���i�i�c���[�A�z�u�j
//
//�@�@�c���[���쐬����B
//
//�@���c���[�쐬�菇
//�@�@�i�菇�P�j�m�[�h�̍쐬
//�@�@�i�菇�Q�j�e�q�֌W�̐ݒ�
//�@�@�i�菇�R�j�c���[�̍쐬
//
//�@��DefaultMutableTreeNode�N���X
//    �c���[�̃m�[�h���쐬����N���X�B
//
//�@��DefaultMutableTreeNode�N���X�̃R���X�g���N�^
//�@�@DefaultMutableTreeNode(Object obj)
//�@�@�@�@�\�F�I�u�W�F�N�gobj�����m�[�h���쐬����B
//
//�@��DefaultMutableTreeNode�N���X�̃��\�b�h
//�@�@void add(MutableTreeNode node)
//�@�@�@�@�\�F�m�[�hnode���q�Ƃ��Ēǉ�����B
//
//�@��JTree�N���X
//    �c���[���쐬����N���X�B
//
//�@��JTree�N���X�̃R���X�g���N�^
//�@�@JTree(TreeNode root)
//�@�@�@�@�\�F���[�groot�����c���[���쐬����B
//
////////////////////////////////////////////////////////////////////////////////

// <applet code=ja133a width=320 height=240 ></applet>

import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
import javax.swing.tree.*;

public class ja133a extends JApplet {

  public void init() {
    // �A�v���b�g����R���e���g�y�C�����擾�B
    Container c = this.getContentPane();

    // �菇�P�F�m�[�h�̍쐬�B
    DefaultMutableTreeNode root = new DefaultMutableTreeNode("���{");
    DefaultMutableTreeNode n1 = new DefaultMutableTreeNode("��錧");
    DefaultMutableTreeNode n11 = new DefaultMutableTreeNode("���ˎs");
    DefaultMutableTreeNode n12 = new DefaultMutableTreeNode("�����s");
    DefaultMutableTreeNode n2 = new DefaultMutableTreeNode("������");
    DefaultMutableTreeNode n21 = new DefaultMutableTreeNode("���킫�s");

    // �菇�Q�F�e�q�֌W�̐ݒ�B
    root.add(n1);
    n1.add(n11);
    n1.add(n12);
    root.add(n2);
    n2.add(n21);

    // �菇�R�F�c���[�̍쐬�B
    JTree tree = new JTree(root);
    // �c���[���R���e���c�y�C�����ɒǉ��B
    c.add(tree);
  }
}
