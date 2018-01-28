//  -*- mode: java -*-  Time-stamp: <2009-06-17 19:56:29 kahata>
/*================================================================
 * title: 
 * file: j142s.java
 * created : Time-stamp: <09/06/16(火) 20:27:01 hata>
 * $Id$
 * To compile: javac aaa.java
 * To run:     java  aaa
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml
 *  http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/KISO/j142.htm
 * description: JavaConsoleApplication 
 *================================================================*/
////////////////////////////////////////////////////////////////////
//  << j142.java >>
//
//  基礎（４）：分岐（switch文）
//
//  ●switch文
//
//      switch( 式 ) {
//        case 定数１:
//          処理１;
//          break;
//        case 定数２:
//          処理２;
//          break;
//        default:
//          処理３;
//          break;
//      } 
//      
//      ・式の計算結果が定数１に等しい場合、処理１が実行される。
//      ・式の計算結果が定数２に等しい場合、処理２が実行される。
//      ・その他の場合、処理３が実行される。
//      ・すなわち、式の計算結果により、処理１，処理２、処理３のいずれかひとつの
//　　　　処理が実行される。
//
////////////////////////////////////////////////////////////////////

import java.lang.String;

class j142s {
  StringBuffer outbuf = new StringBuffer(256);   //(1)
  public j142s() {
    int i;
    // switch文の動作確認。
    i = 1;
    outbuf.append(String.format("i = " + i+"\n"));
    switch( i ) { 
      case 1:           
        outbuf.append(String.format("処理１")); break;
      case 2:           
        outbuf.append(String.format("処理２")); break;
      default:           
        outbuf.append(String.format("処理３")); break;
    } 
    outbuf.append(String.format("\n\n"));

    // switch文の動作確認。
    i = 2;
    outbuf.append(String.format("i = " + i+"\n"));
    switch( i ) { 
      case 1: outbuf.append(String.format("処理１")); break;
      case 2: outbuf.append(String.format("処理２")); break;
      default: outbuf.append(String.format("処理３")); break;
    } 
    outbuf.append(String.format("\n\n"));

    // switch文の動作確認。
    i = 3;
    outbuf.append(String.format("i = " + i +"\n"));
    switch( i ) { 
      case 1: outbuf.append(String.format("処理１")); break;
      case 2: outbuf.append(String.format("処理２")); break;
      default: outbuf.append(String.format("処理３")); break;
    } 
  }

  public static void main(String args[]) {
		StringBuffer txt = new j142s().outbuf;
		System.out.println(txt);
 }
}
/*
実行結果

% javac j142.java
% java j142
i = 1
処理１

i = 2
処理２

i = 3
処理３
*/
