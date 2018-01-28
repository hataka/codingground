// -*- mode: java -*- Time-stamp: <2009-06-19 11:29:47 kahata>
/*====================================================================
 * name: j821g.java 
 * created : Time-stamp: <09/06/19(金) 11:26:45 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links:
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/COLLECTION/j821g.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << j821g.java >>
//
//  データ構造（１）：リスト（LinkedListクラス、整列化）
//
//　　リストをバイト列に変換しファイルに保存・復元する。
//
//    整列化するオブジェクトはSerializableインターフェースを実装する必要がある。
//    public class LinkedList extends AbstractSequentialList
//                            implements List, Cloneable, Serializable

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
/////////////////////////////////////////////////////////////////////////
 
import java.util.*;
import java.io.*;

class j821g {

  public static void main(String args[]) {

    // 空のリストを生成。
    LinkedList<String> a = new LinkedList<String>();

    // 要素を追加。
    a.add("aaa");
    a.add("bbb");
    a.add("ccc");
    a.add("ddd");

    System.out.println("すべての要素(整列化前)：" + a);
    System.out.println();

    try {
      // 保存用ファイル名。
      String f = "j821g.dat";

      // 出力ストリームの生成。
      FileOutputStream fos = new FileOutputStream(f);
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      // リストを整列化し、oosに書き込む。
      oos.writeObject(a);
      System.out.println("リストをバイト列に変換しファイルの保存");
      System.out.println();

      // 出力ストリームを閉じる。
      fos.close();
      oos.close();

      // 入力ストリームの作成。
      FileInputStream fis = new FileInputStream(f);
      ObjectInputStream ois = new ObjectInputStream(fis);

      // oisからオブジェクトを入力。
      LinkedList b = (LinkedList)ois.readObject();
      System.out.println("バイト列のファイルからリストを復元");
      System.out.println();

      // オブジェクトの確認。
      System.out.println("すべての要素(整列化後)：" + b);

      // 入力ストリームを閉じる。
      fis.close();
      ois.close();

    } catch ( Exception e ) { 
      System.out.println(e);
    }
  }
}
/*
実行結果
% javac j821g.java
注: j821g.java の操作は、未チェックまたは安全ではありません。
注: 詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j821g
すべての要素(整列化前)：[aaa, bbb, ccc, ddd]

リストをバイト列に変換しファイルの保存

バイト列のファイルからリストを復元

すべての要素(整列化後)：[aaa, bbb, ccc, ddd]
*/
