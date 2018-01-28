//  -*- mode: java -*-  Time-stamp: <2009-06-17 07:03:50 kahata>
/*================================================================
 * title: 
 * file: j113.java
 * created : Time-stamp: <09/06/16(火) 20:27:01 hata>
 * $Id$
 * To compile: javac aaa.java
 * To run:     java  aaa
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j113.htm
 * description: JavaConsoleApplication 
 *================================================================*/
////////////////////////////////////////////////////////////////////
//  << j113.java >>
//
//  基礎（２）：文字コード
//
//　　コンピュータ内部で、文字は数値で表される。文字に対応する数値を文字コード
//　　という。シフトJISコード、EUCコードなどがよく知られている。
//　　Javaでは、Unicode(ユニコードと読む）という文字コードが使われている。
//
//  ●Unicode
//    Javaでは、Unicodeという16ビットの文字コードを使う。
//
//　　シフトJISコードやEUCコードで書かれたJavaソースファイルは、コンパイルを
//　　行う前に、Unicodeへの変換が行われる。この結果、Javaソースファイルを
//　　Unicodeで書かなくても正しくコンパイルされる。
//
//    ・16進4桁のUnicodeの値(0以上65535以下)XXXXを、\、u、XXXXの順に
//　　　書くと文字が表せる。
//      AのUnicodeは、\u0041、1のUnicodeは、\u0031、漢のUnicodeは、\u6f22。
//
//　●エスケープシーケンス
//　　\を最初に付ける書き方をエスケープシーケンスといい、キーボードから入力
//　　できない特殊な文字を表すことができる。
//    \nで改行を表す。
//
////////////////////////////////////////////////////////////////////

class j113 {
  public static void main(String args[]) {

    char a,b,c;
    a = 'A';
    b = '1';
    c = '漢';

    System.out.println("Aの文字は" + a);
    System.out.println("1の文字は" + b);
    System.out.println("漢の文字は" + c);
    System.out.println("Aの文字コードは" + (int)a);
    System.out.println("1の文字コードは" + (int)b);
    System.out.println("漢の文字コードは" + (int)c);
    System.out.println("\n");
    System.out.println("Aの文字は\u0041");
    System.out.println("1の文字は\u0031");
    System.out.println("漢の文字は\u6f22");
  }
}
/*
実行結果
% javac j113.java
% java j113
Aの文字はA
1の文字は1
漢の文字は漢
Aの文字コードは65
1の文字コードは49
漢の文字コードは28450


Aの文字はA
1の文字は1
漢の文字は漢
*/
