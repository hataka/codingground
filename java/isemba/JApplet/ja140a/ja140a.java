//  -*- mode: java -*-  Time-stamp: <08/07/16(��) 20:06:46 hata>
/*================================================================
 * �v���O������: ja140a.java
 * �쐬��: Time-stamp: Time-stamp: <08/06/19(��) 04:44:40 hata>
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  ����:
 *================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << ja140a.java >>
//
//  �i�`�����������i�Q�j�F���i�i�v���O���X�o�[�A�z�u�j
//
//�@�@�i���󋵂�\������v���O���X�o�[�������B
//
//�@��JProgressBar�N���X
//
//�@��JProgressBar�N���X�̃R���X�g���N�^
//    public JProgressBar(int min, int max)
//�@�@�@�@�\�F���������̐i���o�[���쐬����B�͈͂��ŏ��lmin����эő�lmax
//�@�@�@�@�@�@�Ƃ���B�i���o�[�̏����l�͍ŏ��l�ɐݒ肷��B
//�@�@�@�@�@�@�f�t�H���g�Ń{�[�_�̓y�C���g����A�i��������̓y�C���g����Ȃ��B
//    public JProgressBar(int orient, int min, int max)
//�@�@�@�@�\�F����orient�̐i���o�[���쐬����B�͈͂��ŏ��lmin����эő�lmax
//�@�@�@�@�@�@�Ƃ���B�i���o�[�̏����l�͍ŏ��l�ɐݒ肷��B
//�@�@�@�@�@�@�f�t�H���g�Ń{�[�_�̓y�C���g����A�i��������̓y�C���g����Ȃ��B
//
//�@��JProgressBar�N���X�̃��\�b�h
//    public void setStringPainted(boolean b)
//�@�@�@�@�\�F�i���o�[���i���������`�悷�邩�ǂ������w�肷��B
//�@�@�@�@�@�@�f�t�H���g�ł� false �ɐݒ肳�ꕶ����̓y�C���g����Ȃ��B
//�@�@�@�@�@�@b��true�ɂ���ƁA�i���o�[�ɕ������`�悷��悤�ɂȂ�B
//    public void setValue(int n)
//�@�@�@�@�\�F�i���o�[�̌��݂̒l��n�ɐݒ肷��B
//    public void setString(String s)
//      �@�\�F�i��������s�̒l��ݒ肷��B�f�t�H���g�́Anull�ɐݒ肳��Ă���B
//
////////////////////////////////////////////////////////////////////////////////
import java.awt.*;
import javax.swing.*;

/*
<!-- to Run: %appletviewer ja140a.java -->
<applet code="ja140a.class" width="800" height="200">
</applet>
*/

public class ja140a extends JApplet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();
    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����GridLayout�ɐݒ�B
    c.setLayout(new GridLayout(1,1));

    // �v���O���X�o�[�̍쐬�B
    JProgressBar pb = new JProgressBar(0, 100);
    int n=30;
    pb.setValue(n);
    pb.setStringPainted(true);
    pb.setString(n+"%");

    // �v���O���X�o�[���R���e���c�y�C�����ɒǉ��B
    c.add(pb);
  }
}
