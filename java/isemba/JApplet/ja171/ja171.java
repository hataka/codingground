//  -*- mode: java -*-  Time-stamp: <08/07/22(��) 13:27:07 hata>
/**
 * <pre>
===================================================================================
 * �v���O������: ja171.java
 * �쐬��: Time-stamp: <08/07/22(��) 18:03:29 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * ����: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << ja171.java >>
//
//  �i�`�����������i�T�j�FHTML�������̃p�����[�^�̎擾
//  
//�@HTML�������A�^�O�ɋL�q�����p�����[�^���A�v���b�g�ɓn�����Ƃ��ł���B
//
//  ���^�O
//    
//      ****�́A�p�����[�^��
//      ####�́A�p�����[�^�̒l�B���l�܂��͕�����B
//
//  ��java.applet.Applet�N���X����p���������\�b�h
//    public String getParameter(String name)
//      �@�\�FHTML�������ɋL�q�����p�����[�^��name�Ŏw�肳�ꂽ�p�����[�^��
//            �l���擾���߂�l�Ƃ���B�l���Ȃ��Ƃ���null��߂��B
//
////////////////////////////////////////////////////////////////////////////////
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
import javax.swing.*; 

public class ja171 extends JApplet {

  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();

    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout());

    // ���x���̐����B
    JLabel lab = new JLabel();

    // ���x�����R���e���c�y�C�����ɒǉ��B
    c.add(lab,BorderLayout.CENTER);

    // HTML��������p�����[�^���擾�B
    String s = this.getParameter("msg");
    if( s == null ) { 
      s = "���b�Z�[�W������܂���"; 
    }
    lab.setText(s);
  }
}
/**
<applet code="ja171.class" width="300" height="100">
<param name=msg value="HTML��������̃��b�Z�[�W">
</applet>
**/
