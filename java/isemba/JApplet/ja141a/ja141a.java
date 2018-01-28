// -*- mode: java -*- Time-stamp: <2009-06-19 20:13:13 kahata>
/*====================================================================
 * name: ja141a.java 
 * created : Time-stamp: <08/07/20(��) 11:12:02 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * description:
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja141a.java >>
//
//  �i�`�����������i�Q�j�F���i�i�p�X���[�h�t�B�[���h�A�z�u�j
//
//�@�@�p�X���[�h�̓��͗��������i�������B
//
//�@��JPasswordField�N���X
//�@  1�s�̕ҏW�\�ȃe�L�X�g���͗������B�������A���͂��������͂��̂܂�
//�@�@�\�����ꂸ�A����Ɂ����\�������B
//
//�@��JPasswordField�N���X�̃R���X�g���N�^
//    public JPasswordField(int col)
//      �@�\�F��col�ŐV�K�̋��JPasswordField���쐬����B
//�@�@�@�@�@�@�f�t�H���g�̏����������null�ɐݒ肳���B
//    public JPasswordField(String s, int col)
//�@�@�@�@�\�F�e�L�X�gs�Ɨ�col�ŁA�����������JPasswordField���쐬����B
//
////////////////////////////////////////////////////////////////////////////////
/*===================================================================================
 * </pre>
 * @package    JApplet
 * @subpackage
 * @author    kahata <kazuhiko.hata@nifty.com>
 * @copyright 2003-2008 kahata
 * @license   http://www.debian.org/misc/bsd.license  BSD License (3 Clause)
 * @version   1.0
 * @link      http://pear.php.net/package/phpDocumentor
*=================================================================================*/

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;

/*
<applet code="ja141a.class" width="800" height="600">
</applet>
*/

public class ja141a extends JApplet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();
    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����FlowLayout�ɐݒ�B
    c.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

    // �p�X���[�h�t�B�[���h�̍쐬�B
    JPasswordField pf = new JPasswordField(20);
    pf.setBorder(new TitledBorder("JPasswordField"));

    // �p�X���[�h�t�B�[���h���R���e���c�y�C�����ɒǉ��B
    c.add(pf);
  }
}
