////////////////////////////////////////////////////////////////////////////////
// << ja103.java >>
//
//  �i�`�����������i�O�j�FJava�R���\�[��
//
//  ��Java�R���\�[��
//�@�@�A�v���b�g�̎��s���ɃG���[����������ƁAJava�R���\�[���ɃG���[���b�Z�[�W
//�@�@���\�������B�܂��A�A�v���b�g���ɁASystem.out.println()���\�b�h��
//�@�@System.err.println()���\�b�h���L�q���Ă����ƁAJava�R���\�[���ɕ\�������B
//
//  ��Java2��Java�R���\�[���̋N��
//�@�@�EInternet Explorer�̏ꍇ 
//    �@(1)�u�c�[���v���N���b�N�B
//      (2)�uSun��Java�R���\�[���v���N���b�N�B
//�@�@�@�^�X�N�o�[��Java�A�C�R�����N���b�N���Ă��悢�B
//
////////////////////////////////////////////////////////////////////////////////

import java.awt.*;                                                 
import javax.swing.*;                                              
                                                                   
public class ja103 extends JApplet {                            
                                                                   
  public void init() {                                             
    System.out.println("init() method");
  }                                                                

  public void start() {                                             
    System.out.println("start() method");
  }                                                                

  public void stop() {                                             
    System.err.println("stop() method");
  }                                                                

  public void destroy() {                                             
    System.err.println("destroy() method");
  }                                                                
}
/**
<applet code="ja103.class" width="200" height="200"></applet>

<img src="ja103.jpg" width="400" height="600">
**/
