// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * title: 
 * file: j191a.java 
 * created : Time-stamp: <09/06/30(火) 17:06:46 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j191a.htm
 * description: JavaConsoleApplication  Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j191a.java >>
//
//  基礎（９）：コマンドラインから文字列入力
//
//　　コマンドラインから入力された引数は、String型配列args[]に格納されていく。
//
//      % java クラス名 引数１ 引数２ 引数３
//        args[0]=引数１　args[1]=引数２　args[2]=引数３
//
//    この方法でプログラムにデータを入力できる。必要なら文字列から他の型に
//    変換すればよい。
//
//　●配列の長さ
//　　配列名.length は配列の長さを表す。
//
////////////////////////////////////////////////////////////////////////////////

class j191a {
  public static void main(String args[]) {

    // 引数の表示。
    if( args.length > 0 ) {
      for( int i=0; i<args.length; i++ ) {
        System.out.println("args[" + i + "]:" + args[i]);
      }
    } else {
      System.out.println("引数がありません");
    }
  }
}
/*
</pre> 

<font size=5 color=blue>実行結果</font>

<pre>
% javac j191a.java

% java j191a abc 123 日本語
args[0]:abc
args[1]:123
args[2]:日本語
</pre>

</body>
</html>
*/
