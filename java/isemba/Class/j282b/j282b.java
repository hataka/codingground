// -*- mode: java -*- Time-stamp: <2009-06-29 17:40:50 kahata>
/*====================================================================
 * name: j282b.java 
 * created : Time-stamp: <09/06/29(月) 17:40:19 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j282b.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j282b.java >>
//
//  クラス（８）：パッケージ（パッケージの利用）
//
//　　パッケージの利用法を確認する。
//
//　●利用法
//
//  　他のパッケージにあるpublic指定のあるクラスを使用する場合、クラス名に
//　　パッケージ名を付けて指定する必要がある。しかし、パッケージ名を付けるのは
//　　煩わしい作業である。そこで、予約語importを使うことで、パッケージ名を省く
//　　ことができる。
//
//　　・特定のクラスを利用する場合
//  
//　　　　import  パッケージ名.クラス名
//
//　　・パッケージのすべてのクラスを利用する場合
//  
//　　　　import  パッケージ名.*
//
//　　　プログラム中でクラスを使うときには、パッケージ名.クラス名と書かずに、
//　　　クラス名だけでよい。
//
//　　・import java.lang.*; は、自動的に行われるので、パッケージjava.lang内の
//　　　クラス（System,Stringなど）は、importで指定しなくても利用できる。
//
//
//　　（１）パッケージを指定したクラスの取り込み。
//　　（２）クラスj282a内のフィールド変数aには、指定がないので、
//　　　　　obj.aで参照できない。
//　　（３）クラスj282a内のpublic指定のあるフィールド変数paには、
//　　　　　public指定があるので参照できる。
//　　（４）クラスj282a内のメソッドm()には、指定がないので、呼び出せない。
//　　（５）クラスj282a内のメソッドpm()には、public指定があるので、呼び出せる。
//
////////////////////////////////////////////////////////////////////////////////

import pack1.j282a; //（１）

class j282b {
  public static void main(String args[]) {
  
    j282a obj = new j282a();

    System.out.println("（２）obj.aはエラー"); //（２）
 
    System.out.println("（３）obj.pa = " + obj.pa); //（３） 

    System.out.println("（４）obj.m()はエラー"); //（４）

    System.out.println("（５）obj.pm()：" + obj.pm()); //（５）
  }
}
/*
実行結果
% javac j282b.java
% java j282b
（２）obj.aはエラー
（３）obj.pa = 222
（４）obj.m()はエラー
（５）obj.pm()：public指定のあるメソッド(pm)
*/
