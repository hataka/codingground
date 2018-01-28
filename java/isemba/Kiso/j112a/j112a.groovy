//  -*- mode: java -*-  Time-stamp: <2009-06-17 05:11:25 kahata>
/*================================================================
 * title: 
 * file: j112a.java
 * created : Time-stamp: <09/06/16(火) 20:27:01 hata>
 * $Id$
 * To compile: javac aaa.java // javac -encoding utf8 sample.java
 * To run:     java  aaa
 * http://oshiete.goo.ne.jp/qa/6237564.html
 * http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j112a.htm
 * description: JavaConsoleApplication  JavaConsoleApplication
 *================================================================*/
////////////////////////////////////////////////////////////////////
//  << j112a.java >>
//
//  基礎（２）：演算
//
//  ●整数演算
//    加算：+, 減算：-, 乗算：*, 除算：/, 剰余：%
//
////////////////////////////////////////////////////////////////////

import java.lang.String;
//import java.math.*;
//import java.util.Formatter;
//import java.io.PrintStream;


class j112a {

  String outbuf="";
//  String indent = "    ";
  String indent = "";
  public j112a() {
    outbuf+=indent + "基礎（２）：整数演算(加算：+, 減算：-, 乗算：*, 除算：/, 剰余：)\n\n";
//    outbuf+="整数演算\n";

    // 変数の宣言と代入。
    int x,y,z;
    x = 123; y = 45; 
    outbuf+=indent + "x = " + x + "  y = " + y +"\n";

    // 加算。
    z = x + y;
    outbuf+=indent + "加算　x + y = " + z + "\n";

    // 減算。
    z = x - y;
    outbuf+=indent + "減算　x - y = " + z + "\n";

    // 乗算。
    z = x * y;
    outbuf+=indent + "乗算　x * y = " + z + "\n";

    // 割算。
    z = x / y;
    outbuf+=indent + "割算　x / y = " + z + "\n";

    // 剰余。
    z = x % y;
    outbuf+=indent + "剰余　x % y = " + z + "\n";

  }
  
//  public static void main(String args[]) {
		String txt = new j112a().outbuf;
		System.out.println(txt);
// }
/*===============================================
 * title: 
  public static void main(String args[]) {
    System.out.println("整数演算");
    System.out.println();

    // 変数の宣言と代入。
    int x,y,z;
    x = 123; y = 45; 
    System.out.println("x = " + x + "  y = " + y);

    // 加算。
    z = x + y;
    System.out.println("加算　x + y = " + z);

    // 減算。
    z = x - y;
    System.out.println("減算　x - y = " + z);

    // 乗算。
    z = x * y;
    System.out.println("乗算　x * y = " + z);

    // 割算。
    z = x / y;
    System.out.println("割算　x / y = " + z);

    // 剰余。
    z = x % y;
    System.out.println("剰余　x % y = " + z);
  }
  ===============================================*/
}
/*
実行結果

% javac j112a.java
% java j112a
整数演算

x = 123  y = 45
加算　x + y = 168
減算　x - y = 78
乗算　x * y = 5535
割算　x / y = 2
割算　x % y = 33
*/
