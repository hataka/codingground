// -*- mode: java -*-  Time-stamp: <2010-04-16 16:07:20 kahata>
/*================================================================
 * file: ja117.java
 * path; F:\java\isemba\JApplet\ja117\ja117.java
 * url:  http://localhost/java/isemba/JApplet/ja117/ja117.java
 * created: Time-stamp: <2010-04-16 16:07:20 kahata>
 * $Id$
 * Programmed By: kahata
 * To compile:
 * To run: 
 * link: 
 * link: 
 * description: 
 *
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja117.java >>
//
//  �i�`�����������i�P�j�F���C�A�E�g�}�l�[�W���[�i��Έʒu�w��j
//
//�@�@���i��C�ӂ̑傫���ŁA�C�ӂ̈ʒu�ɔz�u����B
//�@�@���C�A�E�g�}�l�[�W�����g��Ȃ����Ƃ�錾����B
//
//�@�@�@�@setLayout(null)
//
//�@��Component�N���X�̃��\�b�h
//�@�@void setBounds(int x, int y, int width, int height)
//�@�@�@�@�\�F���i��z�u����B
//            x     �F�����W�B
//            y     �F�����W�B
//            width �F���B
//            height�F�����B
//
////////////////////////////////////////////////////////////////////////////////
//<applet code="ja117.class" width="300" height="200"></applet>

import java.awt.*;
import javax.swing.*; 

public class ja117 extends JApplet {

  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();
    // �R���e���c�y�C���Ƀ��C�A�E�g�}�l�[�W���̕s�g�p�ݒ�B
    c.setLayout(null);

    // �{�^���̍쐬�ƈʒu�ݒ�B
    JButton b1 = new JButton("�{�^���P");
    b1.setBounds(20,40,100,20);
    JButton b2 = new JButton("�{�^���Q");
    b2.setBounds(160,40,100,40);
    JButton b3 = new JButton("�{�^���R");
    b3.setBounds(60,100,160,60);

    // �{�^�����R���e���c�y�C�����ɒǉ��B
    c.add(b1);
    c.add(b2);
    c.add(b3);
  }
}
