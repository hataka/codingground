// -*- mode: java -*- Time-stamp: <2009-06-18 10:43:37 kahata>
/*====================================================================
 * name: j611.java
 * created : Time-stamp: <09/06/18(木) 10:40:59 hata>
 * $Id$
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/FILE/j611.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << j611.java >>
//
//  ファイル処理（１）ファイルの属性
//
//    ファイルに関する情報（許可情報、サイズなど）を表示する。
//
//　●java.io.Fileクラス
//    Fileクラスは、ファイルやディレクトリを操作するメソッドをもつが、ファイルの
//　　内容を変更するメソッドはもたない。
//
//　○Fileクラスのコンストラクタ
//    File(String s)
//      機能：パス名sで指定されたファイルに対するオブジェクトを作成。
//
//  ○Fileクラスのメソッド
//    public String getName()
//      機能：ファイル名を返す。
//    public String getAbsolutePath()
//      機能：絶対パス名を返す。
//    public boolean exists()
//      機能：ファイルの存在確認。
//    public boolean canRead()
//      機能：ファイルが読み込み可の場合true、その他falseを返す。
//    public boolean canWrite()
//      機能：ファイルが書き込み可の場合true、その他falseを返す。
//    public long length()
//      機能：ファイルの大きさを返す。
//    public long lastModified()
//      機能：最終更新時刻(1970年1月1日からのミリ秒)を返す。
//
/////////////////////////////////////////////////////////////////////////

import java.io.File;
import java.util.Date;

class j611 {

  public static void main(String args[]) {

//  File f = new File(args[0]); // arg[0]はファイル名。
    File f = new File("j611.java"); //

    // ファイルの存在を確認。
    if( f.exists() ) {
      System.out.println("ファイル（" + f.getName() + "）は存在する");
    } else {
      System.out.println("ファイル（" + f.getName() + "）は存在しない");
      System.exit(0);
    }

    // ファイルの属性を表示。
    System.out.println("ファイル名　：" + f.getName());
    System.out.println("絶対パス名　：" + f.getAbsolutePath());
    System.out.println("サイズ　　　：" + f.length());
    System.out.println("最終更新時刻：" + f.lastModified());
    System.out.println("最終更新時刻：" + new Date(f.lastModified()));
    if( f.canRead() ) {
      System.out.println("読み込み　：可");
    } else {
      System.out.println("読み込み　：不可");
    }
    if( f.canWrite() ) {
      System.out.println("書き込み　：可");
    } else {
      System.out.println("書き込み　：不可");
    }
    System.out.println(Lib.basename("C:\\sss\\aaa\\bbb.ccc"));
  }
}
