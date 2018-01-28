//  -*- mode: java -*-  Time-stamp: <2009-06-16 20:36:04 kahata>
/*================================================================
 * title: 基礎（２）：変数、型
 * file: j111.java
 * created : Time-stamp: <09/06/16(火) 20:27:01 hata>
 * $Id$
 * To compile: javac j111.java
 * To run:     java  j111
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j111.htm
 * description: JavaConsoleApplication 
 *================================================================*/
////////////////////////////////////////////////////////////////////
//  << j111.java >>
//
//  基礎（２）：変数、型
//
//　●変数
//　　変数はデータを格納しておく箱と考えられる。箱を作ったり（宣言という）、
//　　データを格納したり（代入という）、箱に入っているデータを見たり
//　　（参照という）することができる。
//
//　●型
//　　変数に格納するデータの種類のことを型といい、整数型、文字型、論理型などが
//　　ある。
//　　　・整数型：byte,short,int,long
//　　　・浮動小数点数型：float,double
//　　　・文字型：char
//    　・論理型：boolean
//　　これら８種類の型を基本型という。
//
//    　　型　　サイズ　　　値
//  　  byte     8bit       -128 ～ +127
//     short    16bit       -32768 ～ +32767
//       int    32bit       -2147483648 ～ +2147483647
//      long    64bit       -9223372036854775808 ～ +9223372036854775807
//     float    32bit       -3.40E+38 ～ +3.40E+38
//    double    64bit       -1.79E+308 ～ +1.79E+308 
//      char    16bit       0 ～ 65535
//    boolean    1bit       true,false
//
//　・char型の１文字を表すときは、一重引用符(')で囲む。
//　　たとえば、'a', '1', '漢'。
//
//　●キャスト演算子
//　　(型名)式 と書くと、式の型をかっこ内で指定した型に変換する
//    大きいサイズの型の値を小さいサイズの型の変数に代入するときキャスト演算子
//　　を使う必要がある。
//
//　●文字列の連結
//　　文字列の連結には、演算子＋を使う。
//　　
////////////////////////////////////////////////////////////////////
package isemba;

class j111 {
  public static void main(String args[]) {

    // 変数の宣言と初期化。
    byte    a1 = 1; 
    short   a2 = 12;
    int     a3 = 123;
    long    a4 = 1234L; // 整数にLをつけるとlong型になる。
    float   b1 = (float)1.23; // 1.23はdouble型として処理される。
                              // float型として処理するには、明示的な
                              // 型変換が必要。この操作をキャストという。
    double  b2 = 1.234;
    char    c1 = '漢'; 
    char    c2 = 'a'; 
    boolean c3 = true;

    // 変数の出力。
    System.out.println("byte型    a1 = " + a1);    
    System.out.println("short型   a2 = " + a2); 
    System.out.println("int型     a3 = " + a3); 
    System.out.println("long型    a4 = " + a4);
    System.out.println("float型   b1 = " + b1);
    System.out.println("double型  b2 = " + b2);   
    System.out.println("char型    c1 = " + c1);   
    System.out.println("char型    c2 = " + c2);   
    System.out.println("boolean型 c3 = " + c3);   
  }
}

/*
実行結果
% javac j111.java
% java j111
byte型    a1 = 1
short型   a2 = 12
int型     a3 = 123
long型    a4 = 1234
float型   b1 = 1.23
double型  b2 = 1.234
char型    c1 = 漢
char型    c2 = a
boolean型 c3 = true
*/
