//  -*- mode: java -*-  Time-stamp: <08/07/22(火) 19:53:17 hata>
/**
 * <pre>
===================================================================================
 * プログラム名: j511a.java
 * 作成日: Time-stamp: <08/07/22(火) 19:03:21 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * 説明: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << j511a.java >>
//
//  スレッド（１）：スレッドの作成（Threadクラスを継承する方法）
//  
//　　Threadクラスを継承してスレッドを作成する方法を確認する。
//
//　　（１）スレッド(Thread1)の定義。
//　　（２）スレッドの作成。
//　　（３）スレッドの実行。
//　　（４）mainメソッドの実行。
//
//  ●Threadクラスのコンストラクタ
//    public Thread()
//      機能：Threadオブジェクトを作成する。
//　　 
//  ●Threadクラスのメソッド
//    public void start()                                
//      機能：スレッドを開始する。すなわち、スレッドのrun()メソッドを呼び出す。
//
////////////////////////////////////////////////////////////////////////////////
//（１）
 * </pre>
 * @package    JApplet
 * @subpackage
 * @author    kahata <kazuhiko.hata@nifty.com>
 * @copyright 2003-2008 kahata
 * @license   http://www.debian.org/misc/bsd.license  BSD License (3 Clause)
 * @version   1.0
 * @link      http://pear.php.net/package/phpDocumentor
 */
/*=================================================================================*/

class Thread1 extends Thread { 
  public void run() { // 処理の本体。
    for( int i=1; i<=5; i++ ) { 
      System.out.println("thread (" + i + ")");
    }
  }
}

class j511a {
  public static void main(String args[]) {

    Thread1 th1 = new Thread1(); //（２）
    th1.start(); //（３）
    for( int i=1; i<=5; i++ ) { 
      System.out.println("main method (" + i + ")"); //（４）
    }
  }
}
