////////////////////////////////////////////////////////////////////////////////
//  << ja174.java >>
//
//  �i�`�����������i�T�j�F�A�v���b�g��JAR�t�@�C��
//  
//�@�@�����̃t�@�C�������k���āA�ЂƂ̃t�@�C���ɂ������̂�JAR�t�@�C���Ƃ����B
//�@�@�A�v���b�g�̎��s�ɕK�v�ȃt�@�C����JAR�t�@�C���ɂ��Ă����A�Aapplet�^�O��
//�@�@archive�w�������ƁAWeb�T�[�o����̃_�E�����[�h���P��ōς݁A������
//�@�@�悭�Ȃ�B
//
//�@���菇
//�@�@�菇(1) % javac ja174.java
//            2�̃t�@�C�� ja174.class ja174$tokei.class�������B
//  �@�菇(2) % jar cf ja174.jar ja174.class j174$tokei.class
//            JAR�t�@�C��(ja174.jar)�����B
//    �菇(3) HTML�t�@�C������archive�p�����[�^���w�肷��B
//            &lt;applet code="ja174.class"
//                    archive="ja174.jar" width=300 height=200>
//            &lt;//applet>
//
////////////////////////////////////////////////////////////////////////////////
import java.awt.*;
import javax.swing.*;
import java.util.Date;

public class ja174 extends JApplet {

  Thread th;
  JLabel lab;

  public void init() {
    // �A�v���b�g����R���e���c�y�C�����擾�B
    Container c = this.getContentPane();

    // �R���e���c�y�C���̃��C�A�E�g�}�l�[�W����BorderLayout�ɐݒ�B
    c.setLayout(new BorderLayout());

    // ���x���̍쐬�B
    lab = new JLabel();

    // ���x�����R���e���c�y�C�����ɒǉ��B
    c.add(lab,BorderLayout.CENTER);
  }

  public void start() {
    th = new tokei();
    th.start();
  }

  // ��~�����B
  public void stop() {
    th = null;
  }

  // �X���b�h�̖{�́B
  class tokei extends Thread {
    public void run() {
      while( true ) {
        try {
          Date t = new Date();
          lab.setText(t.toString());
          Thread.sleep(1000); // 1000�~���b�ԃX���[�v����B
        } catch ( InterruptedException e ) {
          System.out.println(e);
        }
      }
    }
  }
}
/**
<applet code="ja174.class"
  archive="ja174.jar" width=300 height=200>
</applet>
**/
