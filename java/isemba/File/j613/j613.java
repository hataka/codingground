// -*- mode: java -*- Time-stamp: <09/05/19 16:28:13 kazuhiko>
/*====================================================================
 * name: j613.java 
 * created : Time-stamp: <09/06/26(金) 06:00:12 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/FILE/j613.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j613.java >>
//
//  ファイル処理（１）ファイル管理（ディレクトリ下のファイル名を表示）
//
//    指定したディレクトリの下にあるすべてのファイル、ディレクトリを表示する。
//    ディレクトリはコマンドラインから入力する。
//
//　●Fileクラスのコンストラクタ。
//    File(String s)
//      機能：ディレクトリまたはファイルsに対するオブジェクトを作成。 
//    File(String s, String t)
//      機能：親パス名s、子パス名tに対するオブジェクトを作成。 
//
//  ●Fileクラスのメソッド
//    public String getPath()
//      機能：パス名を返す。
//    public String[] list()
//      機能：ディレクトリ内のすべてのファイル名とディレクトリ名を文字型配列に返す。
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j613 {

  public static void main(String args[]) {

    // 引数の解析。指定がない場合、カレントディレクトリに設定。
    String dirname;
    if( args.length == 1 ) { dirname = args[0]; } else { dirname = "."; }

    try {
      // ディレクトリに対するオブジェクトを作成。
      File d = new File(dirname);

      // 引数がディレクトリか否かチェック。
      if( !d.isDirectory() ) {
        System.out.println(dirname + "はディレクトリではない");
        System.exit(0); 
      } 

      // パス名を表示。
      String path = d.getPath();
      System.out.println("指定したディレクトリ：" + path); 

      // ディレクトリ下のファイル、ディレクトリを表示。 
      String a[] = d.list();
      for( int i=0; i<a.length; i++ ) {
        // ディレクトリ(dirname)下のファイルまたはディレクトリ(a[i])の
        // オブジェクトを作成。
        File g = new File(dirname,a[i]); 

        // ディレクトリかどうかの確認して表示。
        if( g.isDirectory() ) {
          System.out.println(i + ": " + a[i] + "(ディレクトリ)");
        } 

        // ファイルかどうかの確認して表示。
        if( g.isFile() ) {
          System.out.println(i + ": " + a[i] + "(ファイル)");
        }
      }
    } catch ( Exception e ) { }
  }
}
/*
実行結果
% java j613 TEST
指定したディレクトリ：TEST
0: file1(ファイル)
1: file2(ファイル)
2: DIR2(ディレクトリ)
3: DIR1(ディレクトリ)
*/
