//  -*- mode: java -*-  Time-stamp: <2009-06-17 19:56:29 kahata>
/*================================================================
 * title: 
 * file: j151a.java
 * created : Time-stamp: <09/06/16(火) 20:27:01 hata>
 * $Id$
 * To compile: javac aaa.java
 * To run:     java  aaa
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j151a.htm
 * description: JavaConsoleApplication 
 *================================================================*/
////////////////////////////////////////////////////////////////////
//  << j151a.java >>
//
//  基礎（５）：制御構造（for文）
//
//  ●for文
//
//      for( 式1; 式2; 式3 ) {
//        処理
//      }
//
//      ・式1,式2,式3,式2,式3,...と評価されていき、式2が初めてfalseになるまで
//      　処理が繰り返される。
//
////////////////////////////////////////////////////////////////////

public class j151a {
  public static void main(String args[]) {

    int i;
    // for文の動作確認。
    System.out.println("for文の動作確認");
    for( i=1; i<=5; i++ ) {
      System.out.println(" i=" + i);
    }
    System.out.println("ループ脱出後のiの値：" + i);
    System.out.println();

    // for文の動作確認。
    int j,k;
    System.out.println("for文の動作確認");
    for( j=1; j<=3; j++ ) {
      for( k=1; k<=4; k++ ) {
        System.out.print(" [j="+j+",k="+k+"]");
      }
      System.out.println();
    }
  }
}
/*
実行結果

% javac j151a.java
% java j151a
for文の動作確認
 i=1
 i=2
 i=3
 i=4
 i=5
ループ脱出後のiの値：6

for文の動作確認
 [j=1,k=1] [j=1,k=2] [j=1,k=3] [j=1,k=4]
 [j=2,k=1] [j=2,k=2] [j=2,k=3] [j=2,k=4]
 [j=3,k=1] [j=3,k=2] [j=3,k=3] [j=3,k=4]
*/
