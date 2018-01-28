//  -*- mode: java -*-  Time-stamp: <2009-06-16 20:49:36 kahata>
/*================================================================
 * title: 
 * file: j112b.java
 * created : Time-stamp: <09/06/16(火) 20:27:01 hata>
 * $Id$
 * To compile: javac aaa.java
 * To run:     java  aaa
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j112a.htm
 * description: JavaConsoleApplication 
 *================================================================*/
////////////////////////////////////////////////////////////////////
//  << j112b.java >>
//
//  基礎（２）：演算
//
//  ●実数演算
//    加算：+, 減算：-, 乗算：* , 除算：/
//
////////////////////////////////////////////////////////////////////

import java.lang.String;

class j112bs {

  StringBuffer outbuf = new StringBuffer(256);   //(1)
  public j112bs() {
	outbuf.append("実数演算\n\n");
    // 変数の宣言と代入。
    float x,y,z;
    x = (float)12.3; y = (float)4.5; 
    outbuf.append("x = " + x + "  y = " + y + "\n");

    // 加算。
    z = x + y;
   outbuf.append("加算　x + y = " + z + "\n");

    // 減算。
    z = x - y;
   outbuf.append("減算　x - y = " + z+ "\n");

    // 乗算。
    z = x * y;
   outbuf.append("乗算　x * y = " + z+ "\n");

    // 割算。
    z = x / y;
   outbuf.append("割算　x / y = " + z+ "\n");
  }

  public static void main(String args[]) {
		StringBuffer txt = new j112bs().outbuf;
		System.out.println(txt);
 }
}
/*
実行結果
% javac j112b.java
% java j112b
実数演算

x = 12.3  y = 4.5
加算　x + y = 16.8
減算　x - y = 7.8
乗算　x * y = 55.350002
割算　x / y = 2.7333333
*/
