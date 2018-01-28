//  -*- mode: java -*-  Time-stamp: <08/07/22(火) 19:53:17 hata>
/**
 * <pre>
===================================================================================
 * プログラム名: j511c.java
 * 作成日: Time-stamp: <08/07/22(火) 20:40:33 hata>
 * run:  {@link http://jubilo.cis.ibaraki.ac.jp/~isemba/PROGRAM/JAVA/java.shtml}
 * 説明: 
-----------------------------------------------------------------------------------
////////////////////////////////////////////////////////////////////////////////
//  << j511c.java >>
//
//  スレッド（１）：スレッドの作成（内部クラス）
//
//　　スレッドを内部クラスで記述する。
//
//　　（１）スレッド１(Thread1)を内部クラスで定義。
//　　　　　Threadクラスを継承する。
//　　（２）スレッド２(Thread2)を内部クラスで定義。
//　　　　　Runnableインターフェースを実装する。
//　　（３）スレッド１の作成。 
//　　（４）スレッド２の作成。 
//　　（５）スレッド１の実行。    
//　　（６）スレッド２の実行。    
//　　（７）mainメソッドの実行。    
//
//　●スレッドプログラムの書き方
//
//      class クラス名 {
//        public static void main(String args[]) {
//
//          // スレッド１の定義(内部クラス)。
//          class Thread1 extends Thread {
//            public void run() {
//              処理の本体
//            }
//          }
//          // スレッド２の定義(内部クラス)。
//          class Thread2 implements Runnable {
//            public void run() {
//              処理の本体
//            }
//          }
//　　　　　
//          Thread1 th1 = new Thread1(); // スレッド１の作成。
//          Thread2 r = new Thread2();
//          Thread th2 = new Thread(r); // スレッド２の作成。
//          
//          th1.start(); // スレッド１の実行。
//          th2.start(); // スレッド２の実行。
//        } 
//      }
//
//　　・３つのクラスファイルが作成される。
//　　　j511c.class, j511c$1Thread1.class, j511c$1Thread2.class
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

class j511c {                                                   
  public static void main(String args[]) {                      
                                                                
    //（１）       
    class Thread1 extends Thread {                              
      public void run() { // 処理の本体。                
        for( int i=1; i<=5; i++ ) {                            
          System.out.println("thread 1 (" + i + ")");          
        }                                                       
      }                                                         
    }                                                           
                                                                
    //（２）            
    class Thread2 implements Runnable {                         
      public void run() { // 処理の本体。              
        for( int i=1; i<=5; i++ ) {                            
          System.out.println("thread 2 (" + i + ")");          
        }                                                       
      }                                                         
    }                                                           
                                                                
    Thread1 th1 = new Thread1(); //（３）         
    Thread2 r = new Thread2();                                  
    Thread th2 = new Thread(r); //（４）        
                                                                
    th1.start(); //（５）      
    th2.start(); //（６）                         

    for( int i=1; i<=5; i++ ) {                            
      System.out.println("main method (" + i + ")"); //（７）          
    }                                                       
  }                                                             
}
