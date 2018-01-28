// -*- mode: java -*- Time-stamp: <2009-06-18 11:00:53 kahata>
/*====================================================================
 * name: j612.java 
 * created : Time-stamp: <09/06/18(木) 10:40:59 hata>
 * $Id$
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/FILE/j612.htm
 * description:
 * ====================================================================*/
/////////////////////////////////////////////////////////////////////////
// << j612.java >>
//
//  ファイル処理（１）ファイルの属性
//
//    ファイルとディレクトリを区別する。
//
//  ●Fileクラスのメソッド
//    public boolean isFile()
//      機能：通常のファイルの場合true、その他falseを返す。
//    public boolean isDirectory()
//      機能：ディレクトリの場合true、その他falseを返す。
//
/////////////////////////////////////////////////////////////////////////

import java.io.*;

class j612 {

  public static void main(String args[]) {

//  File f = new File(args[0]); // arg[0]はファイル名またはディレクトリ名。
    File f = new File("j612.java"); //

    // ファイルの存在を確認。
    if( f.exists() ) {
      System.out.println(f.getName() + "は存在する");
    } else {
      System.out.println(f.getName() + "は存在しない");
      System.exit(0);
    }

    // 通常のファイルかどうかの判定。
    if( f.isFile() ) {
      System.out.println(f.getName() + "は通常のファイルである");
    } else {
      System.out.println(f.getName() + "は通常のファイルでない");
    }

    // ディレクトリかどうかの判定。
    if( f.isDirectory() ) {
      System.out.println(f.getName() + "はディレクトリである");
    } else {
      System.out.println(f.getName() + "はディレクトリでない");
    }
  }
}
