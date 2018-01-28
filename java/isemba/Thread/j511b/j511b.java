//  -*- mode: java -*-  Time-stamp: <08/07/22(火) 19:53:17 hata>
/**
 * <pre>
===================================================================================
 * プログラム名: j511b.java
 * 作成日: Time-stamp: <08/07/22(火) 20:32:04 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * 説明: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << j511b.java >>
//
//  スレッド（１）：スレッドの作成（Runnableインターフェースを実装する方法）
//  
//　　Runnableインターフェースを実装する方法を確認する。
//
//　　（１）スレッド(Thread1)の定義。
//　　（２）スレッドの作成。
//　　（３）スレッドの実行。
//　　（４）mainメソッドの実行。

//　●Threadクラスのコンストラクタ
//    public Thread(Runnable obj)
//    　機能：Runnableオブジェクトobjを使ってThreadオブジェクトを作成する。
//
////////////////////////////////////////////////////////////////////////////////
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

//（１）
class Thread1 implements Runnable { 
  public void run() { // 処理の本体。
    for( int i=1; i<=5; i++ ) { 
      System.out.println("thread (" + i + ")");
    }
  }
}

class j511b {
  public static void main(String args[]) {

    Thread1 r1 = new Thread1();
    Thread th1 = new Thread(r1); //（２）

    th1.start(); //（３）

    for( int i=1; i<=5; i++ ) { 
      System.out.println("main method (" + i + ")"); //（４）
    }
  }
}
