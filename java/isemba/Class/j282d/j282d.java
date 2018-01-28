// -*- mode: java -*- Time-stamp: <2009-06-29 17:48:49 kahata>
/*====================================================================
 * name: j282d.java 
 * created : Time-stamp: <09/06/29(月) 17:47:55 hata>
 * $Id$
 * Programmed by kahata
 * To compile:
 * To run:
 * links: http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *   http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/CLASS/j282d.htm
 * description: Java プログラミング(基礎と応用)  仙波一郎
 * ====================================================================*/
////////////////////////////////////////////////////////////////////////////////
//  << j282d.java >>
//
//  クラス（８）：パッケージ（パッケージの利用）
//
//　　パッケージの利用を確認する。
//
//　●利用法
//
//  　% javac j282d.java
//
//      カレントディレクトリからパッケージ(pack2)を探すので、クラスファイル
//      (j282c.class)を見つけ出せなくてエラーになる。
//
//  　% javac -classpath c:\tmp j282d.java
//
//　　　classpathオプションを付けてパッケージ(pack2)の存在する場所を指定する。
//      ディレクトリ(c:\tmp)からパッケージ(pack2)を探すので、クラスファイル
//      (j282c.class)を見つけ出せる。
//      カレントディレクトリにクラスファイル(j282d.class)が作成される。
//
//  　% java j282d
//
//      カレントディレクトリからパッケージ(pack2)を探すので、クラスファイル
//      (j282c.class)を見つけ出せなくてエラーになる。
//
//　　% java -classpath c:\tmp;. j282d 
//
//　　　classpathオプションを付けてパッケージ(pack2)の存在する場所を指定する。
//      ディレクトリ(c:\tmp)からパッケージ(pack2)を探すので、クラスファイル
//      (j282c.class)を見つけ出せる。
//      また、ピリオドでカレントディレクトリを指定しているので、クラスファイル
//      (j282d.class)を見つけ出せる。
//      
//　　（１）パッケージを指定したクラスの取り込み。
//　　（２）クラスj282c内のフィールド変数aには、指定がないので、
//　　　　　obj.aで参照できない。
//　　（３）クラスj282c内のpublic指定のあるフィールド変数paには、
//　　　　　public指定があるので参照できる。
//　　（４）クラスj282c内のメソッドm()には、指定がないので、呼び出せない。
//　　（５）クラスj282c内のメソッドpm()には、public指定があるので、呼び出せる。
//
////////////////////////////////////////////////////////////////////////////////

import pack2.j282c; //（１）パッケージの取り込み。

class j282d {
  public static void main(String args[]) {
  
    j282c obj = new j282c();

    System.out.println("（２）obj.aはエラー");//（２）
    System.out.println("（３）obj.pa = " + obj.pa); //（３） 
    System.out.println("（４）obj.m()はエラー"); //（４）
    System.out.println("（５）obj.pm()：" + obj.pm()); //（５）
  }
}
/*
実行結果
//% javac -classpath c:\tmp j282d.java
//% java -classpath c:\tmp;. j282d
% javac -classpath ../j282c j282d.java
% java -classpath ../j282c;. j282d
（２）obj.aはエラー
（３）obj.pa = 222
（４）obj.m()はエラー
（５）obj.pm()：public指定のあるメソッド(pm)
*/
