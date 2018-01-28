// -*- mode: java -*- Time-stamp: <2009-07-02 17:33:46 kahata>
/*====================================================================
 * name: j851g.java 
 * created : Time-stamp: <09/07/02(木) 17:32:08 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/APPLET/j851g.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j851g.java >>
//
//  データ構造（５）：集合（HashMapクラス、整列化）
//
//　　集合をバイト列に変換しファイルに保存・復元する。
//
//    整列化するオブジェクトはSerializableインターフェースを実装する必要がある。
//    public class HashMap extends AbstractMap
//                         implements Map, Cloneable, Serializable
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

class j851g {

  public static void main(String args[]) {

    // 空のマップを作成。
    HashMap<String,String> hm = new HashMap<String,String>();

    // 要素を追加。
    hm.put("A","Airplane");
    hm.put("B","Bus");
    hm.put("C","Cap");
    hm.put("D","Desk");

    System.out.println("すべての要素(整列化前)：" + hm);
    System.out.println();

    try {
      // 保存用ファイル名。
      String f = "j851g.txt";

      // 出力ストリームの生成。
      FileOutputStream fos = new FileOutputStream(f);
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      // 集合を整列化し、oosに書き込む。
      oos.writeObject(hm);
      System.out.println("集合をバイト列に変換しファイルの保存");
      System.out.println();

      // 出力ストリームを閉じる。
      fos.close();
      oos.close();

      // 入力ストリームの作成。
      FileInputStream fis = new FileInputStream(f);
      ObjectInputStream ois = new ObjectInputStream(fis);

      // oisからオブジェクトを入力。
      HashMap g = (HashMap)ois.readObject();
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
% javac j851g.java
注:j851g.java の操作は、未チェックまたは安全ではありません。
注:詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j851g
すべての要素(整列化前)：{D=Desk, A=Airplane, C=Cap, B=Bus}

集合をバイト列に変換しファイルの保存

バイト列のファイルから集合を復元

すべての要素(整列化後)：{D=Desk, A=Airplane, C=Cap, B=Bus}

</pre>

</body>
</html>
*/
