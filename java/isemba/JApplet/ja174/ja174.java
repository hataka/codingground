////////////////////////////////////////////////////////////////////////////////
//  << ja174.java >>
//
//  ＪＡｐｐｌｅｔ（５）：アプレットとJARファイル
//  
//　　複数のファイルを圧縮して、ひとつのファイルにしたものをJARファイルという。
//　　アプレットの実行に必要なファイルをJARファイルにしておき、、appletタグで
//　　archive指定をすると、Webサーバからのダウンロードが１回で済み、効率が
//　　よくなる。
//
//　●手順
//　　手順(1) % javac ja174.java
//            2個のファイル ja174.class ja174$tokei.classが作られる。
//  　手順(2) % jar cf ja174.jar ja174.class j174$tokei.class
//            JARファイル(ja174.jar)を作る。
//    手順(3) HTMLファイル中にarchiveパラメータを指定する。
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
    // アプレットからコンテンツペインを取得。
    Container c = this.getContentPane();

    // コンテンツペインのレイアウトマネージャをBorderLayoutに設定。
    c.setLayout(new BorderLayout());

    // ラベルの作成。
    lab = new JLabel();

    // ラベルをコンテンツペイン内に追加。
    c.add(lab,BorderLayout.CENTER);
  }

  public void start() {
    th = new tokei();
    th.start();
  }

  // 停止処理。
  public void stop() {
    th = null;
  }

  // スレッドの本体。
  class tokei extends Thread {
    public void run() {
      while( true ) {
        try {
          Date t = new Date();
          lab.setText(t.toString());
          Thread.sleep(1000); // 1000ミリ秒間スリープする。
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
