//  -*- mode: java -*-  Time-stamp: <08/07/16(��) 16:31:25 hata>
/*================================================================
 * �v���O������: ja139a.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja139a.java >>
//
//  �i�`�����������i�Q�j�F���i�i�X���C�_�[�A�z�u�j
//
//�@�@�X���C�_�[�́A�������\�����ꂽ��ԓ��Ńm�u���X���C�h���邱�Ƃɂ��
//�@�@�ڐ���̒l��I���ł��镔�i�ł���B
//�@�@�X���C�_�́A��ڐ���ƁA���̊Ԃ̏��ڐ���̗�����\���ł���B
//
//�@��JSlider�N���X
//�@�@�X���C�_�[�������N���X�B
//
//�@��JSlider�N���X�̃R���X�g���N�^
//    public JSlider(int min, int max, int value)
//�@�@�@�@�\�F�ŏ��lmin�A�ő�lmax�A����я����lvalue���w�肵�āA�����X���C�_��
//�@�@�@�@�@�@�쐬����B
//    public JSlider(int orientation, int min, int max, int value)
//�@�@�@�@�\�F����orientation�A�ŏ��lmin�A�ő�lmax�A����я����lvalue���w�肵�āA
//            �X���C�_���쐬����B 
//�@�@�@�@�@�@�����FVERTICAL�AHORIZONTAL
//
//�@��JSlider�N���X�̃��\�b�h
//    public void setMajorTickSpacing(int n)
//�@�@�@�@�\�F��ڐ���̊Ԋun��ݒ肷��B
//�@�@�@�@�@�@�͈͂� 0 �` 50 �̃X���C�_�ŁA��ڐ���̊Ԋu��10�̏ꍇ�A
//�@�@�@�@�@�@0,10,20,30,40,50�ɑ�ڐ��肪�t������B 
//    public void setMinorTickSpacing(int n)
//      �@�\�F���ڐ���̊Ԋun��ݒ肷��B
//�@�@�@�@�@�@�͈͂� 0 �` 50 �̃X���C�_�ŁA���ڐ���̊Ԋu��2�̏ꍇ�́A
//�@�@�@�@�@�@0,2,4,...,48,50�ɏ��ڐ��肪�t������
//    public void setPaintTicks(boolean b)
//      �@�\�F�ڐ��肪�X���C�_�Ńy�C���g����邩�ǂ������w�肷��B
//            true�̏ꍇ�A�ڐ��肪�\������Afalse�̏ꍇ�A�ڐ��肪�\������Ȃ��B
//    public void setPaintLabels(boolean b)
//      �@�\�F���x�����X���C�_�Ńy�C���g����邩�ǂ������w�肷��B 
//            true�̏ꍇ�A�ڐ���̒l���\������Afalse�̏ꍇ�A�ڐ���̒l��
//�@�@�@�@�@�@�\������Ȃ��B
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;
import javax.swing.*;

/*
<applet code="ja139a.class" width="320" height="240">
</applet>
*/

public class ja139a extends JApplet {

  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();
    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����GridLayout�ɐݒ�B
    c.setLayout(new GridLayout(1,1));

    // �X���C�_�[�̍쐬�B
    JSlider sd = new JSlider(0, 50, 10);
    sd.setMajorTickSpacing(10);
    sd.setMinorTickSpacing(2);
    sd.setPaintTicks(true);
    sd.setPaintLabels(true);

    // �X���C�_�[���R���e���c�y�C�����ɒǉ��B
    c.add(sd);
  }
}
