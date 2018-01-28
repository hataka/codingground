//  -*- mode: java -*-  Time-stamp: <08/07/16(��) 20:11:50 hata>
/*================================================================
 * �v���O������: ja140b.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja140b.java >>
//
//  �i�`�����������i�Q�j�F���i�i�v���O���X�o�[�A�z�u�A�C�x���g�����j
//
//�@�@�^�C�}�[�ƘA�����A60�b�̐i���󋵂�\������v���O���X�o�[�������B
//
//�@���C�x���g����
//�@�@�C�x���g�\�[�X�FTimer�N���X
//�@�@�C�x���g      �FActionEvent�N���X
//�@�@�C�x���g���X�i�FActionListener�C���^�[�t�F�[�X
//�@�@�@�@�@�@�@�@�@�@actionPerformed���\�b�h
//
//�@��javax.swing.JComponent�N���X����p���������\�b�h
//    public void setBorder(Border border)
//      �@�\�F���i�ɕ`�悳���{�[�_border��ݒ肷��B
//
//�@��TitledBorder�N���X
//�@�@�^�C�g�����ʒu����шʒu�������w�肵�Ēǉ����A�C�ӂ̃{�[�_����������N���X�B
//
//�@��TitledBorder�N���X�̃R���X�g���N�^
//    public TitledBorder(String s)
//      �@�\�F�^�C�g���𕶎���s�Ƃ���TitledBorder�I�u�W�F�N�g���쐬����B 
//
////////////////////////////////////////////////////////////////////////////////
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/*
<applet code="ja140b.class" width="800" height="600">
</applet>
*/

public class ja140b extends JApplet implements ActionListener {

  JProgressBar pb;
  int n = 0;
  Timer timer = new Timer(1000,this);

  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();
    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����FlowLayout�ɐݒ�B
    c.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));

    // �v���O���X�o�[�̍쐬�B
    pb = new JProgressBar(0, 60);
    pb.setBorder(new TitledBorder("JProgressBar"));

    // �v���O���X�o�[���R���e���c�y�C�����ɒǉ��B
    c.add(pb);
  }

  public void start() { timer.start(); }

  // ActionListener�C���^�[�t�F�[�X�̃��\�b�h�B            
  public void actionPerformed(ActionEvent e) {             
    if( n == 60 ) { 
      timer.stop(); 
    } else {
      n++;
      pb.setValue(n);
      pb.setStringPainted(true);
      pb.setString(n+"�b");
    }
  }
}
