// -*- mode: java -*- Time-stamp: <2009-06-18 13:47:03 kahata>
/*====================================================================
 * name: j811g.java 
 * created : Time-stamp: <09/06/18(木) 10:40:59 hata>
 * $Id$
 * To compile:
 * To run:
 * links:
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/COLLECTION/j811g.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << j811g.java >>
//
//  データ構造（１）：リスト（ArrayListクラス、整列化）
//
//　　リストをバイト列に変換しファイルに保存・復元する。
//
//    整列化するオブジェクトはSerializableインターフェースを実装する必要がある。
//    public class ArrayList extends AbstractList
//                       implements List, RandomAccess, Cloneable, Serializable
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

class j811g {

  public static void main(String args[]) {

    // 空のリストを生成。
    ArrayList<String> a = new ArrayList<String>();

    // 要素を追加。
    a.add("aaa");
    a.add("bbb");
    a.add("ccc");
    a.add("ddd");

    System.out.println("すべての要素(整列化前)：" + a);
    System.out.println();

    try {
      // 保存用ファイル名。
      String f = "j811g.dat";

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
      ArrayList<String> b = (ArrayList<String>)ois.readObject();
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
% javac j811g.java
注: j811g.java の操作は、未チェックまたは安全ではありません。
注: 詳細については、-Xlint:unchecked オプションを指定して再コンパイルしてください。

% java j811g
すべての要素(整列化前)：[aaa, bbb, ccc, ddd]

リストをバイト列に変換しファイルの保存

バイト列のファイルからリストを復元

すべての要素(整列化後)：[aaa, bbb, ccc, ddd]
*/
