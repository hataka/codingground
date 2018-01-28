// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j831g.java 
 * created : Time-stamp: <09/07/02(木) 08:35:13 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j831g.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j831g.java >>
//
//  データ構造（３）：集合（HashSetクラス、整列化）
//
//　　集合をバイト列に変換しファイルに保存・復元する。
//
//    整列化するオブジェクトはSerializableインターフェースを実装する必要がある。
//    public class HashSet extends AbstractSet
//                         implements Set, Cloneable, Serializable
//
//　●java.io.ObjectOutputStreamクラス
//
//　○ObjectOutputStreamクラスのコンストラクタ
//　　ObjectOutputStream(OutputStream os)
//      機能：OutputStream osに書き込むObjectOutputStreamを生成する。
//　　
//　○ObjectOutputStreamクラスのメソッド
//　　void writeObject(Object obj)
//      機能：オブジェクトobjをObjectOutputStreamに書き込む。
//
//　●java.io.ObjectIntputStreamクラス
//
//　○ObjectIntputStreamクラスのコンストラクタ
//　　ObjectInputStream(InputStream is)
//      機能：InputStream isからObjectInputStreamを生成する。
//　　
//　○ObjectInputStreamクラスのメソッド
//　　Object readObject()
//      機能：ObjectInputStreamからオブジェクトを読み込む。
//
////////////////////////////////////////////////////////////////////////////////
 
import java.util.*;
import java.io.*;

class j831g {

  public static void main(String args[]) {

    // 空の集合を作成。
    HashSet<String> hs = new HashSet<String>();

    // 要素を追加。
    hs.add("aaa");
    hs.add("bbb");
    hs.add("ccc");
    hs.add("ddd");

    System.out.println("すべての要素(整列化前)：" + hs);
    System.out.println();

    try {
      // 保存用ファイル名。
      String f = "j831g.txt";

      // 出力ストリームの生成。
      FileOutputStream fos = new FileOutputStream(f);
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      // 集合を整列化し、oosに書き込む。
      oos.writeObject(hs);
      System.out.println("集合をバイト列に変換しファイルの保存");
      System.out.println();

      // 出力ストリームを閉じる。
      fos.close();
      oos.close();

      // 入力ストリームの作成。
      FileInputStream fis = new FileInputStream(f);
      ObjectInputStream ois = new ObjectInputStream(fis);

      // oisからオブジェクトを入力。
      HashSet g = (HashSet)ois.readObject();
      System.out.println("バイト列のファイルから集合を復元");
      System.out.println();

      // オブジェクトの確認。
      System.out.println("すべての要素(整列化後)：" + g);

      // 入力ストリームを閉じる。
      fis.close();
      ois.close();

    } catch ( Exception e ) { 
      System.out.println(e);
    }

  }

}
/*
</pre>       

<font size=5 color=blue>実行結果</font>

<pre>
% javac j831g.java
注: j831g.java の操作は、未チェックまたは安全ではありません。
注: 詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j831g
すべての要素(整列化前)：[ccc, aaa, ddd, bbb]

集合をバイト列に変換しファイルの保存

バイト列のファイルから集合を復元

すべての要素(整列化後)：[ccc, aaa, ddd, bbb]
</pre>

</body>
</html>
*/
