//  -*- mode: java -*-  Time-stamp: <08/07/21(��) 07:06:50 hata>
/**
 * <pre>
===================================================================================
 * �v���O������: ja152b.java
 * �쐬��: Time-stamp: <08/07/21(��) 07:21:30 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * ����: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja152b.java >>
//
//  �i�`�����������i�R�j�F�}�E�X����i�����̕`��A�C�x���g�����A�����N���X�j
//
//�@������
//    �}�E�X���N���b�N����ƁA���O�ɃN���b�N�����ʒu�ƌ��݂̈ʒu�𒼐��Ō��ԁB
//    (���O�Ɉ����ꂽ�����͏�����B)
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�F�}�E�X����
//�@�@�C�x���g�@�@�@�FMouseEvent�N���X
//�@�@�C�x���g���X�i�FMouseAdapter�N���X
//�@�@�@�@�@�@�@�@�@  mouseClicked���\�b�h
//
//�@�������N���X
//�@�@�����N���X�́A�I�u�W�F�N�g���P�񂵂��쐬���Ȃ��Ƃ��Ɏg����B
//�@�@�v���O�������Ȍ��ɋL�q�ł���B
//
//�@�@    new �e�N���X��(����) {
//          ����                
//        }                     
//
//�@�@�E�R���p�C�������ƁA�Q�̃N���X�t�@�C�����쐬�����B
//�@�@�@j152b.class, j152b$1.class, j152b$2.class
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

public class ja152b extends JApplet {

  int Px=0,Py=0; // ���O�̈ʒu�B
  int Cx,Cy; // ���݂̈ʒu�B
  JPanel p;

  // init���\�b�h�̒�`�B
  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();
    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout());

    // �p�l�����`(�����N���X)�B
    p = new JPanel() {                                               
      public void paintComponent(Graphics g) {                   
        super.paintComponent(g);                                 
        // �����`��B                                            
        if( (Px == 0)&&(Py == 0) ) { Px = Cx; Py = Cy; }         
        g.drawLine(Px,Py,Cx,Cy);                                 
        // ���O�̈ʒu���X�V�B                                    
        Px = Cx; Py = Cy;                                        
      }                                                  
    };                                                   
    // �R���e���c�y�C���ɒǉ��B
    c.add(p,BorderLayout.CENTER);   

    // �C�x���g���X�i���`(�����N���X)�B                                    
    MouseAdapter ma = new MouseAdapter() {                                     
      // mouseClicked���\�b�h�̒�`�B                                        
      public void mouseClicked(MouseEvent e) {                               
        Cx = e.getX(); // �N���b�N�����_��x���W���擾����B                  
        Cy = e.getY(); // �N���b�N�����_��y���W���擾����B                  
        p.repaint();                                                           
      }                                                                      
    };
    // �C�x���g���X�i�̓o�^�B
    this.addMouseListener(ma);    
  }
}
