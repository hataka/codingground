//  -*- mode: java -*-  Time-stamp: <08/07/21(��) 07:06:50 hata>
/**
 * <pre>
===================================================================================
 * �v���O������: ja152c.java
 * �쐬��: Time-stamp: <08/07/21(��) 07:28:02 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * ����: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja152c.java >>
//
//  �i�`�����������i�R�j�F�}�E�X����i�����̕`��A�C�x���g�����A�����N���X�j
//
//�@������
//    �}�E�X���N���b�N����ƁA���O�ɃN���b�N�����ʒu�ƌ��݂̈ʒu�𒼐��Ō��ԁB
//    (���O�Ɉ����ꂽ�����͎c��B)
//    super.paintComponent(g); ���폜�܂��̓R�����g������B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�F�}�E�X����
//�@�@�C�x���g�@�@�@�FMouseEvent�N���X
//�@�@�C�x���g���X�i�FMouseAdapter�N���X
//�@�@�@�@�@�@�@�@�@  mouseClicked���\�b�h
//
////////////////////////////////////////////////////////////////////////////////
===================================================================================
 * </pre>
 * @package    JApplet
 * @subpackage
 * @author    kahata <kazuhiko.hata@nifty.com>
 * @copyright 2003-2008 kahata
 * @license   http://www.debian.org/misc/bsd.license  BSD License (3 Clause)
 * @version   1.0
 * @link      http://pear.php.net/package/phpDocumentor
 */
/*=================================================================================*/

import java.awt.*;
import java.awt.event.*; 
import javax.swing.*;

public class ja152c extends JApplet {

  int Px=0,Py=0; // ���O�̈ʒu�B
  int Cx,Cy; // ���݂̈ʒu�B

  // init���\�b�h�̒�`�B
  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();
    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout());

    // �p�l���̍쐬�B
    ja152cp p = new ja152cp();
    // �R���e���c�y�C���ɒǉ��B
    c.add(p,BorderLayout.CENTER);

    // �C�x���g���X�i�̓o�^�B
    EventListener el = new EventListener();
    this.addMouseListener(el);
  }

  // �p�l�����`(�����N���X)�B
  class ja152cp extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      // �����`��B
      if( (Px == 0)&&(Py == 0) ) { Px = Cx; Py = Cy; }
      g.drawLine(Px,Py,Cx,Cy);
      // ���O�̈ʒu���X�V�B
      Px = Cx; Py = Cy;
    }
  }      

  // �C�x���g���X�i���`(�����N���X)�B
  class EventListener extends MouseAdapter {
    // mouseClicked���\�b�h�̒�`�B
    public void mouseClicked(MouseEvent e) {
      Cx = e.getX(); // �N���b�N�����_��x���W���擾����B 
      Cy = e.getY(); // �N���b�N�����_��y���W���擾����B 
      repaint();
    }
  }
}
