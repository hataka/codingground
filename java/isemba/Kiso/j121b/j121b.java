//  -*- mode: java -*-  Time-stamp: <2009-06-17 09:02:41 kahata>
/*================================================================
 * title: 
 * file: j121b.java
 * created : Time-stamp: <09/06/16(火) 20:27:01 hata>
 * $Id$
 * To compile: javac aaa.java
 * To run:     java  aaa
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j121b.htm
 * description: JavaConsoleApplication 
 *================================================================*/
////////////////////////////////////////////////////////////////////
//  << j121b.java >>
//
//  基礎（２）：文字列
//
//  ●文字列の長さ
//　　s.length()と書くと、変数sが指す文字列の長さが得られる。
//　　"abc"のとき、s.length()で3が得られる。
//
//  ●文字列の比較
//　　s.equals("文字列")と書くと、変数sが指す文字列と引数の文字列が比較され、
//　　等しいときtrue、等しくないときfalseが得られる。
//
//  ●文字列の位置指定
//　　s.charAt(i)と書くと、変数sが指す文字列中でi番目の文字が得られる。
//    先頭の文字が、0番目の文字となる。
//
//  ●部分列の指定
//    s.substring(i)と書くと、変数sが指す文字列のi番目以降の文字列が得られる。
//    s.substring(i,j)と書くと、変数sが指す文字列のi番目からj-1番目までの
//　　文字列が得られる。
//
////////////////////////////////////////////////////////////////////

class j121b {
  public static void main(String args[]) {

    // 文字列比較。
    String s1,s2,s3;
    s1 = "水戸市"; 
    s2 = "日立市";
    s3 = "水戸市";
    System.out.println("s1 =" + s1);
    System.out.println("s2 =" + s2);
    System.out.println("s3 =" + s3);
    System.out.println("s1.equals(s2) =" + s1.equals(s2));
    System.out.println("s1.equals(s3) =" + s1.equals(s3));
    System.out.println();

    // 文字列の長さと文字指定。
    String s4 = "a漢1";
    System.out.println("s4 =" + s4);
    System.out.println("s4.charAt(0) =" + s4.charAt(0));
    System.out.println("s4.charAt(1) =" + s4.charAt(1));
    System.out.println("s4.charAt(2) =" + s4.charAt(2));
    System.out.println("s4.length() =" + s4.length());
    System.out.println();

    // 部分列の指定。 
    String s5;
    s5 = "abcdefg";
    System.out.println("s5 =" + s5);
    System.out.println("s5.substring(3) =" + s5.substring(3));
    System.out.println("s5.substring(3,5) =" + s5.substring(3,5));
  }
}
/*
実行結果

% javac j121b.java
% java j121b
s1 =水戸市
s2 =日立市
s3 =水戸市
s1.equals(s2) =false
s1.equals(s3) =true

s4 =a漢1
s4.charAt(0) =a
s4.charAt(1) =漢
s4.charAt(2) =1
s4.length() =3

s5 =abcdefg
s5.substring(3) =defg
s5.substring(3,5) =de
*/
