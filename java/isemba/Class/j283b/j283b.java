// -*- mode: java -*- Time-stamp: <2009-06-29 20:16:37 kahata>
/*====================================================================
 * name: j283b.java 
 * created : Time-stamp: <09/06/29(月) 20:15:55 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j283b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j283b.java >>
//
//  クラス（８）：パッケージ（サブパッケージの利用）
//
//　　サブパッケージ利用法を確認する。
//
//　●利用法
//
//  　他のパッケージにあるクラスを使用する場合、予約語importを使う。
//
//　　・特定のクラスを取り込む場合
//  
//　　　　import  パッケージ名.クラス名
//        ただし、パッケージ名＝名前１.名前２
//
//　　・パッケージのすべてのクラスを取り込む場合
//  
//　　　　import  パッケージ名.*
//        ただし、パッケージ名＝名前１.名前２
//
//　　プログラム中でクラスを使うときには、パッケージ名.クラス名と書かずに、
//　　クラス名だけでよい。
//
//　　（１）パッケージを指定したクラスの取り込み。
//　　（２）クラスj283a内のフィールド変数aには、指定がないので、
//　　　　　obj.aで参照できない。
//　　（３）クラスj283a内のpublic指定のあるフィールド変数paには、
//　　　　　public指定があるので参照できる。
//　　（４）クラスj283a内のメソッドm()には、指定がないので、呼び出せない。
//　　（５）クラスj283a内のメソッドpm()には、public指定があるので、呼び出せる。
//
////////////////////////////////////////////////////////////////////////////////

import pack1.pack2.j283a; //（１）パッケージの取り込み。

class j283b {
  public static void main(String args[]) {
  
    j283a obj = new j283a();

    System.out.println("（２）obj.aはエラー"); //（２）
    System.out.println("（３）obj.pa = " + obj.pa); //（３） 
    System.out.println("（４）obj.m()はエラー"); //（４）
    System.out.println("（５）obj.pm()：" + obj.pm()); //（５）
  }
}
/*
実行結果
% javac j283b.java
% java j283b
（２）obj.aはエラー
（３）obj.pa = 222
（４）obj.m()はエラー
（５）obj.pm()：public指定のあるメソッド(pm)
*/
