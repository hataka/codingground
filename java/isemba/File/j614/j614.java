// -*- mode: java -*- Time-stamp: <2009-06-26 06:17:22 kahata>
/*====================================================================
 * name: j614.java 
 * created : Time-stamp: <09/06/26(金) 06:16:12 hata>
 * $Id$
 * Programmed by kahata
 * To compile: % javac j614.java
 * To run: % java j614 TEST
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/FILE/j614.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * JavaConsoleApplication
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
// << j614.java >>
//
//  ファイル処理（１）ファイル管理（ディレクトリ下のファイル、ディレクトリを
//　　　　　　　　　　 　　　　　　 再帰的に表示）
//
//    指定したディレクトリ下にあるすべてのファイル、ディレクトリを再帰的に表示する。
//    ファイル名はコマンドラインから入力する。
//
////////////////////////////////////////////////////////////////////////////////

import java.io.*;

class j614 {

  // ディレクトリを再帰的にたどるメソッド。
  static void search(String dirname) {
    try {
      File d = new File(dirname);
      String path = d.getPath();

      String a[] = d.list();
      for( int i=0; i<a.length; i++ ) {
        File g = new File(dirname,a[i]);

        // ディレクトリの下のディレクトリを再帰的に表示。 
        if( g.isDirectory() ) { 
          String s = dirname + "/" + a[i];
          search(s);
        } else {
          //ディレクトリの下のファイルを表示。 
          System.out.println(path + "/" + a[i]);
        }
      }

    } catch ( Exception e ) { }
  }

  public static void main(String args[]) {
    // 引数の解析。指定がない場合、カレントディレクトリに設定。
    String dirname;
    if( args.length == 1 ) { dirname = args[0]; } else { dirname = "."; }

    File d = new File(dirname);

    // 引数がディレクトリか否かチェック。
    if( !d.isDirectory() ) {
      System.err.println(dirname + "はディレクトリではありません");
      System.exit(0); 
    } else { 
      // 再帰的にディレクトリ、ファイルを表示。
      search(dirname);
    }
  }
}
