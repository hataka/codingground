<!--====================================================================-->
<!-- << ja101.htm >>                                                    -->
<!--                                                                    -->
<!--  JAVAプログラミング　　　　　　　　　　　　　　　　　　　　　　　  -->
<!--                                                                    -->
<!--====================================================================-->

<html>
<head>
  <META http-equiv=Content-Type content="text/html; charset=shift_jis">
  <title>JAVAプログラミング</title>
</head>

<body bgcolor="white" text="black">

<pre>
////////////////////////////////////////////////////////////////////////////////
//  << ja101.java >>
//
//  ＪＡｐｐｌｅｔ（０）：概説
//
//  ●アプレット
//
//　　・Webブラウザ上で実行されるクラスファイルをアプレットという。
//　　　Webサーバ上に存在し、Webブラウザからの依頼でWebブラウザに送られる。
//　　　文字や図形、画像を表示したり、ボタンやメニューをクリックして対応する処理
//　　　を実行したりすることができる。
//　　・アプレットはWebブラウザ側で実行されるため、ユーザのファイルを書き換え
//　　　たり、ユーザのプログラムを起動したりしないように制約が課せられている。
//　　　この制約をサンドボックスと呼ぶ。
//
//　●アプレットの書き方
//
// 　 ・アプレットは、JAppletクラスのサブクラスとして定義する。
//
//　       import java.awt.*;
//　       import javax.swing.*;
//         public class アプレット名 extends JApplet {
//           ・・・
//           public void init() { ・・・ }
//           public void start() { ・・・ }
//           public void stop() { ・・・ }
//           public void destroy() { ・・・ }
//           ・・・
//         }
//
//　　・JAppletクラスが定義しているメソッド(init,start,stop,destroy)を
//    　オーバーライドしてプログラムを作成するのが基本である。
//   　 これらのメソッドは、自分で起動する必要はなく、Webブラウザから呼び出され
//   　 実行される。
//
//　●アプレットの動作
//
//　　・アプレットの記述を含むHTMLファイルに移動すると、
//　　　init,startの順にメソッドが起動される。
//　　・他のページに移動すると、stopメソッドが起動され、アプレットの動作を
//　　　停止させる。
//　　・アプレットの記述されたページに戻ってくると、startメソッドが
//　　　起動される。　　　
//
//      public void init()
//        機能：アプレットのロード時に１回だけ呼び出される。
//              デフォルトで何もしない。処理をオーバーライドする。
//              変数の初期値設定、ボタンやメニューの設定などに使われる。
//
//      public void start()
//        機能：アプレットの開始時と他のページに移動して戻って来るたびに
//　　  　　　　呼び出される。
//              デフォルトで何もしない。処理をオーバーライドする。
//
//      public void stop()
//        機能：ブラウザで他のページに移動したときに呼び出される。
//              デフォルトで何もしない。処理をオーバーライドする。
//
//      public void destroy()
//        機能：アプレットのアンロード時に呼び出される。
//              デフォルトで何もしない。処理をオーバーライドする。
//
//  ●javax.swingパッケージ
//
//　　・関連ある複数のクラスをまとめたものを、パッケージまたはクラスライブラリ
//    　という。javax.swingパッケージには、アプレットを作成するときに必要な
//　　　クラス(JApplet)やウィンドウ上のボタン、メニューなどの部品に関連する
//　　　クラス(Jbutton,JMenuなど)が含まれている。
//　　　このパッケージを利用すると、ウィンドウ上の部品を操作して処理を進める
//　　　プログラムを作成できる。
//    ・パッケージを使うときは、プログラムの先頭で、
//　　　　　import パッケージ名.クラス名;
//    　と書く。
//    　このようにすると、プログラム内でパッケージに含まれるクラスを使うときに、
//　　　本来は、パッケージ名.クラス名として書く必要があるが、パッケージ名を省略
//　　　できる。
//　　・ブラウザはアプレットから見るとパッケージの外になるので、アプレットには
//　　　public指定をしておき、どこからでもアクセスできるようにしておく必要がある。
//　　　ブラウザから呼び出されるメソッド（init,start,stop,destroy）についても、
//   　 同様の理由でpublic指定が必要となる。
//
//  ●アプレットの作成および実行手順
//
//　　（１）テキストエディタでソースファイル(ap.java)を作成する。
//
//　　（２）javacでコンパイルする。
//　　　　　現在のディレクトリの下にクラスファイル(ap.class)ができる。
//
//          % javac ap.java
//
//　　（３）HTMLファイル(ap.htm)を現在のディレクトリの下に作成し、
//　　　　　appletタグを書く。
//
//          <html>
//            ・・・
//            <applet code="アプレット名" width="www" height="hhh">
//            </applet>
//            ・・・
//          </html>
//
//          codeは、アプレットの名前（ap.class）
//　　      widthは、アプレットの窓の幅（ピクセル単位）
//　　      heightは、アプレットの窓の高さ（ピクセル単位）
//
//　　（４）appletviewerでチェックする、またはブラウザでHTMLファイル
//          (ap.htm)を開く。
//
//          % appletviewer ap.htm
//
////////////////////////////////////////////////////////////////////////////////
</pre>

</body>
</html>
