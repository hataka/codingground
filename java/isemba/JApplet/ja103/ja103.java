////////////////////////////////////////////////////////////////////////////////
// << ja103.java >>
//
//  ＪＡｐｐｌｅｔ（０）：Javaコンソール
//
//  ●Javaコンソール
//　　アプレットの実行時にエラーが発生すると、Javaコンソールにエラーメッセージ
//　　が表示される。また、アプレット中に、System.out.println()メソッドや
//　　System.err.println()メソッドを記述しておくと、Javaコンソールに表示される。
//
//  ●Java2のJavaコンソールの起動
//　　・Internet Explorerの場合 
//    　(1)「ツール」をクリック。
//      (2)「SunのJavaコンソール」をクリック。
//　　　タスクバーのJavaアイコンをクリックしてもよい。
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
