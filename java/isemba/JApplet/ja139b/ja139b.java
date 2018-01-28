//  -*- mode: java -*-  Time-stamp: <08/07/16(��) 18:30:53 hata>
/*================================================================
 * �v���O������: ja139a.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja139b.java >>
//
//  �i�`�����������i�Q�j�F���i�i�X���C�_�[�A�z�u�A�C�x���g�����j
//
//�@�@�X���C�_�[�őI�����ꂽ�l�����x���ɕ\������
//
//�@��ChangeListener�C���^�[�t�F�[�X
//    ChangeEvent �ɑҋ@���郊�X�i�[�I�u�W�F�N�g���`����B 
//
//�@��ChangeListener�C���^�[�t�F�[�X�̃��\�b�h
//    public void stateChanged(ChangeEvent e)
//      �@�\�F���X�i�[�̑Ώۂ̏�Ԃ��ύX���ꂽ�Ƃ��ɌĂяo�����B
//
//�@��JSlider�N���X�̃��\�b�h
//�@�@public boolean getValueIsAdjusting()
//�@�@�@�@�\�F�X���C�_�̃m�u���h���b�O����Ă���ꍇ�� true ��Ԃ��B
//    public int getValue()
//�@�@�@�@�\�F�X���C�_�̒l��Ԃ��B 

//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

/*
<applet code="ja139b.class" width="640" height="100">
</applet>
*/

public class ja139b extends JApplet implements ChangeListener {

  JLabel lab;

  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();
    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����GridLayout�ɐݒ�B
    c.setLayout(new GridLayout(2,1));

    // �X���C�_�[�̍쐬�B
    JSlider sd = new JSlider(0, 50, 10);
    sd.setMajorTickSpacing(10);
    sd.setMinorTickSpacing(2);
    sd.setPaintTicks(true);
    sd.setPaintLabels(true);
    // �X���C�_�[���R���e���c�y�C�����ɒǉ��B
    c.add(sd);

    // ���x�����쐬�B
    lab = new JLabel();
    // ���x�����R���e���c�y�C�����ɒǉ��B
    c.add(lab);

    // �C�x���g���X�i�̓o�^�B
    sd.addChangeListener(this);
  }

  // ChangeListener�C���^�[�t�F�[�X�̃��\�b�h�B  
  public void stateChanged(ChangeEvent e) {                  
    JSlider sd = (JSlider)e.getSource();          
    // �X���C�_�[�̃m�u���h���b�O���́A�X�L�b�v�B
    if( !sd.getValueIsAdjusting() ) {               
      int v = (int)sd.getValue();                
      lab.setText("�ڐ���̒l�F" + v);                                
    }                                                  
  }                                                        
}
