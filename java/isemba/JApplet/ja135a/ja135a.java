//  -*- mode: java -*-  Time-stamp: <08/06/20(��) 18:16:59 hata>
/*================================================================
 * �v���O������: ja135a.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/JAPPLET/ja133a.htm
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja135a.java >>
//
//  �i�`�����������i�Q�j�F���i�i�X�v���b�g�y�C���A�z�u�j
//
//�@�@�\���̈�S�̂����E�ɂQ��������B
//
//�@��JSplitPane�N���X
//�@�@��ʂ𕪊�����̂ɁAJSplitPane�N���X���g���B
//
//�@��JSplitPane�N���X�̃R���X�g���N�^      
//    public JSplitPane(int d)
//      �@�\�F����d�ɕ������V����JSplitPane���쐬����B 
//    �@�@�@  �@JSplitPane.HORIZONTAL_SPLIT  ���������i���E�j�ɕ����B
//    �@�@�@  �@JSplitPane.VERTICAL_SPLIT    ���������i�㉺�j�ɕ����B
//
//�@��JSplitPane�N���X�̃��\�b�h    
//    public void setLeftComponent(Component comp)
//      �@�\�F���icomp������(�㕔)�ɐݒ肷��B 
//    public void setRightComponent(Component comp)
//      �@�\�F���icomp���E��(����)�ɐݒ肷��B 
//    void setContinuousLayout(boolean b)
//    �@�@�\�Ftrue�̏ꍇ�A�A���X�V�@�\��L���ɂ���B
//�@�@�@�@�@�@�A���X�V�@�\���L���ɂȂ�ƁA�������̈ړ��ɉ����ĕ����̈悪
//�@�@�@�@�@�@�X�V����ĕ`�悳���B
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*; 
import javax.swing.*;

public class ja135a extends JApplet {

  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();
   // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W���[��BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout());

    // �R�̗̈�����x���Ƃ���B
    JButton b1 = new JButton("�{�^���P");
    JButton b2 = new JButton("�{�^���Q");
    JButton b3 = new JButton("�{�^���R");

    // ���E�ɕ����B
    JSplitPane sp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
    // �A���X�V�@�\��ݒ�B
    sp.setContinuousLayout(true);
    // �����Ƀ{�^��b1�����蓖�Ă�B
    sp.setLeftComponent(b1);
    // �E���Ƀ{�^��b2,b3�����蓖�Ă�B
    JPanel p = new JPanel();
    p.add(b2);
    p.add(b3);
    sp.setRightComponent(p);
    
    // �X�v���b�g�y�C�����R���e���c�y�C�����ɒǉ��B
    c.add(sp,BorderLayout.CENTER);
  }
}
